.data
	msgUsuario: .asciiz "Quantos reais R$ voce quer converter para dolares U$??\n"
	msgDolares: .asciiz "\nVoce possui em dolares: "
	msgErro: .asciiz "\nO valor inserido é menor que zero!!"
	precoDolar : .float 5.1
	zero: .float 0
	
.text
	li $v0, 4
	la $a0, msgUsuario
	syscall
	
	li $v0, 6
	syscall
	mov.s $f1, $f0
	
	lwc1 $f2, precoDolar
	lwc1 $f3, zero
	
	c.lt.s $f1, $f3
	bc1t Erro
	bc1f Converter
	
	Erro:
		li $v0, 4
		la $a0, msgErro
		syscall
		
		li $v0, 10
		syscall
	
	Converter:
	
		div.s $f12, $f1, $f2
	
		li $v0, 4
		la $a0, msgDolares
		syscall
	
		li $v0, 2
		syscall
	
		li $v0, 10
		syscall
	
