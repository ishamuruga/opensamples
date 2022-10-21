import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonDataService } from 'src/app/services/common-data.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userid:string="rmkadmin";
  isLoggedIn:boolean=true;

  constructor(private rutr:Router,private cData:CommonDataService){}

  ngOnInit(): void {
    sessionStorage.clear();
  }

  doLogin() {
    if (this.userid === "rmkadmin"){
      sessionStorage.setItem("auth","true");
      this.rutr.navigate(["dboard"]);
    } else {
      sessionStorage.setItem("auth","false");
      this.isLoggedIn = false;
    }
  }

  doPromise() {
    //console.log(this.cData.getCustomers());
    this.cData.getCustomersviaPromise().then((x:any[])=>{
      console.log("Data From Promise...");
      console.log(x);
    }).catch(err=>{
      console.log(err);
    })
  }

}
