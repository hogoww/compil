#abs.asb

.text
main : li $v0, 5
	syscall
	move $a0, $v0
	bgtz $a0, affichage
	neg $a0, $a0
	j affichage
	
		
affichage:li $v0, 1
	syscall
	
	li $v0, 10
	syscall	