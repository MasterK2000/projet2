package vue;

import java.awt.*;
import javax.swing.*;

import modele.GestionLogin;

public final class identification extends JFrame{
	
	private static identification instance;
	JTextField JTFnumInscription;
	JPasswordField JPFmotpasse;
	JLabel JLBnum,JLBmdpasse,JLBsouvenir;
	JPanel panel;
	JButton connex;
	JCheckBox JCBsouvenir;
	GridBagConstraints gbl = new GridBagConstraints();
	
	
	
	private identification(){
		
		super("Authentification");
		
		
		JLBnum = new JLabel("");
		JLBmdpasse = new JLabel("");
		JLBsouvenir = new JLabel(" se souvenir de moi?");
		JTFnumInscription = new JTextField("Nom d'utilisateur");
		JPFmotpasse = new JPasswordField("Mot de passe");
		connex = new JButton("Connexion");
		JCBsouvenir = new JCheckBox();
		setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		JLBnum.setIcon(new ImageIcon("usericon.png"));
		JLBmdpasse.setIcon(new ImageIcon("password-icon.png"));
		
		JPFmotpasse.setBorder(BorderFactory.createEmptyBorder(0,3,0,0));
		JTFnumInscription.setBorder(BorderFactory.createEmptyBorder(0,3,0,0));
		
		JTFnumInscription.setFont(new Font("Arial",Font.PLAIN,15));
		JPFmotpasse.setFont(new Font("Arial",Font.PLAIN,15));
		JLBsouvenir.setFont(new Font("Arial",Font.PLAIN,15));
		JTFnumInscription.setForeground(Color.lightGray);
		JPFmotpasse.setForeground(Color.lightGray);
		
		gbl.gridx = 0;
		gbl.gridy = 0;
		gbl.insets = new Insets(9,0,0,0);
		panel.add(JLBnum,gbl);
		
		gbl.insets = new Insets(0,0,0,0);
		gbl.gridx = 0;
		gbl.gridy = 1;
		panel.add(JLBmdpasse,gbl);
		
		gbl.insets = new Insets(9,0,0,0);
		gbl.gridwidth = 1;
		gbl.ipady = 16;
		gbl.gridx = 1;
		gbl.gridy = 0;
		panel.add(JTFnumInscription,gbl);
		
		gbl.insets = new Insets(0,0,0,0);
		gbl.anchor = GridBagConstraints.CENTER;
		gbl.gridwidth = 1;
		gbl.gridx = 1;
		gbl.gridy = 1;
		panel.add(JPFmotpasse,gbl);
		
		gbl.gridx = 0;
		gbl.gridy = 2;
		gbl.ipady = 7;
		gbl.gridwidth =1;
		gbl.insets = new Insets(0,23,5,0);
		panel.add(JCBsouvenir, gbl);
		
		gbl.gridx = 1;
		gbl.insets = new Insets(0,0,5,63);
		panel.add(JLBsouvenir,gbl);
		
		gbl.ipady=0;
		gbl.gridx = 1;
		gbl.gridy = 3;
		gbl.gridwidth =1;
		gbl.ipady = 3;
		gbl.anchor = GridBagConstraints.PAGE_END;
		gbl.insets = new Insets(0,90,8,0);
		panel.add(connex,gbl);
		
		GestionLogin g = new GestionLogin(JTFnumInscription, JPFmotpasse, connex, JCBsouvenir);
		JTFnumInscription.addMouseListener(g);
		JPFmotpasse.addMouseListener(g);
		connex.addActionListener(g);
		JCBsouvenir.addActionListener(g);
		
		add(panel,BorderLayout.CENTER);
		JTFnumInscription.setColumns(14);
		JPFmotpasse.setColumns(14);
		setSize(290,190);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	
	public static void main(String[] args) {
		identification identi = identification.getInstance();
		identi.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static identification getInstance() {
		if(instance == null)
			instance = new identification();
		return instance;
	}

}
