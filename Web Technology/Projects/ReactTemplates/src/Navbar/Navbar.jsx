import { NavLink } from 'react-router-dom';
import './Navbar.css';
import { useState } from 'react';

const Navbar = () => {
  // let user_id = localStorage.getItem(userId);
  // const [data, setData] = useState([]);
  return (
    <nav className="navbar" aria-label="Main navigation">
      {/* <div className="navbar__brand">M7 Web Technologies</div> */}

      <ul className="navbar__links">
        <li><NavLink to="/">Home</NavLink></li>
        <li>
            <>
            <NavLink to="/AllProducts">AllProducts</NavLink>
            <NavLink to="/cart">Cart</NavLink>
            </>
            <>
            <NavLink to="/edit-profile">EditProfile</NavLink>
            <NavLink to="/delete">DeleteProfile</NavLink>
            <NavLink to="/logout">Logout</NavLink>
            
            </>
        </li>
        <li>
            <NavLink to="/login">Login</NavLink>
            <NavLink to="/signup">SignUp</NavLink>
        </li>
      </ul>

      {/* <button type="button" className="navbar__button">
        Get Started
      </button> */}
    </nav>
  );
};

export default Navbar;
