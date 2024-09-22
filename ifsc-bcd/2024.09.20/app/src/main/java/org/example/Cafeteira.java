package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cafeteira {

    // List<List<String>> linhas = new ArrayList<>();
    // linhas.add(Arrays.asList("123", "juca", "j@email"));
    // escreve(linhas, "usuarios.csv", true);

    public static void escreve(List<List<String>> linhas, String filename, boolean append) {
        try {
            FileWriter arquivo = new FileWriter(filename, append);
            for (List<String> elem : linhas) {
                arquivo.append(String.join(",", elem));
            }
            arquivo.flush();
            arquivo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ArrayList<ArrayList<String>> linhas = le(usuarios.csv);
    public static ArrayList<ArrayList<String>> le(String pathname) {
        ArrayList<ArrayList<String>> linhas = new ArrayList<ArrayList<String>>(0);
        try {
            File entrada = new File(pathname);
            Scanner linha = new Scanner(entrada);

            while (linha.hasNext()) {
                String[] registro = linha.nextLine().split(",");

                ArrayList<String> list = new ArrayList<>(Arrays.asList(registro));
                linhas.add(list);
            }

            linha.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return linhas;
    }

    public static String userInfo(int id) {
        ArrayList<ArrayList<String>> linhasUsuarios = le("usuarios.csv");
        for(int i = 0; i < linhasUsuarios.size(); i++) {
            if(linhasUsuarios.get(i).get(0).equals(String.valueOf(id))) {
                return "\nInformações do usuário id " + id + "\n Nome: " + linhasUsuarios.get(i).get(1) + "\n Email: " + linhasUsuarios.get(i).get(2) + "\n Cŕedito dísponivel: R$" + linhasUsuarios.get(i).get(3);
            }
            return "\n Usuário não encontrado!";
        }
        String resp = "\tInformações do usuário id " + id;
        return resp;
    }

    public static String hist(int id) {
        ArrayList<ArrayList<String>> historicoCafeteira = le("consumo.csv");
        String resp = "";
        for(int i = 0; i < historicoCafeteira.size(); i++){
            if(historicoCafeteira.get(i).get(0).equals(String.valueOf(id))){
                resp += "O usuário de id: " + id + " consumiu um café do tipo " + historicoCafeteira.get(i).get(1) + " no dia " + historicoCafeteira.get(i).get(2) + " as " + historicoCafeteira.get(i).get(3) + " horas \n";
            }
        }
        if (!resp.equals("")){
            return resp;
        }
        return "O usuário informado ainda não consumiu nenhum dos nossos cafés!";
    }

    public static String cafInfo() {
        ArrayList<ArrayList<String>> linhaCafeteira = le("cafeteira.csv");
        return "O máximo de cafés que é suportado: " + linhaCafeteira.get(0).get(0) + " cápsulas;" + "\nQuantidade de cafés disponives: " + linhaCafeteira.get(0).get(1) + " cápsulas;" +  "\nValor da cápsula: R$" + linhaCafeteira.get(0).get(2) + ";";
    }

    public static String userAdd(String id, String nome, String email, String credito) {
        List<List<String>> linhas = new ArrayList<>();
        linhas.add(Arrays.asList(id,nome,email,credito));
        escreve(linhas,"usuarios.csv",true);

        String resp = "\tUsuário de id " + id + " adicionado";

        return resp;
    }

    public static String remUser(int id) {
        String resp = "\tUsuário de id " + id + " removido";

        return resp;
    }

    public static String servir(int id, int tipo) {
        String resp = "\tUsuário de id " + id + " servido café tipo " + tipo;
        if(tipo != 1 && tipo != 2) {
            resp = "\t Tipo de café inválido";
        }

        return resp;
    }

    public static String reabastecer() {
        String resp = "\tReabastecendo cafeteira ...";

        return resp;
    }


    //TODO ADICIONAR A FUNÇÃO DE LISTAR USUÁRIOS

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Cafeteira System");

        boolean continua = true;
        int opcao = 0;
        int id = 0;
        int tipo = 0;

        Scanner in = new Scanner(System.in);

        while (continua) {
            System.out.println("================");
            System.out.println("Digite 1: Para informações de usuário");
            System.out.println("Digite 2: Para histórico de cafés");
            System.out.println("Digite 3: Para informações da cafeteira");
            System.out.println("Digite 4: Para adicionar novo usuário");
            System.out.println("Digite 5: Para remover usuário");
            System.out.println("Digite 6: Para servir café");
            System.out.println("Digite 7: Para reabastecer cafeteira");
            System.out.println("Digite 8: Para sair");
            System.out.print("Sua opção: ");
            opcao = in.nextInt();
            in.nextLine();

            if (opcao == 1) {
                System.out.print("Entre com o id do usuário: ");
                id = in.nextInt();
                String resp = userInfo(id);
                System.out.println(resp);
                System.out.println();
            } else if (opcao == 2) {
                System.out.print("Entre com o id do usuário: ");
                id = in.nextInt();
                System.out.println();
                String resp = hist(id);
                System.out.println(resp);
            } else if (opcao == 3) {
                System.out.println("Informações da cafeteira:");
                String resp = cafInfo();
                System.out.println(resp);
                System.out.println();
            } else if (opcao == 4) {
                System.out.println("Adicionando novo usuário:");
                System.out.print("Entre com o id do usuário: ");
                String idUsuario = in.nextLine();
                System.out.print("Entre com o nome do usuário: ");
                String nome = in.nextLine();
                System.out.print("Entre com o email do usuário: ");
                String email = in.nextLine();
                System.out.print("Entre com o crédito do " + nome +": R$ ");
                String credito = in.nextLine();
                String resp = userAdd(idUsuario, nome, email, credito);
                System.out.println(resp);
                System.out.println();
            } else if (opcao == 5) {
                System.out.println("Removendo usuário:");
                System.out.print("Entre com o id do usuário: ");
                id = in.nextInt();
                String resp = remUser(id);
                System.out.println(resp);
                System.out.println();
            } else if (opcao == 6) {
                System.out.println("Servindo café:");
                System.out.print("Entre com o id do usuário: ");
                id = in.nextInt();
                System.out.print("Entre com o tipo de café (1 ou 2): ");
                tipo = in.nextInt();
                String resp = servir(id, tipo);
                System.out.println(resp);
                System.out.println();
            } else if (opcao == 7) {
                String resp = reabastecer();
                System.out.println(resp);
                System.out.println();
            } else if (opcao == 8) {
                continua = false;
            }
        }

        in.close();
    }
}