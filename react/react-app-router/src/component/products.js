import React from 'react';
import { Link } from 'react-router-dom';

export default function Products() {


    return (
        <div>

            <table border="1">
                <tr>
                    <td>
                        <Link to={`/products/abcd`}>
                            <div className="btn">View Details</div>
                        </Link>
                    </td>
                    <td>
                        <Link to={`/products/xyz`}>
                            <div className="btn">View Details</div>
                        </Link>
                    </td>
                </tr>
            </table>

        </div>
    )
}
 