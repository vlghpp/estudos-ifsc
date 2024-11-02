let numer = [5, 4, 3,2,1]

function somaParesAoQuadrado(array: Array<number>): number {
    return array.filter(numero => numero % 2 == 0).map(numero => numero ** 2).reduce((soma, numero) => soma + numero)
}

console.log(somaParesAoQuadrado(numeros));
