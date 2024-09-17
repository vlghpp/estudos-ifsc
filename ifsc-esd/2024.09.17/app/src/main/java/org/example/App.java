
package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String opcaoUsuario = "";
        int c = 0;
        List<String> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        while(!opcaoUsuario.equals("sair")){
            System.out.print(">");
            opcaoUsuario = teclado.nextLine();
            if(opcaoUsuario.equals("?")){
                if(lista.isEmpty()){
                    System.out.println("A lista está vazia!");
                }else{
                    String proximoCliente = lista.getFirst();
                    System.out.println(proximoCliente);
                }
            }else if(!opcaoUsuario.equals("") && !opcaoUsuario.equals("sair")){
                lista.add(opcaoUsuario);
                System.out.println("Você foi adicionado a fila, tem " + lista.size());
            }
        }
    }
}
