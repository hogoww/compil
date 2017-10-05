import java.util.ArrayList;

class Program{
    ArrayList<DeclarationVar> vars;
    ArrayList<FuncDef> f;
    Instruction i;

    Program(){
	vars=new ArrayList<DeclarationVar>();
	f=new ArrayList<FuncDef>();
    }
    void addVar(DeclarationVar d){
	vars.add(d);
    }
    void addFunc(FuncDef d){
	f.add(d);
    }
    void addInstruct(Instruction i){
	this.i=i;
    }
}
