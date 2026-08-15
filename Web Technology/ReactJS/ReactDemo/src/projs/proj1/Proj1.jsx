import style from './Proj1.module.css'
import profile from './pic1.svg'
import wishlist from './pic2.svg'
import cart from './pic3.svg'
import logo from './myntra.svg'

const Proj1 = () => {
    return (
        <div className={style.container}>
            <nav className={style.navBar}>
                <img id={style.logo} src={logo} alt="abc" />
                <ul className={style.navUl}>
                    <li className={style.list}>MEN</li>
                    <li className={style.list}>WOMEN</li>
                    <li className={style.list}>KIDS</li>
                    <li className={style.list}>HOME</li>
                    <li className={style.list}>BEAUTY</li>
                    <li className={style.list}>GENZ</li>
                    <div className={style.sup}>
                        <li className={style.list}>STUDIO<sup>NEW</sup></li>
                    </div>
                </ul>
                <input id={style.search} type="text" placeholder='Search' />
                <div className={style.buttons}>
                    <img className={style.images} src={profile} alt="" />
                    <p>Profile</p>
                </div>
                <div className={style.buttons}>
                    <img className={style.images} src={wishlist} alt="" />
                    <p>Wishlist</p>
                </div>
                <div className={style.buttons}>
                    <img className={style.images} src={cart} alt="" />
                    <p>Bag</p>
                </div>
            </nav>
        </div>
    )
}

export default Proj1