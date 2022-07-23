.data
	msgA: .asciiz "Informe um valor para A: "
	msgB: .asciiz "\nInforme um valor para B: "
	msgC: .asciiz "\nInforme um valor para C: "
	msgResultado: .asciiz "O resultado de Delta e: "
	
.text
	
	#pega o valor de A
	li $v0, 4
	la $a0, msgA
	syscall
	
	li $v0, 5
	syscall
	move $t0, $v0
	
	#pega o valor de B
	li $v0, 4
	la $a0, msgB
	syscall
	
	li $v0, 5
	syscall
	move $t1, $v0
	
	#pega o valor de C
	li $v0, 4
	la $a0, msgC
	syscall
	
	li $v0, 5
	syscall
	move $t2, $v0
	
	#realiza o calculo de Delta
	# B ao quadrado
	mul $t3, $t1, $t1
	#-4
	sub $t3, $t3, 4
	# xA xC
	mul $t3, $t3, $t0
	mul $t3, $t3, $t2
	
	#Imprime o resultado na tela
	li $v0, 4
	la $a0, msgResultado
	syscall
	
	li $v0, 1
	la $a0, ($t3)
	syscall
	
	li $v0, 10
	syscall
