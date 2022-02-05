package VISTA;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import CONTROLADOR.Controlador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JProgressBar;

public class Vista extends JFrame {

	public JPanel contentPane;
	public JPanel panel_2;
	public JTextPane textPane;
	public JPanel panel_3;
	public JPanel panel_4;
	public JComboBox comboBox;
	public Panel panel;
	public JTextPane txtpnResultadoVotacionesPor;
	public JButton btnNewButton;
    public JLabel lblNewLabel;
    public JLabel lblNewLabel_1;
    public JButton btnNewButton_1;
    public JLabel lblNewLabel_2;
    public JTextPane textPane_2;
    public JTextPane textPane_1;
    public JTextPane textPane_3;
    public JLabel lblNewLabel_3;
    public JLabel lblNewLabel_3_1;
    public JLabel lblNewLabel_3_2;
    public JLabel lblNewLabel_3_3;
    public JLabel lblNewLabel_3_4;
    public JLabel lblNewLabel_3_4_1;
    public JLabel lblNewLabel_3_4_2;
    public JLabel lblNewLabel_3_4_3;
    public JTextPane textPane_4;
    public JTextPane textPane_4_1;
    public JTextPane textPane_4_2;
    public JTextPane textPane_4_3;
    public JButton btnNewButton_2;
    public JComboBox comboBox_1;
    public JTextPane txtpnElige;
    public JComboBox comboBox_2;
    public JLabel lblNewLabel_5;
    public JLabel lblNewLabel_6;
    public JLabel lblNewLabel_7;
    public JLabel lblNewLabel_8;
    public JLabel lblNewLabel_9;
    public JLabel lblNewLabel_10;
    public JLabel lblNewLabel_11;
    public JLabel lblNewLabel_12;
    public JLabel lblNewLabel_13;
    public JLabel lblNewLabel_4;
    public JLabel lblNewLabel_14;
    public JLabel lblNewLabel_15;
    public JLabel lblNewLabel_16;
    public JLabel lblNewLabel_17;
    public JLabel lblNewLabel_18;
    public JLabel lblNewLabel_19;
    public JLabel lblNewLabel_20;
    public JLabel lblNewLabel_21;
    public JLabel lblNewLabel_22;
    public JTextPane textPane_5;
    public JTextPane textPane_5_1;
    public JTextPane textPane_5_2;
    public JTextPane textPane_5_3;
    public JTextPane textPane_5_4;
    public JTextPane textPane_5_5;
    public JTextPane textPane_5_6;
    public JTextPane textPane_5_7;
    public JTextPane textPane_5_8;
    public JTextPane textPane_5_9;
    public JTextPane textPane_5_10;
    public JTextPane textPane_5_11;
    public JTextPane textPane_5_12;
    public JTextPane textPane_5_13;
    public JTextPane textPane_5_14;
    public JTextPane textPane_5_15;
    public JTextPane textPane_5_16;
    public JTextPane textPane_5_17;
    public JTextPane textPane_5_18;
    public JLabel lblNewLabel_23;
    public JLabel lblNewLabel_24;
    public JLabel lblNewLabel_3_5;
    public JTextPane textPane_4_3_1;
    public JLabel lblNewLabel_25;
    public JTextPane textPane_1_1;
    public JLabel lblNewLabel_3_6;
    public JTextPane textPane_4_4;
    public JLabel lblNewLabel_26;
    public JLabel lblNewLabel_27;
    public JTextPane textPane_6;
    public JProgressBar progressBar;
    public JTextPane textPane_7;
    public JTextPane txtpnPp;
    public JTextPane txtpnPsoe;
    public JTextPane textPane_8;
    public JProgressBar progressBar_1;
    public JTextPane txtpnVox;
    public JProgressBar progressBar_2;
    public JTextPane textPane_9;
    public JTextPane txtpnCs;
    public JProgressBar progressBar_3;
    public JTextPane textPane_10;
    public JTextPane textPane_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Vista frame = new Vista();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		@SuppressWarnings("unused")
		Controlador controlador=new Controlador(frame);		
		centreWindow(frame);
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Vista() {
		this.setTitle("   - VOTACIONES 2023 -");	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setBounds(100, 100, 1386, 738);
		contentPane.setLayout(null);	
		
		panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1380, 709);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 142, 920, 541);
		panel.add(panel_2);
		
		textPane = new JTextPane();
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane.setEditable(false);
		textPane.setBounds(211, 59, 338, 102);
		panel_2.add(textPane);
		
		txtpnResultadoVotacionesPor = new JTextPane();
		txtpnResultadoVotacionesPor.setBounds(10, 11, 277, 37);
		panel_2.add(txtpnResultadoVotacionesPor);
		txtpnResultadoVotacionesPor.setText("Resultado Votaciones Por:");
		txtpnResultadoVotacionesPor.setVisible(false);
		txtpnResultadoVotacionesPor.setForeground(Color.BLACK);
		txtpnResultadoVotacionesPor.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		txtpnResultadoVotacionesPor.setEditable(false);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setBounds(290, 11, 199, 37);
		panel_2.add(comboBox);
		comboBox.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Rango De Edad", "Comunidad Aut\u00F3noma", "General"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setVisible(false);
		
		btnNewButton = new JButton("Mostrar Resultados");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(499, 11, 215, 37);
		panel_2.add(btnNewButton);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 22));
		btnNewButton.setVisible(false);

		btnNewButton_1 = new JButton("Iniciar Votaci\u00F3n");
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 22));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(724, 11, 186, 37);
		panel_2.add(btnNewButton_1);
		
		textPane_1 = new JTextPane();
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_1.setEditable(false);
		textPane_1.setBounds(211, 185, 338, 102);
		panel_2.add(textPane_1);
		
		textPane_2 = new JTextPane();
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_2.setEditable(false);
		textPane_2.setBounds(211, 298, 338, 102);
		panel_2.add(textPane_2);
		
		textPane_3 = new JTextPane();
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_3.setEditable(false);
		textPane_3.setBounds(211, 411, 338, 102);
		panel_2.add(textPane_3);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(559, 72, 125, 102);
		panel_2.add(lblNewLabel_3);
		
		lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(559, 185, 125, 102);
		panel_2.add(lblNewLabel_3_1);
		
		lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(559, 298, 125, 102);
		panel_2.add(lblNewLabel_3_2);
		
		lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBounds(559, 411, 125, 102);
		panel_2.add(lblNewLabel_3_3);
		
		lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setBounds(87, 50, 125, 102);
		panel_2.add(lblNewLabel_3_4);
		lblNewLabel_3_4.setVisible(false);

		lblNewLabel_3_4_1 = new JLabel("");
		lblNewLabel_3_4_1.setBounds(87, 163, 125, 102);
		panel_2.add(lblNewLabel_3_4_1);
		lblNewLabel_3_4_1.setVisible(false);

		lblNewLabel_3_4_2 = new JLabel("");
		lblNewLabel_3_4_2.setBounds(87, 276, 125, 102);
		panel_2.add(lblNewLabel_3_4_2);
		lblNewLabel_3_4_2.setVisible(false);

		lblNewLabel_3_4_3 = new JLabel("");
		lblNewLabel_3_4_3.setBounds(87, 389, 125, 102);
		panel_2.add(lblNewLabel_3_4_3);
		
		textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setForeground(Color.BLACK);
		textPane_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4.setBounds(694, 72, 216, 102);
		panel_2.add(textPane_4);
		
		textPane_4_1 = new JTextPane();
		textPane_4_1.setEditable(false);
		textPane_4_1.setForeground(Color.BLACK);
		textPane_4_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_1.setBounds(694, 185, 216, 102);
		panel_2.add(textPane_4_1);
		
		textPane_4_2 = new JTextPane();
		textPane_4_2.setEditable(false);
		textPane_4_2.setForeground(Color.BLACK);
		textPane_4_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_2.setBounds(694, 298, 216, 102);
		panel_2.add(textPane_4_2);
		
		textPane_4_3 = new JTextPane();
		textPane_4_3.setEditable(false);
		textPane_4_3.setForeground(Color.BLACK);
		textPane_4_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_3.setBounds(694, 411, 216, 102);
		panel_2.add(textPane_4_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_4.setBounds(10, 50, 40, 40);
		panel_2.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_5.setBounds(10, 98, 40, 40);
		panel_2.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_6.setBounds(10, 147, 40, 40);
		panel_2.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_7.setBounds(10, 196, 40, 40);
		panel_2.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setVisible(false);
		lblNewLabel_8.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_8.setBounds(10, 247, 40, 40);
		panel_2.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setVisible(false);
		lblNewLabel_9.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_9.setBounds(10, 298, 40, 40);
		panel_2.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setVisible(false);
		lblNewLabel_10.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_10.setBounds(10, 349, 40, 40);
		panel_2.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setVisible(false);
		lblNewLabel_11.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_11.setBounds(10, 398, 40, 40);
		panel_2.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setVisible(false);
		lblNewLabel_12.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_12.setBounds(10, 449, 40, 40);
		panel_2.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setVisible(false);
		lblNewLabel_13.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_13.setBounds(10, 495, 40, 40);
		panel_2.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setVisible(false);
		lblNewLabel_14.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_14.setBounds(462, 98, 40, 40);
		panel_2.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setVisible(false);
		lblNewLabel_15.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_15.setBounds(462, 147, 40, 40);
		panel_2.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setVisible(false);
		lblNewLabel_16.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_16.setBounds(462, 196, 40, 40);
		panel_2.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setVisible(false);
		lblNewLabel_17.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_17.setBounds(462, 247, 40, 40);
		panel_2.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setVisible(false);
		lblNewLabel_18.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_18.setBounds(462, 298, 40, 40);
		panel_2.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setVisible(false);
		lblNewLabel_19.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_19.setBounds(462, 349, 40, 40);
		panel_2.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setVisible(false);
		lblNewLabel_20.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_20.setBounds(462, 398, 40, 40);
		panel_2.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setVisible(false);
		lblNewLabel_21.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_21.setBounds(462, 449, 40, 40);
		panel_2.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setVisible(false);
		lblNewLabel_22.setIcon(new ImageIcon("votar2.png"));
		lblNewLabel_22.setBounds(462, 495, 40, 40);
		panel_2.add(lblNewLabel_22);
		
		textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setForeground(Color.BLACK);
		textPane_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5.setBounds(60, 66, 392, 24);
		panel_2.add(textPane_5);
		
		textPane_5_1 = new JTextPane();
		textPane_5_1.setEditable(false);
		textPane_5_1.setForeground(Color.BLACK);
		textPane_5_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_1.setBounds(60, 114, 392, 24);
		panel_2.add(textPane_5_1);
		
		textPane_5_2 = new JTextPane();
		textPane_5_2.setEditable(false);
		textPane_5_2.setForeground(Color.BLACK);
		textPane_5_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_2.setBounds(60, 163, 392, 24);
		panel_2.add(textPane_5_2);
		
		textPane_5_3 = new JTextPane();
		textPane_5_3.setEditable(false);
		textPane_5_3.setForeground(Color.BLACK);
		textPane_5_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_3.setBounds(60, 212, 392, 24);
		panel_2.add(textPane_5_3);
		
		textPane_5_4 = new JTextPane();
		textPane_5_4.setEditable(false);
		textPane_5_4.setForeground(Color.BLACK);
		textPane_5_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_4.setBounds(60, 263, 392, 24);
		panel_2.add(textPane_5_4);
		
		textPane_5_5 = new JTextPane();
		textPane_5_5.setEditable(false);
		textPane_5_5.setForeground(Color.BLACK);
		textPane_5_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_5.setBounds(60, 314, 392, 24);
		panel_2.add(textPane_5_5);
		
		textPane_5_6 = new JTextPane();
		textPane_5_6.setEditable(false);
		textPane_5_6.setForeground(Color.BLACK);
		textPane_5_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_6.setBounds(60, 365, 392, 24);
		panel_2.add(textPane_5_6);
		
		textPane_5_7 = new JTextPane();
		textPane_5_7.setEditable(false);
		textPane_5_7.setForeground(Color.BLACK);
		textPane_5_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_7.setBounds(60, 414, 392, 24);
		panel_2.add(textPane_5_7);
		
		textPane_5_8 = new JTextPane();
		textPane_5_8.setEditable(false);
		textPane_5_8.setForeground(Color.BLACK);
		textPane_5_8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_8.setBounds(60, 467, 392, 24);
		panel_2.add(textPane_5_8);
		
		textPane_5_9 = new JTextPane();
		textPane_5_9.setEditable(false);
		textPane_5_9.setForeground(Color.BLACK);
		textPane_5_9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_9.setBounds(60, 511, 392, 24);
		panel_2.add(textPane_5_9);
		
		textPane_5_10 = new JTextPane();
		textPane_5_10.setEditable(false);
		textPane_5_10.setForeground(Color.BLACK);
		textPane_5_10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_10.setBounds(515, 114, 389, 24);
		panel_2.add(textPane_5_10);
		
		textPane_5_11 = new JTextPane();
		textPane_5_11.setEditable(false);
		textPane_5_11.setForeground(Color.BLACK);
		textPane_5_11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_11.setBounds(512, 163, 398, 24);
		panel_2.add(textPane_5_11);
		
		textPane_5_12 = new JTextPane();
		textPane_5_12.setEditable(false);
		textPane_5_12.setForeground(Color.BLACK);
		textPane_5_12.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_12.setBounds(512, 212, 392, 24);
		panel_2.add(textPane_5_12);
		
		textPane_5_13 = new JTextPane();
		textPane_5_13.setEditable(false);
		textPane_5_13.setForeground(Color.BLACK);
		textPane_5_13.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_13.setBounds(512, 263, 398, 24);
		panel_2.add(textPane_5_13);
		
		textPane_5_14 = new JTextPane();
		textPane_5_14.setEditable(false);
		textPane_5_14.setForeground(Color.BLACK);
		textPane_5_14.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_14.setBounds(515, 314, 395, 24);
		panel_2.add(textPane_5_14);
		
		textPane_5_15 = new JTextPane();
		textPane_5_15.setEditable(false);
		textPane_5_15.setForeground(Color.BLACK);
		textPane_5_15.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_15.setBounds(515, 365, 395, 24);
		panel_2.add(textPane_5_15);
		
		textPane_5_16 = new JTextPane();
		textPane_5_16.setEditable(false);
		textPane_5_16.setForeground(Color.BLACK);
		textPane_5_16.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_16.setBounds(512, 414, 398, 24);
		panel_2.add(textPane_5_16);
		
		textPane_5_17 = new JTextPane();
		textPane_5_17.setEditable(false);
		textPane_5_17.setForeground(Color.BLACK);
		textPane_5_17.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_17.setBounds(515, 467, 395, 24);
		panel_2.add(textPane_5_17);
		
		textPane_5_18 = new JTextPane();
		textPane_5_18.setEditable(false);
		textPane_5_18.setForeground(Color.BLACK);
		textPane_5_18.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 15));
		textPane_5_18.setBounds(512, 511, 398, 24);
		panel_2.add(textPane_5_18);
		
		lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setVisible(false);
		lblNewLabel_23.setIcon(new ImageIcon("Edaad.png"));
		lblNewLabel_23.setBounds(785, 11, 60, 60);
		panel_2.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon("españa.png"));
		lblNewLabel_24.setVisible(false);
		lblNewLabel_24.setBounds(744, 5, 167, 105);
		panel_2.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setVisible(false);
		lblNewLabel_25.setIcon(new ImageIcon("votar.png"));
		lblNewLabel_25.setBounds(60, 107, 125, 102);
		panel_2.add(lblNewLabel_25);
		
		textPane_1_1 = new JTextPane();
		textPane_1_1.setVisible(false);
		textPane_1_1.setForeground(Color.BLACK);
		textPane_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_1_1.setEditable(false);
		textPane_1_1.setBounds(195, 125, 338, 102);
		panel_2.add(textPane_1_1);
		
		lblNewLabel_3_6 = new JLabel("");
		lblNewLabel_3_6.setVisible(false);
		lblNewLabel_3_6.setBounds(543, 125, 125, 102);
		panel_2.add(lblNewLabel_3_6);
		
		textPane_4_4 = new JTextPane();
		textPane_4_4.setVisible(false);
		textPane_4_4.setForeground(Color.BLACK);
		textPane_4_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_4.setBounds(678, 125, 216, 102);
		panel_2.add(textPane_4_4);
		
		lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon("bandera.png"));
		lblNewLabel_26.setVisible(false);
		lblNewLabel_26.setBounds(744, 11, 151, 99);
		panel_2.add(lblNewLabel_26);
		
		lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setVisible(false);
		lblNewLabel_27.setBounds(439, 240, 400, 260);
		panel_2.add(lblNewLabel_27);
		
		textPane_6 = new JTextPane();
		textPane_6.setForeground(Color.BLACK);
		textPane_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		textPane_6.setVisible(false);
		textPane_6.setBounds(97, 255, 303, 216);
		panel_2.add(textPane_6);
		lblNewLabel_3_4_3.setVisible(false);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(940, 142, 416, 541);
		panel.add(panel_3);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "18-25", "26-40", "41-65", "+66"}));
		comboBox_1.setBounds(152, 11, 99, 37);
		comboBox_1.setVisible(false);
		panel_3.add(comboBox_1);
		
		txtpnElige = new JTextPane();
		txtpnElige.setEditable(false);
		txtpnElige.setForeground(Color.BLACK);
		txtpnElige.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		txtpnElige.setText("Elige:");
		txtpnElige.setBounds(63, 11, 79, 37);
		txtpnElige.setVisible(false);
		panel_3.add(txtpnElige);
		
		btnNewButton_2 = new JButton("Mostrar");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 23));
		btnNewButton_2.setBounds(293, 11, 113, 37);
		btnNewButton_2.setVisible(false);
		panel_3.add(btnNewButton_2);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Andalucia", "Aragon", "Asturias", "Baleares", "Canarias", "Cantabria", "C. La Mancha", "C. y Leon", "Catalu\u00F1a", "C. Valenciana", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", "Pais Vasco", "La Rioja", "Ceuta", "Melilla"}));
		comboBox_2.setBounds(148, 12, 135, 37);
		panel_3.add(comboBox_2);
		
		lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setVisible(false);
		lblNewLabel_3_5.setBounds(60, 411, 125, 102);
		panel_3.add(lblNewLabel_3_5);
		
		textPane_4_3_1 = new JTextPane();
		textPane_4_3_1.setEditable(false);
		textPane_4_3_1.setVisible(false);
		textPane_4_3_1.setForeground(Color.BLACK);
		textPane_4_3_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_3_1.setBounds(195, 411, 216, 102);
		panel_3.add(textPane_4_3_1);
		
		progressBar = new JProgressBar();
		progressBar.setVisible(false);
		progressBar.setForeground(Color.BLUE);
		progressBar.setBounds(75, 156, 242, 37);
		panel_3.add(progressBar);
		
		txtpnPp = new JTextPane();
		txtpnPp.setVisible(false);
		txtpnPp.setEditable(false);
		txtpnPp.setForeground(Color.BLACK);
		txtpnPp.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		txtpnPp.setText("  PP");
		txtpnPp.setBounds(9, 156, 55, 37);
		panel_3.add(txtpnPp);
		
		textPane_7 = new JTextPane();
		textPane_7.setForeground(Color.BLACK);
		textPane_7.setEditable(false);
		textPane_7.setVisible(false);
		textPane_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		textPane_7.setBounds(327, 160, 79, 33);
		panel_3.add(textPane_7);
		
		txtpnPsoe = new JTextPane();
		txtpnPsoe.setEditable(false);
		txtpnPsoe.setVisible(false);
		txtpnPsoe.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		txtpnPsoe.setForeground(Color.BLACK);
		txtpnPsoe.setText("PSOE");
		txtpnPsoe.setBounds(9, 219, 56, 33);
		panel_3.add(txtpnPsoe);
		
		textPane_8 = new JTextPane();
		textPane_8.setEditable(false);
		textPane_8.setForeground(Color.BLACK);
		textPane_8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		textPane_8.setVisible(false);
		textPane_8.setBounds(327, 216, 79, 36);
		panel_3.add(textPane_8);
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setForeground(Color.RED);
		progressBar_1.setVisible(false);
		progressBar_1.setBounds(75, 215, 242, 37);
		panel_3.add(progressBar_1);
		
		txtpnVox = new JTextPane();
		txtpnVox.setEditable(false);
		txtpnVox.setVisible(false);
		txtpnVox.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		txtpnVox.setForeground(Color.BLACK);
		txtpnVox.setText("VOX");
		txtpnVox.setBounds(10, 274, 56, 37);
		panel_3.add(txtpnVox);
		
		progressBar_2 = new JProgressBar();
		progressBar_2.setVisible(false);
		progressBar_2.setForeground(Color.GREEN);
		progressBar_2.setBounds(75, 274, 242, 37);
		panel_3.add(progressBar_2);
		
		textPane_9 = new JTextPane();
		textPane_9.setEditable(false);
		textPane_9.setForeground(Color.BLACK);
		textPane_9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		textPane_9.setVisible(false);
		textPane_9.setBounds(327, 274, 79, 37);
		panel_3.add(textPane_9);
		
		txtpnCs = new JTextPane();
		txtpnCs.setEditable(false);
		txtpnCs.setVisible(false);
		txtpnCs.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		txtpnCs.setForeground(Color.BLACK);
		txtpnCs.setText("  CS");
		txtpnCs.setBounds(10, 330, 56, 37);
		panel_3.add(txtpnCs);
		
		progressBar_3 = new JProgressBar();
		progressBar_3.setForeground(Color.ORANGE);
		progressBar_3.setVisible(false);
		progressBar_3.setBounds(75, 330, 242, 37);
		panel_3.add(progressBar_3);
		
		textPane_10 = new JTextPane();
		textPane_10.setEditable(false);
		textPane_10.setVisible(false);
		textPane_10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		textPane_10.setForeground(Color.BLACK);
		textPane_10.setBounds(327, 330, 79, 37);
		panel_3.add(textPane_10);
		
		textPane_11 = new JTextPane();
		textPane_11.setEditable(false);
		textPane_11.setVisible(false);
		textPane_11.setForeground(Color.BLACK);
		textPane_11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
		textPane_11.setBounds(73, 81, 244, 52);
		panel_3.add(textPane_11);
		comboBox_2.setVisible(false);
		
		panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 1346, 120);
		panel.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setForeground(Color.BLACK);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_4.setBackground(Color.WHITE);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1137, 10, 144, 99);
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("src/imagen2.jpg"));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(92, 10, 144, 99);
		panel_4.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("src/imagen1.png"));
		
		JTextPane txtpnVotaciones = new JTextPane();
		txtpnVotaciones.setText("VOTACIONES GENERALES 2023");
		txtpnVotaciones.setForeground(Color.BLACK);
		txtpnVotaciones.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 70));
		txtpnVotaciones.setEditable(false);
		txtpnVotaciones.setBounds(232, 10, 864, 98);
		panel_4.add(txtpnVotaciones);
		
    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y - 18);
    }
}