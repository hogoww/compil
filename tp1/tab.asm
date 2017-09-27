#init tab

.data
tab: .space 12

.text
main:la $t0, tab
	#init
	li $t9, 1
	sw $t9, 0($t0)
	li $t9, 2
	sw $t9, 4($t0)
	li $t9, 3
	sw $t9, 8($t0)

	#swap
	lw $t1, 0($t0)
	lw $t2, 8($t0)
	sw $t1, 8($t0)
	sw $t2, 0($t0)
	
	#done
	li $v0 10
	syscall
	