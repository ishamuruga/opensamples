import React,{useState,useEffect} from 'react'
import OrderDetails from './common/orderDetails'
import OrderEntry from './common/orderEntry'

export default function Dashboard() {

  const [items,setItems] = useState([]);

  const doHandleAddItem = (e) => {
    setItems(prev=>[...prev,e]);

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
