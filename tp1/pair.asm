#isPair?
.data
isPair: .asciiz " est pair :)"
notIsPair: .asciiz " n'est pas pair :("

.text
main:
	li $v0, 5#get value
	syscall
	move $t9 $v0
	
	#verification de la parité
	andi $t0,$v0,1
	bgtz $t0,np
	bgez $t0,p
	
		
p:#ajout du bon texte
	la $t8, isPair
	j affichage
	
np:#ajout du bon texte
	la $t8, notIsPair
	j affichage

affichage:
	#affiche le chiffre rentré
	li $v0 1
	move $a0, $t9
	syscall
	
	#affiche le bon string !
	li $v0, 4
	move $a0,$t8
	syscall

end:
	li $v0, 10 
	syscall