/*
Investigue WIFEXITED(status) e WEXITSTATUS(status) e modifique o exercício anterior para calcular
5!, com cada processo realizando uma multiplicação e retornando o resultado parcial.
*/


#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>


int fatorial(int x){
    if(x == 0){
        return 1;
    }
    return x * fatorial(x - 1);
}

int main() {
    int pid, status;
    pid = fork();
    if (pid == -1) {
        perror("fork falhou!");
        exit(-1);
    } else if (pid == 0) {
        int pid_filho = fork();
        if (pid_filho == -1) {
            perror("fork falhou!");
            exit(-1);
        } else if (pid_filho == 0) {
            int fat = 5 * 4;
            printf("Eu sou o processo %d, neto de %d; fat = %d\n", getpid(), getppid(), fat);
            exit(fat);
        }else{
            wait(&status);
            if(WIFEXITED(status)){
                int fat = WEXITSTATUS(status) * 3;
                printf("Eu sou o processo %d, filho de %d; fat = %d\n", getpid(), getppid(), fat);
                exit(fat);
            }
        }
    } else {
        wait(&status);
        if (WIFEXITED(status)) {
            int fat = WEXITSTATUS(status) * 2;
            printf("Eu sou o processo %d, pai; fat = %d\n", getpid(), fat);
            exit(fat);  
        }
    }
}