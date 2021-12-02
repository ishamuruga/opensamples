import { createOfflineCompileUrlResolver } from '@angular/compiler';
import { Component, EventEmitter, Input, OnDestroy, OnInit, Output } from '@angular/core';
import { Student } from 'src/app/models/student';
import { CommonService } from 'src/app/services/common.service';

@Component({
  selector: 'app-grid',
  templateUrl: './grid.component.html',
  styleUrls: ['./grid.component.css']
})
export class GridComponent implements OnInit,OnDestroy {

  //public cService1:CommonService = new CommonService();

  constructor(public cService:CommonService) {
    console.log("==================1");
    console.log(this.cService.add(7,8));
   }

  ngOnDestroy(): void {
    throw new Error('Method not implemented.');
  }

  @Input()
  students:Student[]=[];

  names:string="";

  @Output()
  addNewStudentEmitter:EventEmitter<Student> = new EventEmitter();

  id:number = 0;
  stu_name:string="";
  age:number=0;

  handleAddStudent(){
    let newStu:Student = new Student(this.id,this.stu_name,this.age);
    
    this.addNewStudentEmitter.emit(newStu);
  }

  

  ngOnInit(): void {
    console.log("==================2");
    this.names = "Test data";
  }

}
