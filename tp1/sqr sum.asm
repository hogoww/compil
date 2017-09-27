#sqr & sum

.text
main:
	#get first value
	li $v0, 5
	syscall
	move $t0, $v0
	
	#get second value
	li $v0, 5
	syscall
	move $t1, $v0
	jal sum
	
	#affichage verif
	li $v0,1
	move $a0, $t2
	syscall
	
	li $v0, 10
	syscall
	
sum:
	#keep from where you're comming from
	move $t8, $ra
	
	#first mul
	move $a0, $t0
	jal sqr
	move $t0, $v0
	
	#second mul
	move $a0, $t1
	jal sqr
	move $t1, $v0
	
	add $t2, $t1, $t0
	
	move $ra, $t8
	#go back home
	jr $ra

sqr:
	mult $a0,$a0
	mflo $v0
	#go back home
	jr $ra