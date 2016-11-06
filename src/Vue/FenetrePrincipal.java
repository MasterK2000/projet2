package Vue;

import java.awt.*;
import javax.swing.*;

import Modele.LectureFichier;

public class FenetrePrincipal extends JFrame{
	private JPanel panCollection,panLivre,panPériodique,panDVD,panGestion,panInfoLogiciel,panAdministrateur = new JPanel();
	private JTabbedPane onglet = new JTabbedPane();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FenetrePrincipal fp = new FenetrePrincipal("préposé");
		//FenetrePrincipal fp = new FenetrePrincipal("utilisateur");
		FenetrePrincipal fp = new FenetrePrincipal("administrateur");
		//LectureFichier objLecture = new LectureFichier("Fichiers/Livres.txt");
	}
	
	public FenetrePrincipal(String strTypeUtilsateur){
		super("Médiathèque");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1400,1000);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(new Color(139,108,66));
		
		panCollection = new JPanel();
		panLivre = new JPanel();
		panPériodique = new JPanel();
		panDVD = new JPanel();
		panGestion = new JPanel();
		panInfoLogiciel = new JPanel();
		
		//Tableau pour panneau d'onglet
		JPanel[] tabPanneau = { panCollection,panLivre,panPériodique,panDVD,panGestion,panInfoLogiciel,panAdministrateur};
		String[] tabNomOnglet ={"Collection","Livre","Périodique","DVD","Gestion","Info Logiciel","Administrateur"};
		
		
		//En-Tête
		add(new JLabel(new ImageIcon("Fichiers/bois planche.jpg")),BorderLayout.NORTH);
		
		//test
		JLabel obJLabel = new JLabel("test");
		obJLabel.setFont(new Font("serif", Font.BOLD, 24 ));
		panDVD.add(obJLabel);
		
		//Ajoute les onglets
		for(int q=0;q<tabPanneau.length;q++){
			
			onglet.add(tabNomOnglet[q], tabPanneau[q]);
		}
		
		//Enlève l'onglet des préposés pour les utilisateurs
		if(strTypeUtilsateur == "utilisateur"){onglet.remove(tabPanneau.length-3);}
		
		//Enlève l'onglet des administrateurs pour préposé et utilisateur
		if(strTypeUtilsateur != "administrateur"){onglet.remove(tabPanneau.length-2);}
		
		//Brun	onglet.setBackground(new Color(145,43,18));
		onglet.setBackground(new Color(250, 240, 197));
		add(onglet);
		
		if(strTypeUtilsateur == "Préposé"){
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
