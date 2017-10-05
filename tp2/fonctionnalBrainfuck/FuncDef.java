import java.util.ArrayList;

class FuncDef{
    ID name;
    Type Return;
    ArrayList<DeclarationVar> v;
    ArrayList<DeclarationVar> arg;
    Instruction i;

    FuncDef(ID name){
	    this.name=name;
	    this.arg=new ArrayList<DeclarationVar>();
	    this.v=new ArrayList<DeclarationVar>();
    }
    void addArg(DeclarationVar arg){
	this.arg.add(arg);
    }
    void addType(Type t){
	this.Return=t;
    }
    void addVar(DeclarationVar dv){
	this.v.add(dv);
    }
    void addInstruct(Instruction i){
	this.i=i;
    }
}
