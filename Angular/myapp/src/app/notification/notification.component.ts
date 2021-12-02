import { Component, OnInit } from '@angular/core';
import { Data } from '@angular/router';
import { Student } from '../models/student';
import { DatacommService } from '../services/datacomm.service';

@Component({
  selector: 'app-notification',
  templateUrl: './notification.component.html',
  styleUrls: ['./notification.component.css']
})
export class NotificationComponent implements OnInit {

  stus: Student[] = [];

  constructor(private dCom: DatacommService) { }

  ngOnInit(): void {
    this.dCom.receiveData().subscribe(x => {
      if (x.payload) {
        console.log(x);
        console.log(x.payload);
        this.stus.push(x.payload);
      } else {
        this.stus = [];
      }
    });
  }

}
