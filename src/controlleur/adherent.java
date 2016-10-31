package controlleur;

public class adherent extends Personne{

	int noAdherent;
	
	adherent(int noAdherent,String nom, String prenom, String adresse, String telephone) {
		super(nom, prenom, adresse, telephone);
		this.noAdherent = noAdherent;
	}
	
}
