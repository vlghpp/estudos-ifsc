let produtos = [
    {nome: "sabonete",preco: 2},
    {nome: "xampu",preco: 5},
    {nome: "pasta de dente",preco: 6}
]

function aumentaPreco(){
    let inflacao = []
    return produtos.map(produto => {
        return {
            nome: produto.nome,
            preco: produto.preco * 1.1
        }
    })
}


console.log(produtos);
console.log(aumentaPreco(produtos));
console.log(produtos);

