type Memo = {
    [posicao:number | string]: number
}

type Exp = (base:number, expoente:number)=> number

function potencia(): Exp{
    let cache:Memo = {}

    return function exp(base:number, expoente:number): number{
        let chave = `${base},${expoente}`

        if(chave in cache) return cache[chave]

        if(expoente === 0) return 1

        cache[chave] = base* exp(base, expoente - 1)
        return cache[chave]


    }
}

const pow = potencia()

console.log(pow(2,2));
console.log(pow(2,6));
