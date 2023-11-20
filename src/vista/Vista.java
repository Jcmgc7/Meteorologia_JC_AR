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
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Vista extends JFrame {
	 
	private Controlador controlador;
	private JComboBox<String> ciudades;
	
	
	
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
	public JButton inicio;

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
		
		 cartago = new JButton("");
		cartago.setBounds(354, 353, 36, 31);
		contentPane.add(cartago);
		
		 cordoba = new JButton("");
		cordoba.setBounds(195, 348, 36, 31);
		contentPane.add(cordoba);
		
		 ceuta = new JButton("");
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
		nombre.setBounds(567, 596, 147, 26);
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
		
		 santa_cruz = new JButton("");
		santa_cruz.setBounds(427, 455, 36, 31);
		contentPane.add(santa_cruz);
		
		 palma = new JButton("");
		palma.setBounds(519, 260, 36, 31);
		contentPane.add(palma);
		
		 merida = new JButton("");
		merida.setBounds(117, 304, 36, 31);
		contentPane.add(merida);
		
		 palma_canaria = new JButton("");
		palma_canaria.setBounds(480, 486, 36, 31);
		contentPane.add(palma_canaria);
		
		 alacant = new JButton("");
		alacant.setBounds(411, 326, 36, 31);
		contentPane.add(alacant);
		
		 caceres = new JButton("");
		caceres.setBounds(132, 242, 36, 31);
		contentPane.add(caceres);
		
		 melilla = new JButton("");
		melilla.setBounds(292, 501, 36, 31);
		contentPane.add(melilla);
		
		 madrid = new JButton("");
		madrid.setBounds(248, 201, 36, 31);
		contentPane.add(madrid);
		
		 huesca = new JButton("");
		huesca.setBounds(411, 92, 36, 31);
		contentPane.add(huesca);
		
		 salamanca = new JButton("");
		salamanca.setBounds(132, 169, 36, 31);
		contentPane.add(salamanca);
		
		 burgos = new JButton("");
		burgos.setBounds(248, 85, 36, 31);
		contentPane.add(burgos);
		
		 gerona = new JButton("");
		gerona.setBounds(540, 80, 36, 31);
		contentPane.add(gerona);
		
		 valladolid = new JButton("");
		valladolid.setBounds(195, 128, 36, 31);
		contentPane.add(valladolid);
		
		 leon = new JButton("");
		leon.setBounds(143, 64, 36, 31);
		contentPane.add(leon);
		
		 logrono = new JButton("");
		logrono.setBounds(292, 92, 36, 31);
		contentPane.add(logrono);
		
		 pamplona = new JButton("");
		pamplona.setBounds(338, 56, 36, 31);
		contentPane.add(pamplona);
		
		 cadiz = new JButton("");
		cadiz.setBounds(132, 440, 36, 31);
		contentPane.add(cadiz);
		
		 oviedo = new JButton("");
		oviedo.setBounds(143, 23, 36, 31);
		contentPane.add(oviedo);
		
		santiago = new JButton("");
		santiago.setBounds(21, 39, 36, 31);
		contentPane.add(santiago);
		
		 valencia = new JButton("");
		valencia.setBounds(391, 260, 36, 31);
		contentPane.add(valencia);
		
		 santander = new JButton("");
		santander.setBounds(235, 23, 36, 31);
		contentPane.add(santander);
		
		 zaragoza = new JButton("");
		zaragoza.setBounds(365, 128, 36, 31);
		contentPane.add(zaragoza);
		
		 pais_vasco = new JButton("");
		pais_vasco.setBounds(292, 39, 36, 31);
		contentPane.add(pais_vasco);
		
		 sevilla = new JButton("");
		sevilla.setBounds(143, 382, 36, 31);
		contentPane.add(sevilla);
		
		 ciudad_real = new JButton("");
		ciudad_real.setBounds(235, 294, 36, 31);
		contentPane.add(ciudad_real);
		
		 albacete = new JButton("");
		albacete.setBounds(324, 299, 36, 31);
		contentPane.add(albacete);
		
		 tarragona = new JButton("");
		tarragona.setBounds(457, 148, 36, 31);
		contentPane.add(tarragona);
		
		 toledo = new JButton("");
		toledo.setBounds(235, 242, 36, 31);
		contentPane.add(toledo);
		
		barcelona = new JButton("");
		barcelona.setBounds(506, 112, 36, 31);
		contentPane.add(barcelona);
		
		listaComunidad = new JComboBox();
		listaComunidad.setBounds(722, 224, 116, 31);
		contentPane.add(listaComunidad);
		
		JLabel mapE = new JLabel("");
		mapE.setIcon(new ImageIcon("src/img/mapeja.png"));
		mapE.setBounds(1, 1, 592, 539);
		contentPane.add(mapE);
		
		inicio = new JButton("Inicio");
		inicio.setBounds(722, 128, 85, 21);
		contentPane.add(inicio);
	
	ciudades.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			 String ciudadSeleccionada = (String) ciudades.getSelectedItem();
			 
		}
		
	});

	}
}
