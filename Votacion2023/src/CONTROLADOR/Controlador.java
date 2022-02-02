package CONTROLADOR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.sql.Array;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import MODELO.Modelo;
import VISTA.Vista;

public class Controlador implements ActionListener{
	Vista vista=new Vista();
	
	public Controlador(VISTA.Vista frame) {
		this.vista=frame;
		this.vista.btnNewButton.addActionListener(this);
		this.vista.comboBox.addActionListener(this);
		this.vista.btnNewButton_1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
    	Modelo modelo=new Modelo();
    	SessionFactory sessionFactory = null;
	   	Configuration configuration = new Configuration();
	   	configuration.configure("hibernate.cfg.xml");	   	
	   	sessionFactory = configuration.buildSessionFactory();
    	if(e.getSource()== vista.btnNewButton_1) {
    		try { 
				modelo.insertar(); 
				vista.comboBox.setVisible(true);
			} catch (Exception e1) { e1.printStackTrace(); }
				vista.btnNewButton_1.setVisible(false);			
			}
    	
		vista.lblNewLabel_3_4.setVisible(true);
		
		String eleccion = (String) vista.comboBox.getSelectedItem();
			if (eleccion.equals("Rango De Edad")) {	
				vista.btnNewButton.setVisible(true);
				if(e.getSource()== vista.btnNewButton) {
					   	int PP1825=modelo.contarVotoPorRango(sessionFactory, "PP", 18, 25);
					   	int PSOE1825=modelo.contarVotoPorRango(sessionFactory, "PSOE", 18, 25);						
					   	int VOX1825=modelo.contarVotoPorRango(sessionFactory, "VOX", 18, 25);					
					   	int CIUDADANO1825=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 18, 25);									
					   	sacarGanadorPorRango(PP1825, PSOE1825, VOX1825, CIUDADANO1825, vista.lblNewLabel_3, vista.textPane_4,"18-25");
						vista.lblNewLabel_3_4.setVisible(true);
						vista.lblNewLabel_3_4.setIcon(new ImageIcon("votar.png"));
						vista.textPane.setText("\n                     RANGO 18-25 AÑOS\n"
												+"PP:"+PP1825+" - PSOE:"+PSOE1825+" - VOX:"+VOX1825+" - CIUDADANOS:"+CIUDADANO1825);						
						int PP2640=modelo.contarVotoPorRango(sessionFactory, "PP", 26, 40);						
						int PSOE2640=modelo.contarVotoPorRango(sessionFactory, "PSOE", 26, 40);					
						int VOX2640=modelo.contarVotoPorRango(sessionFactory, "VOX", 26, 40);						
						int CIUDADANO2640=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 26, 40);			
						sacarGanadorPorRango(PP2640, PSOE2640, VOX2640, CIUDADANO2640, vista.lblNewLabel_3_1, vista.textPane_4_1,"26-40");
						vista.lblNewLabel_3_4_1.setVisible(true);
						vista.lblNewLabel_3_4_1.setIcon(new ImageIcon("votar.png"));
						vista.textPane_1.setText("\n                     RANGO 26-40 AÑOS\n"
												+"PP:"+PP2640+" - PSOE:"+PSOE2640+" - VOX:"+VOX2640+" - CIUDADANOS:"+CIUDADANO2640);		
						int PP4165=modelo.contarVotoPorRango(sessionFactory, "PP", 41, 65);
						int PSOE4165=modelo.contarVotoPorRango(sessionFactory, "PSOE", 41, 65);						
						int VOX4165=modelo.contarVotoPorRango(sessionFactory, "VOX", 41, 65);					
						int CIUDADANO4165=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 41, 65);						
						sacarGanadorPorRango(PP4165, PSOE4165, VOX4165, CIUDADANO4165, vista.lblNewLabel_3_2, vista.textPane_4_2,"41-65");
						vista.lblNewLabel_3_4_2.setVisible(true);
						vista.lblNewLabel_3_4_2.setIcon(new ImageIcon("votar.png"));
						vista.textPane_2.setText("\n                     RANGO 41-65 AÑOS\n"
												+"PP:"+PP4165+" - PSOE:"+PSOE4165+" - VOX:"+VOX4165+" - CIUDADANOS:"+CIUDADANO4165);										
						int PP66=modelo.contarVotoPorRango(sessionFactory, "PP", 66, 110);						
						int PSOE66=modelo.contarVotoPorRango(sessionFactory, "PSOE", 66, 110);					
						int VOX66=modelo.contarVotoPorRango(sessionFactory, "VOX", 66, 110);					
						int CIUDADANO66=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 66, 110);
						sacarGanadorPorRango(1, 1, 1, 1, vista.lblNewLabel_3_3, vista.textPane_4_3,"+66");
						vista.lblNewLabel_3_4_3.setVisible(true);
						vista.lblNewLabel_3_4_3.setIcon(new ImageIcon("votar.png"));
						vista.textPane_3.setText("\n                      RANGO +66 AÑOS\n"
												+"PP:"+PP66+" - PSOE:"+PSOE66+" - VOX:"+VOX66+" - CIUDADANOS:"+CIUDADANO66);			
						}				
			}else if(eleccion.equals("Comundad Autonoma")) {
				vista.btnNewButton.setVisible(true);
				
			}		 
	}
	
		public void sacarGanadorPorRango(int pp, int psoe, int vox, int ciudadano, JLabel label, JTextPane texto,String rango) {
			if((pp>psoe)&&(pp>vox)&&(pp>ciudadano)) { label.setIcon(new ImageIcon("PP.png")); texto.setText("\n   Ha ganado el PP\n   en el Rango de "+rango+" Años");}
			if((psoe>pp)&&(psoe>vox)&&(psoe>ciudadano)) { label.setIcon(new ImageIcon("psoe.png")); texto.setText("\n   Ha ganado el PSOE\n   en el Rango de "+rango+" Años");}
			if((vox>psoe)&&(vox>pp)&&(vox>ciudadano)) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años");}
			if((ciudadano>psoe)&&(ciudadano>pp)&&(ciudadano>vox)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años");}
			 
			if((pp==psoe)&&((pp>vox)&&(pp>ciudadano))) { label.setIcon(new ImageIcon("PP.png")); texto.setText("\n   Ha ganado el PP\n   en el Rango de "+rango+" Años\n   Coalición con PSOE");}
			if((pp==ciudadano)&&((ciudadano>psoe)&&(ciudadano>vox))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PP");}
			if((vox==psoe)&&((vox>pp)&&(vox>ciudadano))) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años\n   Coalición con PSOE");}
			if((vox==pp)&&((vox>psoe)&&(vox>ciudadano))) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años\n   Coalición con PP");}
			if((psoe==ciudadano)&&((ciudadano>vox)&&(ciudadano>pp))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PSOE");}
			if((vox==ciudadano)&&((ciudadano>pp)&&(ciudadano>psoe))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con VOX");}

			if((pp==psoe)&&(pp==vox)&&(pp>ciudadano)) { label.setIcon(new ImageIcon("PP.png")); texto.setText("\n   Ha ganado el PP\n   en el Rango de "+rango+" Años\n   Coalición con PSOE-VOX");}
			if((pp==psoe)&&(pp==ciudadano)&&(pp>vox)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PP-PSOE");}
			if((psoe==vox)&&(psoe==ciudadano)&&(psoe>pp)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con VOX-PSOE");}
			if((pp==vox)&&(ciudadano==vox)&&(pp>psoe)) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años\nCoalición con PP-CIUDADANOS");}
			
			if((pp==psoe)&&(pp==vox)&&(pp==ciudadano)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PP-PSOE-VOX");}
		}
}