class AffectationVar extends Affectation{
    Id id;
    AffectationVar(Id id, Expression e){
	this.id=id;
	this.e=e;
    }
    Réaffecter(Expression e){
	this.e=e;
    }
}
