class Mul extends BinOp{
    Mul(ExprLA e1,ExprLA e2){
	this.e1=e1;
	this.e2=e2;
    }
    int eval(){
	return e1.eval()*e2.eval();
    }
}
