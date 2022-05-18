#include <stdio.h>
#include <stdlib.h>

struct aluno {  //cria a estrutura aluno
	char *nome; int idade;  //cria o ponteiro char nome e o valor inteiro idade
} a1, a2;   //cria as variáveis da estrutura, a1 e a2

void main(){
  a1.nome = "Afranio";  //atribui a string Afranio para o ponteiro nome da variavel a1
  a1.idade = 32;        //atribui a idade 32 para o inteiro idade do a1
  a2 = a1;             //atribui os valores de a1 para a2

  printf("%s %d", a2.nome, a2.idade);  //imprime o nome de a2 e a idade

}
