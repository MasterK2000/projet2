package controlleur;

public class livre extends Document{
	String nomAuteur;
	
	livre(String noDoc, String titre, String dateparution,String nomAuteur, boolean etat) {
		super(noDoc, titre, dateparution, etat);
		this.nomAuteur = nomAuteur;
	}

	
	
	
	
}
