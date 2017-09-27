#affichage tab
.data
space: ' '

.text
main:
	li $v0, 5
	syscall
	addi $t0, $v0, 1 #valeur finale dans un registre safe, +1 pour la comparaison
	li $t1, 1 #initialise compteur

loop:
	li $v0, 11
	la $a0, space
	syscall
	
	li $v0 1
	move $a0, $t1
	syscall
	addi $t1, $t1, 1
	bne $t0,$t1,loop
	j end
end:
	li $v0, 10
	syscall