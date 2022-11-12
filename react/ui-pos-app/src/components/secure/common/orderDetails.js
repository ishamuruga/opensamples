import React, { useState, useEffect } from "react";
import CreateOrderVo from "../../../model/createordervo";
import OrderDetailsVo from "../../../model/orderdetailsvo";
import { MessageService } from "../../../services/data-comm";

export default function OrderDetails({ itms }) {
 // let itemCosts = [10.23, 45.41, 67.89, 67.12, 89.57, 23, 45, 6, , 7, 8, 9];

  // let processedItems = itms.map(x => {
  //   console.log(x);
  //   let c = itemCosts[x.category];
  //   x.cost = c * x.quantity;
  //   return x;
  // });

  const handleOrderCreate = (e)=> {
    e.preventDefault();
    let totalCost = 0;
    let orderDetailsvo = [];
    itms.map(item=>{
      orderDetailsvo.push(new OrderDetailsVo(item.id,item.quantity,item.name,item.category,item.cost));
      totalCost = totalCost + item.cost;
    });
    let orderId = "Order" + Math.random().toString();
    let createOrdervo = new CreateOrderVo(orderId,"Super Order",totalCost,orderDetailsvo);
    
    MessageService.send("EVT_CREATE_ORDER",createOrdervo);

  }

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
            itms.map(y => {
              return (
                <tr key={y.id}>
                  <th scope="row">{y.id}</th>
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
      <div class="text-center">
        {
          <button disabled={!(itms.length>0)} type="button" onClick={handleOrderCreate} class="btn btn-primary">Create Order</button>
        }
        
      </div>

    </div>
  );
}
