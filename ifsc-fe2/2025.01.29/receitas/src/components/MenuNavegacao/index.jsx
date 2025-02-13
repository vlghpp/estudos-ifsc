import { Link, useLocation } from 'react-router'
import './style.css'
import LinkNavegacao from '../LinkNavegacao'

const MenuNavegacao = () => {
    const localizacao = useLocation()

    return (
        <nav className="menu-navegacao">
            <LinkNavegacao to="/">Home</LinkNavegacao>
            <LinkNavegacao to="/adicionar">Nova Receita</LinkNavegacao>
        </nav>

    )
}

export default MenuNavegacao