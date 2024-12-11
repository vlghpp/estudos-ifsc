package ads.esd.exercicios_pilha;

import ads.esd.estruturas.ListaSequencial;
import ads.esd.estruturas.Pilha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try{
            FileInputStream arquivo = new FileInputStream("arquivo.txt");
            Scanner scanner = new Scanner(arquivo);
            Pilha pilha = new Pilha();
            ListaSequencial linhaArquivo = new ListaSequencial();
            while(scanner.hasNext()){
                String linha = scanner.nextLine();
                for(String elemento : linha.split(" ")){
                    try {
                        int numero = Integer.parseInt(elemento);
                        pilha.empilha(linha);
                    } catch (NumberFormatException e) {

                    }
                }
            }

            while(!pilha.estaVazia()){
                System.out.println(pilha.desempilha());
            }



        }catch(FileNotFoundException e){
            System.out.println("ARQUIVO NÃO ENCONTRADO!");
        }
    }
}
