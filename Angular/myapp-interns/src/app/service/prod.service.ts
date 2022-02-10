import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Prods, Products } from '../model/products';

@Injectable({
  providedIn: 'root'
})
export class ProdService {

  private url:string = "http://localhost:3000";

  private sburl:string = "http://localhost:8080/api";

  constructor(private http:HttpClient) { }

  public getProducts() {
    return this.http.get<Products[]>(`${this.url}/products`).toPromise();
  }

  public getProductsSB() {
    return this.http.get<Prods[]>(`${this.sburl}/prods`).toPromise();
  }

  public addProducts() {

    let p:Products = {
      "id": 25252,
      "name": "Product123",
      "cost": 101,
      "quantity": 132,
      "locationId": 1,
      "familyId": 123
    }

    this.http.post(`${this.url}/products`,p).toPromise().then(x=>{
      console.log(x);
    });

  }


  public getProductsviaObs() : Observable<Products[]> {
    return this.http.get<Products[]>(`${this.url}/products`);
  }
}
