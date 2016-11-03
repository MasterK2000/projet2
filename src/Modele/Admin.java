package Modele;


public class Admin extends Personne{

	int noEmploye;
	
	public int getNoEmploye() {
		return noEmploye;
	}

	public void setNoEmploye(int noEmploye) {
		this.noEmploye = noEmploye;
	}

	Admin(int noEmploye, String nom, String prenom, String password, String adresse, String telephone) {
		super(nom, prenom,password, adresse, telephone);
		this.noEmploye = noEmploye;
	}
	
	@Override
	public String toString(){
		return "ADMIN - noEmploye:" + noEmploye + " nom et prenom:" + nom + " " + prenom + " adresse:" + adresse 
				+ " telephone:" + telephone + " pass:" + password;
	}

}
