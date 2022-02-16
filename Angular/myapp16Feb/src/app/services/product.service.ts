import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  public getProducts(){
    return this.http.get<Product[]>("http://localhost:3000/products").toPromise();
  }

  public getProductsViaObservable() : Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:3000/products");
  }
}
