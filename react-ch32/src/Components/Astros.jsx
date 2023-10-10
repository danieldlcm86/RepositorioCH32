import './Astros.css';
import { useEffect, useState } from 'react';
import Progress from './Progress';
//http://api.open-notify.org/astros.json
//http://open-notify.org/Open-Notify-API/People-In-Space/

const DATA_URL = 'http://api.open-notify.org/astros.json';

//Crear divs que sirven como cards
const Astro = ({name, craft}) => {
    return (
        <div className="astro--container">
            <h2 className="astro--name">{name}</h2>
            <p className="astro--station">Space Station: {craft}</p>
        </div>
    )
}

//Implementando useState
const Astros = () => {
    const [astros, setAstros] = useState([])

//Implementado useEffect
    useEffect(() => {
        fetchAstros();
    }, []);

    const fetchAstros = () => {
        fetch(DATA_URL)
            .then(res => res.json())
            .then(data => setAstros(data.people))
            .catch(err => console.error(err))
    }

    console.log(astros);
    return(
        <>
            <h2>Astros API</h2>
            {
                //astros.length === 0 para que se muestre el Progress
                astros.length !== 0
                ?
                astros.map((astro, index) => (
                    <Astro key={index} {...astro} />
                ))
                :
                <Progress />
            }
        </>
    )
}

export default Astros;