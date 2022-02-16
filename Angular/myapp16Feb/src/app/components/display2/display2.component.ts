import { Component, OnInit } from '@angular/core';
import { DataPushService } from 'src/app/services/data-push.service';

@Component({
  selector: 'app-display2',
  templateUrl: './display2.component.html',
  styleUrls: ['./display2.component.css']
})
export class Display2Component implements OnInit {
  constructor(private dPush:DataPushService) { }

  ngOnInit(): void {
    this.dPush.listenToBroadcast().subscribe(x=>{
      if (x) {
        console.log(x);
      }
    })
  }

}
