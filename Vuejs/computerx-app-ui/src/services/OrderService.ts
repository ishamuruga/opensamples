import { catchError, of, switchMap } from "rxjs";
import { fromFetch } from "rxjs/fetch";

export default class OrderSerice {

    url: string = "http://localhost:8080/";

    public getUsers() {
        return fetch(`${this.url}api/order`)
    }

    public getUsersAdv() {
        return fromFetch(`${this.url}api/order`)
    }

}