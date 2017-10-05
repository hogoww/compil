class GreaterEqualThan extends BinOp{

    GreaterEqualThan(ExprLA e1,ExprLA e2){
	this.e1=e1;
	this.e2=e2;
    }
    
    int eval(){
	int resultat;
	if(e1.eval()>=e2.eval()){
	    resultat=1;
	}
	else{
	    resultat=0;
	}
	return resultat;
    }
}
