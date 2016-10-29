package vue;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;

public class identification extends JFrame{

	JTextField JTFnumInscription,JTFmotpasse;
	JLabel JLBnum,JLBmdpasse,JLBsouvenir;
	JPanel panel1,panel2;
	JButton connex,effacer;
	JCheckBox JCBsouvenir;
	Color couleur = new Color(103,204,201) ;
	
	identification(){
		
		super("Authentification");
		setLayout(null);
		GridBagConstraints gbl = new GridBagConstraints();
		Container c = getContentPane();
		JLBnum = new JLabel("");
		JLBmdpasse = new JLabel("");
		JLBsouvenir = new JLabel(" se souvenir de moi?");
		JTFnumInscription = new JTextField("Nom d'utilisateur");
		JTFmotpasse = new JTextField("Mot de passe");
		panel1 = new JPanel();
		connex = new JButton("Connexion");
		JCBsouvenir = new JCheckBox();
		setLayout(new GridBagLayout());
		effacer = new JButton("Effacer");
		
		JLBnum.setIcon(new ImageIcon("usericon.png"));
		JLBmdpasse.setIcon(new ImageIcon("password-icon.png"));
		
		JTFmotpasse.setBorder(BorderFactory.createEmptyBorder());
		JTFnumInscription.setBorder(BorderFactory.createEmptyBorder());
		
		JTFnumInscription.setFont(new Font("Arial",Font.PLAIN,15));
		JTFmotpasse.setFont(new Font("Arial",Font.PLAIN,15));
		JLBsouvenir.setFont(new Font("Arial",Font.PLAIN,15));
		JTFnumInscription.setForeground(Color.lightGray);
		JTFmotpasse.setForeground(Color.lightGray);
		
		
		gbl.gridx = 0;
		gbl.gridy = 0;
		gbl.insets = new Insets(9,0,0,0);
		add(JLBnum,gbl);
		gbl.insets = new Insets(0,0,0,0);
		gbl.gridx = 0;
		gbl.gridy = 1;
		add(JLBmdpasse,gbl);
		gbl.insets = new Insets(9,0,0,0);
		gbl.gridwidth = 1;
		gbl.ipady = 16;
		gbl.gridx = 1;
		gbl.gridy = 0;
		add(JTFnumInscription,gbl);
		gbl.insets = new Insets(0,0,0,0);
		gbl.anchor = GridBagConstraints.CENTER;
		gbl.gridwidth = 1;
		gbl.gridx = 1;
		gbl.gridy = 1;
		add(JTFmotpasse,gbl);
		
		gbl.gridx = 0;
		gbl.gridy = 2;
		gbl.ipady = 7;
		gbl.gridwidth =1;
		gbl.insets = new Insets(0,23,5,0);
		add(JCBsouvenir, gbl);
		
		gbl.gridx = 1;
		gbl.insets = new Insets(0,0,5,63);
		add(JLBsouvenir,gbl);
		
		gbl.ipady=0;
		gbl.gridx = 1;
		gbl.gridy = 3;
		gbl.gridwidth =1;
		gbl.ipady = 3;
		gbl.anchor = GridBagConstraints.PAGE_END;
		gbl.insets = new Insets(0,100,8,0);
		add(connex,gbl);
		
		JTFnumInscription.setColumns(15);
		JTFmotpasse.setColumns(15);
		setSize(270,180);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	
	public static void main(String[] args) {
		identification identi = new identification();
		identi.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
