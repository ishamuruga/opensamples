import React, { useState,useEffect } from "react";

export default function OrderDetails({itms}) {
  console.log(itms);
  let itemCosts = [10.23, 45.41, 67.89, 67.12, 89.57];

  let processedItems = itms.map(x=>{
    console.log("###########33");
    console.log(x);
    let c = itemCosts[x.category];
    x.cost = c * x.quantity;
    return x;
  });
  console.log(processedItems);


  //console.log(props.itms);
  // if (props.items) {
  //   let processedItems = props.items.map((x) => {
  //     let c = itemCosts[x.category];
  //     x.cost = c * x.quantity;

  //     return x;
  //   });
  //   console.log(processedItems);
  // }

  // useEffect(()=>{
  //   console.log(props.itms);
  // },[props.itms])
  
  
  return (
    <div className="table-responsive">
      <table className="table table-sm table-striped table-hover">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Item</th>
            <th scope="col">Quantity</th>
            <th scope="col">Category</th>
            <th scope="col">Cost</th>
          </tr>
        </thead>
        <tbody>
        {
          processedItems.map(y=>{
            return (
              <tr>
                <th scope="row">1</th>
                <td>{y.name}</td>
                <td>{y.quantity}</td>
                <td>{y.category}</td>
                <td>{y.cost}</td>
              </tr>
            )   
          })
        }
        </tbody>
      </table>
    </div>
  );
}
