type Caches = {
    [posicao:number]: number
}

type Numero = (valor: number) => number

function fibonacci(numero:number): Numero  {
    let cache: Caches = {}

    return function fib(numero:number): number{
        if(numero in cache) return cache[numero]
        
        if(numero <= 1) return numero

        cache[numero] = fib(numero - 1) + fib(numero - 2)
        return cache[numero]
    }
}

//passa o indice do elemento na linha fibonacci
console.log(fibonacci(7))
