.data

	pergunta: .asciiz "Digite sua idade, por favor: "
	msg1: .asciiz "Voce e menor de idade"
	msg2: .asciiz "Voce e maior de idade"

.text
	
	li $v0, 4
	la $a0, pergunta
	syscall
	
	li $v0, 5
	syscall
	move $t1, $v0
	#entrada de dados concluida
	
	#inicia a parte de processamento de dados
	li $t0, 18
	
	blt $t1, $t0, menor
	bge $t1, $t0, maior
	
	menor:
	li $v0, 4
	la $a0, msg1
	syscall
	
	li $v0, 10 #finaliza a execucao do programa
	syscall
	
	maior:
	li $v0, 4
	la $a0, msg2
	syscall
	
	li $v0, 10
	syscall
