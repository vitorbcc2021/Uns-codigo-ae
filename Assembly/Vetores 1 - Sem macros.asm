.data
	Array:
		.align 2
		.space 16 # Aloca 4 espaços no array, pois 1 dado do tipo word consome 32 bits -- 4 Bytes
		
.text
	# Inicializando os registradores $t0, e $t1 em zero!!
	move $t0, $zero # Indice do array
	move $t1, $zero # Valor a ser colocado no array
	
	li $t2, 16
	
	Loop:
		beq $t0, $t2, saiLoop
		
		sw $t1, Array($t0)
		add $t0, $t0, 4 # Tem que avançar de 4 em 4 Bytes, pois cada tipo de dado Word consome 4 Bytes (32 bits)
		
		add $t1, $t1, 1 # montar um vetor que vai ter --> {0, 1, 2, 3}
		
		j Loop
		
	saiLoop:
		move $t0, $zero
		imprime:
			beq $t0, $t2, saiImpressao
			li $v0, 1
			lw $a0, Array($t0)
			syscall
		
			add $t0, $t0, 4 #percorre o array
			
			j imprime
			
		saiImpressao:
			li $v0, 10
			syscall
