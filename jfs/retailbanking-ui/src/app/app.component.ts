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

  url = "http://localhost:8090/api/accounts";

  handleClick() {
    this.httpc.get<Account[]>(this.url).toPromise().then((x)=> {
      console.log(x as Account[]);
      this.accts = x as Account[];
      this.message = "Completed"
    })
  }
}
