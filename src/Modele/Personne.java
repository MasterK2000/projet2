package Modele;

public class Personne {

	String nom,prenom,adresse,telephone,password;
	
	Personne(String nom,String prenom,String password,String adresse,String telephone){
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public void ajouter(){
		
	}
	public void modifier(){
		
	}
	public void supprimer(){
		
	}
}
