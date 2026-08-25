import {createBrowserRouter, Route, createRoutesFromElements} from 'react-router-dom';
import Layout from '../layout/Layout';
import Home from '../components/Home';
import About from '../components/About';
import Contact from '../components/Contact';
import Services from '../components/Services';
import NotFound from '../components/NotFound';

const Router = createBrowserRouter(
    createRoutesFromElements(
        <Route path='/' element={<Layout/>}>
            <Route path='/home' element={<Home/>} />
            <Route path='/about' element={<About/>} />
            <Route path='/contact' element={<Contact/>} />
            <Route path='/services' element={<Services/>} />
            <Route path='*' element={<NotFound/>} />
        </Route>
    )
);

export default Router