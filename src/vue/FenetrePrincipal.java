package vue;

import java.awt.*;
import javax.swing.*;

public class FenetrePrincipal extends JFrame{
	private JPanel panCollection,panLivre,panPériodique,panDVD,panGestion,panInfoLogiciel = new JPanel();
	private JTabbedPane onglet = new JTabbedPane();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FenetrePrincipal fp = new FenetrePrincipal("préposé");
	}
	
	public FenetrePrincipal(String strTypeUtilsateur){
		super("Médiathèque");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1400,1000);
		setLocationRelativeTo(null);
		setVisible(true);
		
		panCollection = new JPanel();
		panLivre = new JPanel();
		panPériodique = new JPanel();
		panDVD = new JPanel();
		panGestion = new JPanel();
		panInfoLogiciel = new JPanel();
		
		add(new JLabel(new ImageIcon("bois planche.jpg")),BorderLayout.NORTH);
		
		if(strTypeUtilsateur == "préposé"){
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
		JPanel[] tabPanneau = { panCollection,panLivre,panPériodique,panDVD,panGestion,panInfoLogiciel};
		String[] tabNomOnglet ={"Collection","Livre","Périodique","DVD","Gestion","Info Logiciel"};
		
		JLabel obJLabel = new JLabel("test");
		
		obJLabel.setFont(new Font("serif", Font.BOLD, 24 ));
		
		panDVD.add(obJLabel);
		
		
		
		for(int q=0;q<tabPanneau.length;q++){
			onglet.add(tabNomOnglet[q], tabPanneau[q]);
		}
		
		add(onglet);
		
		
		
		
		

	}
	
	private void Utilisateur(){
		//JPanel[] tabPanneau = { panCollection,panLivre,panPériodique,panDVD,panInfoLogiciel};
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
	}
}
