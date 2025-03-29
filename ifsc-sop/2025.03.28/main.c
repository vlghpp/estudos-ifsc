#include<stdio.h>
#include<math.h>
float hav(float theta){
    return powf(sinf(theta / 2), 2);
}

float graus2rad(float grau){
    return (grau * (2 * M_PI / 360));
}

float distancia_na_terra(float lat1, float lon1, float lat2, float lon2){
    const float r = 6371.0;
    return  2 * r  * asinf((sqrtf(hav(lat2 - lat1) + cosf(lat1) * cosf(lat2) * hav(lon2 - lon1))));
}
int main(){
    float lat1, lon1, lat2, lon2;
    printf("Entre com lat lon do ponto 1: ");
    scanf("%f %f", &lat1, &lon1);

    printf("Entre com lat lon do ponto 2: ");
    scanf("%f %f", &lat2, &lon2);

    printf("Distância entre os pontos: %f \n", distancia_na_terra(graus2rad(lat1), graus2rad(lon1), graus2rad(lat2), graus2rad(lon2)));
    return 0;
}

