package vue;

import java.awt.*;
import javax.swing.*;

public class FenetrePrincipal extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FenetrePrincipal fp = new FenetrePrincipal();
		fp.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public FenetrePrincipal(){
		super("Médiathèque");
		setSize(1400,1000);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().add(new JLabel(new ImageIcon("bois planche.jpg")),BorderLayout.NORTH);
		
		
		
		
		
		setResizable(false);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		
	}
}
