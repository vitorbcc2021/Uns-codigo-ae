#include <stdio.h>
#include <string.h>  //necessário para strlen
#include <conio.h>
#include <stdbool.h>

int main(void){
    //receber palavra do usuário
    char palavra[10];

    printf("entre com a palavra:" );
    scanf("%s", palavra);

    //verificar se a palavra é um palindromo, e se for verdade, imprimir isso na tela
    int tamanho = strlen(palavra);

    int aa=0, bb=tamanho-1;
    bool palindromo = false;
    while(palavra[aa] == palavra[bb]){
        if((aa == bb) || (aa>bb)){
            palindromo = true;
        }
        aa++;
        bb--;
    }

    if(palindromo){
        printf("Sim, palíndromo verdadeiro");
    }
    else{
        printf("Não, palíndromo falso");
    }

    return 0;
}
