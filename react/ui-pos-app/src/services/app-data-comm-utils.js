import axios from 'axios';
import React, { useEffect } from 'react'
import Config from '../model/config';
import { MessageService } from "./data-comm"


export default function AppDataComm() {

    const myHeader = {
        headers: {
            'Content-Type': 'application/json',
        }
    }

    useEffect(() => {
        MessageService.receive().subscribe(payload => {
            if (payload.event == "EVT_CREATE_ORDER") {
                axios.post(Config.url + Config.createorder, JSON.stringify(payload.data), myHeader)
                    .then((res) => {
                        console.log("Response from the server 8080")
                        MessageService.send("EVT_CREATE_ORDER_200", { res });
                    }).catch(err => {
                        console.log("Error in Order Creation")
                        console.error(err);
                        MessageService.send("EVT_CREATE_ORDER_400", {});
                    })
            }
        });
    })

    return (
        <div>
            {/* Common data Communication */}
        </div>
    )
}
