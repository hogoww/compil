import java.util.ArrayList;

class Procedure extends Instruction{
    FuncName p;
    ArrayList<Expression> arg;
    Procedure(FuncName p){
	 this.p=p;
	 arg=new ArrayList<Expression>();
    }
    void addArg(Expression e){
	arg.add(e);
    }
}
