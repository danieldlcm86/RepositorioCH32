import './Navbar.css';

const NavbarV1 = () => {

    //Otra forma de agregar estilos
    /*
    const aStyles = {
        color: 'white',
        fontSize: '1.3rem',
        TextDecoration: 'none',
    }*/

    return(
        <div className='navbar--container'>
            <div className="navbar--title">
                <h1>Navbar</h1>
            </div>
            <div className="navbar--links">
                <div className="navbar--link">
                    <a href="#">Home</a>
                </div>
                <div className="navbar--link">
                    <a href="#" /* style={aStyles}llamamos el estilo declarado arriba*/ >About</a>
                </div>
                <div className="navbar--link">
                    <a //Estilos inline con doble llave, no los vamos a aplicar
                        href="#"
                        /*style={{
                            color: 'white',
                            fontSize: '1.3rem',
                            textDecoration: 'none',
                        }}*/
                    >
                        Astros
                    </a>
                </div>
            </div>
        </div>
    )
}

export default NavbarV1;