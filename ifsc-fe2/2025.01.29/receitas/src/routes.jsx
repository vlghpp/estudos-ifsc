import Cabecalho from "./components/Cabecalho/Cabecalho";
import "./App.css";
import { ReceitaProvider } from "./contexto/ReceitaContext";
import Principal from "./components/Principal";
import {BrowserRouter, Routes, Route} from "react-router"
import Form from "./components/Form";

function AppRoutes() {
  return (
    <div>
      <BrowserRouter>
      <Cabecalho titulo="Receitas Deliciosas" />
      <ReceitaProvider>
        <Routes>
          <Route path="/" element={<Principal></Principal>}></Route>
          <Route path="/adicionar" element={<h1>Nova Receita</h1>}></Route>
          <Route path="/:id" element={<Form />}></Route>
          <Route path="*" element={<Principal />}></Route>
        </Routes>
      </ReceitaProvider>
      </BrowserRouter>
    </div>
  );
}

export default AppRoutes;
