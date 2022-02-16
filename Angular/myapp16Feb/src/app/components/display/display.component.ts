import { Component, OnInit } from '@angular/core';
import { DataPushService } from 'src/app/services/data-push.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  datas:any[] = [];

  constructor(private dPush:DataPushService) { }

  ngOnInit(): void {
    this.dPush.listenToBroadcast().subscribe(x=>{
      if (x) {
        if (x.event==="type"){
          console.log(x);
          this.datas.push(x);
        }
      }
    })
  }

}
