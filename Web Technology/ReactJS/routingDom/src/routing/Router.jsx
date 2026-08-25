import {createBrowserRouter} from 'react-router-dom';
import Layout from '../layout/Layout';
import Home from '../components/Home';
import About from '../components/About';
import Contact from '../components/Contact';
import Services from '../components/Services';
import NotFound from '../components/NotFound';

const Router = createBrowserRouter([
    {
        path : "",
        element : <Layout/>,
        children : [
            {
                path : "/home",
                element : <Home/>
            },
            {
                path : "/about",
                element : <About/>
            },
            {
                path : "/contact",
                element : <Contact/>
            },
            {
                path : "/services",
                element : <Services/>
            },
            {
                path : "*",
                element : <NotFound/>
            }
        ]
    }
])

export default Router