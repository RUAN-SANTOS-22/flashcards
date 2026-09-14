import { Link } from "react-router-dom"

function Navbar() {
    return (
        <nav className="navbar navbar-expand-lg bg-body-tertiary">
            <div className="container">
                <Link className="navbar-brand" to="/">
                    Flashcards
                </Link>

                <div className="navbar-nav">
                    <Link className="nav-link" to="/revisar">
                        Revisar
                    </Link>

                    <Link className="nav-link" to="/baralhos">
                        Baralhos
                    </Link>
                </div>
            </div>
        </nav>
    )
}

export default Navbar