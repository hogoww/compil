class If extends Instruction{
    Expression e;
    Instruction ifInstruct;
    Instruction elseInstruct;
    If(Expression e,Instruction ifInstruct,Instruction elseInstruct){
	this.e=e;
	this.ifInstruct=ifInstruct;
	this.elseInstruct=elseInstruct;
    }
}
