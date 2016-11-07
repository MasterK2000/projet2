package Controlleur;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTable;

import Modele.*;
import Vue.*;
import Controlleur.GestionLogin;

public class Communicateur {

	ArrayList<Personne> ArrayUtilisateurs;
	ArrayList<Document> ArrayDocuments;
	


	private static Communicateur instance;
	private static identification iden;
	private static Communicateur comm;
	private static ListeUtilisateurs lstUtilisateurs;
	private static LectureFichier lstDocuments;
	private static FenetrePrincipal fPrincipal;
	
	private Communicateur(){
		iden = new identification();
		lstUtilisateurs = new ListeUtilisateurs();
		lstDocuments = new LectureFichier();
		ArrayUtilisateurs = lstUtilisateurs.getArrayUtilisateurs();
		ArrayDocuments = lstDocuments.getArrayDocuments();
	}
	
	
	public boolean validerConnexion(String username,String motpasse){
		boolean valide = false;
		for (int i = 0; i < ArrayUtilisateurs.size(); i++) {
			String usernameArray = (ArrayUtilisateurs.get(i).getPrenom()).substring(0,1) + "." + ArrayUtilisateurs.get(i).getNom();
			if(username.equalsIgnoreCase(usernameArray) 
					&& (String.valueOf(motpasse).equalsIgnoreCase(ArrayUtilisateurs.get(i).getPassword()))
					|| String.valueOf(motpasse).equalsIgnoreCase("")){
				if(ArrayUtilisateurs.get(i).getClass() == Admin.class) fPrincipal = new FenetrePrincipal("Administrateur");
				if(ArrayUtilisateurs.get(i).getClass() == Prepose.class) fPrincipal = new FenetrePrincipal("Préposé");
				if(ArrayUtilisateurs.get(i).getClass() == Adherent.class) fPrincipal = new FenetrePrincipal("Adherent");
				iden.hide();
				valide = true;
			}
		}
		return valide;
	}
	
	public JTable creerJTBLivre(){
		String[] colonnes = {"Numero document","Titre","Date parution","Auteur","Disponibilite"};
		String[][] donnees = new String[15][6];
		
		for (int i = 0,p=0; i < ArrayDocuments.size(); i++) {
			if(ArrayDocuments.get(i).getClass() == livre.class){
			livre lv = ((livre)ArrayDocuments.get(i));
			donnees[p] = lv.getJTBligne(lv);
			p++;
			}
		}
		return new JTable(donnees,colonnes);
	}
	
	public static Communicateur getInstance() {
		if(instance == null)
			instance = new Communicateur();
		return instance;
	}
	public ArrayList<Personne> getArrayUtilisateurs() {
		return ArrayUtilisateurs;
	}


	public void setArrayUtilisateurs(ArrayList<Personne> arrayUtilisateurs) {
		ArrayUtilisateurs = arrayUtilisateurs;
	}


	public ArrayList<Document> getArrayDocuments() {
		return ArrayDocuments;
	}


	public void setArrayDocuments(ArrayList<Document> arrayDocuments) {
		ArrayDocuments = arrayDocuments;
	}

	
	public static void main(String[] args) {
		Communicateur.getInstance();
	}

	
}
