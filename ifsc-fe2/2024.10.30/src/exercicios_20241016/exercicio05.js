let palavras = ['banana', 'casa', 'amora', 'maça'];

function stringsMaiusculas(array) {
    return array.filter( palavra => palavra.length > 5).map( palavra => palavra.toUpperCase());
}

console.log(stringsMaiusculas(palavras));