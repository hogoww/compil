import java.util.ArrayList;
import java.util.Map;

public class Coloration {
	private Graph g;
	private int nbCouleur;

	Coloration(Graph g,int k){
		this.g=g;
		this.nbCouleur=k;
	}

	public void colorThatGraph(){
		colorThatGraphAux();
		for(NodeColoration n : g){
			if(n.getIsSpill()){
				n.ReactivateAllEdges();//On remet les aretes
				colorThatNode(n);//On tente une coloration du sommet spill en cours
				if(n.getCouleur()==-1){
					n.DeactivateAllEdges();//On enleve toute les aretes du noeud.
				}
				else{
					n.setIsActive(true);
					n.setIsSpill(false);
				}
			}
		}
	}

	public void colorThatGraphAux(){

		NodeColoration n=chercheTrivial();
		if(n==null){
			n=chercheMaxDegre();
			if(n==null){//plus de noeuds dans le graph, on sort de la recursivité.
				return;
			}
			else{
				n.setIsSpill(true);
			}
		}

		n.setIsActive(false);//On retire le noeud du graph
		n.DeactivateAllEdges();//On enleve toute les aretes du noeud.
		colorThatGraphAux();//On continue à descendre
		if(!n.getIsSpill()){
			n.ReactivateAllEdges();//On remet les aretes avec les noeuds actifs	    
			colorThatNode(n);
			n.setIsActive(true);//on le remet	    
		}
	}

	private void colorThatNode(NodeColoration n){
		ArrayList<Boolean> couleurVoisins;
		couleurVoisins=new ArrayList<Boolean>(this.nbCouleur);
		for(int i=0;i<nbCouleur;++i){
			couleurVoisins.add(new Boolean(Boolean.FALSE));
		}

		for(Map.Entry<NodeColoration,Boolean> nc : n.getVoisins().entrySet()){//On récupère la couleur des voisins
			if(nc.getKey().getIsActive()){//à ce stade, seuls les noeuds actifs ont une couleur
				if(nc.getValue().booleanValue()){//Si l'arrète est active
					couleurVoisins.set(nc.getKey().getCouleur(),true);
				}
			}
		}
		Boolean hasColor=false;
		if(n.isHasPref()) {//si le noeud a envie d'avoir la même couleur qu'un ami	
			ArrayList<Boolean> couleurPrefs;
			couleurPrefs=new ArrayList<Boolean>(this.nbCouleur);//Maintenant on regarde si une couleur parmi les preferences est disponible
			
			for(int i=0;i<nbCouleur;++i){
				couleurPrefs.add(new Boolean(Boolean.FALSE));
			}
			
			for(Map.Entry<NodeColoration,Boolean> nc : n.getPrefs().entrySet()){
				if(nc.getKey().getIsActive()){
					//ici pas besoin de savoir si l'arete est active
						couleurPrefs.set(nc.getKey().getCouleur(),true);
				}
			}
			
			for(int i=0;i<this.nbCouleur;++i){//On regarde si il existe une couleur préférée disponible auquel cas on la prends 
				if(couleurPrefs.get(i).booleanValue() && !couleurVoisins.get(i).booleanValue()){
					n.setCouleur(i);
					hasColor=true;
					break;		
				}
			}
		}
		
		if(!hasColor) {
			for(int i=0;i<this.nbCouleur;++i){//On assigne la première couleur disponible 
				if(!couleurVoisins.get(i).booleanValue()){
					n.setCouleur(i);
					break;
				}
				//else on laisse la couleur à -1, pour les spilled
			}
		}

	}


	private NodeColoration chercheMaxDegre(){
		NodeColoration max=g.get(0);//Pas forcement actif, donc on vérifie à la fin.
		for(NodeColoration n : g){
			if(n.getIsActive() && (n.getDegre()>max.getDegre())){
				max=n;
			}
		}
		if(max.getIsActive()){
			return max;
		}
		else{
			return null;//arrive s'il n'y a plus de noeuds dans le graph   
		}
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
}
