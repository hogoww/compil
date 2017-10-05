abstract class Instruction{
    Instruction nextInstruct;
    void addInstruction(Instruction i){
	this.nextInstruct=i;
    }
}
