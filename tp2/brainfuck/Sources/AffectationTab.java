class AffectationTab extends Affectation{
    AccesTab tab;
    AffectationTab(AccesTab tab, Expression e){
	this.tab=tab;
	this.e=e;
    }
    Réaffecter(Expression e){
	this.e=e;
    }
}
