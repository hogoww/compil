import java.util.ArrayList;

class FuncDef{
    ID name;
    Type Return;
    ArrayList<DeclarationVar> arg;
    Instruction i;
    VarDef v;
    FuncDef(ID name,Type Return,ArrayList<DeclarationVar> arg,Instruction i){
	    this.name=name;
	    this.Return=Return;
	    this.arg=arg;
	    this.i=i;
    }

    void addVarDef(VarDef v){
	this.v=v;
    }
}
