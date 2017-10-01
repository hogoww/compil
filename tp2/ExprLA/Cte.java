class Cte extends ExprLA{
    int val;
    Cte(int val){
	this.val=val;
    }
    Cte(boolean val){
	if(val){
	    this.val=1;
	}
	else{
	    this.val=0;
	}
    }
    int eval(){
	return val;
    }
}
