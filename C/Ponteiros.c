#include <stdio.h>

int main(){
    int vetor[100], *p1, *p2, i, j, k, l, m;
    i = 0;
    p1 =& i;
    for(j=0; j<100; j++){
        vetor[j] = *p1;
    }
    //printf("%d\n", vetor[10]);  //este é um printf de teste
    
    k=1;
    p2 =& k;
    for(l=0; l<100; l++){
        vetor[l] = (*p2)++;
    }
    //printf("teste: %d \n \n", vetor[17]); //este também é um printf de teste

    for(m=0; m<100; m++){
        printf("%d  ", vetor[m]);
    }

    return 0;
}
