import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Graph extends ArrayList<NodeColoration>{
	
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
		int nbAretePrefs;
		try{
			Scanner s=new Scanner(new File(nomFichier));
			nbSommet=Integer.parseInt(s.nextLine());
			for(int i=0;i<nbSommet;++i){
				this.add(new NodeColoration(s.nextLine().charAt(0)));
			}
			
			nbArrete=Integer.parseInt(s.nextLine());
			for(int i=0;i<nbArrete;++i){
				String Line=s.nextLine();//Flemme de parser mieux que un char max par node 

				int i1=getIndexNodeByName(Line.charAt(0));		
				int i2=getIndexNodeByName(Line.charAt(2));

				if((i1==-1) || (i2==-1)){
					System.err.println("Un sommet n'existait pas lors du parsing des arètes du fichier");
					throw new FileNotFoundException();
				}

				NodeColoration n1=this.get(i1);
				NodeColoration n2=this.get(i2);
				n1.addVoisins(n2);
			}
			
			nbAretePrefs=Integer.parseInt(s.nextLine()); //Ce sont aussi des aretes mais qui ont une preference
			for(int i=0;i<nbAretePrefs;++i){
				String Line=s.nextLine();

				int i1=getIndexNodeByName(Line.charAt(0));		
				int i2=getIndexNodeByName(Line.charAt(2));

				if((i1==-1) || (i2==-1)){
					System.err.println("Un sommet n'existait pas lors du parsing des arètes du fichier");
					throw new FileNotFoundException();
				}

				NodeColoration n1=this.get(i1);
				NodeColoration n2=this.get(i2);
				n1.setHasPref(true);
				//n2.setHasPref(true);
				n1.addPrefs(n2);
				//n2.addPrefs(n1);
			}
			
			
			s.close();
		}
		catch(FileNotFoundException e){
			System.err.println("Le format du fichier décrivant le graph est incorrect");
		}

	}

	public void printColoByNode(){
		for(NodeColoration n : this){
			System.out.println(n.getNom()+" "+n.getCouleur());
		}
	}   
}
