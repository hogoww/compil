import java.util.HashMap;
import java.util.Map;

public class NodeColoration {
	private static boolean inserted=false;//Pour une insertion bilaterale simple.
	private char nom;//On pourrait utiliser des integers, c'est pour faire jolie.
	private boolean isActive;
	private boolean isSpill;
	private boolean hasPref = false;
	private int couleur;
	private HashMap<NodeColoration,Boolean> prefs;
	private HashMap<NodeColoration,Boolean> voisins;

	NodeColoration(char nom){
		this.nom=nom;
		this.isActive=true;
		this.isSpill=false;
		this.couleur=-1;//N'as pas de couleur;
		voisins=new HashMap<NodeColoration,Boolean>();
		prefs = new HashMap<NodeColoration,Boolean>();
	}  

	NodeColoration(char nom, boolean pref){
		this.nom=nom;
		this.isActive=true;
		this.isSpill=false;
		hasPref=pref;
		this.couleur=-1;//N'as pas de couleur;
		voisins=new HashMap<NodeColoration,Boolean>();
		prefs = new HashMap<NodeColoration,Boolean>();
	}

	public HashMap<NodeColoration,Boolean> getVoisins(){
		return this.voisins;
	}
	
	public HashMap<NodeColoration,Boolean> getPrefs(){
		return this.prefs;
	}

	public void DeactivateAllEdges(){
		for(Map.Entry<NodeColoration,Boolean> nc : voisins.entrySet()){
			if(nc.getKey().getIsActive()){
				removeMe(nc.getKey());
				nc.getKey().removeMe(this);
			}
			//else inutile
		}
	}

	public void ReactivateAllEdges(){
		for(Map.Entry<NodeColoration,Boolean> nc : voisins.entrySet()){
			if(nc.getKey().getIsActive()){
				this.activeMe(nc.getKey());
				nc.getKey().activeMe(this);
			}
		}
	}


	public int getDegre(){//Ergo nombre d'arrete à 1
		int counter=0;
		for(Boolean b : voisins.values()){
			if(b.booleanValue()){
				counter++;
			}
		}
		return counter;
	}

	public void addVoisins(NodeColoration n){
		voisins.put(n,false);
		if(NodeColoration.inserted){
			NodeColoration.inserted=false;//Done
		}
		else{	    
			NodeColoration.inserted=true;
			n.addVoisins(this);//On s'ajoute également chez le voisins.
		}
	}    
	
	public void addPrefs(NodeColoration n){
		prefs.put(n,false);
		if(NodeColoration.inserted){
			NodeColoration.inserted=false;//Done
		}
		else{	    
			NodeColoration.inserted=true;
			n.addVoisins(this);//On s'ajoute également chez le voisins.
		}
	}  
	
	public void setIsActive(boolean b){
		this.isActive=b;
	}
	public boolean getIsActive(){
		return this.isActive;
	}
	public void setIsSpill(boolean b){
		this.isSpill=b;
	}
	public boolean getIsSpill(){
		return this.isSpill;
	}
	public void setCouleur(int c){
		this.couleur=c;
	}
	public int getCouleur(){
		return this.couleur;
	}
	public char getNom(){
		return this.nom;
	}
	public void removeMe(NodeColoration n){
		voisins.put(n,false);
	}
	public void activeMe(NodeColoration n){
		voisins.put(n,true);
	}
	public int compareTo(NodeColoration other){
		return this.nom==other.getNom()?0:1;
	}
	@Override
	public String toString(){
		return nom+" "+isActive+" "+isSpill+" "+couleur;
	}

	public boolean isHasPref() {
		return hasPref;
	}

	public void setHasPref(boolean hasPref) {
		this.hasPref = hasPref;
	}
}
