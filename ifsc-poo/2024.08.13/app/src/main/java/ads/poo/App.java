/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
//        String currentDir =  System.getProperty("user.dir");
//
//        Path path = Path.of(currentDir + "/novo.txt");
//
//        try {
//            Files.createFile(path);
//            System.out.println("Arquivo criado");
//
//            Path novoPath = Path.of(currentDir + "/arquivo-renomeado.txt");
//            Files.move(path, novoPath);
//            System.out.println("Arquivo movido");
//
//            Files.deleteIfExists(novoPath);
//            System.out.println("Arquivo deletado");
//
//        } catch (Exception e) {
//            System.out.println("Erro: " + e);
//        }

//        System.out.println(currentDir);
//
//        String arquivo = args[0];
//        Path path = Path.of(arquivo);
//
//
//
//        if(Files.exists(path)){
//            System.out.println(String.format("Arquivo: %s", path.toAbsolutePath()));
//            //arquivo regular é todos aqueles que não são links, diretorios
//            System.out.println(String.format("Regular: %s", Files.isRegularFile(path)));
//            System.out.println(String.format("Diretório: %s", Files.isDirectory(path)));
//            System.out.println(String.format("Permissão de Leitura: %s", Files.isReadable(path)));
//            System.out.println(String.format("Permissão de escrita: %s", Files.isWritable(path)));
//        }else{
//            System.out.println("Arquivo não encontrado");


        String currentDir =  System.getProperty("user.dir");
        Path inicial = Path.of(currentDir);

        try(Stream<Path> walk = Files.walk(inicial)){
            walk.sorted().forEach(arq -> {
                // profundidade do caminho relativo ao diretório inicial
                int profundidade = inicial.relativize(arq).getNameCount();
                String sufixo = (Files.isDirectory(arq) ? " (d)" : "");
                System.out.println(" ".repeat(profundidade) + arq.getFileName() + sufixo);
            });
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
