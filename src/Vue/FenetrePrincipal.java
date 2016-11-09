package Vue;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Controlleur.Communicateur;

import Modele.LectureFichier;

public class FenetrePrincipal extends JFrame{
	private JPanel panCollection,panLivre,panP�riodique,panDVD,panGestion,panInfoLogiciel,panAdministrateur = new JPanel();
	private JTabbedPane onglet = new JTabbedPane();
	TableModelLivres modeleLivre;
	JTable tableLivre;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FenetrePrincipal fp = new FenetrePrincipal("pr�pos�");
		//FenetrePrincipal fp = new FenetrePrincipal("utilisateur");
		FenetrePrincipal fp = new FenetrePrincipal("administrateur");
		//LectureFichier objLecture = new LectureFichier("Fichiers/Livres.txt");
	}

	public FenetrePrincipal(String strTypeUtilsateur) throws IOException{
		super("M�diath�que");
		Communicateur communicateur = Communicateur.getInstance();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1400,1000);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(new Color(139,108,66));

		panCollection = new JPanel();
		panLivre = new JPanel();
		panP�riodique = new JPanel();
		panDVD = new JPanel();
		panGestion = new JPanel();
		panInfoLogiciel = new JPanel();

		//Tableau pour panneau d'onglet
		JPanel[] tabPanneau = { panCollection,panLivre,panP�riodique,panDVD,panGestion,panInfoLogiciel,panAdministrateur};
		String[] tabNomOnglet ={"Collection","Livre","P�riodique","DVD","Gestion","Info Logiciel","Administrateur"};


		//En-T�te
		add(new JLabel(new ImageIcon("Fichiers/bois planche.jpg")),BorderLayout.NORTH);

		//test
		JLabel obJLabel = new JLabel("test");
		obJLabel.setFont(new Font("serif", Font.BOLD, 24 ));
		panDVD.add(obJLabel);

		//test onglet donnees livres
		modeleLivre = new TableModelLivres(communicateur.getArrayDocuments());
		tableLivre = new JTable(modeleLivre);
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableLivre.getModel());
		tableLivre.setRowSorter(sorter);
		tableLivre.setPreferredScrollableViewportSize(new Dimension(800, 500));
		tableLivre.setFillsViewportHeight(true);
		tableLivre.setOpaque(true);
		JScrollPane scrollPane = new JScrollPane(tableLivre);
		panLivre.add(scrollPane);

		//Ajoute les onglets
		for(int q=0;q<tabPanneau.length;q++){
			onglet.add(tabNomOnglet[q], tabPanneau[q]);
		}

		//Enl�ve l'onglet des pr�pos�s pour les utilisateurs
		if(strTypeUtilsateur == "utilisateur"){onglet.remove(tabPanneau.length-3);}

		//Enl�ve l'onglet des administrateurs pour pr�pos� et utilisateur
		if(strTypeUtilsateur != "administrateur"){onglet.remove(tabPanneau.length-2);}

		//Brun	onglet.setBackground(new Color(145,43,18));
		onglet.setBackground(new Color(250, 240, 197));
		add(onglet);

		if(strTypeUtilsateur == "Pr�pos�"){
			Prepose();
		}
		else if(strTypeUtilsateur == "Adherent"){
			Utilisateur();
		}
		else{
			//Peut-Etre Administrateur systeme
		}


		setResizable(false);
	}

	private void Prepose(){


	}

	private void Utilisateur(){

	}

	public void paintComponent(Graphics g){
		super.paintComponents(g);
	}
}
