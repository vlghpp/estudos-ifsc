type Operacao = (valor: number) => number

function incrementarPor(quantidade:number): Operacao {
    return (valor:number) => valor + quantidade
}
let incrementarCinco = incrementarPor(5)

console.log(incrementarCinco(10));
