import { render, screen } from '@testing-library/react';
import App from './App';
import {BrowserRouter as Router} from 'react-router-dom';

// test('renders learn react link', () => {
  // render(<App />);
  //const linkElement = screen.getByText(/learn react/i);
  //expect(linkElement).toBeInTheDocument();
// });

test('renders react component', async () => {
  render(
    <Router>
      <App />
    </Router>,
  );

  const linkElement = screen.getByText('My Portal Page');
  expect(linkElement).toBeInTheDocument();
  // your tests...
});

