class Not extends UnOp{
   
    Inv(ExprArith e){
	this.e=e;
    }
    
    int eval(){
	int resultat;
	if(e.eval()==0){
	    resultat=1
	}
	else{
	    resultat=0;
	}
	return resultat;
    }
}
