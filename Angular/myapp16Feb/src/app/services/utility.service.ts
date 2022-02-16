import { Injectable } from '@angular/core';
import { LoggerService } from './logger.service';
import { UtilityManager } from './utility-manager';

@Injectable({
  providedIn: 'root'
})
export class UtilityService implements UtilityManager{

  constructor(private logger:LoggerService) { }

  add(x: number, y: number): number {
    this.logger.log(x + "," + y);
    return x+y;
  }
  multiple(x: number, y: number): number {
    return x*y;
  }
}
