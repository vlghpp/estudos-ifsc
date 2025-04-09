#include<stdio.h>

char decompor(float x, int *parte_int, float *parte_frac){
    *parte_int = (int) x;
    *parte_frac = x - *parte_int;
    return x > 0 ? '+' : '-';
}


int main(){
    float x, parte_frac;
    int parte_int;
    printf("Entre com um número real: ");
    scanf("%f", &x);
    char operador = decompor(x, &parte_int, &parte_frac);
    printf("Sinal: %c \n", operador);
    printf("Parte inteira: %d \n", parte_int);
    printf("Parte fracionária: %f\n", parte_frac);
}