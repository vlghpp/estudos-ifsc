export default function Form( { recipe, onEdit }){
    return(
        <div>
            { recipe &&
                <form>
                <h2>Editar Receitas</h2>
                <input type="text" name="nome" placeholder="Nome da receita" value={recipe.nome} onChange={(e) => onEdit({...recipe, nome: e.target.value})}/>
                <div>
                    <h3>Ingredientes</h3>
                    <ul>
                        {recipe.ingredientes.map((ingredient, i) => {
                            return(
                                <li key={i} >
                                    <input 
                                        type="text" 
                                        value={ingredient.nome} 
                                        
                                    />

                                    <input type="text" value={ingredient.quantidade}/>
                                    <input type="text" value={ingredient.medida}/>
                                </li>
                            )
                            
                        })}
                    </ul>
                </div>

                <div>
                    <h3>Modo de preparo</h3>
                    <ol>
                        {recipe.instrucoes.map((instruction, i) => {
                            return(
                                <li key={i}>
                                    <input type="text" name="instrucao" value={instruction} placeholder={`Passo ${i + 1}`}/>
                                </li>
                            )
                        })}
                    </ol>
                </div>
            </form>
            }

        </div>
        
    )
}