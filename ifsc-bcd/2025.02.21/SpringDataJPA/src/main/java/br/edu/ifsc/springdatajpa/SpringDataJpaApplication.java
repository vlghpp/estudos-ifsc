package br.edu.ifsc.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(EmpregadoRepository repositorio){
        return (args -> {
//            insertDadosEmpregados(repositorio);
//            System.out.println(repositorio.findAll());

            System.out.println(repositorio.findEmpregadoBySobrenomeContaining("Ramos"));
        });
    }

    private void insertDadosEmpregados(EmpregadoRepository repositorio){
        repositorio.save(new Empregado("Arhur", "Lorenzon"));
        repositorio.save(new Empregado("Kauan", "Ramos"));
        repositorio.save(new Empregado("Eduardo", "Perock"));
    }
}
