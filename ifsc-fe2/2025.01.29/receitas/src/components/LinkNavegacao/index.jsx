import { Link, useLocation } from "react-router"

const LinkNavegacao = ({children, to}) =>{
    const localizacao = useLocation()

    return (
        <nav className="menu-navegacao">
            <Link to={to} className={`link ${localizacao.pathname === to && 'linkSelecionado'}`}>{children}</Link>
        </nav>
    )
}

export default LinkNavegacao