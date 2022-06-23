################ MACROS ###################
.macro print(%string)
	.data
		msg: .asciiz %string
	.text
		li $v0, 4
		la $a0, msg
		syscall
.end_macro


###########################################
.macro printInteger()
	.text
		li $v0, 1
		la $a0, ($t0)
		syscall
.end_macro


###########################################
.macro scanInteger1()
	.data
		msg: .asciiz "Digite um valor inteiro: "
	.text
		li $v0, 4
		la $a0, msg
		syscall
		
		li $v0, 5
		syscall
		move $t1, $v0
.end_macro


###########################################
.macro scanInteger2()
	.data
		msg: .asciiz "Digite um valor inteiro: "
	.text
		li $v0, 4
		la $a0, msg
		syscall
		
		li $v0, 5
		syscall
		move $t2, $v0
.end_macro


###########################################
.macro exit()
	li $v0, 10
	syscall
.end_macro


################ MAIN #####################
.text
	.globl operacoes
operacoes:
	print("\n##OPERARCOES##\nDigite 0 para sair;\nDigite 1 para somar;\nDigite 2 para subtrair;\nDigite 3 para multiplicar;\nDigite 4 para dividir.\n")
	scanInteger1()

	beq $t1, 0, sair
	jal opcoes
	j operacoes

opcoes:
	beq $t1, 1, adicao
	beq $t1, 2, subtracao
	beq $t1, 3, multiplicacao
	beq $t1, 4, divisao

adicao:
	scanInteger1()
	scanInteger2()

	add $t0, $t1, $t2

	print("Resultado: ")
	printInteger()

	jr $ra

subtracao:
	scanInteger1()
	scanInteger2()

	sub $t0, $t1, $t2

	print("Resultado: ")
	printInteger()	

	jr $ra

multiplicacao:
	scanInteger1()
	scanInteger2()

	mul $t0, $t1, $t2

	print("Resultado: ")
	printInteger()

	jr $ra

divisao:
	scanInteger1()
	scanInteger2()

	div $t0, $t1, $t2

	print("Resultado: ")
	printInteger()

	jr $ra

sair:
	exit()