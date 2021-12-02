import { Component } from '@angular/core';
import { Student } from './models/student';
import { DatacommService } from './services/datacomm.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private dComService:DatacommService){}

  title = "myapp";

  dob:Date = new Date(2001,2,3);

  public texts:string = "";

  public studs:Student[] = [
    {id:0,name:"Basha",age:45},
    {id:1,name:"Velan",age:55},
    {id:2,name:"AlexPandiyan",age:25},
  ];

  public handleAddNewStudent(data:Student){
    console.log(data);
    this.studs.push(data);
  }

  doSendData(){
    let idx:number = Math.random()
    let stu = new Student(Math.random(),"name" + idx,idx);
    this.dComService.sendMessage(stu);
    console.log(stu);
  }

  doClearData() {
    this.dComService.clearData();
  }

}
