.data
	msgFatorial: .asciiz "Digite um valor: "
	msgResultado: .asciiz "Total: "
	msgErro: .asciiz "ERRO! Numero menor que zero."
.text
	li $v0, 4
	la $a0, msgFatorial
	syscall
	
	li $v0, 5
	syscall
	move $a0, $v0
	
	sub $a1, $a0, 1 #fiz o $a1 para ele ser uma copia de $a0-1, pois a1 terá de ser subtraido continuamente
	
	bgtz $a0, Fatorial
	beqz $a0, Zero
	blt $a0, 0, Erro
	
	Fatorial:
		beqz $a1, Fim
		mul $a0, $a0, $a1
		sub $a1, $a1, 1 #fiz o $a1 sempre subtrair menos um
		
		bnez $a1, Fatorial
		beqz $a1, Fim
	
	Zero:
		li $v0, 4
		la $a0, msgResultado
		syscall
		
		li $v0, 1
		la $a0, 1
		syscall
		
		li $v0, 10
		syscall
	
	Erro:
		li $v0, 4
		la $a0, msgErro
		syscall
		
		li $v0, 10
		syscall
		
	Fim:	
		li $v0, 1
		syscall
		
		li $v0, 10
		syscall
