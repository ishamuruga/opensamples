import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataPushService {

  private datapush:BehaviorSubject<any> = new BehaviorSubject({
    data:{},
    ts:new Date(),
    event:""
  });

  public sendPayload(payload:any,eventType:string){
    this.datapush.next({
      data:payload,
      ts:new Date(),
      event:eventType
    })
  }

  public listenToBroadcast():Observable<any> {
    return this.datapush.asObservable();
  }

  public reset(){
    this.datapush.next({
      data:"",
      ts:new Date(),
      event:""
    })
  }


  constructor() { }
}
