factoR(x:integer):integer
if x<=0 then
        factoR:=0
else
	if x=1 then
	   factoR:=1
	else
	   factoR:=x*factoR(x-1)