import { fireEvent, render, screen } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';

import Login from '../component/login';

// test('renders learn react link', () => {
// render(<App />);
//const linkElement = screen.getByText(/learn react/i);
//expect(linkElement).toBeInTheDocument();
// });

test('renders react component', async () => {
    render(
        <MemoryRouter>
            <Login />
        </MemoryRouter>


    );


    //   let nameTextBox = screen.getByRole('input', {
    //     name: /username/i,
    //   });

    let nameLabel = screen.getByText('UserName:-');
    let passwordLabel = screen.getByText(/Password:-/i);

    //const linkElement = screen.getByText('My Portal Page');
    expect(nameLabel).toBeInTheDocument();
    expect(passwordLabel).toBeInTheDocument();

    // your tests...
});



test('renders react component', async () => {
    render(
        <MemoryRouter>
            <Login />
        </MemoryRouter>


    );

    const usernameinput = screen.getByLabelText(/UserName:-/i);
    expect(usernameinput).toHaveAttribute('type', 'text');
});


test('Disabled', async () => {
    render(
        <MemoryRouter>
            <Login />
        </MemoryRouter>


    );

    const usernameinput = screen.getByLabelText(/UserName:-/i);
    fireEvent.change(usernameinput,{
        'target' :{
            'value':''
        }
    });
    const btn = screen.getByRole('button',{name:'DoLogin'})

    expect(btn).toHaveAttribute('disabled',"");
    // const passwordinput = screen.getByLabelText(/Password:-/i);

});

test('State change', async () => {
    render(
        <MemoryRouter>
            <Login />
        </MemoryRouter>


    );

    const usernameinput = screen.getByLabelText(/UserName:-/i);
    fireEvent.change(usernameinput,{
        'target' :{
            'value':'userb'
        }
    });

    const passwordinput = screen.getByLabelText(/Password:-/i);
    fireEvent.change(passwordinput,{
        'target' :{
            'value':'userb'
        }
    });

    const btn = screen.getByRole('button',{name:'DoLogin'})

    //expect(btn).not.toHaveAttribute('disabled');

    fireEvent.click(btn);
     console.log(sessionStorage.getItem('auth'));

    // const passwordinput = screen.getByLabelText(/Password:-/i);

});

