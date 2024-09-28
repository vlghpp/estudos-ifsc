const numeroVisor = document.getElementById('visor')

const soma = document.getElementById('soma')
const sub = document.getElementById('subtracao')
const mult = document.getElementById('multiplicacao')
const divisao = document.getElementById('divisao')
const poten = document.getElementById('potenciacao')
const raiz = document.getElementById('raiz')
const porcen = document.getElementById('porcentagem')

let valorDisplay = ''
let historico = []
let x = 0
let y = 0
let operador = ''


function atualizaDisplay(){
    document.querySelector('#display').textContent = valorDisplay || '0'
}

function limpaDisplay() {
    valorDisplay = ''
    atualizaDisplay()
}

function adicionaSimbolo(simbolo){
    valorDisplay += simbolo
    atualizaDisplay()
}

function adicionaOperador(simbolo){
    x = parseFloat(valorDisplay)
    operador = simbolo
    valorDisplay += simbolo
    atualizaDisplay()
}

function calculaResultado(){
    y = parseFloat(valorDisplay)
    switch(operador){
        case "+":
            valorDisplay = x + y
            break


        default:
            break
    }
}

document.querySelectorAll('.numero').forEach(numero => {
    numero.addEventListener('click', () => {
        adicionaSimbolo(numero.textContent)
    })
})


document.querySelector('#soma').addEventListener('click', () => {
    adicionaSimbolo("+")
})


