int main() {
 int pid, status, k = 0;
 printf("processo %d\t antes do fork\n", getpid());
 pid = fork();
 printf("processo %d\t depois do fork\n", getpid());
 if (pid == -1) {
 perror("fork falhou!");
 exit(-1);
 } else if (pid == 0) {
 k += 1000;
 printf("processo filho\t pid: %d\t K: %d\n", getpid(), k);
 exit(0);
 } else {
 wait(&status);
 k += 10;
 printf("processo pai\t pid: %d\t K: %d\n", getpid(), k);
 exit(0);
 }
 }