class And extends BinOp{

    And(ExprLA e1,ExprLA e2){
	this.e1=e1;
	this.e2=e2;
    }
    
    int eval(){
	int resultat;
	if(e1.eval()>0 && e2.eval()>0){
	    resultat=1;
	}
	else{
	 resultat=0;
	}
	return resultat;
    }
}
