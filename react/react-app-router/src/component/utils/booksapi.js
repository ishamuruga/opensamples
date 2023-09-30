import axios from 'axios';

const fetchAllBooks = ()=>{
    return axios.get(`http://localhost:4000/books`);
}

const addBooks = (book)=>{
    return axios.post(`http://localhost:4000/books`,book);
}

const deleteBooks = (id)=>{
    return axios.delete(`http://localhost:4000/books/${id}`);
}

export {fetchAllBooks,addBooks,deleteBooks}