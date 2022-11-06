import React from "react";
import logo from "./logo.svg";

import "./App.css";
import { BrowserRouter as Router, Routes, Route, Link, useRoutes } from "react-router-dom";
import Login from './components/secure/login';
import Aboutus from "./components/secure/aboutus";
import Navbar from "./components/layout/navbar";
import Dashboard from "./components/secure/dashboard";
import PageNotFound from "./components/secure/pageNotFound";
import ProtectedRoute from "./core/protectedRoute";


const RouteCfg = () => {
  const data = {
    id:"super",
    name:"star"
  };

  let rts = useRoutes([
    { path: "/", element: <Login /> },
    { path: "/login", element: <Login /> },
    {
      path: "/dashboard", element: (
        <ProtectedRoute user={data}>
          <Dashboard />
        </ProtectedRoute >
      )
    },
    { path: "*", element: <PageNotFound /> }

  ]);
  return rts;
}


function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
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
