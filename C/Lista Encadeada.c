#include <stdio.h>
#include <stdlib.h>

typedef struct ponto{
    int x, y;
    struct ponto *proximo;
}ponto;

int main(void){
    ponto *iniLista; // Marca o ponto de início da Lista Encadeada

    ponto *proximo_ponto;/* Sempre vai guardar o endereço do novo espaço alocado, assim,
                            sendo possível modificá-lo através deste ponteiro   */
    int resp;

    iniLista = malloc(sizeof(ponto));   /*  Atribui para a variavel iniLista um endereço de memória
                                            que consegue armazenar uma struct ponto */

    if(iniLista == NULL) exit(1);   /*  Malloc retorna null se não conseguir alocar, por isso fiz o teste:
                                        se for igual a null, então termina a execução do programa   */

    proximo_ponto = iniLista;

    while(1){
        printf("Digite um valor para x: ");
        scanf("%d", &proximo_ponto -> x); // A seta é usada para acessar a variável da struct
        printf("Digite um valor para y: ");
        scanf("%d", &proximo_ponto -> y);
        printf("Deseja continuar digitando numeros?\n(1)SIM    (outro valor)NAO\n");
        scanf("%d", &resp);

        if(resp == 1){
            proximo_ponto -> proximo = malloc(sizeof(ponto));
            proximo_ponto = proximo_ponto -> proximo;
                                /*  AQUI E ONDE A MAGICA ACONTECE!!!
                                    Basicamente,  toda vez que o usuario desejar continuar
                                    digitando mais valores, o malloc vai alocar um novo espaço
                                    na memória do tamanho de uma 'struct ponto' e guardar o endereço
                                    desse espaço alocado no ponteiro 'proximo' dentro da struct, e
                                    depois será atribuido esse mesmo endereço ao ponteiro 'proximo_ponto'
                                */
        }
        else break;
    }

    proximo_ponto -> proximo = NULL;/*  Como ja mexemos varias vezes com o ponteiro 'proximo', ele ja esta
                                        guardando o ultimo espaço alocado, portanto, vamos resetar ele para
                                        que póssamos voltar a utilizá-lo do zero    */

    proximo_ponto = iniLista; //Também vamos voltar o ponteiro 'proximo_ponto' para o inicio da nossa Lista, nosso primeiro espaço alocado! 

    while(proximo_ponto != NULL){
        printf("x: %d    y: %d\n", proximo_ponto->x, proximo_ponto->y);
        proximo_ponto = proximo_ponto -> proximo; /*    Como 'proximo_ponto' sempre esta recebendo 'proximo'
                                                        no momento que ele chegar no final o valor recebido
                                                        será null e irá parar   */
    }

    return 0;
}
