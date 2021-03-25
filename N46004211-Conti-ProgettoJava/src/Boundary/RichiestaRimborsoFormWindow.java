package Boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class RichiestaRimborsoFormWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCodice;
	private JTextField textID;
	private JPasswordField passwordField;
	private JLabel lblStringa;
	private JLabel lblProgrammaCashBack;
	private JLabel lblPassword;
	private JLabel lblID;
	private JPanel panelSfumato;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RichiestaRimborsoFormWindow frame = new RichiestaRimborsoFormWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public RichiestaRimborsoFormWindow() {
		setTitle("Programma CashBack - Richiesta Rimborso");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RichiestaRimborsoFormWindow.class.getResource("/Boundary/io.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton RichiediRimborsoButton = new JButton("Richiedi rimborso");
		RichiediRimborsoButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		RichiediRimborsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gestore, chiama una funzione del controller
				int codice;
				if(textCodice.getText().equals("") || textID.getText().equals("") || String.valueOf(passwordField.getPassword()).equals("")) {
					lblStringa.setVisible(true);
					lblStringa.setText("Non puoi lasciare i campi vuoti!");
				}
				else {
				codice = Integer.parseInt(textCodice.getText());
				String id = textID.getText();
				String password = String.valueOf(passwordField.getPassword());
				String stringa=Control.RichiestaRimborsoController.RichiestaRimborsoHandler(codice, id, password);
				lblStringa.setVisible(true);
				lblStringa.setText(stringa);
				}
			}
		});
		RichiediRimborsoButton.setBounds(134, 157, 146, 30);
		contentPane.add(RichiediRimborsoButton);
		
		lblID = new JLabel("User ID");
		lblID.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblID.setBounds(92, 67, 62, 30);
		contentPane.add(lblID);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblPassword.setBounds(277, 67, 70, 30);
		contentPane.add(lblPassword);
		
		textID = new JTextField();
		textID.setBounds(61, 97, 116, 20);
		contentPane.add(textID);
		textID.setColumns(15);
		
		lblStringa = new JLabel("");
		lblStringa.setHorizontalAlignment(SwingConstants.LEFT);
		lblStringa.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblStringa.setForeground(Color.WHITE);
		lblStringa.setBounds(10, 207, 414, 30);
		lblStringa.setVisible(false);
		contentPane.add(lblStringa);
		
		textCodice = new JTextField();
		textCodice.setBounds(257, 30, 70, 20);
		contentPane.add(textCodice);
		textCodice.setColumns(6);
		
		lblProgrammaCashBack = new JLabel("Codice del programma CashBack");
		lblProgrammaCashBack.setBounds(33, 27, 201, 26);
		contentPane.add(lblProgrammaCashBack);
		lblProgrammaCashBack.setFont(new Font("Dubai", Font.PLAIN, 15));
		
		JCheckBox chckbxPassword = new JCheckBox("Mostra password");
		chckbxPassword.setOpaque(false);
		chckbxPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPassword.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxPassword.setBounds(257, 120, 121, 20);
		contentPane.add(chckbxPassword);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setEchoChar('*');
		passwordField.setBounds(257, 97, 107, 20);
		contentPane.add(passwordField);
		
		panelSfumato = new JPanel() {

			private static final long serialVersionUID = 1L;
			@Override
			protected void paintComponent(Graphics g) {
	            if (g instanceof Graphics2D) {   
	               int w = getWidth();
	               int h = getHeight();
	               Paint p = new GradientPaint(w/2, h, Color.BLUE, w/2, 0, Color.WHITE, true);
	               Graphics2D g2d = (Graphics2D)g;
	               g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	               g2d.setPaint(p);
	               g2d.fillRect(0, 0, w, h);
	            } else {
	               super.paintComponent(g);
	            }
	         }
	      };
		panelSfumato.setBounds(0, 0, 434, 261);
		contentPane.add(panelSfumato);
	}
}
