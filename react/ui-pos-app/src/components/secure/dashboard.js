import React,{useState,useEffect} from 'react'
import OrderDetails from './common/orderDetails'
import OrderEntry from './common/orderEntry'

export default function Dashboard() {

  const [items,setItems] = useState([]);

  const doHandleAddItem = (e) => {
    console.log("==================")
    console.log(e);
    console.log(items);


    setItems(prev=>[...prev,e]);
    //let dat = items;  
    //console.log(dat.e);
    //dat.push(e);
    //setItems(dat);
    //setItems(dat);
    //// setItems(prev=>{
    //   return {
    //     ...prev,
    //     e
    //   }
    // });
    console.log(items);
  }

  // useEffect(()=>{
  //   console.log(items);
  // },[items]);


  return (
    <div>
      <OrderEntry onDoAddItem={doHandleAddItem}/>
      <OrderDetails itms={items}/>
    </div>
  )
}
