import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class ChronoTimer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChronoTimer frame = new ChronoTimer();
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
	public ChronoTimer() {
		setTitle("ChronoTimer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(5, 5, 615, 510);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Morgan\\git\\chronoGui\\ChronoGUI\\GUIwithBuilder\\XXGUI\\chrono.jpg"));
		contentPane.add(lblNewLabel);
		
		JButton btn1 = new JButton("1");
		btn1.setBorder(null);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBackground(new Color(128, 128, 128));
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		btn1.setBounds(446, 185, 31, 30);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		btn2.setBorder(null);
		btn2.setBackground(new Color(128, 128, 128));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(481, 185, 31, 30);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3.setBorder(null);
		btn3.setBackground(new Color(128, 128, 128));
		btn3.setBounds(514, 185, 31, 30);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4.setBorder(null);
		btn4.setBackground(Color.GRAY);
		btn4.setBounds(446, 217, 31, 30);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5.setBorder(null);
		btn5.setBackground(Color.GRAY);
		btn5.setBounds(481, 217, 31, 30);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn6.setBorder(null);
		btn6.setBackground(Color.GRAY);
		btn6.setBounds(514, 217, 31, 30);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn7.setBorder(null);
		btn7.setBackground(Color.GRAY);
		btn7.setBounds(446, 249, 31, 30);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn8.setBorder(null);
		btn8.setBackground(Color.GRAY);
		btn8.setBounds(481, 249, 31, 30);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn9.setBorder(null);
		btn9.setBackground(Color.GRAY);
		btn9.setBounds(514, 249, 31, 30);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("*");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn10.setBorder(null);
		btn10.setBackground(Color.GRAY);
		btn10.setBounds(446, 282, 31, 30);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("0");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn11.setBorder(null);
		btn11.setBackground(new Color(128, 128, 128));
		btn11.setBounds(481, 282, 31, 30);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("#");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn12.setBorder(null);
		btn12.setBackground(Color.GRAY);
		btn12.setBounds(514, 282, 31, 30);
		contentPane.add(btn12);
		
		JRadioButton enable2 = new JRadioButton("");
		enable2.setBackground(new Color(255, 255, 255));
		enable2.setBounds(273, 144, 28, 25);
		contentPane.add(enable2);
		
		JRadioButton enable4 = new JRadioButton("");
		enable4.setBackground(new Color(255, 255, 255));
		enable4.setBounds(298, 144, 30, 25);
		contentPane.add(enable4);
		
		JRadioButton enable6 = new JRadioButton("");
		enable6.setBackground(new Color(255, 255, 255));
		enable6.setBounds(330, 144, 30, 25);
		contentPane.add(enable6);
		
		JRadioButton enable8 = new JRadioButton("");
		enable8.setBackground(new Color(255, 255, 255));
		enable8.setBounds(362, 144, 30, 25);
		contentPane.add(enable8);
		
		JRadioButton enable1 = new JRadioButton("");
		enable1.setBackground(Color.WHITE);
		enable1.setBounds(273, 80, 28, 25);
		contentPane.add(enable1);
		
		JRadioButton enable3 = new JRadioButton("");
		enable3.setBackground(Color.WHITE);
		enable3.setBounds(303, 80, 21, 25);
		contentPane.add(enable3);
		
		JRadioButton enable5 = new JRadioButton("");
		enable5.setBackground(Color.WHITE);
		enable5.setBounds(330, 80, 30, 25);
		contentPane.add(enable5);
		
		JRadioButton enable7 = new JRadioButton("");
		enable7.setBackground(Color.WHITE);
		enable7.setBounds(362, 80, 30, 25);
		contentPane.add(enable7);
		
		JButton btnPower = new JButton("Power");
		btnPower.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPower.setBounds(60, 29, 91, 30);
		contentPane.add(btnPower);
		
		JButton btnFunction = new JButton("FUNCTION");
		btnFunction.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFunction.setBounds(48, 183, 107, 25);
		contentPane.add(btnFunction);
		
		JButton btnSwap = new JButton("SWAP");
		btnSwap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSwap.setBounds(62, 276, 89, 27);
		contentPane.add(btnSwap);
		
		JButton btnPrinterPwr = new JButton("Printer Pwr");
		btnPrinterPwr.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPrinterPwr.setBounds(444, 21, 108, 25);
		contentPane.add(btnPrinterPwr);
		
		JTextArea mainDisplay = new JTextArea();
		mainDisplay.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		mainDisplay.setText("");
		mainDisplay.setBounds(243, 183, 149, 135);
		contentPane.add(mainDisplay);
		
		JTextArea txtrPrinterarea = new JTextArea();
		txtrPrinterarea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrPrinterarea.setText("");
		txtrPrinterarea.setBounds(454, 60, 84, 80);
		contentPane.add(txtrPrinterarea);
		
		JRadioButton chan1 = new JRadioButton("");
		chan1.setBackground(Color.WHITE);
		chan1.setBounds(94, 409, 28, 25);
		contentPane.add(chan1);
		
		JRadioButton chan3 = new JRadioButton("");
		chan3.setBackground(Color.WHITE);
		chan3.setBounds(124, 409, 26, 25);
		contentPane.add(chan3);
		
		JRadioButton chan5 = new JRadioButton("");
		chan5.setBackground(Color.WHITE);
		chan5.setBounds(154, 409, 24, 25);
		contentPane.add(chan5);
		
		JRadioButton chan7 = new JRadioButton("");
		chan7.setBackground(Color.WHITE);
		chan7.setBounds(185, 409, 31, 25);
		contentPane.add(chan7);
		
		JRadioButton chan2 = new JRadioButton("");
		chan2.setBackground(Color.WHITE);
		chan2.setBounds(91, 447, 24, 25);
		contentPane.add(chan2);
		
		JRadioButton chan4 = new JRadioButton("");
		chan4.setBackground(Color.WHITE);
		chan4.setBounds(124, 447, 27, 25);
		contentPane.add(chan4);
		
		JRadioButton chan6 = new JRadioButton("");
		chan6.setBackground(Color.WHITE);
		chan6.setBounds(154, 447, 26, 25);
		contentPane.add(chan6);
		
		JRadioButton chan8 = new JRadioButton("");
		chan8.setBackground(Color.WHITE);
		chan8.setBounds(185, 447, 26, 25);
		contentPane.add(chan8);
		
		JButton start1 = new JButton("");
		start1.setBackground(UIManager.getColor("Button.background"));
		start1.setBounds(270, 62, 23, 18);
		contentPane.add(start1);
		
		JButton start3 = new JButton("");
		start3.setBounds(301, 62, 23, 18);
		contentPane.add(start3);
		
		JButton start5 = new JButton("");
		start5.setBounds(330, 62, 23, 18);
		contentPane.add(start5);
		
		JButton start7 = new JButton("");
		start7.setBounds(360, 62, 23, 18);
		contentPane.add(start7);
		
		JButton finish2 = new JButton("");
		finish2.setBounds(270, 125, 23, 18);
		contentPane.add(finish2);
		
		JButton finish4 = new JButton("");
		finish4.setBounds(301, 125, 23, 18);
		contentPane.add(finish4);
		
		JButton finish6 = new JButton("");
		finish6.setBounds(330, 125, 23, 18);
		contentPane.add(finish6);
		
		JButton finish8 = new JButton("");
		finish8.setBounds(362, 125, 23, 18);
		contentPane.add(finish8);
	}
}
