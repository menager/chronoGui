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
import java.awt.Canvas;

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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		enable4.setBounds(303, 144, 30, 25);
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
		chan1.setBounds(93, 411, 22, 22);
		contentPane.add(chan1);
		
		JRadioButton chan3 = new JRadioButton("");
		chan3.setBackground(Color.WHITE);
		chan3.setBounds(123, 411, 22, 22);
		contentPane.add(chan3);
		
		JRadioButton chan5 = new JRadioButton("");
		chan5.setBackground(Color.WHITE);
		chan5.setBounds(153, 411, 22, 22);
		contentPane.add(chan5);
		
		JRadioButton chan7 = new JRadioButton("");
		chan7.setBackground(Color.WHITE);
		chan7.setBounds(183, 411, 22, 22);
		contentPane.add(chan7);
		
		JRadioButton chan2 = new JRadioButton("");
		chan2.setBackground(Color.WHITE);
		chan2.setBounds(93, 447, 22, 22);
		contentPane.add(chan2);
		
		JRadioButton chan4 = new JRadioButton("");
		chan4.setBackground(Color.WHITE);
		chan4.setBounds(123, 447, 22, 22);
		contentPane.add(chan4);
		
		JRadioButton chan6 = new JRadioButton("");
		chan6.setBackground(Color.WHITE);
		chan6.setBounds(153, 447, 22, 22);
		contentPane.add(chan6);
		
		JRadioButton chan8 = new JRadioButton("");
		chan8.setBackground(Color.WHITE);
		chan8.setBounds(183, 447, 22, 22);
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
		
		JButton leftArrow = new JButton("L");
		leftArrow.setBounds(70, 214, 21, 23);
		contentPane.add(leftArrow);
		
		JButton rightArrow = new JButton("R");
		rightArrow.setBounds(99, 214, 21, 23);
		contentPane.add(rightArrow);
		
		JButton downArrow = new JButton("D");
		downArrow.setBounds(140, 214, 21, 23);
		contentPane.add(downArrow);
		
		JButton upArrow = new JButton("U");
		upArrow.setBounds(168, 214, 21, 23);
		contentPane.add(upArrow);
		
		JLabel lblChan = new JLabel("CHAN");
		lblChan.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChan.setBounds(31, 394, 46, 14);
		contentPane.add(lblChan);
		
		JLabel lblUsbPort = new JLabel("USB PORT");
		lblUsbPort.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsbPort.setBounds(320, 423, 70, 14);
		contentPane.add(lblUsbPort);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStart.setBounds(232, 64, 32, 14);
		contentPane.add(lblStart);
		
		JLabel lblEnabledisable = new JLabel("Enable/Disable");
		lblEnabledisable.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnabledisable.setBounds(178, 84, 91, 14);
		contentPane.add(lblEnabledisable);
		
		JLabel lblFinish = new JLabel("Finish");
		lblFinish.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFinish.setBounds(230, 126, 38, 14);
		contentPane.add(lblFinish);
		
		JLabel label = new JLabel("Enable/Disable");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(178, 149, 91, 14);
		contentPane.add(label);
		
		JLabel lblQueueRunning = new JLabel("Queue / Running / Final Time");
		lblQueueRunning.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblQueueRunning.setBounds(250, 325, 135, 14);
		contentPane.add(lblQueueRunning);
		
		JLabel lblChronotimer = new JLabel("CHRONOTIMER 1009");
		lblChronotimer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblChronotimer.setBounds(223, 27, 160, 14);
		contentPane.add(lblChronotimer);
		
		JButton usbPort = new JButton("");
		usbPort.setBounds(275, 425, 40, 10);
		contentPane.add(usbPort);
		
		JLabel CHlabel_1 = new JLabel("1      3      5      7");
		CHlabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		CHlabel_1.setBounds(96, 394, 129, 14);
		contentPane.add(CHlabel_1);
		
		JLabel CHlabel_2 = new JLabel("2      4      6      8");
		CHlabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		CHlabel_2.setBounds(96, 434, 129, 14);
		contentPane.add(CHlabel_2);
		
		JLabel label_1 = new JLabel("1      3      5      7");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(273, 45, 129, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("2      4      6      8");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(273, 110, 129, 14);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setBounds(10, 380, 610, 143);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(10, 11, 610, 348);
		contentPane.add(lblNewLabel_1);
	}
}
