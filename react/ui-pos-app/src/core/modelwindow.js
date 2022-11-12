import React, { useState, useEffect } from 'react'
import swal from 'sweetalert';


export default function ModelWindow({title,message}) {

    const styles = {
        popup: {
            display: "show",
            opacity: "0"
        }
    };

    useEffect(() => {
        swal({
            title: title,
            text: message,
            icon: "success",
            button: "Ok",
        });
    })


    return (
        <div>

        </div>
    )
}
