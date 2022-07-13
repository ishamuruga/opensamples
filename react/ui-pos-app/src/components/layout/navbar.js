import React from "react";
import { BrowserRouter as Router, Routes, Route, Link, useRoutes } from "react-router-dom";




export default function Navbar() {

  // https://getbootstrap.com/docs/4.0/components/navbar/

  return (
    <div>
      <nav className="navbar navbar-expand-sm navbar-light bg-light">
        <a className="navbar-brand" href="#">
          ePOS
        </a>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav ml-auto">
            <li className="nav-item active">
              <Link className="nav-link" to="/">Login</Link>
            </li>
            <li className="nav-item active">
              <Link className="nav-link" to="/dashboard">DashBoard</Link>
            </li>
            <li className="nav-item active">
              <Link className="nav-link" to="/aboutus">About Us</Link>
            </li>
          </ul>
          
        </div>
      </nav>
    </div>
  );
}
