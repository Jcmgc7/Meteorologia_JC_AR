package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
		
		JButton btnNewButton_28 = new JButton("New button");
		btnNewButton_28.setBounds(143, 481, 36, 31);
		contentPane.add(btnNewButton_28);
		
		JButton btnNewButton_26 = new JButton("New button");
		btnNewButton_26.setBounds(427, 455, 36, 31);
		contentPane.add(btnNewButton_26);
		
		JButton btnNewButton_24 = new JButton("New button");
		btnNewButton_24.setBounds(411, 326, 36, 31);
		contentPane.add(btnNewButton_24);
		
		JButton btnNewButton_27 = new JButton("New button");
		btnNewButton_27.setBounds(480, 486, 36, 31);
		contentPane.add(btnNewButton_27);
		
		JButton btnNewButton_25 = new JButton("New button");
		btnNewButton_25.setBounds(519, 260, 36, 31);
		contentPane.add(btnNewButton_25);
		
		JButton btnNewButton_23 = new JButton("New button");
		btnNewButton_23.setBounds(117, 304, 36, 31);
		contentPane.add(btnNewButton_23);
		
		JButton btnNewButton_22 = new JButton("New button");
		btnNewButton_22.setBounds(132, 242, 36, 31);
		contentPane.add(btnNewButton_22);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(411, 92, 36, 31);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_29 = new JButton("New button");
		btnNewButton_29.setBounds(292, 501, 36, 31);
		contentPane.add(btnNewButton_29);
		
		JButton btnNewButton_21 = new JButton("New button");
		btnNewButton_21.setBounds(248, 201, 36, 31);
		contentPane.add(btnNewButton_21);
		
		JButton btnNewButton_20 = new JButton("New button");
		btnNewButton_20.setBounds(132, 169, 36, 31);
		contentPane.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton("New button");
		btnNewButton_19.setBounds(248, 85, 36, 31);
		contentPane.add(btnNewButton_19);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(540, 80, 36, 31);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(143, 64, 36, 31);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("New button");
		btnNewButton_18.setBounds(195, 128, 36, 31);
		contentPane.add(btnNewButton_18);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(338, 56, 36, 31);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(143, 23, 36, 31);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(292, 92, 36, 31);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(132, 440, 36, 31);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(21, 39, 36, 31);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(235, 23, 36, 31);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(292, 39, 36, 31);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(391, 260, 36, 31);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(365, 128, 36, 31);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(143, 382, 36, 31);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(324, 299, 36, 31);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(235, 242, 36, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(235, 294, 36, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(457, 148, 36, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Antonio\\git\\Meteorologia_JC_AR\\img\\sol.png"));
		btnNewButton.setBounds(506, 112, 36, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Antonio\\git\\Meteorologia_JC_AR\\img\\mapeja.png"));
		lblNewLabel.setBounds(1, 1, 592, 539);
		contentPane.add(lblNewLabel);
	}
}
