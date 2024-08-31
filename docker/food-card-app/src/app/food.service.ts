import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Card from './Card';
import AppConstants from './Env';

@Injectable({
  providedIn: 'root'
})
export class FoodService {


 

   constructor(private httpC: HttpClient) { 
  
  }

  fetchAll() {
    return this.httpC.get(
      AppConstants.URL + AppConstants.COLON + AppConstants.PORT + AppConstants.SLASH + AppConstants.FETCHALL
    );
  }

  save(card: Card) {
    return this.httpC.post(AppConstants.URL + AppConstants.COLON + AppConstants.PORT + AppConstants.SLASH + AppConstants.SAVE, card).subscribe(x => console.log(x));
  }
}


// const AppConstants = {
//   URL:"http://localhost",
//   COLON:":",
//   SLASH:"/",
//   PORT:"8080",
//   FETCHALL:"all",
//   SAVE:"save",
// }