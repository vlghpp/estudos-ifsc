function fibonacci(numero){
    let cache = {}

    function fib(numero){
        if(numero in cache) return cache[numero]
        
        if(numero <= 1) return numero

        cache[numero] = fib(numero - 1) + fib(numero - 2)
        return cache[numero]
    }

    return fib(numero)
}

//passa o indice do elemento na linha fibonacci
console.log(fibonacci(7))
