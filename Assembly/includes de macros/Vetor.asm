.include "Macros.asm"

.data
	Array:
		.align 2
		.space 16 # Aloca 4 espaços no array, pois 1 dado do tipo word consome 32 bits -- 4 Bytes
		
.text
	# Inicializando os registradores $t0, e $t1 em zero!!
	move $t0, $zero # Indice do array
	
	li $t1, 16
	print("-----Digite 4 valores para o seu Array-----\n")
	
	Loop:
		beq $t0, $t1, saiLoop # Se o indice chegar no tamanho maximo do Array, ele para!
		
		inputInteger($t2)
		
		sw $t2, Array($t0) # Joga o $t1 na posicao de $t0 do Array
		
		add $t0, $t0, 4 # Tem que avançar de 4 em 4 Bytes, pois cada tipo de dado Word consome 4 Bytes (32 bits)
		
		j Loop
		
	saiLoop:
		move $t0, $zero
		quebraLinha
		print("-----Seu Array-----\n")
		imprime:
			beq $t0, $t1, saiImpressao
			
			li $v0, 1
			lw $a0, Array($t0)
			syscall
			espaco
			
			add $t0, $t0, 4 #percorre o array
			
			j imprime
			
		saiImpressao: fimPrograma
