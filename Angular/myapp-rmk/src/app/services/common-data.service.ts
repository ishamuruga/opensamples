import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Product from '../components/model/products';

@Injectable({
  providedIn: 'root'
})
export class CommonDataService {

  url:string = "http://localhost:3000";

  customers:any[] = [
    {id:1,name:"Petta"},
    {id:2,name:"Kala"},
    {id:3,name:"Arunachalam"},
  ]

  constructor(private prodApi:HttpClient) { }

  public getCustomers(): any[] {
    return this.customers;
  }

  public getCustomersviaPromise(){
    return Promise.resolve(this.customers);
  }

  public getProducts() : Promise<Product[] | undefined> {
    return this.prodApi.get<Product[]>(`${this.url}/products`).toPromise();
  }

  public getProducts_v2() : Observable<Product[]> {
    return this.prodApi.get<Product[]>(`${this.url}/products`);
  }


}
