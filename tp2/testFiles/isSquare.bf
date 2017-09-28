isSquare(x:integer):boolean
	var i : integer
	i:=1
	isSquare:=false
	while i<x and not isSquare do:
	      var a : integer
	      a:=i*i
	      if a=x then
	      	 isSquare:=true
	      else
		 skip
