#include <stdbool.h> /*inclui a biblioteca que contem a
				       possibilidade de criar variáveis booleanas */



float calcularSaldo(float salario, float gasto){ //recebe as variaveis flutuantes salario e gasto
	return salario - gasto;         //retorna a subtração de salario por gasto

}



float lerGastos(){           	/*faz com que enquanto "lendo" seja verdadeira
                            	  o programa continue a executar o código */
	bool lendo = true; 
	float g, gasto=0;

	while(lendo){

		printf("Entre com o gasto: ");

		scanf("%f", &g);     	 //escaneia o valor do gasto(g) inserido pelo usuário

		gasto = gasto + g;		 /*soma e faz atribuição de (g) na variável
		                  		 gasto que foi iniciada com o valor 0 */

		printf("Deseja parar de digitar gastos? (1)Sim (2)Nao : ");

		int x;

		scanf("%d", &x);

		if (x==1){      /*se o valor x inserido pelo usuário for igual a 1,
		                  declara lendo como falso, logo, para o while */

			lendo = false;

		}
	}

	return gasto;  //retorna o gasto total após todas as subtrações
}



int main(void){
    float salario, gasto, saldo;

  
    printf("Entre com a seu salario: ");

    scanf("%f", &salario);

  
    gasto = lerGastos(); //atribui o valor retornado pela função lergastos() para a variável gasto


    printf("Salario:%f \n", salario);

  
    saldo = calcularSaldo(salario, gasto); //atribui o valor retornado por calcularSaldo() para a variável saldo

    printf("Saldo:%f \n", saldo);


    return 0;
}
