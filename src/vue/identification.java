package vue;

import javax.swing.*;

public class identification extends JFrame{

	JTextField JTFnumInscription,JTFmotpasse;
	JLabel JLBnum,JLBmdpasse;
	JPanel panel1,panel2;
	
	identification(){
		
		super("Authentification");
		
		JLBnum = new JLabel("Numero d'inscription : "); // ajouter accent a numero
		JLBmdpasse = new JLabel("Mot de passe : ");
		JTFnumInscription = new JTextField();
		JTFmotpasse = new JTextField();
		
		
		
		
		setSize(300,500);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	
	public static void main(String[] args) {
		identification identi = new identification();
		identi.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
