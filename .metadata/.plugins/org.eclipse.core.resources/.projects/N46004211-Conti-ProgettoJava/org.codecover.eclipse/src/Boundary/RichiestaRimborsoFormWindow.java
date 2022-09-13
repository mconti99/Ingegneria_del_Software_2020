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
  static {
    CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.ping();
  }


	static { CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[1]++; }
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
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[2]++;
EventQueue.invokeLater(new Runnable() {
			public void run() {
boolean CodeCoverTryBranchHelper_Try1 = false;
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[3]++;
try {
CodeCoverTryBranchHelper_Try1 = true;
					CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[4]++;
RichiestaRimborsoFormWindow frame = new RichiestaRimborsoFormWindow();
					CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[5]++;
frame.setVisible(true);
				} catch (Exception e) {
CodeCoverTryBranchHelper_Try1 = false;
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[2]++;
					CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[6]++;
e.printStackTrace();
				} finally {
    if ( CodeCoverTryBranchHelper_Try1 ) {
  CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[1]++;
}
  }
			}
		});
	}


	public RichiestaRimborsoFormWindow() {
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[7]++;
setTitle("Programma CashBack - Richiesta Rimborso");
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[8]++;
setIconImage(Toolkit.getDefaultToolkit().getImage(RichiestaRimborsoFormWindow.class.getResource("/Boundary/io.png")));
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[9]++;
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[10]++;
setBounds(100, 100, 450, 300);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[11]++;
contentPane = new JPanel();
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[12]++;
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[13]++;
setContentPane(contentPane);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[14]++;
contentPane.setLayout(null);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[15]++;
JButton RichiediRimborsoButton = new JButton("Richiedi rimborso");
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[16]++;
RichiediRimborsoButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[17]++;
RichiediRimborsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gestore, chiama una funzione del controller
				int codice;
int CodeCoverConditionCoverageHelper_C1;
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[18]++;
if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (32)) == 0 || true) &&
 ((textCodice.getText().equals("")) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (16)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C1 |= (8)) == 0 || true) &&
 ((textID.getText().equals("")) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((String.valueOf(passwordField.getPassword()).equals("")) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 3) || true)) || (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 3) && false)) {
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[3]++;
					CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[19]++;
lblStringa.setVisible(true);
					CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[20]++;
lblStringa.setText("Non puoi lasciare i campi vuoti!");

				}
				else {
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[4]++;
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[21]++;
codice = Integer.parseInt(textCodice.getText());
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[22]++;
String id = textID.getText();
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[23]++;
String password = String.valueOf(passwordField.getPassword());
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[24]++;
String stringa=Control.RichiestaRimborsoController.RichiestaRimborsoHandler(codice, id, password);
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[25]++;
lblStringa.setVisible(true);
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[26]++;
lblStringa.setText(stringa);
				}
			}
		});
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[27]++;
RichiediRimborsoButton.setBounds(134, 157, 146, 30);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[28]++;
contentPane.add(RichiediRimborsoButton);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[29]++;
lblID = new JLabel("User ID");
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[30]++;
lblID.setFont(new Font("Dubai", Font.PLAIN, 18));
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[31]++;
lblID.setBounds(92, 67, 62, 30);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[32]++;
contentPane.add(lblID);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[33]++;
lblPassword = new JLabel("Password");
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[34]++;
lblPassword.setFont(new Font("Dubai", Font.PLAIN, 18));
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[35]++;
lblPassword.setBounds(277, 67, 70, 30);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[36]++;
contentPane.add(lblPassword);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[37]++;
textID = new JTextField();
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[38]++;
textID.setBounds(61, 97, 116, 20);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[39]++;
contentPane.add(textID);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[40]++;
textID.setColumns(15);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[41]++;
lblStringa = new JLabel("");
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[42]++;
lblStringa.setHorizontalAlignment(SwingConstants.LEFT);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[43]++;
lblStringa.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[44]++;
lblStringa.setForeground(Color.WHITE);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[45]++;
lblStringa.setBounds(10, 207, 414, 30);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[46]++;
lblStringa.setVisible(false);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[47]++;
contentPane.add(lblStringa);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[48]++;
textCodice = new JTextField();
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[49]++;
textCodice.setBounds(257, 30, 70, 20);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[50]++;
contentPane.add(textCodice);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[51]++;
textCodice.setColumns(6);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[52]++;
lblProgrammaCashBack = new JLabel("Codice del programma CashBack");
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[53]++;
lblProgrammaCashBack.setBounds(33, 27, 201, 26);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[54]++;
contentPane.add(lblProgrammaCashBack);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[55]++;
lblProgrammaCashBack.setFont(new Font("Dubai", Font.PLAIN, 15));
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[56]++;
JCheckBox chckbxPassword = new JCheckBox("Mostra password");
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[57]++;
chckbxPassword.setOpaque(false);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[58]++;
chckbxPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[59]++;
chckbxPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
int CodeCoverConditionCoverageHelper_C2;
				CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[60]++;
