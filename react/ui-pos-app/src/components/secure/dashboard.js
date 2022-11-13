import React, { useState, useEffect } from 'react'
import ErrorBoundary from '../../core/error-boudary';
import ModelWindow from '../../core/modelwindow';
import { MessageService } from '../../services/data-comm';
import OrderDetails from './common/orderDetails'
import OrderEntry from './common/orderEntry'

export default function Dashboard() {

  const [items, setItems] = useState([]);
  const [status, setStatus] = useState({
    flag: false,
    id: "",
    message: ""
  })

  const doHandleAddItem = (e) => {
    setItems(prev => [...prev, e]);

  }

  useEffect(() => {

    MessageService.receive().subscribe(x => {

      if (x.event == "EVT_CREATE_ORDER_200") {
        console.log(JSON.stringify(x));
        setItems([]);
        setStatus({
          id: x.data.data.id,
          message: x.data.data.id + "," + x.data.data.status,
          flag: true
        })
        //return <ModelWindow title="MyTitle" message="MyMessage"/>
      }
    });


  }, []);

  useEffect(() => {
    setStatus(false);
  })


  return (
    <div>
      <ErrorBoundary>
        {
          status.flag && <ModelWindow title="Order Status" message={status.message} />
        }
        <OrderEntry onDoAddItem={doHandleAddItem} />
        <OrderDetails itms={items} />
      </ErrorBoundary>
    </div>
  )
}
