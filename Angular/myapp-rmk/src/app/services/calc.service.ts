import { Injectable } from '@angular/core';
import CalcServiceManager from './icalc.service';

@Injectable({
  providedIn: 'root'
})
export class CalcService implements  CalcServiceManager {

  constructor() { }
  add(x: number, y: number): number {
    return x+y;
  }
  multiply(x: number, y: number): number {
    return x*y;
  }
}
