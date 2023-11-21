package vista;

import java.awt.EventQueue;
import controlador.Controlador;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextField;


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
import java.time.LocalDate;
import java.awt.Color;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.UIManager;

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
	public JButton inicio;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

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
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cartago = new JButton("");
		cartago.setBounds(354, 353, 36, 31);
		contentPane.add(cartago);
		cartago.setMargin(new Insets(0, 0, 0, 0)); 
		cartago.setContentAreaFilled(false); 
		cartago.setBorderPainted(false); 
		cartago.setFocusPainted(false);
		
		 cordoba = new JButton("");
		cordoba.setBounds(195, 348, 36, 31);
		contentPane.add(cordoba);
		cordoba.setMargin(new Insets(0, 0, 0, 0)); 
		cordoba.setContentAreaFilled(false); 
		cordoba.setBorderPainted(false); 
		cordoba.setFocusPainted(false);
		
		 ceuta = new JButton("");
		ceuta.setBounds(143, 481, 36, 31);
		contentPane.add(ceuta);
		ceuta.setMargin(new Insets(0, 0, 0, 0)); 
		ceuta.setContentAreaFilled(false); 
		ceuta.setBorderPainted(false); 
		ceuta.setFocusPainted(false);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Nombre Ciudad:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(557, 562, 140, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Temperatura Max :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(190, 562, 127, 24);
		contentPane.add(lblNewLabel_1_1);
		
		 temperatura_Min = new JLabel("Not Found");
		temperatura_Min.setForeground(new Color(30, 144, 255));
		temperatura_Min.setBounds(387, 596, 67, 26);
		contentPane.add(temperatura_Min);
		
		 temperatura_Max = new JLabel("Not Found");
		 temperatura_Max.setBackground(Color.LIGHT_GRAY);
		temperatura_Max.setForeground(new Color(255, 0, 0));
		temperatura_Max.setBounds(217, 596, 67, 26);
		contentPane.add(temperatura_Max);
		
		JLabel lblNewLabel_1_2 = new JLabel("Temperatura Min :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(377, 562, 121, 24);
		contentPane.add(lblNewLabel_1_2);
		
		 nombre = new JLabel("Not Found");
		nombre.setForeground(new Color(0, 0, 0));
		nombre.setBounds(567, 596, 147, 26);
		contentPane.add(nombre);
		
		
		
		JLabel Etiqueta_Tiempo = new JLabel("Tiempo :");
		Etiqueta_Tiempo.setFont(new Font("Tahoma", Font.BOLD, 12));
		Etiqueta_Tiempo.setBounds(34, 562, 60, 24);
		contentPane.add(Etiqueta_Tiempo);
		
		 tiempo_E = new JLabel("Not Found");
		tiempo_E.setForeground(new Color(255, 255, 255));
		tiempo_E.setBounds(34, 596, 145, 26);
		contentPane.add(tiempo_E);
		
		santa_cruz = new JButton("");
		santa_cruz.setBounds(427, 455, 36, 31);
		contentPane.add(santa_cruz);
		santa_cruz.setMargin(new Insets(0, 0, 0, 0)); 
		santa_cruz.setContentAreaFilled(false); 
		santa_cruz.setBorderPainted(false); 
		santa_cruz.setFocusPainted(false);
		
		 palma = new JButton("");
		palma.setBounds(519, 260, 36, 31);
		contentPane.add(palma);
		palma.setMargin(new Insets(0, 0, 0, 0)); 
		palma.setContentAreaFilled(false); 
		palma.setBorderPainted(false); 
		palma.setFocusPainted(false);
		
		 merida = new JButton("");
		merida.setBounds(117, 304, 36, 31);
		contentPane.add(merida);
		merida.setMargin(new Insets(0, 0, 0, 0)); 
		merida.setContentAreaFilled(false); 
		merida.setBorderPainted(false); 
		merida.setFocusPainted(false);
		
		 palma_canaria = new JButton("");
		palma_canaria.setBounds(480, 486, 36, 31);
		contentPane.add(palma_canaria);
		palma_canaria.setMargin(new Insets(0, 0, 0, 0)); 
		palma_canaria.setContentAreaFilled(false); 
		palma_canaria.setBorderPainted(false); 
		palma_canaria.setFocusPainted(false);
		
		
		 alacant = new JButton("");
		alacant.setBounds(411, 326, 36, 31);
		contentPane.add(alacant);
		alacant.setMargin(new Insets(0, 0, 0, 0)); 
		alacant.setContentAreaFilled(false); 
		alacant.setBorderPainted(false); 
		alacant.setFocusPainted(false);
		
		 caceres = new JButton("");
		caceres.setBounds(132, 242, 36, 31);
		contentPane.add(caceres);
		caceres.setMargin(new Insets(0, 0, 0, 0)); 
		caceres.setContentAreaFilled(false); 
		caceres.setBorderPainted(false); 
		caceres.setFocusPainted(false);
		
		 melilla = new JButton("");
		melilla.setBounds(292, 501, 36, 31);
		contentPane.add(melilla);
		melilla.setMargin(new Insets(0, 0, 0, 0)); 
		melilla.setContentAreaFilled(false); 
		melilla.setBorderPainted(false); 
		melilla.setFocusPainted(false);
		
		 madrid = new JButton("");
		madrid.setBounds(248, 201, 36, 31);
		contentPane.add(madrid);
		madrid.setMargin(new Insets(0, 0, 0, 0)); 
		madrid.setContentAreaFilled(false); 
		madrid.setBorderPainted(false); 
		madrid.setFocusPainted(false);
		
		 huesca = new JButton("");
		huesca.setBounds(411, 92, 36, 31);
		contentPane.add(huesca);
		huesca.setMargin(new Insets(0, 0, 0, 0)); 
		huesca.setContentAreaFilled(false); 
		huesca.setBorderPainted(false); 
		huesca.setFocusPainted(false);
		
		 salamanca = new JButton("");
		salamanca.setBounds(132, 169, 36, 31);
		contentPane.add(salamanca);
		salamanca.setMargin(new Insets(0, 0, 0, 0)); 
		salamanca.setContentAreaFilled(false); 
		salamanca.setBorderPainted(false); 
		salamanca.setFocusPainted(false);
		
		 burgos = new JButton("");
		burgos.setBounds(248, 85, 36, 31);
		contentPane.add(burgos);
		burgos.setMargin(new Insets(0, 0, 0, 0)); 
		burgos.setContentAreaFilled(false); 
		burgos.setBorderPainted(false); 
		burgos.setFocusPainted(false);
		
		 gerona = new JButton("");
		gerona.setBounds(540, 80, 36, 31);
		contentPane.add(gerona);
		gerona.setMargin(new Insets(0, 0, 0, 0)); 
		gerona.setContentAreaFilled(false); 
		gerona.setBorderPainted(false); 
		gerona.setFocusPainted(false);
		
		 valladolid = new JButton("");
		valladolid.setBounds(195, 128, 36, 31);
		contentPane.add(valladolid);
		valladolid.setMargin(new Insets(0, 0, 0, 0)); 
		valladolid.setContentAreaFilled(false); 
		valladolid.setBorderPainted(false); 
		valladolid.setFocusPainted(false);
		
		 leon = new JButton("");
		leon.setBounds(143, 64, 36, 31);
		contentPane.add(leon);
		leon.setMargin(new Insets(0, 0, 0, 0)); 
		leon.setContentAreaFilled(false); 
		leon.setBorderPainted(false); 
		leon.setFocusPainted(false);
		
		
		 logrono = new JButton("");
		logrono.setBounds(292, 92, 36, 31);
		contentPane.add(logrono);
		logrono.setMargin(new Insets(0, 0, 0, 0)); 
		logrono.setContentAreaFilled(false); 
		logrono.setBorderPainted(false); 
		logrono.setFocusPainted(false);
		
		 pamplona = new JButton("");
		pamplona.setBounds(338, 56, 36, 31);
		contentPane.add(pamplona);
		pamplona.setMargin(new Insets(0, 0, 0, 0)); 
		pamplona.setContentAreaFilled(false); 
		pamplona.setBorderPainted(false); 
		pamplona.setFocusPainted(false);
		
		 cadiz = new JButton("");
		cadiz.setBounds(132, 440, 36, 31);
		contentPane.add(cadiz);
		cadiz.setMargin(new Insets(0, 0, 0, 0)); 
		cadiz.setContentAreaFilled(false); 
		cadiz.setBorderPainted(false); 
		cadiz.setFocusPainted(false);
		
		 oviedo = new JButton("");
		oviedo.setBounds(143, 23, 36, 31);
		contentPane.add(oviedo);
		oviedo.setMargin(new Insets(0, 0, 0, 0)); 
		oviedo.setContentAreaFilled(false); 
		oviedo.setBorderPainted(false); 
		oviedo.setFocusPainted(false);
		
		santiago = new JButton("");
		santiago.setBounds(21, 39, 36, 31);
		contentPane.add(santiago);
		santiago.setMargin(new Insets(0, 0, 0, 0)); 
		santiago.setContentAreaFilled(false); 
		santiago.setBorderPainted(false); 
		santiago.setFocusPainted(false);
		
		 valencia = new JButton("");
		valencia.setBounds(391, 260, 36, 31);
		contentPane.add(valencia);
		valencia.setMargin(new Insets(0, 0, 0, 0)); 
		valencia.setContentAreaFilled(false); 
		valencia.setBorderPainted(false); 
		valencia.setFocusPainted(false);
		
		 santander = new JButton("");
		santander.setBounds(235, 23, 36, 31);
		contentPane.add(santander);
		santander.setMargin(new Insets(0, 0, 0, 0)); 
		santander.setContentAreaFilled(false); 
		santander.setBorderPainted(false); 
		santander.setFocusPainted(false);
		
		 zaragoza = new JButton("");
		zaragoza.setBounds(365, 128, 36, 31);
		contentPane.add(zaragoza);
		zaragoza.setMargin(new Insets(0, 0, 0, 0)); 
		zaragoza.setContentAreaFilled(false); 
		zaragoza.setBorderPainted(false); 
		zaragoza.setFocusPainted(false);
		
		
		 pais_vasco = new JButton("");
		pais_vasco.setBounds(292, 39, 36, 31);
		contentPane.add(pais_vasco);
		pais_vasco.setMargin(new Insets(0, 0, 0, 0)); 
		pais_vasco.setContentAreaFilled(false); 
		pais_vasco.setBorderPainted(false); 
		pais_vasco.setFocusPainted(false);
		
		 sevilla = new JButton("");
		sevilla.setBounds(143, 382, 36, 31);
		contentPane.add(sevilla);
		sevilla.setMargin(new Insets(0, 0, 0, 0)); 
		sevilla.setContentAreaFilled(false); 
		sevilla.setBorderPainted(false); 
		sevilla.setFocusPainted(false);
	
		
		 ciudad_real = new JButton("");
		ciudad_real.setBounds(235, 294, 36, 31);
		contentPane.add(ciudad_real);
		ciudad_real.setMargin(new Insets(0, 0, 0, 0)); 
		ciudad_real.setContentAreaFilled(false); 
		ciudad_real.setBorderPainted(false); 
		ciudad_real.setFocusPainted(false);
	
		
		 albacete = new JButton("");
		albacete.setBounds(324, 299, 36, 31);
		contentPane.add(albacete);
		albacete.setMargin(new Insets(0, 0, 0, 0)); 
		albacete.setContentAreaFilled(false); 
		albacete.setBorderPainted(false); 
		albacete.setFocusPainted(false);
	
		
		 tarragona = new JButton("");
		tarragona.setBounds(457, 148, 36, 31);
		contentPane.add(tarragona);
		tarragona.setMargin(new Insets(0, 0, 0, 0)); 
		tarragona.setContentAreaFilled(false); 
		tarragona.setBorderPainted(false); 
		tarragona.setFocusPainted(false);
		
		
		
		 toledo = new JButton("");
		toledo.setBounds(235, 242, 36, 31);
		contentPane.add(toledo);
		toledo.setMargin(new Insets(0, 0, 0, 0)); 
		toledo.setContentAreaFilled(false); 
		toledo.setBorderPainted(false); 
		toledo.setFocusPainted(false);
		
		barcelona = new JButton("");
		barcelona.setBounds(506, 112, 36, 31);
		contentPane.add(barcelona);
		barcelona.setMargin(new Insets(0, 0, 0, 0)); 
		barcelona.setContentAreaFilled(false); 
		barcelona.setBorderPainted(false); 
		barcelona.setFocusPainted(false);
		
		listaComunidad = new JComboBox();
		listaComunidad.setBounds(722, 294, 116, 31);
		contentPane.add(listaComunidad);
		
		JLabel mapE = new JLabel("");
		mapE.setIcon(new ImageIcon("src/img/mapeja.png"));
		mapE.setBounds(1, 1, 592, 539);
		contentPane.add(mapE);
		
		inicio = new JButton("Inicio");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 reproducirSonido("src/sound/marmota.aiff");
			}
		});
		inicio.setIcon(new ImageIcon(Vista.class.getResource("/img/marmoteision.jpg")));
		inicio.setBounds(688, 23, 190, 200);
		contentPane.add(inicio);
		
		listaDias = new JComboBox();
		LocalDate fecha = LocalDate.now();
		listaDias.setModel(new DefaultComboBoxModel(new LocalDate[] {fecha, diaSemana(fecha,1), diaSemana(fecha,2), diaSemana(fecha,3), diaSemana(fecha,4)}));
		listaDias.setBounds(722, 382, 116, 31);
		contentPane.add(listaDias);
		
		JLabel lblNewLabel = new JLabel("Comunidad:");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(744, 278, 67, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha:");
		lblNewLabel_1.setBounds(744, 364, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Vista.class.getResource("/img/verde.jpg")));
		lblNewLabel_3.setBounds(12, 550, 702, 89);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Vista.class.getResource("/img/verde.jpg")));
		lblNewLabel_4.setBounds(688, 260, 190, 194);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Vista.class.getResource("/img/plato.jpg")));
		lblNewLabel_2.setBackground(new Color(192, 192, 192));
		lblNewLabel_2.setForeground(new Color(107, 157, 40));
		lblNewLabel_2.setBounds(1, -23, 898, 708);
		contentPane.add(lblNewLabel_2);
	}
	public static LocalDate diaSemana(LocalDate fecha, int dias) {
        return fecha.plusDays(dias);
    }
	public void reproducirSonido(String path) {
        try {
            File soundFile = new File("src/sound/marmota.aiff");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(soundFile));
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
