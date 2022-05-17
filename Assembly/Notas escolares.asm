.data
	msgDigite: .asciiz "Digite 4 notas de 0 até 10: "
	msgMedia: .asciiz "\nA média da soma das 4 notas é: "
	msgErro: .asciiz "\nERRO: A sua nota é menor que 0.0, ou, maior que 10,0"
	
	inicioFloat: .float 0.0 # Uma constante zero precisa ser "inicializada" na memória ram
				# Para um número inteiro isto não é necessário pois ja é "inicializado" no $zero
	dez: .float 10.0
	quatroDiv: .float 4.0 # Para dividir as notas por 4
	
.text
	lwc1 $f1, inicioFloat # O comando load word coprocessador1 vai atribuir o valor de inicioFloat para o registrador $f1
	lwc1 $f9, dez
	lwc1 $f10, quatroDiv

	li $v0, 4
	la $a0, msgDigite
	syscall
	
	# Primeira nota
	li $v0, 6
	syscall
	mov.s $f2, $f0
	
	# Segunda nota
	li $v0, 6
	syscall
	mov.s $f3, $f0
	
	# Terceira nota
	li $v0, 6
	syscall
	mov.s $f4, $f0
	
	# Quarta nota
	li $v0, 6
	syscall
	mov.s  $f5, $f0
	
	# Soma das notas
	add.s $f6, $f2, $f3
	add.s $f7, $f4, $f5
	add.s $f8, $f6, $f7
	div.s $f11, $f8, $f10

	
	# Irá validar se a nota esta dentro da regra 0 à 10
	
	c.le.s $f11, $f9   # Compara se $f11(nota) é igual ou menor q $f9(10)
	bc1t fimPrograma  # Se for verdadeiro, vai para fim do programa
	bc1f deuErro      # Se for falso, então está errado!
	
	c.lt.s $f11, $f1   # Compara se $f11(nota) é menor que $f1(zero)
	bc1t deuErro	  # Se for verdadeiro, então está errado!
	bc1f fimPrograma  # Se for falso, então vai obedece a regra das notas e vai para fimPrograma
	
	fimPrograma:
		
		li $v0, 4
		la $a0, msgMedia
		syscall

		add.s $f12, $f1, $f11 # O registrador $f12 é o responsável por imprimir qualquer float
			   	     # Não foi necessário colocar um la para imprimí-lo
			   	     # Todo resultado deve ser armazenado em $f12 para ser impresso
		
		li $v0, 2
		syscall
		
		li $v0, 10	    # Para o programa
		syscall
	
	deuErro:
		li $v0, 4
		la $a0, msgErro
		syscall
		
		li $v0, 10	   # Para o programa
		syscall
