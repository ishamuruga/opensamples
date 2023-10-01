import { fireEvent, render, screen } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';

import {fetchAllBooks} from '../component/utils/booksapi';

// test('renders learn react link', () => {
// render(<App />);
//const linkElement = screen.getByText(/learn react/i);
//expect(linkElement).toBeInTheDocument();
// });

test('renders react component', async () => {
    

    let books = await fetchAllBooks();
    console.log(books.data.length);
    expect(books.data.length).toEqual(2);

});
