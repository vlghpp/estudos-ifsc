#include<stdio.h>

//retorna comprimento total da palavra
int string_rep(char *palavra, int repeticoes, char *palavra_repetida){
    for (int i = 0; i < repeticoes; i++){
        for (int j = 0; j < palavra; i++){
            palavra_repetida[j] = palavra[i];
        }
    }
    return sizeof(palavra_repetida);
}

int main(){
    char palavra[11];
    char palavra_repetida[101];
    int repeticoes;
    printf("Entre com uma palavra: ");
    scanf("%s", &palavra);

    printf("Entre com o número de repetições: ");
    scanf("%d", &repeticoes);

    printf("Resultado: %s \n", palavra_repetida);

    printf("Tamanho: %d\n", string_rep(palavra, repeticoes, palavra_repetida));

    return 0;
}