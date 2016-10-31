package controlleur;

import sun.security.util.Password;

public class Prepose extends Personne{

	int noEmploye;
	Password motpasse;
	
	Prepose(int noEmploye,Password motpasse,String nom, String prenom, String adresse, String telephone) {
		super(nom, prenom, adresse, telephone);
		this.noEmploye = noEmploye;
		this.motpasse = motpasse;
	}

	public void seConnecter(){
		
	}
	
}
