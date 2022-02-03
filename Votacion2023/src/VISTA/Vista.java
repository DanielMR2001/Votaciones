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
		textPane_4.setForeground(Color.BLACK);
		textPane_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4.setBounds(694, 72, 216, 102);
		panel_2.add(textPane_4);
		
		textPane_4_1 = new JTextPane();
		textPane_4_1.setForeground(Color.BLACK);
		textPane_4_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_1.setBounds(694, 185, 216, 102);
		panel_2.add(textPane_4_1);
		
		textPane_4_2 = new JTextPane();
		textPane_4_2.setForeground(Color.BLACK);
		textPane_4_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_2.setBounds(694, 298, 216, 102);
		panel_2.add(textPane_4_2);
		
		textPane_4_3 = new JTextPane();
		textPane_4_3.setForeground(Color.BLACK);
		textPane_4_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 17));
		textPane_4_3.setBounds(694, 411, 216, 102);
		panel_2.add(textPane_4_3);
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
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Andalucia", "Aragon", "Asturias", "Baleares", "Canarias", "Cantabria", "C. La Mancha", "C. a y Leon", "Catalu\u00F1a", "C. Valenciana", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", "Pais Vasco", "La Rioja", "Ceuta", "Melilla"}));
		comboBox_2.setBounds(148, 12, 135, 37);
		panel_3.add(comboBox_2);
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