package Modele;

import java.io.*;
import java.util.*;

public class LectureFichier {
	private BufferedReader brFichier;
	private BufferedReader brFichierSer;
	ArrayList<Document> ArrayDocuments;
	
	public LectureFichier(){
		/*
		try {
			brFichierSer = new BufferedReader(new FileReader("Fichiers/Donnee.ser"));
		} 
		catch (FileNotFoundException e) {	
			System.out.println("Premier démarrage");
			
			try {
				brFichier = new BufferedReader(new FileReader(strNomFichier));
				
			} catch (FileNotFoundException f) {
				System.out.println("Un fichier est manquant");
			}
			//lecture a faire
			
			String strLigne;
			StringTokenizer st;
			DVD objDocument;
			//valeur de remplisage, ne pas oublier de lui donner sa vrai valeur
			Boolean booVide = false;
			try {		
				while ((strLigne = brFichier.readLine())!= null){
					st = new StringTokenizer(strLigne, ",");
					while (st.hasMoreTokens()) {	   
						System.out.println(strLigne);
						//if()
						objDocument = new DVD(st.nextToken(), st.nextToken(),st.nextToken(),
								Integer.parseInt(st.nextToken().trim()),st.nextToken(),booVide.booleanValue());
					}	    
				}   
			} 
			catch (Exception f) {
				System.out.println(f.toString());
			}
		}
	}*/
	
		File tabDocumentSer = new File("Fichiers/ListeDocuments.ser");
		ArrayDocuments  = new ArrayList<Document>();

		if(!tabDocumentSer.exists()){
			BufferedReader brFichierLivre = null,brFichierPeriodique = null,brFichierDVD = null; 
			try {
				brFichierLivre = new BufferedReader(new FileReader ("Fichiers/Livres.txt"));
				brFichierPeriodique = new BufferedReader(new FileReader ("Fichiers/Periodiques.txt"));
				brFichierDVD = new BufferedReader(new FileReader ("Fichiers/DVD.txt"));
			} catch (FileNotFoundException e) {
				System.out.println("fichier textes de document n'existent pas?");
			}

			String strLigne;
			livre objectLivre;
			Periodique objectPeriodique;
			DVD objectDVD;

			try {
				strLigne = brFichierLivre.readLine();
				while (strLigne != null) {
					String[] s = strLigne.split(",");
					objectLivre = new livre(s[0],s[1],s[2],s[3],true);
					ArrayDocuments.add(objectLivre);
					strLigne = brFichierLivre.readLine();
				}

				strLigne = brFichierPeriodique.readLine();
				while (strLigne != null){
					String[] s = strLigne.split(",");
					objectPeriodique = new Periodique(s[0],s[1],s[2],Integer.parseInt(s[3].trim()),Integer.parseInt(s[4].trim()),true);
					ArrayDocuments.add(objectPeriodique);
					strLigne = brFichierPeriodique.readLine();
				}

				strLigne = brFichierDVD.readLine();
				while (strLigne != null){
					String[] s = strLigne.split(",");
					objectDVD = new DVD(s[0],s[1],s[2],Integer.parseInt(s[3].trim()),s[4],true);
					ArrayDocuments.add(objectDVD);
					strLigne = brFichierDVD.readLine();
				}

				brFichierLivre.close();
				brFichierPeriodique.close();
				brFichierDVD.close();
			} catch (Exception e){
				System.out.println("mauvaise lecture des fichiers textes documents");
			}
		}
		else{
			//deserialiser
		}
	}

	public ArrayList<Document> getArrayDocuments() {
		return ArrayDocuments;
	}
		
}

