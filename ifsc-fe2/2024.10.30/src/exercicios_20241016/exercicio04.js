let numeros = [5, 4, 3,2,1]

function somaParesAoQuadrado(array){
    array.filter(numero => numero % 2 == 0).map(numero => numero ** 2).reduce((soma, numero) => soma + numero)
}

console.log(somaParesAoQuadrado(numeros));
