//Théo Rogliano
//Pierre Misse-Chanabier

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class coloration{
   public static void main (String[] args){
       Graph g=new Graph();
       g.remplirDepuisFichier("g1.txt");
       int nbCouleur=3;
       Coloration c=new Coloration(g,nbCouleur);
       c.colorThatGraph();
       g.printColoByNode();
   }
}

class Coloration{
    private Graph g;
    private int nbCouleur;
    Coloration(Graph g,int k){
	this.g=g;
	this.nbCouleur=k;
    }

    public void colorThatGraph(){
	colorThatGraphAux();
	for(NodeColoration n : g){
	    if(n.getIsSplit()){
		ReactivateAllEdges(n);//On remet les aretes avec les noeuds actifs	    
		colorThatNode(n);
		if(n.getCouleur()==-1){
		    DeactivateAllEdges(n);//On enleve toute les aretes du noeud.
		}
		else{
		    n.setIsActive(true);
		    n.setIsSplit(false);
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
		n.setIsSplit(true);
	    }
	}
	
	n.setIsActive(false);//On retire le noeud du graph
	DeactivateAllEdges(n);//On enleve toute les aretes du noeud.
	colorThatGraphAux();//On continue à descendre
	if(!n.getIsSplit()){
	    ReactivateAllEdges(n);//On remet les aretes avec les noeuds actifs	    
	    colorThatNode(n);
	    n.setIsActive(true);//n le remte	    
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
	
	for(int i=0;i<this.nbCouleur;++i){//On assigne la première couleur disponible
	    if(!couleurVoisins.get(i).booleanValue()){
		n.setCouleur(i);
	        break;
	    }
	}
	//else on laisse la couleur à -1, pour les splited
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
	    return null;//arrive si il n'y a plus de noeud dans le graph   
	}
    }
    private void DeactivateAllEdges(NodeColoration n){
	for(Map.Entry<NodeColoration,Boolean> nc : n.getVoisins().entrySet()){
	    if(nc.getKey().getIsActive()){
		n.removeMe(nc.getKey());
		nc.getKey().removeMe(n);
	    }
	    //else inutile
	}
    }
    
    private void ReactivateAllEdges(NodeColoration n){
	for(Map.Entry<NodeColoration,Boolean> nc : n.getVoisins().entrySet()){
	    if(nc.getKey().getIsActive()){
		n.activeMe(nc.getKey());
		nc.getKey().activeMe(n);
	    }
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



class Graph extends ArrayList<NodeColoration>{
    Graph(){
	super();	
    }
    private int getIndexNodeByName(char s){
	for(int i=0;i<this.size();i++){
	    if(this.get(i).getNom()==s){
		return i;
	    }
	}
	return -1;
    }

    public void remplirDepuisFichier(String nomFichier){
	int nbArrete;
	int nbSommet;
	try{
	    Scanner s=new Scanner(new File(nomFichier));
	    nbSommet=Integer.parseInt(s.nextLine());
	    for(int i=0;i<nbSommet;++i){
		this.add(new NodeColoration(s.nextLine().charAt(0)));
	    }
	    nbArrete=Integer.parseInt(s.nextLine());
	    for(int i=0;i<nbSommet;++i){
		String Line=s.nextLine();//Flemme de parser mieux que un char max par node
		
	        int i1=getIndexNodeByName(Line.charAt(0));		
	        int i2=getIndexNodeByName(Line.charAt(2));
		
		if((i1==-1) || (i2==-1)){
		    System.out.println("Un sommet n'existait pas lors du parsing des arrètes du fichier");
		    throw new FileNotFoundException();
		}
		
		NodeColoration n1=this.get(i1);
		NodeColoration n2=this.get(i2);
		n1.addVoisins(n2);
	    }
	s.close();
	}
	catch(FileNotFoundException e){
	    System.out.println("Le format du fichier décrivant le graph est incorrect");
	}

    }

    public void printColoByNode(){
	for(NodeColoration n : this){
	    System.out.println(n.getNom()+" "+n.getCouleur());
	}
    }   
}

class NodeColoration implements Comparable<NodeColoration> {
    private static boolean inserted=false;//Pour une insertion bilaterale simple.
    private char nom;//On pourrait utiliser des integers, c'est pour faire jolie.
    private boolean isActive;
    private boolean isSplit;
    private int couleur;
    private HashMap<NodeColoration,Boolean> voisins;
    
    NodeColoration(char nom){
	this.nom=nom;
	this.isActive=true;
	this.isSplit=false;
	this.couleur=-1;//N'as pas de couleur;
	voisins=new HashMap<NodeColoration,Boolean>();
    }
    public HashMap<NodeColoration,Boolean> getVoisins(){
	return this.voisins;
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
    public char getNom(){
	return this.nom;
    }
    public void removeMe(NodeColoration n){
	voisins.put(n,false);
    }
    public void activeMe(NodeColoration n){
	voisins.put(n,true);
    }
    @Override
    public int compareTo(NodeColoration other){
        return this.nom==other.getNom()?0:1;
    }
    @Override
	public String toString(){
	return nom+" "+isActive+" "+isSplit+" "+couleur;
    }
}
