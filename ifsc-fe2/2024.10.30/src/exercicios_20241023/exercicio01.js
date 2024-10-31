let numeros = [0,[1,1,[2,3], 5], 8, 13, 21]

function somaArray(array){
    let soma = 0

    for (let i = 0; i < array.length; i++) {
        if(Array.isArray(array[i])){
            soma += somaArray(array[i])
        }else if (typeof array[i] === 'number'){
            soma += array[i]
        }

    }
    return soma;
}


console.log(somaArray(numeros))