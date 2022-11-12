import React,{useState,useEffect} from 'react'
import ModelWindow from '../../core/modelwindow';
import { MessageService } from '../../services/data-comm';
import OrderDetails from './common/orderDetails'
import OrderEntry from './common/orderEntry'

export default function Dashboard() {

  const [items,setItems] = useState([]);
  const [status,setStatus] = useState(false)

  const doHandleAddItem = (e) => {
    setItems(prev=>[...prev,e]);

  }

  useEffect(()=>{
    
    MessageService.receive().subscribe(x=>{
      console.log(x.event);
      if (x.event == "EVT_CREATE_ORDER_200"){
        setStatus(true);
        //return <ModelWindow title="MyTitle" message="MyMessage"/>
      }
    });
    
    
  },[]);

  useEffect(()=>{
    setStatus(false);
  })


  return (
    <div>
      {
        status && <ModelWindow title="Order Status" message="Order Created Sucessfully"/>
      }
      <OrderEntry onDoAddItem={doHandleAddItem}/>
      <OrderDetails itms={items}/> 
    </div>
  )
}
