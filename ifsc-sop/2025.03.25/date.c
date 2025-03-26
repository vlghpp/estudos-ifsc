#include <stdio.h>

int main() {
    int day, mounth, year;
    char *mesExtented;

    printf("Entre com a data:");
    scanf("%d/ %d/ %d/", &day, &mounth, &year);

    switch(mounth) {
        case 1:
            mesExtented = "Janeiro";
            break;
        case 2:
            mesExtented = "Fevereiro";
            break;
        case 3:
            mesExtented = "Março";
            break;
        case 4:
            mesExtented = "Abril";
            break;
        case 5:
            mesExtented = "Maio";
            break;
        case 6:
            mesExtented = "Junho";
            break;
        case 7:
            mesExtented = "Julho";
            break;
        case 8:
            mesExtented = "Agosto";
            break;
        case 9:
            mesExtented = "Setembro";
            break;
        case 10:
            mesExtented = "Outubro";
            break;
        case 11:
            mesExtented = "Novembro";
            break;
        case 12:
            mesExtented = "Dezembro";
            break;
    }

    if(day==1 || day % 10 == 1){
        printf("%s %dst, %d", mesExtented, day, year);
    }else if(day==2 || day%10 == 2){
        printf("%s %dnd, %d", mesExtented, day, year);
    }else if(day==3 || day %10 ==3){
        printf("%s %drd, %d", mesExtented, day, year);
    }else{
        printf("%s %dth, %d", mesExtented, day, year);

    }
    return 0;
}