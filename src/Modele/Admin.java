package Modele;

import sun.security.util.Password;

public class Admin extends Personne{

	int noEmploye;
	String motpasse;
	Admin(int noEmploye, String password, String nom, String prenom, String adresse, String telephone) {
		super(nom, prenom, adresse, telephone);
		this.motpasse = password;
		this.noEmploye = noEmploye;
	}
	
	@Override
	public String toString(){
		return "ADMIN - noEmploye:" + noEmploye + " nom et prenom:" + nom + " " + prenom + " adresse:" + adresse 
				+ " telephone:" + telephone + " pass:" + motpasse;
	}

}
