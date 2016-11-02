package Modele;


import java.util.Date;

public class Document {
	
	String noDoc,titre,dateparution;
	boolean etat;
	//mot cles
	
	Document(String noDoc,String titre,String dateparution,boolean etat){
		this.noDoc = noDoc;
		this.titre = titre;
		this.dateparution = dateparution;
		this.etat = etat;
	}
	
	public void modifier(){
		
	}
	public void lister(){
		
	}
	public void ajouter(){
		
	}
	public void emprunter(){
		
	}
	protected void changerEtat(){
		
	}
	public String verifierDispo(){
		
		return etat ? "disponible" : "non disponible";
	}
}
