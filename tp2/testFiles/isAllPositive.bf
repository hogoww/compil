isAllPositive(t:array of integer s:integer):boolean
isAllPositive:=true
var i:integer
i:=0
while i<size and isAllPositive do
      if t[i]<0 then 
      	 isAllPositive:=false
      else
	 skip