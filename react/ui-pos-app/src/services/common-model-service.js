import { of } from "rxjs";
import Category from "../model/category"
import config from './config';
import axios from 'axios';
import {getAuthToken} from './common';

export const Categories = () => {
    // let categories = [
    //     new Category(-1, "Please select a value"),
    //     new Category(1, "Fruits"),
    //     new Category(2, "Groceries"),
    //     new Category(3, "Oils"),
    //     new Category(4, "Snackes"),
    //     new Category(5, "Groceries"),
    // ];


    const fetchAll = () => {
        console.log(getAuthToken())
        let url = config.baseurl + "/api/pos/categories";
        // axios.get(url)
        //     .then(res => {
        //         console.log(res);
        //     });
        
        return axios.get(url);

        //return of(categories);
    }

    const findById = (id) => {
        //return of(...categories);
    }

    return {
        fetchAll,
        findById
    }
}