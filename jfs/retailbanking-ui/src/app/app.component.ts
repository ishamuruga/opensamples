import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import Account from './account';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  accts!:Account[];

  message:string = "Not Connected";

  constructor(private httpc:HttpClient){}

  title = 'retailbanking-ui';

  handleClick() {
    this.httpc.get<Account[]>("http://localhost:8080/api/accounts").toPromise().then((x)=> {
      console.log(x as Account[]);
      this.accts = x as Account[];
      this.message = "Completed"
    })
  }
}
