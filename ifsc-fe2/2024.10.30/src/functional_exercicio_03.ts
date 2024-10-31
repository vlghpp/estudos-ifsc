let numero = [5, 4, 3,2,1]


let maiorElemento = function(array: number[]): number{
    return array.reduce ((maior, numero) => numero > maior ? numero : maior)
}

console.log(maiorElemento(numeros));

