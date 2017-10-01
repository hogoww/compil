import java.util.ArrayList;

class Program{
    ArrayList<DeclarationVar> vars;
    ArrayList<FuncDef> f;
    Expression e;
    Program(){
	vars=new ArrayList<DeclarationVar>();
	f=new ArrayList<FuncDef>();
    }
    void AddVar(DeclarationVar d){
	vars.add(d);
    }
    void addFunc(FuncDef d){
	f.add(d);
    }
    void AddExpr(Expression e){
	this.e=e;
    }
}
