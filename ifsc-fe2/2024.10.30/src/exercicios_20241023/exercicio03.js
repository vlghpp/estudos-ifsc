function gerarSequencia(inicio, passo){
    let valor = inicio - passo
    return function(){
        valor += passo
        return valor
    }
}

let sequencia = gerarSequencia(2, 3)

console.log(sequencia());
console.log(sequencia())
console.log(sequencia())
console.log(sequencia())
console.log(sequencia())
console.log(sequencia())
