import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { customer } from 'src/app/model/customer';
import { LoggerService } from 'src/app/services/logger.service';
import { UtilityService } from 'src/app/services/utility.service';


@Component({
  selector: 'app-grid',
  templateUrl: './grid.component.html',
  styleUrls: ['./grid.component.css']
})
export class GridComponent implements OnInit {

  //private utilService:UtilityService = new UtilityService();

  @Input()
  data:customer[] = [];

  @Output()
  newCustomer:EventEmitter<customer> = new EventEmitter();

  constructor(private utilService:UtilityService,
            private logger:LoggerService) { }

  ngOnInit(): void {
  }

  handleNewCustomer(){
    let nc:customer = {
      id:99,
      email : "bashabhai@gmail.co,"
    }
    console.log(nc);
    console.log(this.utilService.add(5,6));
    this.newCustomer.emit(nc);

  }

}
