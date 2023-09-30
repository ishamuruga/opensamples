import React, { useState, useEffect } from 'react'
import { addBooks, deleteBooks, fetchAllBooks } from './utils/booksapi';
import Book from './model/book';

export default function Booklist() {

  const [books, setBooks] = useState([]);

  useEffect(() => {
    fetchAllBooks().then(res => {
      console.log(res.data);
      setBooks(res.data);
    })
  }, [])

  const onDelete = (id)=> {
    deleteBooks(id).then(x=>{
      console.log("deleted");
    })
  }

  const onAddBooks = ()=>{
    let book = new Book(Math.random(),'Super Star','Basha','https://m.media-amazon.com/images/I/81yeN1VwEkL._SY466_.jpg');
  
    addBooks(book).then(x=>{
      let b = books;
      b.push(book);
      setBooks(b);
      console.log(books);
    })
  }


  return (
    <div>
      <h3>Add Books</h3>
      <button onClick={onAddBooks}>Add Books</button>
      <h3>List Books</h3>
      {
        books.map(b => {
          return (
            <div class="card" style={
              {
                "width": "18rem"
              }
            }>
              <img src={b.image} class="card-img-top" width="50" alt="Fissure in Sandstone" />
              <div class="card-body">
                <h5 class="card-title">{b.title}</h5>
                <p class="card-text">{b.id}</p>
                <p class="card-text">{b.author}</p>
                <button onClick={()=>onDelete(b.id)}>Delete</button>
              </div>
            </div>
          )
        })
      }
    </div>
  )
}


