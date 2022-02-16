import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit,OnDestroy {

  loginForm!:FormGroup;

  constructor(private router:Router,
        private fb:FormBuilder) { 
    console.log("=======Cons");

    this.loginForm = fb.group({
      "email" : ["",Validators.compose([Validators.required,Validators.email])],
      "password" : ["",Validators.compose([Validators.required,Validators.minLength(3),Validators.maxLength(10)])]
    })
  }
  ngOnDestroy(): void {
    console.log("=======Destroy");
    //sessionStorage.clear();
  }

  ngOnInit(): void {
    console.log("=======Init");
    sessionStorage.setItem("auth","false");
  }

  doLogin(){
    sessionStorage.setItem("auth","true")
    this.router.navigate(['dashboard']);
  }

  doLoggout(){
    sessionStorage.setItem("auth","false")
  }

  submitForm(form:any){
    console.log("My Form data.........")
    console.log(form["email"]);
    console.log(form["password"]);
  }


}
