package Modele;

public class livre extends Document{
	String nomAuteur;
	
	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	livre(String noDoc, String titre, String dateparution,String nomAuteur, boolean etat) {
		super(noDoc, titre, dateparution, etat);
		this.nomAuteur = nomAuteur;
	}

	public String[] getJTBligne(livre livre){
		livre lv = livre;
		String etat;
		if(lv.etat) etat = "Disponible";
		else etat = "Non disponible";
	
		String[] tablivre = {lv.noDoc,lv.titre,lv.dateparution,lv.nomAuteur,etat};
		
		return tablivre;
		
	}
	
	
}
