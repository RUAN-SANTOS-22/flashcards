import { BrowserRouter, Routes, Route } from "react-router-dom"

import Home from "./pages/Home"
import Revisar from "./pages/Revisar"
import Baralho from "./pages/Baralho"
import Navbar from "./components/NavBar"

function App() {
    return (
        <BrowserRouter>
            <Navbar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/revisar" element={<Revisar />} />
                <Route path="/baralho" element={<Baralho />} />
            </Routes>
        </BrowserRouter>
    )
}

export default App