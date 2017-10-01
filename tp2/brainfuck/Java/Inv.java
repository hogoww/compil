class Inv extends UnOp{
    
    Inv(ExprLA e){
	this.e=e;
    }
    
    int eval(){
	return -e.eval();
    }
}
