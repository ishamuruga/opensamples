import React from 'react';
import { useParams } from 'react-router-dom';

export default function ProductDetails() {

    const { name } = useParams();
    return (
        <div>
            <div className="container">
                <h1>Products Details Page - {name}</h1>
            </div>

        </div>
    )
}
 