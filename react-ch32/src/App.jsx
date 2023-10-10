import Navbar from './Components/Navbar.jsx'
import Main from './Components/Main.jsx'
import Astros from './Components/Astros.jsx'
import './App.css'

function App() {

  const linksData = [
    {name: 'Home', href: '/'},
    {name: 'About', href: '/'},
    {name: 'Astros', href: '/'},
  ]

  return (
    <>
      < Navbar header='Navbar' links={linksData} />
      <Main />
      <Astros />
    </>
  )
}

export default App
