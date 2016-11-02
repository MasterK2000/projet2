package Modele;

public class Adherent extends Personne{

	int noAdherent;
	
	Adherent(int noAdherent,String nom, String prenom, String adresse, String telephone) {
		super(nom, prenom, adresse, telephone);
		this.noAdherent = noAdherent;
	}
	
	@Override
	public String toString(){
		return "ADHERENT - noEmploye:" + noAdherent + " nom et prenom:" + nom + " " + prenom + " adresse:" + adresse 
				+ " telephone: " + telephone;
	}
	
}
