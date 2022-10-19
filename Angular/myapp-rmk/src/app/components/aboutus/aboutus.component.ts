import { Component, OnInit } from '@angular/core';
import { CalcService } from 'src/app/services/calc.service';
import { LoggerService } from 'src/app/services/logger.service';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent implements OnInit {

  addvalue:number=0;
  mulvalue:number=0;

  constructor(private cService:CalcService,private logger:LoggerService) { }

  ngOnInit(): void {
    this.addvalue = this.cService.add(5,6);
    this.mulvalue = this.cService.multiply(5,6);
  }

}
