package Controlleur;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class GestionLogin implements ActionListener, FocusListener{

	private JTextField JTFnum;
	private JPasswordField JPFpasse;
	private JButton JBconnex;
	private JCheckBox JCBsouv;
	public static String nomSauvegarde = "";


	public GestionLogin(JTextField JTFnum,JPasswordField JPFpasse, JButton JBconnex,JCheckBox JCBsouv){
		this.JTFnum = JTFnum;
		this.JPFpasse = JPFpasse;
		this.JBconnex = JBconnex;
		this.JCBsouv = JCBsouv;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object o = arg0.getSource();

		if(o == JBconnex){
			Communicateur comm = Communicateur.getInstance();
			if(!comm.validerConnexion(JTFnum.getText().trim(), String.valueOf(JPFpasse.getPassword()))){
				JOptionPane.showMessageDialog(null,"Nom d'utilisateur ou mot de passe non valide(s)");
				JPFpasse.setText("password");JPFpasse.setForeground(Color.lightGray);
			}
			else{
				if(JCBsouv.isSelected())
					nomSauvegarde = JTFnum.getText();
			}
		}

		if(String.valueOf(JPFpasse.getPassword()).equals("")){
			JPFpasse.setText("password");
			JPFpasse.setForeground(Color.lightGray);
		}
		if(JTFnum.getText().equals("")){
			JTFnum.setText("Nom d'utilisateur");
			JTFnum.setForeground(Color.lightGray);
		}
	}

	public void gestionlogin(FocusEvent arg0){
		Object o = arg0.getSource();

		if(o == JTFnum && (JTFnum.getText().equals("Nom d'utilisateur") || JTFnum.getText().equals(""))){
			JTFnum.setText("");
			JTFnum.setForeground(Color.black);
		}
		if(o != JPFpasse && String.valueOf(JPFpasse.getPassword()).equals("")){
			JPFpasse.setText("password");
			JPFpasse.setForeground(Color.lightGray);
		}
		if(o == JPFpasse && (JPFpasse.getPassword().equals("") || String.valueOf(JPFpasse.getPassword()).equals("password"))){
			JPFpasse.setText("");
			JPFpasse.setForeground(Color.black);
		}
		if(o != JTFnum && JTFnum.getText().equals("")){
			JTFnum.setText("Nom d'utilisateur");
			JTFnum.setForeground(Color.lightGray);
		}
	}


	@Override
	public void focusGained(FocusEvent arg0) {
		gestionlogin(arg0);
	}
	@Override
	public void focusLost(FocusEvent arg0) {

	}

}
