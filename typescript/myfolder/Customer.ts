export interface Customer {
    id:number;
    name:string;
    email:string;
    cusType:CustomerType;
}


export interface CustomerType {
    id:number;
    description:string;
}