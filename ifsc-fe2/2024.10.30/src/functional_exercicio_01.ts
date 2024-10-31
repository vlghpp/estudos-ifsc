"use strict"

let numeros = [5, 4, 3,2,1]

// FORMATO FUNCIONAL

function quadrado(array: Array<number>): number[]{
    let quadrados = []

    for(let i = 0; i < array.length; i++){
        quadrados.push(array[i] ** 2)
    } 
       
    //quadrados = array.map(n=> n**2)

    return quadrados
}

console.log(numeros);
console.log(quadrado(numeros));
console.log(numeros);