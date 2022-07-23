#include <stdio.h>
#include <stdbool.h>

struct aluno {  //cria a estrutura aluno
	char *nome; int idade; bool possuiCarro; //cria o ponteiro char nome e o valor inteiro idade
	//Obs: Strings apenas funcionam se foram um ponteiro do tipo char!
} a1, a2;   //cria as variáveis da estrutura, a1 e a2

void main(){
    a1.nome = "Afranio";  //atribui a string Afranio para o ponteiro nome da variavel a1
    a1.idade = 32;        //atribui a idade 32 para o inteiro idade do a1
    a1.possuiCarro = true;
    a2 = a1;              //atribui os valores de a1 para a2
    
    a1.idade = 47;    /* Este valor nao muda o de a2, pois eles compartilham espaços diferentes na memoria!
                         se este valor fosse de uma classe e não de uma struct, então a2 estaria recebendo
                         uma referencia para a2, ou seja, iriam trabalhar com o mesmo endereco na memoria!
                         Logo, modificar a1 modificaria a2, e o inverso tambem ocorreria*/

    if(a2.possuiCarro){
        printf("%s tem %d anos de idade e possui carro!", a2.nome, a2.idade);  //imprime o nome de a2 e a idade
    }
    else{
        printf("%s tem %d anos de idade e nao possui carro!", a2.nome, a2.idade);
    }
}
