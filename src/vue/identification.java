package vue;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class identification extends JFrame{

	JTextField JTFnumInscription,JTFmotpasse;
	JLabel JLBnum,JLBmdpasse,JLBsouvenir;
	JPanel panel1,panel2;
	JButton connex,effacer;
	JCheckBox JCBsouvenir;
	
	identification(){
		
		super("Authentification");
		setLayout(null);

		setBackground(new Color(76,201,201));
		
		JLBnum = new JLabel("Numero d'utilisateur : ");
		JLBmdpasse = new JLabel("Mot de passe : ");
		JLBsouvenir = new JLabel("se souvenir de moi?");
		JTFnumInscription = new JTextField();
		JTFmotpasse = new JTextField();
		panel1 = new JPanel();
		connex = new JButton("Connexion");
		JCBsouvenir = new JCheckBox();
		
		panel1.setLayout(new GridLayout(2,2));
		JTFnumInscription.setColumns(10);
		JTFmotpasse.setColumns(10);
		
		JCBsouvenir.setBounds(15,95,20,20);
		JLBsouvenir.setBounds(40,90,130,30);
		
		connex.setBounds(214,92, 100, 30);
		panel1.add(JLBnum);
		panel1.add(JTFnumInscription);
		panel1.add(JLBmdpasse);
		panel1.add(JTFmotpasse);
		
		panel1.setBounds(15, 15, 300, 60);
		add(panel1);
		add(connex);
		add(JLBsouvenir);
		add(JCBsouvenir);
		setSize(336,180);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	
	public static void main(String[] args) {
		identification identi = new identification();
		identi.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
