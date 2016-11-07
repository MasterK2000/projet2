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
	public String getNoDoc() {
		return noDoc;
	}

	public void setNoDoc(String noDoc) {
		this.noDoc = noDoc;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateparution() {
		return dateparution;
	}

	public void setDateparution(String dateparution) {
		this.dateparution = dateparution;
	}

	public boolean getEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
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
