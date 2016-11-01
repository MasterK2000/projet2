package controlleur;

import java.io.*;
import java.util.*;

public class LectureFichier {
	private BufferedReader brFichierSeri;
	private BufferedReader brFichierDVD;
	private BufferedReader brFichierLivre;
	private BufferedReader brFichierPerio;
	private BufferedReader brFichier;
	
	/*
	public LectureFichier(String strNomFichier){
		try {
			brFichier = new BufferedReader(new FileReader(strNomFichier));
			
			
			try {
				brFichierDVD = new BufferedReader(new FileReader("DVD.txt"));
				brFichierLivre = new BufferedReader(new FileReader("Livres.txt"));
				brFichierPerio = new BufferedReader(new FileReader("Periodiques.txt"));
			} catch (FileNotFoundException f) {
				System.out.println("");
			}
		} 
		catch (FileNotFoundException e) {	
			System.out.println("Premier démarrage");
			
			//lecture a faire
		}
		String strLigne;
		StringTokenizer st;
		Station station;
		try {		
			while ((strLigne = brFichier.readLine())!= null){
				st = new StringTokenizer(strLigne, ",");
				while (st.hasMoreTokens()) {	   
					station = new Station(st.nextToken(), st.nextToken(),Short.parseShort(st.nextToken().trim()));
				
					tabStation[intNbStations]= station;
					intNbStations++;
				}	    
			}   
		} 
		catch (Exception e) {

		}
	
	}
	*/
}
