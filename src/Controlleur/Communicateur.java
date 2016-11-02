package Controlleur;

import Modele.ListeUtilisateurs;
import Vue.identification;

public class Communicateur {

	ListeUtilisateurs lstUtilisateurs = new ListeUtilisateurs();

	
	public static void main(String[] args) {
		Communicateur comm = new Communicateur();
		for (int i = 0; i < comm.lstUtilisateurs.getArrayUtilisateurs().size(); i++) {
			System.out.println(comm.lstUtilisateurs.getArrayUtilisateurs().get(i).toString());
		}
		identification iden = identification.getInstance();
		
		
	}

}
