const composicao = (f, g) => {
    return function(x) {
        return f(g(x))
    }
}

function dobro(x){
    return x * 2
}
function quadrado(x){
    return x ** 2
}

let dobroQuadrado = composicao(dobro, quadrado)

console.log(dobroQuadrado(3));
