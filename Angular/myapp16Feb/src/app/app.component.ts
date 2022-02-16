import { Component } from '@angular/core';
import { customer } from './model/customer';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myapp123';

  name = "MyCompany";

  public custs: customer[] = [
    { id: 1, email: "ss@gmail.com" },
    { id: 2, email: "ggt@gmail.com" },
    { id: 2, email: "hht@gmail.com" },
  ]

  names = [
    { id: 4, name: "name1" },
    { id: 5, name: "name2" },
    { id: 6, name: "name3" }
  ]

  constructor() {}

  handleNewCustomer(data:customer) {
    console.log(data);
    this.custs.push(data);
  }

  handleTitleChange(e:any){
    this.title = e.target.value;
  }

}
