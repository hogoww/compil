class Cte extends ExprLA{
    int val;
    Cte(int val){
	this.val=val;
    }
    int eval(){
	return val;
    }
}
