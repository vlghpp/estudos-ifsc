import { FaRegEdit, FaRegTrashAlt } from 'react-icons/fa';
import Rate from '../Rate';
import './style.css';


export default function Recipe({ id, name, ingredients, instructions, onEdit, onDelete }){
    return (
        <section className="recipes-card">
            <h2>{name}</h2>
            <h3>Ingredientes</h3>
            <ul>
                {ingredients.map((ingredient, i) => (
                    <li key={i}>{ingredient.quantidade} {ingredient.medida} de {ingredient.nome}</li>
                ))}
            </ul>
            <h3>Modo de preparo</h3>
            <ol>
                {instructions.map((instruction, i) =>(
                    <li key={i}>{instruction}</li>
                ))}
            </ol>
            
            <div className="footer">
                <Rate />    
                <FaRegEdit onClick={() => onEdit(id)}/>
                <FaRegTrashAlt onClick={() => onDelete(id)}/>
            </div>
            
            
        </section>
    
)

}