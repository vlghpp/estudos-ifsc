function potencia(){
    let cache = {}

    return function exp(base, expoente){
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
