import { Component, OnDestroy, OnInit } from '@angular/core';
import { map, of, Subscription } from 'rxjs';
import { Product } from 'src/app/model/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit,OnDestroy {

  prods:Product[]=[];

  todate = new Date();

  age:number = 60;

  subs!:Subscription;

  datas = [
    {id:1,name:"test123"},
    {id:2,name:"test223"},
    {id:3,name:"test323"},
    {id:4,name:"test423"},
    {id:5,name:"test523"}
  ]

  constructor(private prodService:ProductService) { }
  
  ngOnDestroy(): void {
    if (this.subs){
      this.subs.unsubscribe();
    }
  }

  ngOnInit(): void {}

  doPromiseCall(){
    this.prodService.getProducts().then((x:any)=>{
      this.prods = x;
      console.log(this.prods);
    }).catch(err=>{
      console.error("ERRRRRR");
      console.error(err);
    }).finally(()=>{
      console.log("Finally")
    })
  }

  doObservableCall(){
    this.subs = this.prodService.getProductsViaObservable().pipe(
      map(data => {
        data.map(d=>d.cost = d.cost *10);
        return data;
      }),
      map(data => data.filter(prod=> prod.cost>200))
    ).subscribe(x=>{
      this.prods = x;
    },err=> {
      console.error(err);
    },()=>{
      console.log("Finally");
    })
  }

  doProcessArray(){
    of(this.datas).pipe().subscribe(x=>{
      console.log(x)
    })
  }

}
