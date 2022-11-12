import React,{useState,useEffect} from 'react'
import ModelWindow from '../../core/modelwindow';
import { MessageService } from '../../services/data-comm';
import OrderDetails from './common/orderDetails'
import OrderEntry from './common/orderEntry'

export default function Dashboard() {

  const [items,setItems] = useState([]);

  const doHandleAddItem = (e) => {
    setItems(prev=>[...prev,e]);

  }

  useEffect(()=>{
    
    MessageService.receive().subscribe(x=>{
      if (x.event == "EVT_CREATE_ORDER"){
        console.log(" WIN WIN");
      }
    })
    
    
  },[]);


  return (
    <div>
      <ModelWindow/>
      {/* <OrderEntry onDoAddItem={doHandleAddItem}/>
      <OrderDetails itms={items}/> */}
    </div>
  )
}
