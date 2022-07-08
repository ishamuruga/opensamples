import React from "react";
import logo from "./logo.svg";

import "./App.css";
import { BrowserRouter as Router, Routes, Route, Link, useRoutes } from "react-router-dom";
import  Login from './components/secure/login';
import Aboutus from "./components/secure/aboutus";
import Navbar from "./components/layout/navbar";


const RouteCfg = () => {
 
  let rts = useRoutes([
    { path :"/", element:<Login/>},
    { path :"/login", element:<Login/>},
    { path :"/aboutus", element:<Aboutus/>},
  ]);
  return rts;
}


function App() {
  return (
    <div className="App">
      <Router>
        <Navbar/>
        <RouteCfg></RouteCfg>
      </Router>
      
      {/* <Routes> */}
          {/* <Route path="/" element={<Login />}></Route> */}
          {/* <Route path="/landing" element={<Landing />}></Route> */}
          {/* <Route path='/dashboard' element={<Dashboard/>}></Route> */}
        {/* </Routes> */}
    </div>
  );
}

export default App;
