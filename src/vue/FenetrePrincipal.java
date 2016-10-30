package vue;

import java.awt.*;
import javax.swing.*;

public class FenetrePrincipal extends JFrame{
	private JPanel panCollection,panLivre,panP�riodique,panDVD,panGestion,panInfoLogiciel = new JPanel();
	private JTabbedPane onglet = new JTabbedPane();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FenetrePrincipal fp = new FenetrePrincipal("pr�pos�");
		//FenetrePrincipal fp = new FenetrePrincipal("utilisateur");
		//nbghjgfdftgydyrtd
	}
	
	public FenetrePrincipal(String strTypeUtilsateur){
		super("M�diath�que");
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
		JPanel[] tabPanneau = { panCollection,panLivre,panP�riodique,panDVD,panGestion,panInfoLogiciel};
		String[] tabNomOnglet ={"Collection","Livre","P�riodique","DVD","Gestion","Info Logiciel"};
		
		
		//En-T�te
		add(new JLabel(new ImageIcon("bois planche.jpg")),BorderLayout.NORTH);
		
		//test
		JLabel obJLabel = new JLabel("test");
		obJLabel.setFont(new Font("serif", Font.BOLD, 24 ));
		panDVD.add(obJLabel);
		
		//Ajoute les onglets
		for(int q=0;q<tabPanneau.length;q++){
			
			onglet.add(tabNomOnglet[q], tabPanneau[q]);
		}
		
		//Enl�ve l'onglet des pr�pos�s pour les utilisateurs
		if(strTypeUtilsateur == "utilisateur"){onglet.remove(tabPanneau.length-2);}
		
		//Brun	onglet.setBackground(new Color(145,43,18));
		onglet.setBackground(new Color(250, 240, 197));
		add(onglet);
			
		if(strTypeUtilsateur == "pr�pos�"){
			Preprose();
		}
		else if(strTypeUtilsateur == "utilisateur"){
			Utilisateur();
		}
		else{
			//Peut-Etre Administrateur systeme
		}
		
		
		setResizable(false);
	}
	
	private void Preprose(){
	

	}
	
	private void Utilisateur(){
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
	}
}
