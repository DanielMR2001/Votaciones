package CONTROLADOR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
		//ComboBox PARA MOSTRAR RESULTADOS POR RANGO DE EDAD, COMUNIDADES Y GENERAL
		String eleccion = (String) vista.comboBox.getSelectedItem();
			//FUNCIONALIDAD SI SE SELECCIONA POR RANGO DE EDAD
			if (eleccion.equals("Rango De Edad")) {
				vista.panel_2.setVisible(true);vista.lblNewLabel_24.setVisible(false);vista.btnNewButton.setVisible(true);vista.btnNewButton_2.setVisible(true);vista.txtpnElige.setVisible(true);vista.comboBox_2.setVisible(false);vista.textPane_4_3_1.setVisible(false);vista.lblNewLabel_3_5.setVisible(false);
				vista.textPane_5.setVisible(false);vista.textPane_5_1.setVisible(false);vista.textPane_5_2.setVisible(false);vista.textPane_5_3.setVisible(false);vista.textPane_5_4.setVisible(false);vista.textPane_5_5.setVisible(false);vista.textPane_5_6.setVisible(false);vista.textPane_5_7.setVisible(false);vista.textPane_5_8.setVisible(false);vista.textPane_5_9.setVisible(false);vista.textPane_5_10.setVisible(false);
				vista.textPane_5_11.setVisible(false);vista.textPane_5_12.setVisible(false);vista.textPane_5_13.setVisible(false);vista.textPane_5_14.setVisible(false);vista.textPane_5_15.setVisible(false);vista.textPane_5_16.setVisible(false);vista.textPane_5_17.setVisible(false);vista.textPane_5_18.setVisible(false);
				vista.lblNewLabel_4.setVisible(false);vista.lblNewLabel_5.setVisible(false);vista.lblNewLabel_6.setVisible(false);vista.lblNewLabel_7.setVisible(false);vista.lblNewLabel_8.setVisible(false);vista.lblNewLabel_9.setVisible(false);vista.lblNewLabel_10.setVisible(false);vista.lblNewLabel_11.setVisible(false);vista.lblNewLabel_12.setVisible(false);vista.lblNewLabel_13.setVisible(false);
				vista.lblNewLabel_14.setVisible(false);vista.lblNewLabel_15.setVisible(false);vista.lblNewLabel_16.setVisible(false);vista.lblNewLabel_17.setVisible(false);vista.lblNewLabel_18.setVisible(false);vista.lblNewLabel_19.setVisible(false);vista.lblNewLabel_20.setVisible(false);vista.lblNewLabel_21.setVisible(false);vista.lblNewLabel_22.setVisible(false);
				vista.lblNewLabel_26.setVisible(false);vista.lblNewLabel_25.setVisible(false);vista.textPane_1_1.setVisible(false);vista.lblNewLabel_3_6.setVisible(false);vista.textPane_4_4.setVisible(false);vista.lblNewLabel_27.setVisible(false);vista.textPane_6.setVisible(false);
				vista.progressBar.setVisible(false);vista.textPane_7.setVisible(false);vista.txtpnPp.setVisible(false);vista.progressBar_1.setVisible(false);vista.textPane_8.setVisible(false);vista.txtpnPsoe.setVisible(false);vista.progressBar_2.setVisible(false);
				vista.textPane_9.setVisible(false);vista.txtpnVox.setVisible(false);vista.progressBar_3.setVisible(false);vista.textPane_10.setVisible(false);vista.txtpnCs.setVisible(false);vista.textPane_11.setVisible(false);
				if(e.getSource()== vista.btnNewButton) {
					vista.lblNewLabel_23.setVisible(true);vista.comboBox_1.setVisible(true);
					vista.lblNewLabel_3_4.setVisible(true);vista.lblNewLabel_3_4_1.setVisible(true);vista.lblNewLabel_3_4_2.setVisible(true);vista.lblNewLabel_3_4_3.setVisible(true);
					vista.textPane.setVisible(true);vista.textPane_1.setVisible(true);vista.textPane_2.setVisible(true);vista.textPane_3.setVisible(true);vista.textPane_4.setVisible(true);vista.textPane_4_1.setVisible(true);vista.textPane_4_2.setVisible(true);vista.textPane_4_3.setVisible(true);
					vista.lblNewLabel_3.setVisible(true);vista.lblNewLabel_3_1.setVisible(true);vista.lblNewLabel_3_2.setVisible(true);vista.lblNewLabel_3_3.setVisible(true);			
				    //18-25
					informacionPorRango(modelo, sessionFactory, 18, 25, vista.textPane, vista.textPane_4, vista.lblNewLabel_3, "18-25", "el Rango de 18-25 Años",vista.lblNewLabel_3_4 );			
					//26-40
					informacionPorRango(modelo, sessionFactory, 26, 40, vista.textPane_1, vista.textPane_4_1, vista.lblNewLabel_3_1, "26-40", "el Rango de 26-40 Años", vista.lblNewLabel_3_4_1 );			
					//41-65
					informacionPorRango(modelo, sessionFactory, 41, 65, vista.textPane_2, vista.textPane_4_2, vista.lblNewLabel_3_2, "41-65", "el Rango de 41-65 Años", vista.lblNewLabel_3_4_2 );			
					//+66
					informacionPorRango(modelo, sessionFactory, 66, 110, vista.textPane_3,vista.textPane_4_3, vista.lblNewLabel_3_3, "+66", "el Rango de +66 Años", vista.lblNewLabel_3_4_3);			
				}	
				//FUNCIONALIDAD SI SE SELECCIONA UNA EDAD CONCRETA EN EL PANEL DERECHO
				if(e.getSource()==vista.btnNewButton_2) {
					vista.textPane_4_3_1.setVisible(true);vista.lblNewLabel_3_5.setVisible(true);
					String mostrar = (String) vista.comboBox_1.getSelectedItem();
					if(mostrar.equals("18-25")) { mostrarPorcentajePorRango(modelo, sessionFactory, 18, 25, "    RANGO 18-25"); }
					if(mostrar.equals("26-40")) { mostrarPorcentajePorRango(modelo, sessionFactory, 26, 40, "    RANGO 26-40"); }
					if(mostrar.equals("41-65")) { mostrarPorcentajePorRango(modelo, sessionFactory, 41, 65, "    RANGO 41-65"); }
					if(mostrar.equals("+66")) { mostrarPorcentajePorRango(modelo, sessionFactory, 66, 110, "     RANGO +66"); }
				}
			//FUNCIONALIDAD SI SE SELECCIONA POR COMUNIDAD AUTÓNOMA
			}else if(eleccion.equals("Comunidad Autónoma")) {
				vista.lblNewLabel_23.setVisible(false);vista.comboBox_1.setVisible(false);vista.btnNewButton.setVisible(true);vista.txtpnElige.setVisible(true);vista.btnNewButton_2.setVisible(true);
				vista.lblNewLabel_3_4.setVisible(false);vista.lblNewLabel_3_4_1.setVisible(false);vista.lblNewLabel_3_4_2.setVisible(false);vista.lblNewLabel_3_4_3.setVisible(false);vista.textPane_6.setVisible(false);
				vista.textPane.setVisible(false);vista.textPane_1.setVisible(false);vista.textPane_2.setVisible(false);vista.textPane_3.setVisible(false);vista.textPane_4.setVisible(false);vista.textPane_4_1.setVisible(false);vista.textPane_4_2.setVisible(false);vista.textPane_4_3.setVisible(false);
				vista.lblNewLabel_3.setVisible(false);vista.lblNewLabel_3_1.setVisible(false);vista.lblNewLabel_3_2.setVisible(false);vista.lblNewLabel_3_3.setVisible(false);vista.lblNewLabel_27.setVisible(false);
				vista.lblNewLabel_26.setVisible(false);vista.lblNewLabel_25.setVisible(false);vista.textPane_1_1.setVisible(false);vista.lblNewLabel_3_6.setVisible(false);vista.textPane_4_4.setVisible(false);
				vista.progressBar.setVisible(false);vista.textPane_7.setVisible(false);vista.txtpnPp.setVisible(false);vista.progressBar_1.setVisible(false);vista.textPane_8.setVisible(false);vista.txtpnPsoe.setVisible(false);vista.progressBar_2.setVisible(false);
				vista.textPane_9.setVisible(false);vista.txtpnVox.setVisible(false);vista.progressBar_3.setVisible(false);vista.textPane_10.setVisible(false);vista.txtpnCs.setVisible(false);vista.textPane_11.setVisible(false);
				if(e.getSource()== vista.btnNewButton) {
					vista.lblNewLabel_24.setVisible(true);vista.comboBox_2.setVisible(true);
					vista.textPane_5.setVisible(true);vista.textPane_5_1.setVisible(true);vista.textPane_5_2.setVisible(true);vista.textPane_5_3.setVisible(true);vista.textPane_5_4.setVisible(true);vista.textPane_5_5.setVisible(true);vista.textPane_5_6.setVisible(true);vista.textPane_5_7.setVisible(true);vista.textPane_5_8.setVisible(true);vista.textPane_5_9.setVisible(true);vista.textPane_5_10.setVisible(true);
					vista.textPane_5_11.setVisible(true);vista.textPane_5_12.setVisible(true);vista.textPane_5_13.setVisible(true);vista.textPane_5_14.setVisible(true);vista.textPane_5_15.setVisible(true);vista.textPane_5_16.setVisible(true);vista.textPane_5_17.setVisible(true);vista.textPane_5_18.setVisible(true);
					vista.lblNewLabel_4.setVisible(true);vista.lblNewLabel_5.setVisible(true);vista.lblNewLabel_6.setVisible(true);vista.lblNewLabel_7.setVisible(true);vista.lblNewLabel_8.setVisible(true);vista.lblNewLabel_9.setVisible(true);vista.lblNewLabel_10.setVisible(true);vista.lblNewLabel_11.setVisible(true);vista.lblNewLabel_12.setVisible(true);vista.lblNewLabel_13.setVisible(true);
					vista.lblNewLabel_14.setVisible(true);vista.lblNewLabel_15.setVisible(true);vista.lblNewLabel_16.setVisible(true);vista.lblNewLabel_17.setVisible(true);vista.lblNewLabel_18.setVisible(true);vista.lblNewLabel_19.setVisible(true);vista.lblNewLabel_20.setVisible(true);vista.lblNewLabel_21.setVisible(true);vista.lblNewLabel_22.setVisible(true);
					informacionPorComunidad(modelo, sessionFactory, "Andalucia", vista.textPane_5);
					informacionPorComunidad(modelo, sessionFactory, "Aragon",vista.textPane_5_1);
					informacionPorComunidad(modelo, sessionFactory, "Asturias",vista.textPane_5_2);
					informacionPorComunidad(modelo, sessionFactory, "Baleares", vista.textPane_5_3);
					informacionPorComunidad(modelo, sessionFactory, "Canarias",vista.textPane_5_4);
					informacionPorComunidad(modelo, sessionFactory, "Cantabria",vista.textPane_5_5);
					informacionPorComunidad(modelo, sessionFactory, "Castilla La Mancha",vista.textPane_5_6);
					informacionPorComunidad(modelo, sessionFactory, "Castilla y Leon",vista.textPane_5_7);
					informacionPorComunidad(modelo, sessionFactory, "Catalunia",vista.textPane_5_8);
					informacionPorComunidad(modelo, sessionFactory, "Comunidad Valenciana",vista.textPane_5_9);
					informacionPorComunidad(modelo, sessionFactory, "Extremadura",vista.textPane_5_10);
					informacionPorComunidad(modelo, sessionFactory, "Galicia",vista.textPane_5_11);
					informacionPorComunidad(modelo, sessionFactory, "Madrid",vista.textPane_5_12);
					informacionPorComunidad(modelo, sessionFactory, "Murcia",vista.textPane_5_13);
					informacionPorComunidad(modelo, sessionFactory, "Navarra",vista.textPane_5_14);
					informacionPorComunidad(modelo, sessionFactory, "Pais Vasco",vista.textPane_5_15);
					informacionPorComunidad(modelo, sessionFactory, "La Rioja",vista.textPane_5_16);
					informacionPorComunidad(modelo, sessionFactory, "Ceuta",vista.textPane_5_17);
					informacionPorComunidad(modelo, sessionFactory, "Melilla",vista.textPane_5_18);	
				}
				//SACAR EL GANDOR DE CADA COMUNIDAD DEPENDIENDO DEL ITEM SELECCIONADO
				if(e.getSource()==vista.btnNewButton_2) {
					vista.textPane_4_3_1.setVisible(true);vista.lblNewLabel_3_5.setVisible(true);
					String mostrar = (String) vista.comboBox_2.getSelectedItem();
					if(mostrar.equals("Andalucia")) { ganadorPorComunidad(modelo, sessionFactory, "Andalucia", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Andalucia", "     ANDALUCIA"); 
					}else if(mostrar.equals("Aragon")) { ganadorPorComunidad(modelo, sessionFactory, "Aragon", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Aragon", "        ARAGON"); 
					} else if(mostrar.equals("Asturias")) { ganadorPorComunidad(modelo, sessionFactory, "Asturias", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Asturias", "       ASTURIAS"); 
					}else if(mostrar.equals("Baleares")) { ganadorPorComunidad(modelo, sessionFactory, "Baleares", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Baleares", "       BALEARES"); 
					}else if(mostrar.equals("Canarias")) { ganadorPorComunidad(modelo, sessionFactory, "Canarias", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Canarias", "       CANARIAS"); 
					}else if(mostrar.equals("Cantabria")) { ganadorPorComunidad(modelo, sessionFactory, "Cantabria", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Cantabria", "      CANTABRIA"); 
					}else if(mostrar.equals("C. La Mancha")) { ganadorPorComunidad(modelo, sessionFactory, "Castilla La Mancha", vista.textPane_4_3_1, vista.lblNewLabel_3_5);						
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Castilla La Mancha", "    C.LA MANCHA"); 
					}else if(mostrar.equals("C. y Leon")) { ganadorPorComunidad(modelo, sessionFactory, "Castilla y Leon", vista.textPane_4_3_1, vista.lblNewLabel_3_5);						
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Castilla y Leon", "       C.Y LEON"); 
					}else if(mostrar.equals("Cataluña")) { ganadorPorComunidad(modelo, sessionFactory, "Catalunia", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Catalunia", "      CATALUÑA"); 
					}else if(mostrar.equals("C. Valenciana")) { ganadorPorComunidad(modelo, sessionFactory, "Comunidad Valenciana", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Comunidad Valenciana", "   C.VALENCIANA"); 
					}else if(mostrar.equals("Extremadura")) { ganadorPorComunidad(modelo, sessionFactory, "Extremadura", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Extremadura", "   EXTREMADURA"); 
					}else if(mostrar.equals("Galicia")) { ganadorPorComunidad(modelo, sessionFactory, "Galicia", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Galicia", "       GALICIA"); 
					}else if(mostrar.equals("Madrid")) { ganadorPorComunidad(modelo, sessionFactory, "Madrid", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Madrid", "        MADRID"); 
					}else if(mostrar.equals("Murcia")) { ganadorPorComunidad(modelo, sessionFactory, "Murcia", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Murcia", "        MURCIA"); 
					}else if(mostrar.equals("Navarra")) { ganadorPorComunidad(modelo, sessionFactory, "Navarra", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Navarra", "      NAVARRA"); 
					}else if(mostrar.equals("Pais Vasco")) { ganadorPorComunidad(modelo, sessionFactory, "Pais Vasco", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Pais Vasco", "     PAIS VASCO"); 
					}else if(mostrar.equals("La Rioja")) { ganadorPorComunidad(modelo, sessionFactory, "La Rioja", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "La Rioja", "       LA RIOJA"); 
					}else if(mostrar.equals("Ceuta")) { ganadorPorComunidad(modelo, sessionFactory, "Ceuta", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Ceuta", "         CEUTA"); 
					}else if(mostrar.equals("Melilla")) { ganadorPorComunidad(modelo, sessionFactory, "Melilla", vista.textPane_4_3_1, vista.lblNewLabel_3_5);
						mostrarPorcentajePorComunidad(modelo, sessionFactory, "Melilla", "       MELILLA"); 
					}
				}
			//SACAR EL GANDOR GENERAL A NIVEL DE ESPAÑA
			}else if(eleccion.equals("General")) {
				vista.lblNewLabel_23.setVisible(false);vista.comboBox_1.setVisible(false);vista.btnNewButton.setVisible(false);vista.txtpnElige.setVisible(false);
				vista.lblNewLabel_3_4.setVisible(false);vista.lblNewLabel_3_4_1.setVisible(false);vista.lblNewLabel_3_4_2.setVisible(false);vista.lblNewLabel_3_4_3.setVisible(false);vista.btnNewButton_2.setVisible(false);
				vista.textPane.setVisible(false);vista.textPane_1.setVisible(false);vista.textPane_2.setVisible(false);vista.textPane_3.setVisible(false);vista.textPane_4.setVisible(false);vista.textPane_4_1.setVisible(false);vista.textPane_4_2.setVisible(false);vista.textPane_4_3.setVisible(false);
				vista.lblNewLabel_3.setVisible(false);vista.lblNewLabel_3_1.setVisible(false);vista.lblNewLabel_3_2.setVisible(false);vista.lblNewLabel_3_3.setVisible(false);vista.txtpnElige.setVisible(false);
				vista.panel_2.setVisible(true);vista.lblNewLabel_24.setVisible(false);vista.btnNewButton.setVisible(true);vista.comboBox_2.setVisible(false);vista.textPane_4_3_1.setVisible(false);vista.lblNewLabel_3_5.setVisible(false);
				vista.textPane_5.setVisible(false);vista.textPane_5_1.setVisible(false);vista.textPane_5_2.setVisible(false);vista.textPane_5_3.setVisible(false);vista.textPane_5_4.setVisible(false);vista.textPane_5_5.setVisible(false);vista.textPane_5_6.setVisible(false);vista.textPane_5_7.setVisible(false);vista.textPane_5_8.setVisible(false);vista.textPane_5_9.setVisible(false);vista.textPane_5_10.setVisible(false);
				vista.textPane_5_11.setVisible(false);vista.textPane_5_12.setVisible(false);vista.textPane_5_13.setVisible(false);vista.textPane_5_14.setVisible(false);vista.textPane_5_15.setVisible(false);vista.textPane_5_16.setVisible(false);vista.textPane_5_17.setVisible(false);vista.textPane_5_18.setVisible(false);
				vista.lblNewLabel_4.setVisible(false);vista.lblNewLabel_5.setVisible(false);vista.lblNewLabel_6.setVisible(false);vista.lblNewLabel_7.setVisible(false);vista.lblNewLabel_8.setVisible(false);vista.lblNewLabel_9.setVisible(false);vista.lblNewLabel_10.setVisible(false);vista.lblNewLabel_11.setVisible(false);vista.lblNewLabel_12.setVisible(false);vista.lblNewLabel_13.setVisible(false);
				vista.lblNewLabel_14.setVisible(false);vista.lblNewLabel_15.setVisible(false);vista.lblNewLabel_16.setVisible(false);vista.lblNewLabel_17.setVisible(false);vista.lblNewLabel_18.setVisible(false);vista.lblNewLabel_19.setVisible(false);vista.lblNewLabel_20.setVisible(false);vista.lblNewLabel_21.setVisible(false);vista.lblNewLabel_22.setVisible(false);
				vista.progressBar.setVisible(false);vista.textPane_7.setVisible(false);vista.txtpnPp.setVisible(false);vista.progressBar_1.setVisible(false);vista.textPane_8.setVisible(false);vista.txtpnPsoe.setVisible(false);vista.progressBar_2.setVisible(false);
				vista.textPane_9.setVisible(false);vista.txtpnVox.setVisible(false);vista.progressBar_3.setVisible(false);vista.textPane_10.setVisible(false);vista.txtpnCs.setVisible(false);vista.textPane_11.setVisible(false);
				if(e.getSource()==vista.btnNewButton) {
					vista.lblNewLabel_26.setVisible(true);vista.lblNewLabel_25.setVisible(true);vista.textPane_1_1.setVisible(true);vista.lblNewLabel_3_6.setVisible(true);vista.textPane_4_4.setVisible(true);
					vista.progressBar.setVisible(true);vista.textPane_7.setVisible(true);vista.txtpnPp.setVisible(true);vista.progressBar_1.setVisible(true);vista.textPane_8.setVisible(true);vista.txtpnPsoe.setVisible(true);vista.progressBar_2.setVisible(true);
					vista.textPane_9.setVisible(true);vista.txtpnVox.setVisible(true);vista.progressBar_3.setVisible(true);vista.textPane_10.setVisible(true);vista.txtpnCs.setVisible(true);vista.textPane_11.setVisible(true);vista.lblNewLabel_3_5.setVisible(false);vista.textPane_4_3_1.setVisible(false);
					int PP=modelo.contarVotoGeneral(sessionFactory, "PP");
					int PSOE=modelo.contarVotoGeneral(sessionFactory, "PSOE");
					int VOX=modelo.contarVotoGeneral(sessionFactory, "VOX");
					int CIUDADANOS=modelo.contarVotoGeneral(sessionFactory, "CIUDADANOS");
					vista.textPane_1_1.setText("\n                              ESPAÑA\nPP:"+PP+" - PSOE:"+PSOE+" - VOX:"+VOX+" - CIUDADANOS:"+CIUDADANOS);
					sacarGanador(PP, PSOE, VOX, CIUDADANOS, vista.lblNewLabel_3_6, vista.textPane_4_4, "España");
					String ganador=sacarGanador(PP, PSOE, VOX, CIUDADANOS,  vista.lblNewLabel_3_6, vista.textPane_4_4, "España");
					vista.lblNewLabel_27.setVisible(true);
					if(ganador.equals("PP")) {vista.lblNewLabel_27.setIcon(new ImageIcon("mapaPP.png"));vista.textPane_6.setVisible(true); vista.textPane_6.setText("\n\n\nEnhorabuena al PP\nGobernará hasta 2027");}
					if(ganador.equals("PSOE")) {vista.lblNewLabel_27.setIcon(new ImageIcon("mapaPSOE.png"));vista.textPane_6.setVisible(true); vista.textPane_6.setText("\n\n\nEnhorabuena al PSOE\nGobernará hasta 2027");}
					if(ganador.equals("CIUDADANOS")) {vista.lblNewLabel_27.setIcon(new ImageIcon("mapaCIUDADANOS.png")); vista.textPane_6.setVisible(true); vista.textPane_6.setText("\n\n\nEnhorabuena a CIUDADANOS\nGobernará hasta 2027");}
					if(ganador.equals("VOX")) {vista.lblNewLabel_27.setIcon(new ImageIcon("mapaVOX.jpg")); vista.textPane_6.setVisible(true); vista.textPane_6.setText("\n\n\nEnhorabuena a VOX\nGobernará hasta 2027");}						
					calcular("          ESPAÑA", PP, PSOE, VOX, CIUDADANOS);
				}
			}
	}

	private void mostrarPorcentajePorRango(Modelo modelo, SessionFactory sessionFactory, int edad1, int edad2, String rango) {
		vista.progressBar.setVisible(true);vista.textPane_7.setVisible(true);vista.txtpnPp.setVisible(true);vista.progressBar_1.setVisible(true);vista.textPane_8.setVisible(true);vista.txtpnPsoe.setVisible(true);vista.progressBar_2.setVisible(true);
		vista.textPane_9.setVisible(true);vista.txtpnVox.setVisible(true);vista.progressBar_3.setVisible(true);vista.textPane_10.setVisible(true);vista.txtpnCs.setVisible(true);vista.textPane_11.setVisible(true);vista.lblNewLabel_3_5.setVisible(false);vista.textPane_4_3_1.setVisible(false);
		int pp=modelo.contarVotoPorRango(sessionFactory, "PP", edad1, edad2);						
		int psoe=modelo.contarVotoPorRango(sessionFactory, "PSOE", edad1, edad2);					
		int vox=modelo.contarVotoPorRango(sessionFactory, "VOX", edad1, edad2);					
		int ciudadanos=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", edad1, edad2);
		calcular(rango, pp, psoe, vox, ciudadanos);
	}

	private void calcular(String dato, int pp, int psoe, int vox, int ciudadanos) {
		int suma=pp+psoe+vox+ciudadanos;
		int porcentajePP=(pp*100)/suma;
		String ganador=sacarGanador(pp, psoe, vox, ciudadanos,  vista.lblNewLabel_3_6, vista.textPane_4_4, "España");	
		vista.progressBar.setValue(porcentajePP);	
		vista.textPane_7.setText("("+porcentajePP+"%)");
		if(ganador.equals("PP")) {vista.textPane_7.setText("("+porcentajePP+"%)*");}
		int porcentajePSOE=(psoe*100)/suma;
		vista.progressBar_1.setValue(porcentajePSOE);
		vista.textPane_8.setText("("+porcentajePSOE+"%)");
		if(ganador.equals("PSOE")) {vista.textPane_8.setText("("+porcentajePSOE+"%)*");}
		int porcentajeVOX=(vox*100)/suma;
		vista.progressBar_2.setValue(porcentajeVOX);
		vista.textPane_9.setText("("+porcentajeVOX+"%)");
		if(ganador.equals("VOX")) {vista.textPane_9.setText("("+porcentajeVOX+"%)*");}
		int porcentajeCIUDADANOS=(ciudadanos*100)/suma;
		vista.progressBar_3.setValue(porcentajeCIUDADANOS);
		vista.textPane_10.setText("("+porcentajeCIUDADANOS+"%)");
		if(ganador.equals("CIUDADANOS")) {vista.textPane_10.setText("("+porcentajeCIUDADANOS+"%)*");}
		vista.textPane_11.setText(dato);
	}

	private void mostrarPorcentajePorComunidad(Modelo modelo, SessionFactory sessionFactory, String comunidad, String ciudad) {
		vista.progressBar.setVisible(true);vista.textPane_7.setVisible(true);vista.txtpnPp.setVisible(true);vista.progressBar_1.setVisible(true);vista.textPane_8.setVisible(true);vista.txtpnPsoe.setVisible(true);vista.progressBar_2.setVisible(true);
		vista.textPane_9.setVisible(true);vista.txtpnVox.setVisible(true);vista.progressBar_3.setVisible(true);vista.textPane_10.setVisible(true);vista.txtpnCs.setVisible(true);vista.textPane_11.setVisible(true);
		int pp=modelo.contarVotoPorComunidad(sessionFactory, "PP", comunidad);
		int psoe=modelo.contarVotoPorComunidad(sessionFactory, "PSOE", comunidad);
		int vox=modelo.contarVotoPorComunidad(sessionFactory, "VOX", comunidad);
		int ciudadanos=modelo.contarVotoPorComunidad(sessionFactory, "CIUDADANOS", comunidad);
		calcular(ciudad, pp, psoe, vox, ciudadanos);
	}
	
	private void ganadorPorComunidad(Modelo modelo, SessionFactory sessionFactory, String comunidad, JTextPane panelganador, JLabel label) {
		int PP=modelo.contarVotoPorComunidad(sessionFactory, "PP", comunidad);
		int PSOE=modelo.contarVotoPorComunidad(sessionFactory, "PSOE", comunidad);
		int VOX=modelo.contarVotoPorComunidad(sessionFactory, "VOX", comunidad);
		int CIUDADANOS=modelo.contarVotoPorComunidad(sessionFactory, "CIUDADANOS", comunidad);
		if(comunidad.equals("Catalunia")) {comunidad="Cataluña";}
		sacarGanador(PP, PSOE, VOX, CIUDADANOS, label, panelganador, comunidad);
		
	}

	private void informacionPorComunidad(Modelo modelo, SessionFactory sessionFactory, String comunidad, JTextPane panelresultado) {
		int PP=modelo.contarVotoPorComunidad(sessionFactory, "PP", comunidad);
		int PSOE=modelo.contarVotoPorComunidad(sessionFactory, "PSOE", comunidad);
		int VOX=modelo.contarVotoPorComunidad(sessionFactory, "VOX", comunidad);
		int CIUDADANOS=modelo.contarVotoPorComunidad(sessionFactory, "CIUDADANOS", comunidad);
		if(comunidad.equalsIgnoreCase("Castilla La Mancha")) {comunidad="C.La Mancha";}
		if(comunidad.equalsIgnoreCase("Castilla y Leon")) {comunidad="C.y Leon";}
		if(comunidad.equalsIgnoreCase("Comunidad Valenciana")) {comunidad="C.Valenciana";}
		if(comunidad.equalsIgnoreCase("Catalunia")) {comunidad="Cataluña";}
		panelresultado.setText(comunidad.toUpperCase()+" - PP:"+PP+" - PSOE:"+PSOE+" - VOX:"+VOX+" - CIUDADANOS:"+CIUDADANOS);	
	}

	private void informacionPorRango(Modelo modelo, SessionFactory sessionFactory, int edad1, int edad2,JTextPane panelresultado, JTextPane panelGanador, JLabel label, String rango1, String rango2, JLabel png ) {
		int PP=modelo.contarVotoPorRango(sessionFactory, "PP", edad1, edad2);						
		int PSOE=modelo.contarVotoPorRango(sessionFactory, "PSOE", edad1, edad2);					
		int VOX=modelo.contarVotoPorRango(sessionFactory, "VOX", edad1, edad2);					
		int CIUDADANO=modelo.contarVotoPorRango(sessionFactory, "CIUDADANOS", edad1, edad2);
		sacarGanador(PP, PSOE, VOX, CIUDADANO, label, panelGanador,rango2);
		png.setVisible(true);
		png.setIcon(new ImageIcon("votar.png"));
		panelresultado.setText("\n                      RANGO "+rango1+" AÑOS\n" +"PP:"+PP+" - PSOE:"+PSOE+" - VOX:"+VOX+" - CIUDADANOS:"+CIUDADANO);
	}
	
	public String sacarGanador(int pp, int psoe, int vox, int ciudadano, JLabel label, JTextPane texto,String dato) {
		String ganador="";
		//GANADOR SIN EMPATES
		if((pp>psoe)&&(pp>vox)&&(pp>ciudadano)) { label.setIcon(new ImageIcon("pp.jpg")); texto.setText("\n   Ha ganado el PP\n   en "+dato); ganador="PP";}
		if((psoe>pp)&&(psoe>vox)&&(psoe>ciudadano)) { label.setIcon(new ImageIcon("psoe.png")); texto.setText("\n   Ha ganado el PSOE\n   en "+dato); ganador="PSOE";}
		if((vox>psoe)&&(vox>pp)&&(vox>ciudadano)) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en "+dato); ganador="VOX";}
		if((ciudadano>psoe)&&(ciudadano>pp)&&(ciudadano>vox)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en "+dato); ganador="CIUDADANOS";}
		//GANADOR CON 2 EMPATES
		if((pp==psoe)&&((pp>vox)&&(pp>ciudadano))) { label.setIcon(new ImageIcon("pp.jpg")); texto.setText("\n   Ha ganado el PP\n   "+dato+"\n   Coalición con PSOE"); ganador="PP";}
		if((pp==ciudadano)&&((ciudadano>psoe)&&(ciudadano>vox))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en "+dato+"\n   Coalición con PP"); ganador="CIUDADANOS";}
		if((vox==psoe)&&((vox>pp)&&(vox>ciudadano))) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en "+dato+"\n   Coalición con PSOE"); ganador="VOX";}
		if((vox==pp)&&((vox>psoe)&&(vox>ciudadano))) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en "+dato+"\n   Coalición con PP"); ganador="VOX";}
		if((psoe==ciudadano)&&((ciudadano>vox)&&(ciudadano>pp))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en "+dato+"\n   Coalición con PSOE"); ganador="CIUDADANOS";}
		if((vox==ciudadano)&&((ciudadano>pp)&&(ciudadano>psoe))) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en "+dato+"\n   Coalición con VOX"); ganador="CIUDADANOS";}
		//GANADOR CON 3 EMPATES
		if((pp==psoe)&&(pp==vox)&&(pp>ciudadano)) { label.setIcon(new ImageIcon("pp.jpg")); texto.setText("\n   Ha ganado el PP\n   en "+dato+"\n   Coalición con PSOE-VOX"); ganador="PP";}
		if((pp==psoe)&&(pp==ciudadano)&&(pp>vox)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en "+dato+"\n   Coalición con PP-PSOE"); ganador="CIUDADANOS";}
		if((psoe==vox)&&(psoe==ciudadano)&&(psoe>pp)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en "+dato+"\n   Coalición con VOX-PSOE"); ganador="CIUDADANOS";}
		if((pp==vox)&&(ciudadano==vox)&&(pp>psoe)) { label.setIcon(new ImageIcon("vox.png")); texto.setText("\n   Ha ganado VOX\n   en "+dato+"\nCoalición con PP-CIUDADANOS"); ganador="VOX";}
		//GANADOR CON 4 EMPATES
		if((pp==psoe)&&(pp==vox)&&(pp==ciudadano)) { label.setIcon(new ImageIcon("Ciudadanos.png")); texto.setText("\n   Ha ganado CIUDADANOS\n   en "+dato+"\n   Coalición con PP-PSOE-VOX"); ganador="CIUDADANOS";}
		return ganador;
	}
}