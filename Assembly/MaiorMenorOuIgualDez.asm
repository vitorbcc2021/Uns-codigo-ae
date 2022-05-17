.data
	msgDigite: .asciiz "Digite o valor desejado: "
	msgMenor: .asciiz "O valor digitado � menor que 10\n"
	msgMaior: .asciiz "O valor digitado � maior que 10\n"
	msgIgual: .asciiz "O valor digitado � igual a 10\n"
	
.text
	li $v0, 4
	la $a0, msgDigite
	syscall
	
	li $v0, 5
	syscall
	move $t1, $v0
	
	beq $t1, 10, igual
	bgt $t1, 10, maior
	blt $t1, 10, menor
	
	igual:
	
	li $v0, 4
	la $a0, msgIgual
	syscall
	
	li $v0, 10
	syscall
	
	maior:
	
	li $v0, 4
	la $a0, msgMaior
	syscall
	
	li $v0, 10
	syscall
	
	menor:
	
	li $v0, 4
	la $a0, msgMenor
	syscall
	
	li $v0, 10
	syscall
