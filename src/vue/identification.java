package vue;

import java.awt.GridLayout;

import javax.swing.*;

public class identification extends JFrame{

	JTextField JTFnumInscription,JTFmotpasse;
	JLabel JLBnum,JLBmdpasse;
	JPanel panel1,panel2;
	JButton connex,effacer;
	JCheckBox souvenir;
	
	identification(){
		
		super("Authentification");
		
		JLBnum = new JLabel("Numero d'utilisateur : ");
		JLBmdpasse = new JLabel("Mot de passe : ");
		JTFnumInscription = new JTextField();
		JTFmotpasse = new JTextField();
		panel1 = new JPanel();
		connex = new JButton("Connexion");
		panel1.setLayout(new GridLayout(2,2));
		JTFnumInscription.setColumns(10);
		JTFmotpasse.setColumns(10);
		
		
		setLayout(null);
		panel1.add(JLBnum);
		panel1.add(JTFnumInscription);
		panel1.add(JLBmdpasse);
		panel1.add(JTFmotpasse);
		
		panel1.setBounds(20, 20, 300, 60);
		add(panel1);
		setSize(350,200);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	
	public static void main(String[] args) {
		identification identi = new identification();
		identi.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
