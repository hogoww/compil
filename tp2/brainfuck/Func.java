import java.util.ArrayList;

class Func extends Expression{
    FuncName f;
    ArrayList<Expression> arg;
    Func(FuncName f){
	 this.f=f;
	 arg=new ArrayList<Expression>();
    }
    void AddArg(Expression e){
	arg.add(e);
    }
}
