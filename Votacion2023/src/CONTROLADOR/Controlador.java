package CONTROLADOR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.sql.Array;

import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

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
    		
		vista.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					modelo.insertar(); 
					vista.comboBox.setVisible(true);
				} catch (Exception e1) { e1.printStackTrace(); }
					vista.btnNewButton_1.setVisible(false);
					
				}
			});

			String eleccion = (String) vista.comboBox.getSelectedItem();
				if (eleccion.equals("Rango De Edad")) {	
					vista.btnNewButton.setVisible(true);
					vista.btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							SessionFactory sessionFactory = null;
					    	Configuration configuration = new Configuration();
					    	configuration.configure("hibernate.cfg.xml");
					    	sessionFactory = configuration.buildSessionFactory();
					    	sessionFactory = configuration.buildSessionFactory();
							BigInteger PP1825=modelo.contarVotoPorRango(sessionFactory, "PP", 18, 25);
							BigInteger PP2640=modelo.contarVotoPorRango(sessionFactory, "PP", 26, 40);
							BigInteger PP4165=modelo.contarVotoPorRango(sessionFactory, "PP", 41, 65);
							BigInteger PP66=modelo.contarVotoPorRango(sessionFactory, "PP", 66, 110);
							BigInteger vectorPP[]= {PP1825,PP2640,PP4165,PP66};
							BigInteger PSOE1825=modelo.contarVotoPorRango(sessionFactory, "PSOE", 18, 25);
							BigInteger PSOE2640=modelo.contarVotoPorRango(sessionFactory, "PSOE", 26, 40);
							BigInteger PSOE4165=modelo.contarVotoPorRango(sessionFactory, "PSOE", 41, 65);
							BigInteger PSOE66=modelo.contarVotoPorRango(sessionFactory, "PSOE", 66, 110);
							BigInteger vectorPSOE[]= {PSOE1825,PSOE2640,PSOE4165,PSOE66};
							BigInteger VOX1825=modelo.contarVotoPorRango(sessionFactory, "VOX", 18, 25);
							BigInteger VOX2640=modelo.contarVotoPorRango(sessionFactory, "VOX", 26, 40);
							BigInteger VOX4165=modelo.contarVotoPorRango(sessionFactory, "VOX", 41, 65);
							BigInteger VOX66=modelo.contarVotoPorRango(sessionFactory, "VOX", 66, 110);
							BigInteger vectorVOX[]= {VOX1825,VOX2640,VOX4165,VOX66};
							BigInteger CIUDADANO1825=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 18, 25);
							BigInteger CIUDADANO2640=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 26, 40);
							BigInteger CIUDADANO4165=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 41, 65);
							BigInteger CIUDADANO66=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", 66, 110);
							BigInteger vectorCIUDADANO[]= {CIUDADANO1825,CIUDADANO2640,CIUDADANO4165,CIUDADANO66};
							String s1=String.valueOf(PP1825);
							String s5=String.valueOf(PSOE1825);
							String s9=String.valueOf(VOX1825);
							String s13=String.valueOf(CIUDADANO1825);
								vista.textPane.setText("RANGO 18-25=="+s1+"(PP)-"+s5+"(PSOE)-"+s9+"(VOX)-"+s13+"(CIUDADANOS)");						
							String s2=String.valueOf(PP2640);
							String s6=String.valueOf(PSOE2640);
							String s10=String.valueOf(VOX2640);
							String s14=String.valueOf(CIUDADANO2640);
								vista.textPane_1.setText("RANGO 26-40=="+s2+"(PP)-"+s6+"(PSOE)-"+s10+"(VOX)-"+s14+"(CIUDADANOS)");
							String s3=String.valueOf(PP4165);
							String s7=String.valueOf(PSOE4165);
							String s11=String.valueOf(VOX4165);
							String s15=String.valueOf(CIUDADANO4165);
								vista.textPane_2.setText("RANGO 41-65=="+s3+"(PP)-"+s7+"(PSOE)-"+s11+"(VOX)-"+s15+"(CIUDADANOS)");							
							String s4=String.valueOf(PP66);
							String s8=String.valueOf(PSOE66);
							String s12=String.valueOf(VOX66);
							String s16=String.valueOf(CIUDADANO66);
								vista.textPane_3.setText("RANGO 66-...=="+s4+"(PP)-"+s8+"(PSOE)-"+s12+"(VOX)-"+s16+"(CIUDADANOS)");
							vista.textPane_4.setText(eleccion);
							}			
						});
				}
				
				
		}
	
	
	
}