import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CommonDataService {

  customers:any[] = [
    {id:1,name:"Petta"},
    {id:2,name:"Kala"},
    {id:3,name:"Arunachalam"},
  ]

  constructor() { }

  public getCustomers(): any[] {
    return this.customers;
  }

  public getCustomersviaPromise(){
    return Promise.resolve(this.customers);
  }
}
