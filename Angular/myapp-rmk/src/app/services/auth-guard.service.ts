import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  constructor(private rtr:Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean  {

    const flag = sessionStorage.getItem("auth");
    if (!flag){
      alert("Invalid Loging,redirecting...");
      this.rtr.navigate(["/login"]);
      return false;
    }

    return true;
  }
}