if((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((chckbxPassword.isSelected()) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) || true)) || (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 1) && false)) {
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[5]++;
					CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[61]++;
passwordField.setEchoChar((char)0);

				}
				else {
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[6]++;
					CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[62]++;
passwordField.setEchoChar('*');
				}
			}
		});
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[63]++;
chckbxPassword.setBounds(257, 120, 121, 20);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[64]++;
contentPane.add(chckbxPassword);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[65]++;
passwordField = new JPasswordField();
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[66]++;
passwordField.setColumns(10);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[67]++;
passwordField.setEchoChar('*');
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[68]++;
passwordField.setBounds(257, 97, 107, 20);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[69]++;
contentPane.add(passwordField);
		
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[70]++;
panelSfumato = new JPanel() {

			private static final long serialVersionUID = 1L;
			@Override
			protected void paintComponent(Graphics g) {
int CodeCoverConditionCoverageHelper_C3;
	            CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[71]++;
if ((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((g instanceof Graphics2D) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) || true)) || (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) && false)) {
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[7]++;   
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[72]++;
int w = getWidth();
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[73]++;
int h = getHeight();
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[74]++;
Paint p = new GradientPaint(w/2, h, Color.BLUE, w/2, 0, Color.WHITE, true);
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[75]++;
Graphics2D g2d = (Graphics2D)g;
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[76]++;
g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[77]++;
g2d.setPaint(p);
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[78]++;
g2d.fillRect(0, 0, w, h);

	            } else {
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.branches[8]++;
	               CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[79]++;
super.paintComponent(g);
	            }
	         }
	      };
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[80]++;
panelSfumato.setBounds(0, 0, 434, 261);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t.statements[81]++;
contentPane.add(panelSfumato);
	}
}

class CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("C:\\Users\\itama\\Desktop\\N46004211-Conti\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\N46004211-Conti-ProgettoJava\\org.codecover.eclipse\\coverage-logs\\coverage-log-file.clf"), "fc824915-6d01-49ba-9acd-37a5396028e5").addObservedContainer(new CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t ());
  }
    public static long[] statements = new long[82];
    public static long[] branches = new long[9];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[4];
  static {
    final String SECTION_NAME = "Boundary.RichiestaRimborsoFormWindow.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,3,1,1};
    for (int i = 1; i <= 3; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[1];
    public static java.util.concurrent.atomic.AtomicLong[] syncs = new java.util.concurrent.atomic.AtomicLong[3];
    static {
      for (int i = 0; i <= 2; i++) {
        syncs[i] = new java.util.concurrent.atomic.AtomicLong(0L);
      }
    }
    public static java.util.Hashtable[] syncWaits = new java.util.Hashtable[1];
    static {
      for (int i = 0; i <= 0; i++) {
        syncWaits[i] = new java.util.Hashtable();
      }
    }
    public static long[] qmo = new long[2];

  public CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb83k4tcsbjm3sswt24yf8uh5t () {
    super("Boundary.RichiestaRimborsoFormWindow.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 81; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 8; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 3; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
      for (int i = 0; i <= 2; i++) {
        syncs[i].set(0L);
      }
      for (int i = 0; i < 2; i++) {
        qmo[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("Boundary.RichiestaRimborsoFormWindow.java");
      for (int i = 1; i <= 81; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 8; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 3; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
      for (int i = 0; i <= 0; i++) {
        if (syncs[i * 3].get() != 0L) {
          log.passCounter("Y" + i + "-0", syncs[i * 3].get());
          syncs[i * 3].set(0L);
        }
        if (syncs[i * 3 + 1].get() != 0L) {
          log.passCounter("Y" + i + "-1", syncs[i * 3 + 1].get());
          syncs[i * 3 + 1].set(0L);
        }
        if (syncs[i * 3 + 2].get() != 0L) {
          log.passCounter("Y" + i + "-2", syncs[i * 3 + 2].get());
          syncs[i * 3 + 2].set(0L);
        }
      }
      for (int i = 0; i < 1; i++) {
        if (qmo[i * 2] != 0L) {
          log.passCounter("Q" + i + "-0", qmo[i * 2]);
          qmo[i * 2] = 0L;
        }
        if (qmo[i * 2 + 1] != 0L) {
          log.passCounter("Q" + i + "-1", qmo[i * 2 + 1]);
          qmo[i * 2 + 1] = 0L;
        }
      }
  }
}

