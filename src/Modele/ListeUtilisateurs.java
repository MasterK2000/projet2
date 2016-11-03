package Modele;

import java.io.*;
import java.util.ArrayList;

public class ListeUtilisateurs {

	ArrayList<Personne> ArrayUtilisateurs;


	public ListeUtilisateurs(){
		File tabUtilisateurSer = new File("Fichiers/ListeUtilisateurs.ser");
		ArrayUtilisateurs  = new ArrayList<Personne>();

		if(!tabUtilisateurSer.exists()){
			BufferedReader brFichierAdherent = null,brFichierAdmin = null,brFichierPrepose = null; 
			try {
				brFichierAdherent = new BufferedReader(new FileReader ("Fichiers/Adherent.txt"));
				brFichierAdmin = new BufferedReader(new FileReader ("Fichiers/Admin.txt"));
				brFichierPrepose = new BufferedReader(new FileReader ("Fichiers/Prepose.txt"));
			} catch (FileNotFoundException e) {
				System.out.println("fichier textes n'existent pas?");
			}

			String strLigne;
			Adherent objetAdherent;
			Admin objetAdmin;
			Prepose objetPrepose;

			try {
				strLigne = brFichierAdherent.readLine();
				while (strLigne != null) {
					String[] s = strLigne.split(",");
					objetAdherent = new Adherent(Integer.parseInt(s[0]),s[1],s[2],s[3],s[4],s[5]);
					ArrayUtilisateurs.add(objetAdherent);
					strLigne = brFichierAdherent.readLine();
				}

				strLigne = brFichierAdmin.readLine();
				while (strLigne != null){
					String[] s = strLigne.split(",");
					objetAdmin = new Admin(Integer.parseInt(s[0]),s[1],s[2],s[3],s[4],s[5]);
					ArrayUtilisateurs.add(objetAdmin);
					strLigne = brFichierAdmin.readLine();
				}

				strLigne = brFichierPrepose.readLine();
				while (strLigne != null){
					String[] s = strLigne.split(",");
					objetPrepose = new Prepose(Integer.parseInt(s[0]),s[1],s[2],s[3],s[4],s[5]);
					ArrayUtilisateurs.add(objetPrepose);
					strLigne = brFichierPrepose.readLine();
				}

				brFichierAdherent.close();
				brFichierAdmin.close();
				brFichierPrepose.close();
			} catch (Exception e){
				System.out.println("mauvaise lecture des fichiers textes utilisateurs");
			}
		}
		else{
			//serialiser
		}
	}

	public ArrayList<Personne> getArrayUtilisateurs() {
		return ArrayUtilisateurs;
	}

}
