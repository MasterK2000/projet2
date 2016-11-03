package Modele;

import java.io.*;
import java.util.*;

public class LectureFichier {
	private BufferedReader brFichierSeri;
	private BufferedReader brFichierDVD;
	private BufferedReader brFichierLivre;
	private BufferedReader brFichierPerio;
	private BufferedReader brFichier;
	private BufferedReader brFichierSer;
	
	/*
	public LectureFichier(String strNomFichier){
		try {
			
			brFichierSer = new BufferedReader(new FileReader("Fichiers/Donne.ser"));
			
			
		} 
		catch (FileNotFoundException e) {	
			System.out.println("Premier démarrage");
			
			try {
				//brFichier = new BufferedReader(new FileReader(strNomFichier));
				brFichierDVD = new BufferedReader(new FileReader("DVD.txt"));
				//brFichierLivre = new BufferedReader(new FileReader("Fichiers/Livres.txt"));
				//brFichierPerio = new BufferedReader(new FileReader("Fichiers/Periodiques.txt"));
				
			} catch (FileNotFoundException f) {
				System.out.println("Un fichier est manquant");
			}
			//lecture a faire
			
			String strLigne;
			StringTokenizer st;
			DVD objDVD;
			//valeur de remplisage, ne pas oublier de lui donner sa vrai valeur
			Boolean booVide = false;
			try {		
				System.out.println("klhuigui");
				strLigne = brFichierDVD.readLine();
				System.out.println(strLigne +"vhjfcj");
				while ((strLigne = brFichier.readLine())!= null){
					System.out.println("4354354");
					st = new StringTokenizer(strLigne, ",");
					while (st.hasMoreTokens()) {	   
						System.out.println("dfdfdfklhuigui");
						System.out.println(strLigne + "vgftftyfty");
						objDVD = new DVD(st.nextToken(), st.nextToken(),st.nextToken(),
								Integer.parseInt(st.nextToken().trim()),st.nextToken(),booVide.booleanValue());
					
						//tabStation[intNbStations]= station;
						//intNbStations++;
					}	    
				}   
			} 
			catch (Exception f) {
				System.out.println(f.toString());
			}
		}
		
	
	}
	*/
}
