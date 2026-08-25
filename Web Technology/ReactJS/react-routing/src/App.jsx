import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './components/Home';
import About from './components/About';
import Contact from './components/Contact';
import Services from './components/Services';
import NotFound from './components/NotFound';

const App = () => {
    return (
        <BrowserRouter>
            <ul>
                {/* Link tag is a higher order function */}
                <li><Link to="/home">Home Page</Link></li>
                <li><Link to="/about">About Page</Link></li>
                <li><Link to="/contact">Contact Page</Link></li>
                <li><Link to="/services">Services Page</Link></li>
            </ul>
            <hr />
            <Routes>
                <Route path='/home' element={<Home/>} ></Route>
                <Route path='/about' element={<About/>} ></Route>
                <Route path='/contact' element={<Contact/>} ></Route>
                <Route path='/services' element={<Services/>} ></Route>
                <Route path='*' element={<NotFound/>} ></Route>
            </Routes>
        </BrowserRouter>
    )
}

export default App