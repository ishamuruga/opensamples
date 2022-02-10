import { Component, OnDestroy, OnInit } from '@angular/core';
import { map, of, Subscription } from 'rxjs';
import { Products } from 'src/app/model/products';
import { ProdService } from 'src/app/service/prod.service';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit,OnDestroy {

  prods!:Products[];

  constructor(private prodService:ProdService) { }
  
  ngOnDestroy(): void {
    if (this.prodSubs) {
      this.prodSubs.unsubscribe();
    }
    
    console.log("Componenet Destroyed");
  }

  ngOnInit(): void {
    console.log("Componenet Created");
  }

  prodSubs!:Subscription;

  fetchProdData(){
    this.prodService.getProductsSB().then((res:any) => {
      console.log(res);
      this.prods = res;
    }).catch(err=>{
      console.log(err);
    }).finally(()=>{
      console.log("Happily");
    })
  }

  addProdData(){
    this.prodService.addProducts();
  }

  fetchProdDataviaObs(){
    this.prodSubs = this.prodService.getProductsviaObs().pipe(
      map(data =>{
        data.map(d=>d.cost = d.cost+100);
        return data;
      }),
      map(data=> data.filter(prod=>prod.cost > 110)),
      map(data=> data.filter(prod=>prod.cost > 190))
    ).subscribe((res:any) => {
      console.log(res);
      this.prods = res;
    },err => {
      console.error("ERROR");
      console.error(err);
    },()=>{
      console.log("finally");
    });
  }

  doSomething(){
    of("123","567","789").subscribe(x=>{
      console.log(x);
    })
  }

}
