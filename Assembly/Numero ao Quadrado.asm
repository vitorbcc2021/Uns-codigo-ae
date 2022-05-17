.data
	msgDigite: .asciiz "Digite o valor que gostaria de ver seu valor ao quadrado: "
	msgValor: .asciiz "\nEste valor ao quadrado é: "

.text
	li $v0, 4
	la $a0, msgDigite
	syscall
	
	li $v0, 5
	syscall
	move $t0, $v0
	
	mul $t1, $t0, $t0
	
	li $v0, 4
	la $a0, msgValor
	syscall
	
	li $v0, 1
	la $a0, ($t1)
	syscall