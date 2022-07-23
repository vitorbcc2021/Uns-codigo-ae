#include <stdio.h>

long fatorial(long num){
    long num2 = num - 1;

    while(num2 > 0){
        num *= num2;
        num2--;
    }
    return num;
}

void main(){
    long fat = fatorial(4);

    printf("O fatorial e: %d", fat);
}
