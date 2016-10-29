package vue;

import java.awt.*;
import javax.swing.*;

public class FenetrePrincipal extends JFrame{

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
		
		getContentPane().add(new JLabel(new ImageIcon("bois planche.jpg")),BorderLayout.NORTH);
		
		if(strTypeUtilsateur == "préposé"){
			Preprose();
		}
		else if(strTypeUtilsateur == "utilisateur"){
			Utilisateur();
		}
		else{
			//Peut-Etre Administrateur systeme
		}
		
		JPanel panCollection,panLivre,panPériodique,panDVD,pan;
		
		
		JPanel[] tabPanneau = { panCollection = new JPanel()};
		
			
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
