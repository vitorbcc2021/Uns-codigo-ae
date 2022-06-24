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
.macro printResultado()
	.text
		print("\nResultado: ")
		
		li $v0, 1
		la $a0, ($t0)
		syscall
		
		jr $ra
.end_macro
###########################################
.macro scanOpcao()
	.text
		li $v0, 5
		syscall
		move $t1, $v0
.end_macro
###########################################
.macro scanInteger()
	.text
		print("Digite o primeiro numero: ")
		
		li $v0, 5
		syscall
		move $t1, $v0
		
		print("Digite o segundo numero: ")
		
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
	print("\n\n##OPERARCOES##\nDigite 0 para sair;\nDigite 1 para somar;\nDigite 2 para subtrair;\nDigite 3 para multiplicar;\nDigite 4 para dividir.\n")
	scanOpcao()

	beq $v0, 0, sair
	jal opcoes
	j operacoes

opcoes:
	beq $v0, 1, adicao
	beq $v0, 2, subtracao
	beq $v0, 3, multiplicacao
	beq $v0, 4, divisao

adicao:
	scanInteger()
	add $t0, $t1, $t2
	printResultado()

subtracao:
	scanInteger()
	sub $t0, $t1, $t2
	printResultado()

multiplicacao:
	scanInteger()
	mul $t0, $t1, $t2
	printResultado()

divisao:
	scanInteger()
	div $t0, $t1, $t2
	printResultado()

sair: exit()
