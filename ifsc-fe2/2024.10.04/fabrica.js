function carro(ano, modelo, marca){
    let c = Object.create(carro.definicao)
    c.ano = ano
    c.modelo = modelo
    c.marca = marca
    return c
}

carro.definicao {
    andar: function(){
        console.log("O carro começou a andar");
        
    };
    buzinar: function(){
        console.log("O carro faz bibi!");
        
    };
    virar: function(direcao){
        console.log("O carro está virando para a " + direcao);  
    }
}