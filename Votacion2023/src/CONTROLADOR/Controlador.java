package CONTROLADOR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.sql.Array;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		this.vista.btnNewButton_2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
    	Modelo modelo=new Modelo();
    	SessionFactory sessionFactory = null;
	   	Configuration configuration = new Configuration();
	   	configuration.configure("hibernate.cfg.xml");	   	
	   	sessionFactory = configuration.buildSessionFactory();
    	//BOTON INICIAR VOTACION-INSERT
	   	if(e.getSource()== vista.btnNewButton_1) {
    		try { 
				modelo.insertar(); 
				vista.comboBox.setVisible(true);
				vista.txtpnResultadoVotacionesPor.setVisible(true);
			} catch (Exception e1) { e1.printStackTrace(); }
				vista.btnNewButton_1.setVisible(false);			
			}	
		vista.lblNewLabel_3_4.setVisible(true);
		//ComboBox PARA MOSTRAR RESULTADOS POR RANGO DE EDAD, COMUNIDADES Y GENERAL
		String eleccion = (String) vista.comboBox.getSelectedItem();
			//FUNCIONALIDAD SI SE SELECCIONA POR RANGO DE EDAD
			if (eleccion.equals("Rango De Edad")) {	
				vista.btnNewButton.setVisible(true);	
				vista.btnNewButton_2.setVisible(true);
				vista.txtpnElige.setVisible(true);
				vista.comboBox_2.setVisible(false);
				if(e.getSource()== vista.btnNewButton) {
					vista.comboBox_1.setVisible(true);
				    //18-25
					informacionPorRango(modelo, sessionFactory, 18, 25, vista.textPane, vista.textPane_4, vista.lblNewLabel_3, "18-25",vista.lblNewLabel_3_4 );			
					//26-40
					informacionPorRango(modelo, sessionFactory, 26, 40, vista.textPane_1, vista.textPane_4_1, vista.lblNewLabel_3_1, "26-40",vista.lblNewLabel_3_4_1 );			
					//41-65
					informacionPorRango(modelo, sessionFactory, 41, 65, vista.textPane_2, vista.textPane_4_2, vista.lblNewLabel_3_2, "40-65",vista.lblNewLabel_3_4_2 );			
					//+66
					informacionPorRango(modelo, sessionFactory, 66, 110, vista.textPane_3,vista.textPane_4_3, vista.lblNewLabel_3_3, "+66", vista.lblNewLabel_3_4_3);			
				}				
			}else if(eleccion.equals("Comunidad Autónoma")) {	
				vista.btnNewButton.setVisible(true);
				vista.comboBox_1.setVisible(false);
				vista.txtpnElige.setVisible(true);
				vista.btnNewButton_2.setVisible(true);
				vista.lblNewLabel_3_4.setIcon(null);vista.lblNewLabel_3_4_1.setIcon(null);vista.lblNewLabel_3_4_2.setIcon(null);vista.lblNewLabel_3_4_3.setIcon(null);
				vista.textPane.setText("");vista.textPane_1.setText("");vista.textPane_2.setText("");vista.textPane_3.setText("");vista.textPane_4.setText("");vista.textPane_4_1.setText("");vista.textPane_4_2.setText("");vista.textPane_4_3.setText("");
				vista.lblNewLabel_3.setIcon(null);vista.lblNewLabel_3_1.setIcon(null);vista.lblNewLabel_3_2.setIcon(null);vista.lblNewLabel_3_3.setIcon(null);
				if(e.getSource()== vista.btnNewButton) {
					vista.comboBox_2.setVisible(true);
					
				}
			}
	}

	private void informacionPorRango(Modelo modelo, SessionFactory sessionFactory, int edad1, int edad2,JTextPane panelresultado, JTextPane panelGanador, JLabel label, String rango, JLabel png ) {
		int PP=modelo.contarVotoPorRango(sessionFactory, "PP", edad1, edad2);						
		int PSOE=modelo.contarVotoPorRango(sessionFactory, "PSOE", edad1, edad2);					
		int VOX=modelo.contarVotoPorRango(sessionFactory, "VOX", edad1, edad2);					
		int CIUDADANO=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", edad1, edad2);
		sacarGanadorPorRango(PP, PSOE, VOX, CIUDADANO, label, panelGanador,rango);
		png.setVisible(true);
		png.setIcon(new ImageIcon("votar.png"));
		panelresultado.setText("\n                      RANGO "+rango+" AÑOS\n" +"PP:"+PP+" - PSOE:"+PSOE+" - VOX:"+VOX+" - CIUDADANOS:"+CIUDADANO);
	}
	
		public void sacarGanadorPorRango(int pp, int psoe, int vox, int ciudadano, JLabel label, JTextPane texto,String rango) {
			//GANADOR SIN EMPATES
			if((pp>psoe)&&(pp>vox)&&(pp>ciudadano)) { label.setIcon(new ImageIcon("pp.jpg")); texto.setText("\n   Ha ganado el PP\n   en el Rango de "+rango+" Años");}
			if((psoe>pp)&&(psoe>vox)&&(psoe>ciudadano)) { label.setIcon(new ImageIcon("psoe.png")); texto.setText("\n   Ha ganado el PSOE\n   en el Rango de "+rango+" Años");}
			if((vox>psoe)&&(vox>pp)&&(vox>ciudadano)) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años");}
			if((ciudadano>psoe)&&(ciudadano>pp)&&(ciudadano>vox)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años");}
			//GANADOR CON 2 EMPATES
			if((pp==psoe)&&((pp>vox)&&(pp>ciudadano))) { label.setIcon(new ImageIcon("pp.jpg")); texto.setText("\n   Ha ganado el PP\n   en el Rango de "+rango+" Años\n   Coalición con PSOE");}
			if((pp==ciudadano)&&((ciudadano>psoe)&&(ciudadano>vox))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PP");}
			if((vox==psoe)&&((vox>pp)&&(vox>ciudadano))) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años\n   Coalición con PSOE");}
			if((vox==pp)&&((vox>psoe)&&(vox>ciudadano))) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años\n   Coalición con PP");}
			if((psoe==ciudadano)&&((ciudadano>vox)&&(ciudadano>pp))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PSOE");}
			if((vox==ciudadano)&&((ciudadano>pp)&&(ciudadano>psoe))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con VOX");}
			//GANADOR CON 3 EMPATES
			if((pp==psoe)&&(pp==vox)&&(pp>ciudadano)) { label.setIcon(new ImageIcon("pp.jpg")); texto.setText("\n   Ha ganado el PP\n   en el Rango de "+rango+" Años\n   Coalición con PSOE-VOX");}
			if((pp==psoe)&&(pp==ciudadano)&&(pp>vox)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PP-PSOE");}
			if((psoe==vox)&&(psoe==ciudadano)&&(psoe>pp)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con VOX-PSOE");}
			if((pp==vox)&&(ciudadano==vox)&&(pp>psoe)) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en el Rango de "+rango+" Años\nCoalición con PP-CIUDADANOS");}
			//GANADOR CON 4 EMPATES
			if((pp==psoe)&&(pp==vox)&&(pp==ciudadano)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en el Rango de "+rango+" Años\n   Coalición con PP-PSOE-VOX");}
		}
}