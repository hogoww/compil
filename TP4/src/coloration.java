
public class coloration {
	   public static void main (String[] args){
	       Graph g=new Graph();
	       g.remplirDepuisFichier("g1.txt");
	       int nbCouleur=3;
	       Coloration c=new Coloration(g,nbCouleur);
	       c.colorThatGraph();
	       g.printColoByNode();
	   }
}
