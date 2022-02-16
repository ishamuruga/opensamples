import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthguardService implements CanActivate {

  constructor(private router:Router) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean  {
    
    let res = sessionStorage.getItem("auth");
    if (res === "true") {
      return true;
    } else {
      alert("Invalid Entry");
      this.router.navigate(['/login']);
      return false;
    }
  }
}
