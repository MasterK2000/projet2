package modele;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

import vue.identification;

public class GestionLogin implements ActionListener, MouseListener{

	private JTextField JTFnum;
	private JPasswordField JPFpasse;
	private JButton JBconnex;
	private JCheckBox JCBsouv;
	String nomSauvegarde = "";
	private char[] e = {'p','a','s','s','w','o','r','d'}, e1 ={};

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
			/*
			Verifier le nom d'utilisateur et mot de passe
			Est-il un utilisateur ou admin
			*/
			
			if(JCBsouv.isSelected()){
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


	@Override
	public void mouseClicked(MouseEvent arg0) {
		gestionlogin(arg0);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		gestionlogin(arg0);
	}
	
	public void gestionlogin(MouseEvent arg0){
		Object o = arg0.getSource();

		if(o == JTFnum && (JTFnum.getText().equals("Nom d'utilisateur") || JTFnum.getText().equals(""))){
			JTFnum.setText("");
			JTFnum.setForeground(Color.black);
		}
		if(o != JPFpasse && String.valueOf(JPFpasse.getPassword()).equals("")){
			JPFpasse.setText("Mot de passe");
			JPFpasse.setForeground(Color.lightGray);
		}
		if(o == JPFpasse && (JPFpasse.getPassword().equals("") || String.valueOf(JPFpasse.getPassword()).equals("Mot de passe"))){
			JPFpasse.setText("");
			JPFpasse.setForeground(Color.black);
		}
		if(o != JTFnum && JTFnum.getText().equals("")){
			JTFnum.setText("Nom d'utilisateur");
			JTFnum.setForeground(Color.lightGray);
		}
	}

}
