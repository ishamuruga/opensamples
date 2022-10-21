import { Component, OnDestroy, OnInit } from '@angular/core';
import { map, of, Subscription } from 'rxjs';
import { CommonDataService } from 'src/app/services/common-data.service';
import Customer from '../model/customer';
import Product from '../model/products';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit,OnDestroy {

  prods:Product[] = [];

  subs!:Subscription;

  custs:Customer[] = [
    {id:1,name:"BashaBhai",email:"bb@gmail.com"},
    {id:2,name:"RockyBhai",email:"rb@gmail.com"},
    {id:3,name:"Kala",email:"kala@gmail.com"}
  ]

  constructor(private cDataService:CommonDataService) { }

  

  ngOnDestroy(): void {
    console.log("On Destroy ######");
    if (this.subs) {
      this.subs.unsubscribe();    
    }
    
  }

  ngOnInit(): void {
    this.getCustomer().subscribe(x=>{
      console.log(x);
    })
  }

  public fetchProds() {
    this.cDataService.getProducts().then((res:Product[] | undefined)=>{
      this.prods = res as Product[];
    }).catch(err=>{
      console.log("Error Occurred...");
      console.error(err);
    }).finally(()=>{
      console.log("All in well");
    });
  }

  public fetchProds_v2() {
    console.log("Calling Version 2");
    this.subs=this.cDataService.getProducts_v2().pipe(
      map(data => {
        data.map(d => {
          d.cost = d.cost + 2;
          return d;
        });
        return data;
      }),
      map(data=>data.filter(prod=>prod.cost>25)), 
      map(data=>data.filter(prod=>prod.cost>35))   
    ).subscribe((res:Product[])=>{
      this.prods = res as Product[];
    },err=>{
      console.log(err);
    },()=>{
      console.log("Vanakkam....");
    })
  }

  public getCustomer() {
    return of(...this.custs);
  }

}
