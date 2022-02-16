import { Component, OnInit } from '@angular/core';
import { DataPushService } from 'src/app/services/data-push.service';

import {customer} from '../../model/customer';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  constructor(private dPush:DataPushService) { }

  ngOnInit(): void {
  }

  doHandleDataSend(){
    let cust:customer = {
      id:1,
      email:"Test123" + Math.random().toString()
    }

    console.log(cust);

    this.dPush.sendPayload(cust,"AboutClick");
  }



}
