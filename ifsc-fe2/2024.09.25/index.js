const numeroVisor = document.getElementById('visor')

const soma = document.getElementById('soma')
const sub = document.getElementById('subtracao')
const mult = document.getElementById('multiplicacao')
const divisao = document.getElementById('divisao')
const poten = document.getElementById('potenciacao')
const raiz = document.getElementById('raiz')
const porcen = document.getElementById('porcentagem')


const numeros = document.querySelectorAll('.numero')

numeros.forEach(numero => {
    numero.addEventListener('click', e => {
        const texto = numero.innerHTML
        numeroVisor.innerHTML =  
    })
})



