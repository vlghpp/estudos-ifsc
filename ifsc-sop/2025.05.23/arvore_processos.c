/*

Implemente um programa que crie uma árvore de 3 processos com chamadas encadeadas de fork().
Cada processo deve imprimir "Eu sou o processo XXX, filho de YYY"usando getpid() e getppid(),
e os wait() devem garantir a ordem: C antes de B, B antes de A. Use sleep(1) entre as mensagens.

*/

#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    int pid;
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
            printf("Eu sou o processo %d, neto de %d\n", getpid(), getppid());
            sleep(1);
            exit(0);
        }else{
            wait(0);
            printf("Eu sou o processo %d, filho de %d\n", getpid(), getppid());
            sleep(1);
            exit(0);
        }
        exit(0);
    } else {
        wait(0);
        printf("Eu sou o processo %d, pai\n", getpid());
        exit(0);
    }
}