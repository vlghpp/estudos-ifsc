let numeros = [5, 4, 3,2,1]


let maiorElemento = function(array){
    return array.reduce ((maior, numero) => numero > maior ? numero : maior)
}

console.log(maiorElemento(numeros));

