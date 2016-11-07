package Vue;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Modele.Document;
import Modele.livre;

public class TableModelLivres extends AbstractTableModel{

	ArrayList<Document> lstDocuments; 
	ArrayList<String> tabColonne = new ArrayList<String>();
	ArrayList<ArrayList> tabDonnees = new ArrayList<ArrayList>();


	TableModelLivres(ArrayList<Document> arrDocuments){
		this.lstDocuments = arrDocuments;
		tabColonne.add("Numero Document");
		tabColonne.add("Titre");
		tabColonne.add("Date Parution");
		tabColonne.add("Nom d'auteur");
		tabColonne.add("Disponibilite");

		for (int x= 0; x<lstDocuments.size() && lstDocuments.get(x).getClass() == livre.class; x++){
			ArrayList<Object>  ligne = new ArrayList<Object>();
			livre liv = (livre) lstDocuments.get(x);
			ligne.add(liv.getNoDoc());
			ligne.add(liv.getTitre());
			ligne.add(liv.getDateparution());
			ligne.add(liv.getNomAuteur());
			if(liv.getEtat()) ligne.add("Disponible");
			else ligne.add("Non disponible");
			tabDonnees.add(ligne);
		}
	}

	public String getColumnName(int col){
		return  tabColonne.get(col);
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return tabColonne.size();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return tabDonnees.size();
	}

	@Override
	public Object getValueAt(int ligne, int colonne) {
		return tabDonnees.get(ligne).get(colonne);
	}



}
