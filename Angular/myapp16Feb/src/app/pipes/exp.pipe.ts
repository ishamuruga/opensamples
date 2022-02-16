import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'virexp'
})
export class ExpPipe implements PipeTransform {

  transform(value: number, arg: number): number {
    return value * arg;
  }

}
