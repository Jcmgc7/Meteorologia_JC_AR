package vista;

import java.awt.EventQueue;
import controlador.Controlador;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;

public class Vista extends JFrame {
	
	public JPanel contentPane;
	public JButton santiago;
	public JButton oviedo;
	public JButton santander;
	public JButton pais_vasco;
	public JButton pamplona;
	public JButton logrono;
	public JButton huesca;
	public JButton zaragoza;
	public JButton tarragona;
	public JButton barcelona;
	public JButton gerona;
	public JButton leon;
	public JButton burgos;
	public JButton valladolid;
	public JButton salamanca;
	public JButton toledo;
	public JButton ciudad_real;
	public JButton albacete;
	public JButton madrid;
	public JButton valencia;
	public JButton alacant;
	public JButton cartago;
	public JButton merida;
	public JButton caceres;
	public JButton cordoba;
	public JButton sevilla;
	public JButton cadiz;
	public JButton palma_canaria;
	public JButton santa_cruz;
	public JButton palma;
	public JButton ceuta;
	public JButton melilla;
	public JLabel nombre;
	public JLabel tiempo_E;
	public JLabel temperatura_Max;
	public JLabel temperatura_Min;
	public JComboBox listaDias;
	public JComboBox listaComunidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					Controlador controlador = new Controlador(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 cartago = new JButton("New button");
		cartago.setBounds(354, 353, 36, 31);
		contentPane.add(cartago);
		
		 cordoba = new JButton("New button");
		cordoba.setBounds(195, 348, 36, 31);
		contentPane.add(cordoba);
		
		 ceuta = new JButton("New button");
		ceuta.setBounds(143, 481, 36, 31);
		contentPane.add(ceuta);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Nombre Ciudad:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(557, 562, 140, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Temperatura Max :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(190, 562, 127, 24);
		contentPane.add(lblNewLabel_1_1);
		
		 temperatura_Min = new JLabel("Not Found");
		temperatura_Min.setForeground(Color.LIGHT_GRAY);
		temperatura_Min.setBounds(387, 596, 67, 26);
		contentPane.add(temperatura_Min);
		
		 temperatura_Max = new JLabel("Not Found");
		temperatura_Max.setForeground(Color.LIGHT_GRAY);
		temperatura_Max.setBounds(217, 596, 67, 26);
		contentPane.add(temperatura_Max);
		
		JLabel lblNewLabel_1_2 = new JLabel("Temperatura Min :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(377, 562, 121, 24);
		contentPane.add(lblNewLabel_1_2);
		
		 nombre = new JLabel("Not Found");
		nombre.setForeground(Color.LIGHT_GRAY);
		nombre.setBounds(567, 596, 74, 26);
		contentPane.add(nombre);
		
		listaDias = new JComboBox();
		listaDias.setBounds(722, 348, 116, 31);
		contentPane.add(listaDias);
		
		JLabel Etiqueta_Tiempo = new JLabel("Tiempo :");
		Etiqueta_Tiempo.setFont(new Font("Tahoma", Font.BOLD, 12));
		Etiqueta_Tiempo.setBounds(34, 562, 60, 24);
		contentPane.add(Etiqueta_Tiempo);
		
		 tiempo_E = new JLabel("Not Found");
		tiempo_E.setForeground(Color.LIGHT_GRAY);
		tiempo_E.setBounds(34, 596, 119, 26);
		contentPane.add(tiempo_E);
		
		 santa_cruz = new JButton("New button");
		santa_cruz.setBounds(427, 455, 36, 31);
		contentPane.add(santa_cruz);
		
		 palma = new JButton("New button");
		palma.setBounds(519, 260, 36, 31);
		contentPane.add(palma);
		
		 merida = new JButton("New button");
		merida.setBounds(117, 304, 36, 31);
		contentPane.add(merida);
		
		 palma_canaria = new JButton("New button");
		palma_canaria.setBounds(480, 486, 36, 31);
		contentPane.add(palma_canaria);
		
		 alacant = new JButton("New button");
		alacant.setBounds(411, 326, 36, 31);
		contentPane.add(alacant);
		
		 caceres = new JButton("New button");
		caceres.setBounds(132, 242, 36, 31);
		contentPane.add(caceres);
		
		 melilla = new JButton("New button");
		melilla.setBounds(292, 501, 36, 31);
		contentPane.add(melilla);
		
		 madrid = new JButton("New button");
		madrid.setBounds(248, 201, 36, 31);
		contentPane.add(madrid);
		
		 huesca = new JButton("New button");
		huesca.setBounds(411, 92, 36, 31);
		contentPane.add(huesca);
		
		 salamanca = new JButton("New button");
		salamanca.setBounds(132, 169, 36, 31);
		contentPane.add(salamanca);
		
		 burgos = new JButton("New button");
		burgos.setBounds(248, 85, 36, 31);
		contentPane.add(burgos);
		
		 gerona = new JButton("New button");
		gerona.setBounds(540, 80, 36, 31);
		contentPane.add(gerona);
		
		 valladolid = new JButton("New button");
		valladolid.setBounds(195, 128, 36, 31);
		contentPane.add(valladolid);
		
		 leon = new JButton("New button");
		leon.setBounds(143, 64, 36, 31);
		contentPane.add(leon);
		
		 logrono = new JButton("New button");
		logrono.setBounds(292, 92, 36, 31);
		contentPane.add(logrono);
		
		 pamplona = new JButton("New button");
		pamplona.setBounds(338, 56, 36, 31);
		contentPane.add(pamplona);
		
		 cadiz = new JButton("New button");
		cadiz.setBounds(132, 440, 36, 31);
		contentPane.add(cadiz);
		
		 oviedo = new JButton("New button");
		oviedo.setBounds(143, 23, 36, 31);
		contentPane.add(oviedo);
		
		santiago = new JButton("New button");
		santiago.setBounds(21, 39, 36, 31);
		contentPane.add(santiago);
		
		 valencia = new JButton("New button");
		valencia.setBounds(391, 260, 36, 31);
		contentPane.add(valencia);
		
		 santander = new JButton("New button");
		santander.setBounds(235, 23, 36, 31);
		contentPane.add(santander);
		
		 zaragoza = new JButton("New button");
		zaragoza.setBounds(365, 128, 36, 31);
		contentPane.add(zaragoza);
		
		 pais_vasco = new JButton("New button");
		pais_vasco.setBounds(292, 39, 36, 31);
		contentPane.add(pais_vasco);
		
		 sevilla = new JButton("New button");
		sevilla.setBounds(143, 382, 36, 31);
		contentPane.add(sevilla);
		
		 ciudad_real = new JButton("New button");
		ciudad_real.setBounds(235, 294, 36, 31);
		contentPane.add(ciudad_real);
		
		 albacete = new JButton("New button");
		albacete.setBounds(324, 299, 36, 31);
		contentPane.add(albacete);
		
		 tarragona = new JButton("New button");
		tarragona.setBounds(457, 148, 36, 31);
		contentPane.add(tarragona);
		
		 toledo = new JButton("New button");
		toledo.setBounds(235, 242, 36, 31);
		contentPane.add(toledo);
		
		 barcelona = new JButton("New button");
		barcelona.setIcon(new ImageIcon("src/img/sol.png"));
		barcelona.setBounds(506, 112, 36, 31);
		contentPane.add(barcelona);
		
		 listaComunidad = new JComboBox();
		listaComunidad.setBounds(722, 224, 116, 31);
		contentPane.add(listaComunidad);
		
		JLabel mapE = new JLabel("");
		mapE.setIcon(new ImageIcon("src/img/mapeja.png"));
		mapE.setBounds(1, 1, 592, 539);
		contentPane.add(mapE);
	}
}
