import {Link} from 'react-router-dom'
import './Navigation.css'

function Navigation() {

  return (
    <>
        {/* <h1>Header</h1> */}
        <header>
            <nav>
                <div className='logo'>
                    <p>NAME</p>
                </div>
                <ul>
                    <li className='move'>
                        <Link to='/home'>Home</Link>
                        <span></span>
                    </li>
                    <li className='move'>
                        <a href="#">About</a>
                        <span></span>
                    </li>
                    <li className='move'>
                        <a href="#">Skills</a>
                        <span></span>
                    </li>
                    <li className='move'>
                        <a href="#">Projects</a>
                        <span></span>
                    </li>
                    <li className='move'>
                        <a href="#">Contact</a>
                        <span></span>
                    </li>
                </ul>
            </nav>
        </header>
    </>
  )
}

export default Navigation