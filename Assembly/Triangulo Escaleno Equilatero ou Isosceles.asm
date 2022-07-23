.data

	msg3lados: .asciiz "informe os valores do tamanho dos 3 lados do triangulo: "
	msgEquilatero: .asciiz "O triangulo e equilatero"
	msgEscaleno: .asciiz "O triangulo e escaleno"
	msgIsosceles: .asciiz "O triangulo e isosceles"

.text
	
#Imprime a mensagem para o usuario digitar
	li $v0, 4
	la $a0, msg3lados
	syscall
	
#Faz a leitura de um valor inteiro, digitado pelo usuario
	li $v0, 5
	syscall
	move $t0, $v0 #move o valor inteiro de v0 para t0
	
	li $v0, 5
	syscall
	move $t1, $v0
	
	li $v0, 5
	syscall
	move $t2, $v0
	
#Anotacao:
#Se t0 for igual t1 ele vai para a comparacao2 e verificara se e igual ou diferente de t2
#Se t0 for diferente de t1 ele vai para a comparacao4 e verificara se e igual ou diferente de t2
	beq $t0, $t1, comparacao2
	bne $t0, $t1 comparacao4

#Se t1 for igual t2 vai para comparacao3 para fazer a ultima verificacao de igualdade
#Se for diferente, ja sabemos que t1 = t0, logo, se apenas um e diferente, ele e isosceles	
	comparacao2:
		beq $t1, $t2, comparacao3
		bne $t1, $t2, isosceles
		
	comparacao3:
		beq $t0, $t2, equilatero
		bne $t0, $t2, isosceles
		
	comparacao4:
		beq $t0, $t2, isosceles
		bne $t0, $t2, comparacao5
	
	comparacao5:
		beq $t1, $t2, isosceles
		bne $t1, $t2, escaleno
	
	
#Esta parte e a que ira imprimir os resultados apos fazer todas as comparacoes possiveis
	equilatero:
		li $v0, 4
		la $a0, msgEquilatero
		syscall
		
		li $v0, 10 #Termina a execucao
		syscall
	
	isosceles:
		li $v0, 4
		la $a0, msgIsosceles
		syscall
		
		li $v0, 10 #Termina a execucao
		syscall
		
	escaleno:
		li $v0, 4
		la $a0, msgEscaleno
		syscall
		
		li $v0, 10 #Termina a execucao
		syscall
