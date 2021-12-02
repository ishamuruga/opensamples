import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DatacommService {

  private subject = new BehaviorSubject<any>({});

  public sendMessage(data:any) {
    
    this.subject.next({
      payload:data
    });
    console.log("Data Sent");
  }

  public receiveData():Observable<any> {
    return this.subject.asObservable();
  }

  public clearData(){
    this.subject.next({
      payload:''
    });
  }

  constructor() { }
}
