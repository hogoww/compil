class CteBool extends Cte{
    boolean val;
    CteBool(boolean val){
	this.val=val;
    }
    int eval(){
	return (val?1:0);
    }
}
