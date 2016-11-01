package controlleur;

import controlleur.Personne;
import sun.security.util.Password;

public class Admin extends Personne{

	int noEmploye;
	Password motpasse;
	Admin(int noEmploye, String nom, String prenom, String adresse, String telephone,Password password) {
		super(nom, prenom, adresse, telephone);
		this.motpasse = password;
		this.noEmploye = noEmploye;
	}
	

}
