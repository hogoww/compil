class While extends Instruction{
    Expression e;
    Instruction whileInstruct;
   
    While(Expression e,Instruction whileInstruct){
	this.e=e;
	this.whileInstruct=whileInstruct;
    }
}
