import logo from './logo.svg';
import './App.css';
import { lazy, Suspense } from 'react';

import { Routes, Route } from 'react-router-dom';
import Login from './component/login';
import Home from './component/home';
import Products from './component/products';
import About from './component/about';
import Navbar from './component/navbar';
import Pagenotfound from './component/pagenotfound';
import Proddetails from './component/proddetails';
import Protected from './component/protected';
import Booklist from './component/booklist';

function App() {
  return (
    <>
    <div>My Portal Page</div>
      <Navbar />
      {/* <Suspense fallback={<div className="container">Loading...</div>}> */}
        <Routes>
          <Route path='/' element={<Login />} />
          <Route path='/home' element={<Home />} />
          <Route path='/products' element={
            <Protected name={'products'}>
              <Products />
            </Protected>

          } />

          <Route path='/products/:name' element={<Proddetails />} />
          
          <Route path='/about' element={
            <Protected name={'about'}>
              <About />
            </Protected>

          } />

          <Route path='/booklist' element={
            <Protected name={'booklist'}>
              <Booklist />
            </Protected>

          } />

          <Route path="*" element={<Pagenotfound />} />
        </Routes>
      {/* </Suspense> */}
    </>
  );
}

export default App;
 