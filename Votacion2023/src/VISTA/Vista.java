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
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Vista extends JFrame {

	public JPanel contentPane;
	public JPanel panel_2;
	public JTextPane textPane;
	public JTextPane textPane_1;
	public JTextPane textPane_2;
	public JTextPane textPane_3;
	public JPanel panel_3;
	public JPanel panel_4;
	public JComboBox comboBox;
	public Panel panel;
	public JTextPane txtpnResultadoVotacionesPor;
	public JButton btnNewButton;
	public JTextPane textPane_4;
    public JLabel lblNewLabel;
    public JLabel lblNewLabel_1;
    public JButton btnNewButton_1;
    public JLabel lblNewLabel_2;


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
		textPane.setBounds(92, 59, 376, 65);
		panel_2.add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(83, 132, 376, 65);
		panel_2.add(textPane_1);
		
		textPane_2 = new JTextPane();
		textPane_2.setBounds(83, 187, 376, 65);
		panel_2.add(textPane_2);
		
		textPane_3 = new JTextPane();
		textPane_3.setBounds(92, 254, 376, 65);
		panel_2.add(textPane_3);
		
		textPane_4 = new JTextPane();
		textPane_4.setBounds(73, 297, 376, 65);
		panel_2.add(textPane_4);
		
		txtpnResultadoVotacionesPor = new JTextPane();
		txtpnResultadoVotacionesPor.setBounds(10, 11, 277, 37);
		panel_2.add(txtpnResultadoVotacionesPor);
		txtpnResultadoVotacionesPor.setText("Resultado Votaciones Por:");
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
		
		btnNewButton_1 = new JButton("Iniciar Votaci\u00F3n");
		btnNewButton_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 22));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(724, 11, 186, 37);
		panel_2.add(btnNewButton_1);
		
		btnNewButton.setVisible(false);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(940, 142, 416, 541);
		panel.add(panel_3);
		
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