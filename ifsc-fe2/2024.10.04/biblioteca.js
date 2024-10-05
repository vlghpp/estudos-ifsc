class Livro{
    titulo
    autor
    ano
    constructor(titulo, autor, ano){
        this.titulo = titulo
        this.autor = autor
        this.ano = ano
    }

    emprestar(){
        console.log(`O livro ${this.titulo} está sendo emprestado.`);
    }

    devolver(){
        console.log(`O livro ${this.titulo} foi devolvido.`);
    }
    informaAutor(){
        console.log(`O livro ${this.titulo} é ${this.autor}`);
        
    }
}

let livro = new Livro("O pequeno principe", ["ROBERT JR", "LUCAS DA SILVA", "CAIOBA", "ARTHUR"], 1999)

livro.emprestar()
livro.informaAutor()