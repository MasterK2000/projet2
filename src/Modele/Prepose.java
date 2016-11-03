package Modele;


public class Prepose extends Personne{

	int noEmploye;
	
	Prepose(int noEmploye,String nom, String prenom,String password, String adresse, String telephone) {
		super(nom, prenom,password, adresse, telephone);
		this.noEmploye = noEmploye;
	}

	public void seConnecter(){
	}
	

	@Override
	public String toString(){
		return "PREPOSE - noEmploye:" + noEmploye + " nom et prenom:" + nom + " " + prenom + " adresse:" + adresse 
				+ " telephone:" + telephone + " passe:" + password;
	}
}
