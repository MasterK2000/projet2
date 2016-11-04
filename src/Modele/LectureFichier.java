package Modele;

import java.io.*;
import java.util.*;

public class LectureFichier {
	private BufferedReader brFichier;
	private BufferedReader brFichierSer;
	
	
	public LectureFichier(String strNomFichier){
		//
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
	}
	
}
