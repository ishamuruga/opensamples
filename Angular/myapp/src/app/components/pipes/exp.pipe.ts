import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'math_exp'
})
export class ExpPipe implements PipeTransform {

  transform(value: number, data: number): number {
    return value*data;
  }

}
