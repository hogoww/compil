import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

class Coloration{
    private Graph g;
    private int nbCouleur;
    Coloration(Graph g,int k){
	this.g=g;
	this.nbCouleur=k;
    }
    private NodeColoration chercheTrivial(){
	//Si retour r>=0 coloration trivial pour le noeud r;
	//Si retour r<0 coloration non triviale
	for(NodeColoration n : g){
	    if(n.getIsActive() && (n.getDegre()<this.nbCouleur)){
		return n;
	    }
	}
	return null;
    }
    
    public void colorThatGraph(){
	NodeColoration n=chercheTrivial();
	if(n==null){
	    n.setIsSplit(true);
	}
	n.setIsActive(false);//On retire le noeud du graph
	colorThatGraph();//On continue à descendre
	n.setIsActive(true);//on le remet
	colorThatNode(n);
	if(n.getCouleur()!=-1){
	    n.setIsSplit(false);
	}
	    
    }
    private void colorThatNode(NodeColoration n){
	ArrayList<Boolean> couleurVoisins;
	couleurVoisins=new ArrayList<Boolean>(this.nbCouleur);
	Collections.fill(couleurVoisins,false);

	for(NodeColoration nc : n.getVoisins()){//On récupère la couleur des voisins
	    if(nc.getIsActive()){//à ce stade, seuls les noeuds actifs ont une couleur
		couleurVoisins.set(nc.getCouleur(),true);
	    }
	}

	for(int i=0;i<this.nbCouleur;++i){//On assigne la première couleur disponible
	    if(!couleurVoisins.get(i).booleanValue()){
		n.setCouleur(i);
	        break;
	    }
	}
	//else on laisse la couleur à -1;
    }
    
}



class Graph extends ArrayList<NodeColoration>{
    public void remplirDepuisFichier(String nomFichier){
	//to do;
    }
}

class NodeColoration {
    private static boolean inserted=false;//Pour une insertion bilaterale simple.
    private String nom;//On pourrait utiliser des integers, c'est pour faire jolie.
    private boolean isActive;
    private boolean isSplit;
    private int couleur;
    private TreeSet<NodeColoration> voisins;
    
    NodeColoration(String nom){
	this.nom=nom;
	this.isActive=true;
	this.isSplit=false;
	this.couleur=-1;//N'as pas de couleur;
	voisins=new TreeSet<NodeColoration>();
    }
    public TreeSet<NodeColoration> getVoisins(){
	return this.voisins;
    }
    public int getDegre(){
	return voisins.size();
    }
    public void addVoisins(NodeColoration n){
	voisins.add(n);
	if(NodeColoration.inserted){
	    NodeColoration.inserted=false;//Done
	}
	else{
	    n.addVoisins(this);//On s'ajoute également chez le voisins.
	    NodeColoration.inserted=true;
	}
    }    
    public void setIsActive(boolean b){
	this.isActive=b;
    }
    public boolean getIsActive(){
	return this.isActive;
    }
    public void setIsSplit(boolean b){
	this.isSplit=b;
    }
    public boolean getIsSplit(){
	return this.isSplit;
    }
    public void setCouleur(int c){
	this.couleur=c;
    }
    public int getCouleur(){
	return this.couleur;
    }
    public String getNom(){
	return this.nom;
    }    
}
