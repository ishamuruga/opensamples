import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  public add(x:number,y:number) {
    return x+y;
  }

  constructor() { }
}
