import React from 'react'
import {NavLink} from 'react-router-dom';

export default function Navbar() {
  return (
    <nav>
       <ul>
          <li>
             <NavLink to="/">Login</NavLink>
          </li>
          <li>
             <NavLink to="/home">Home</NavLink>
          </li>
          <li>
             <NavLink to="/products">Products</NavLink>
          </li>
          <li>
             <NavLink to="/about">About</NavLink>
          </li>
          <li>
             <NavLink to="/booklist">Booklist</NavLink>
          </li>
          
       </ul>
 </nav>
  )
} 
