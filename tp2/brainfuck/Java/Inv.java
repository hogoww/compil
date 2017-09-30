class Inv extends UnOp{
    
    Inv(ExprArith e){
	this.e=e;
    }
    
    int eval(){
	return -e.eval();
    }
}
