#include <stdio.h>

typedef struct aluno {
	char *nome; int idade;
}aluno; //Desta forma, nao pode criar variaveis depois das chaves! deve ser criado na main!

void main(){
    aluno a1;
    a1.nome = "Vitor";
    a1.idade = 20;
    
    printf("%s com %d anos de idade faz ciencia da computacao!", a1.nome, a1.idade);

    aluno a2;

    a2.nome = "Miguel";
    a2.idade = 15;

    printf("\n%s com %d anos de idade faz sistemas da informacao!", a2.nome, a2.idade);
}
