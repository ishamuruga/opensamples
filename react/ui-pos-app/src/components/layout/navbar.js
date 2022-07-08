import React from "react";
import { BrowserRouter as Router, Routes, Route, Link, useRoutes } from "react-router-dom";




export default function Navbar() {

  // https://getbootstrap.com/docs/4.0/components/navbar/

  return (
    <div>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
          ePOS
        </a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <Link className="nav-link" to="/">Login</Link>
            </li>
            <li class="nav-item active">
              <Link className="nav-link" to="/aboutus">About Us</Link>
            </li>
          </ul>
          
        </div>
      </nav>
    </div>
  );
}
