class While extends Instruction{
    Expression e;
    Instruction whileInstruct;
   
    If(Expression e,Instruction whileInstruct){
	this.e=e;
	this.whileInstruc=whileInstruc;
    }
}
