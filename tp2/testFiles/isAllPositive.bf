isAllPositive(t:array of integer s:integer):boolean
var i:integer
isAllPositive:=true;
i:=0;
while i<size and isAllPositive do
      if t[i]<0 then 
      	 isAllPositive:=false
      else
	 skip