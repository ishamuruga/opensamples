import { HttpErrorResponse } from '@angular/common/http';
import { ErrorHandler, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GlobalErrorHandlerService implements ErrorHandler {

  constructor() { }
  
  handleError(error: Error | HttpErrorResponse ): void {
    console.warn(" i am in global error hadler");
    alert("System error has occured, pls try after some time");
    console.log(error.message);
    //post the error details to the back end
    //let result = await this.errorsercvice.post(error);//
    //Collect
    //browser type & version, user id, timestamp, error message
    console.error(error);
  }


}
