package Modele;


public class Prepose extends Personne{

	int noEmploye;
	String motpasse;
	
	Prepose(int noEmploye,String motpasse,String nom, String prenom, String adresse, String telephone) {
		super(nom, prenom, adresse, telephone);
		this.noEmploye = noEmploye;
		this.motpasse = motpasse;
	}

	public void seConnecter(){
		
	}
	

	@Override
	public String toString(){
		return "PREPOSE - noEmploye:" + noEmploye + " nom et prenom:" + nom + " " + prenom + " adresse:" + adresse 
				+ " telephone:" + telephone + " passe:" + motpasse;
	}
}
