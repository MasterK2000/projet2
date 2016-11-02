package Modele;

public class DVD extends Document{
	int nbDisques;
	String realisateur;
	
	DVD(String noDoc, String titre, String dateparution, int nbDisques, String realisateur, boolean etat) {
		super(noDoc, titre, dateparution, etat);
		this.nbDisques = nbDisques;
		this.realisateur = realisateur;
	}
	
	
}
