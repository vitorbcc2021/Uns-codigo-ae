.data

	msg_digite1: .asciiz "Digite 1 para somar\n"
	msg_digite2: .asciiz "Digite 2 para subtrair\n"
	msg_digite3: .asciiz "Digite 3 para multiplicar\n"
	msg_digite4: .asciiz "Digite 4 para dividir\n"
	msg_digite0: .asciiz "Digite 0 para encerrar o programa\n"
	msg_opcao: .asciiz "Digite sua escolha: "
	msg_resultado: .asciiz "O resultado e: "
	msg_encerrado: .asciiz "O programa foi encerrado ;)\n"
	msg_soma: .asciiz "Digite 2 inteiros para realizar uma soma: "
	msg_subtracao: .asciiz "Digite 2 inteiros para realizar uma subtracao: "
	msg_mult: .asciiz "Digite 2 inteiros para realizar uma multiplicacao: "
	msg_div: .asciiz "Digite 2 inteiros para realizar uma divisao: "

.text

	#ira imprimir as opcoes para o usuario ler e escolher

	li $v0, 4
	la $a0, msg_digite1
	syscall

	li $v0, 4
	la $a0, msg_digite2
	syscall

	li $v0, 4
	la $a0, msg_digite3
	syscall

	li $v0, 4
	la $a0, msg_digite4
	syscall

	li $v0, 4
	la $a0, msg_digite0
	syscall

	li $v0, 4
	la $a0, msg_opcao
	syscall

	#ira pegar o digito da opcao do usuario

	li $v0, 5
	syscall
	move $t1, $v0

	#avaliara a opcao do usuario de acordo com as opcoes

	beqz $t1, paraPrograma
	beq $t1, 1 , somarInteiros
	beq $t1, 2 , subtrairInteiros
	beq $t1, 3 , multiplicarInteiros
	beq $t1, 4 , dividirInteiros
	
	#executara de acordo com o que foi escolhido pelo usuario
	
	paraPrograma:
		li $v0, 4
		la $a0, msg_encerrado
		syscall
		
		li $v0, 10 #encerra a execucao do programa
		syscall
	
	somarInteiros:
		li $v0, 4
		la $a0, msg_soma
		syscall
		
		li $v0, 5
		syscall
		move $t2, $v0
		
		li $v0, 5
		syscall
		move $t3, $v0
		
		add $t4, $t2, $t3
		
		li $v0 4
		la $a0, msg_resultado
		syscall
		
		li $v0, 1
		la $a0, ($t4)
		syscall
		
		li $v0, 10
		syscall
	
	subtrairInteiros:
		li $v0, 4
		la $a0, msg_subtracao
		syscall
		
		li $v0, 5
		syscall
		move $t2, $v0
		
		li $v0, 5
		syscall
		move $t3, $v0
		
		sub $t4, $t2, $t3
		
		li $v0 4
		la $a0, msg_resultado
		syscall
		
		li $v0, 1
		la $a0, ($t4)
		syscall
		
		li $v0, 10
		syscall
	
	multiplicarInteiros:
		li $v0, 4
		la $a0, msg_mult
		syscall
		
		li $v0, 5
		syscall
		move $t2, $v0
		
		li $v0, 5
		syscall
		move $t3, $v0
		
		mul $t4, $t2, $t3
		
		li $v0 4
		la $a0, msg_resultado
		syscall
		
		li $v0, 1
		la $a0, ($t4)
		syscall
	
		li $v0, 10
		syscall
	
	dividirInteiros:
		li $v0, 4
		la $a0, msg_div
		syscall
		
		li $v0, 5
		syscall
		move $t2, $v0
		
		li $v0, 5
		syscall
		move $t3, $v0
		
		div $t4, $t2, $t3
		
		li $v0 4
		la $a0, msg_resultado
		syscall
		
		li $v0, 1
		la $a0, ($t4)
		syscall

		li $v0, 10
		syscall
