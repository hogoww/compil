#fibo

.text
main:
	li $v0 5
	syscall #get value
	
	move $a0,$v0# won't beedited
	li $a1, 1#n-1
	li $a2, 1#n-2
	li $a3, 2#first value of counter
	jal fibo
	
	li $v0 1 #print
	syscall
	
	li $v0 10 #end
	syscall
	
fibo:
	add $t0, $a1, $a2 #fibo
	move $a2, $a1 #new n-2
	move $a1,$t0 #new n-1
	addi $a3,$a3,1
	bne $a0, $a3, fibo #check if done
	move $a0,$a1#latest n-1
	jr $ra