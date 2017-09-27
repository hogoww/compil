#swap with stack

.data
int1 : 1
int2 : 2

.text
main:
	la $a0, int1
	la $a1, int2
	jal swap
	
	li $v0, 10
	syscall

swap:
	lw $t0, 0($a0)
	sw $t0, 0($sp)
	subi $sp, $sp, 4
	
	lw $t1, 0($a1)
	sw $t1, 0($a0)
	
	addi $sp,$sp, 4
	lw $t1, 0($sp)
	
	sw $t1, 0($a1)
	
	
	
	jr $ra