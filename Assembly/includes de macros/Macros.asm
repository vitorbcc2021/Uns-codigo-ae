.macro inputInteger(%registrador)
	li $v0, 5
	syscall
	move %registrador, $v0
.end_macro
#################################################
.macro printInteger(%registrador)
	li $v0, 1
	la $a0, (%registrador)
	lw $a0, %registrador
	syscall
.end_macro
#################################################
.macro espaco
	.data
		msg: .asciiz " "
	.text
		li $v0, 4
		la $a0, msg
		syscall
.end_macro
#################################################
.macro quebraLinha
	.data
		msg: .asciiz "\n"
	.text
		li $v0, 4
		la $a0, msg
		syscall
.end_macro
#################################################
.macro fimPrograma
	li $v0, 10
	syscall
.end_macro
#################################################
.macro print(%msg)
	.data
		msg: .asciiz %msg
	.text
		li $v0, 4
		la $a0, msg
		syscall
.end_macro
#################################################
.macro vetorInt(%tamanho)
	.data
		vetor:
			.align 2
			.space %tamanho
	.text
		lw $t1, %tamanho
		move $t0, $zero
.end_macro
