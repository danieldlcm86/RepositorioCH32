import './Navbar.css'

/* Si no conocemos el props que pasaremos usamos la palabra reservada props, en caso que si lo conozcamos, solo pasamos la variable que declaramos en App.jsx
const Navbar = (props) => {
    console.log(props);
*/

const Navbar = ({ header, links }) => {

    return (
        <div className="navbar--container">
            <div className="navbar--title">
                <h1>{header}</h1>
            </div>
            <div className="navbar--links">
                {
                    links.map((link, index) => (
                        <div key={index} className='navbar--link'>
                            <a href={link.href}>{link.name}</a>
                        </div>
                    ))
                }
            </div>
        </div>
    )
}

export default Navbar