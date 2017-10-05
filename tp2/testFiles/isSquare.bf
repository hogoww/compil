isSquare(x:integer):boolean
	var i : integer a : integer
	i:=1;
	isSquare:=false;
	while i<x and not isSquare do
	      a:=i*i;
	      if a=x then
	      	 isSquare:=true
	      else
		 skip
skip