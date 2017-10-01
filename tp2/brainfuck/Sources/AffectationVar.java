class AffectationVar extends Affectation{
    ID id;
    AffectationVar(ID id, Expression e){
	this.id=id;
	this.e=e;
    }
    void Reaffecter(Expression e){
        this.e=e;
    }
}
