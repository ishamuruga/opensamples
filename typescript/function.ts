function doConv(val:number):number {
    return (val-32)*(5/9);
}

console.log(doConv(100));

let dc = function (val:number):number {
    return (val-32)*(5/9);
};

console.log(dc(100));

let dc2 = (val:number) => {
    return (val-32)*(5/9);
}

//let dc3 = (val:number) => (val-32)*(5/9);

//HOC

let dc4 = (val:number,fn) => {
    let t = val*20;
    return fn(t);
}

//let res = dc4(200,dc3);
let res = dc4(200,(val:number) => (val-32)*(5/9));