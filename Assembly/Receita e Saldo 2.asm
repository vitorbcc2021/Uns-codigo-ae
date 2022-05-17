.data
	seleção: .asciiz "\nDigite qual operação deseja realizar:\n\n1: Depositar\n2: Sacar\n3: Ver quantia total\n4: Encerrar operação!\n"
	msgReceita: .asciiz "Digite sua receita bancaria atual: "
	msgSaldo: .asciiz "\nSeu saldo final é: "
	msgDepositar: .asciiz "\nDigite o valor que deseja depositar: "
	msgSacar: .asciiz "\nDigite o valor que deseja sacar: "
	msgEncerrar: .asciiz "\nPrograma encerrado!\n"
	saldoTotal: .asciiz "\nSeu saldo total é: "
	zero: .float 0.0	
	msgErro: .asciiz "\n ERRO!! Operação Inválida!! "

.text
	lwc1 $f11, zero
	
	#o usuário da entrada na sua receita
	li $v0, 4
	la $a0, msgReceita
	syscall
	
	li $v0, 6
	syscall
	mov.s $f1, $f0
	
	LOOP:
	
	#vai ler a escolha de operação do usuário
	li $v0, 4
	la $a0, seleção
	syscall
	
	li $v0, 5
	syscall
	move $t0, $v0
	
	beq $t0, 1, depositar
	beq $t0, 2, sacar
	beq $t0, 3, visualizar
	beq $t0, 4, EXIT
	bc1f erro
	
		erro:
			li $v0, 4
			la $a0, msgErro 
			syscall
			
			j LOOP
		
		depositar:
	
			li $v0, 4
			la $a0, msgDepositar
			syscall
	
			li $v0, 6
			syscall
			mov.s $f2, $f0
	
			add.s $f3, $f1, $f2
			add.s $f1, $f3, $f11
			
			j LOOP
			
		sacar:
			li $v0, 4
			la $a0, msgSacar
			syscall
			
			li $v0, 6
			syscall
			mov.s $f2, $f0
			
			sub.s $f3, $f1, $f2
			sub.s $f1, $f3, $f11
			
			j LOOP
		
		visualizar:
			mov.s $f12, $f1
			
			li $v0, 4
			la $a0, saldoTotal
			syscall
			
			li $v0, 2
			syscall
			
			j LOOP
	EXIT:
		li $v0, 4
		la $a0, msgEncerrar
		syscall
		
		li $v0, 10
		syscall