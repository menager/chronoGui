import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Apr 09 18:01:54 CDT 2016
 */



/**
 * @author Morgan Nager
 */
public class chronotimerGUI  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Morgan Nager
		panel1 = new JPanel();
		label1 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		button0 = new JButton();
		button11 = new JButton();
		button12 = new JButton();
		textField1 = new JTextField();

		//======== panel1 ========
		{

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panel1.setLayout(null);

			//---- label1 ----
			label1.setText("text");
			label1.setIcon(new ImageIcon(getClass().getResource("/chrono.jpg")));
			panel1.add(label1);
			label1.setBounds(40, 0, 620, 500);

			//---- button1 ----
			button1.setText("text");
			panel1.add(button1);
			button1.setBounds(480, 175, 35, 30);

			//---- button2 ----
			button2.setText("text");
			panel1.add(button2);
			button2.setBounds(515, 175, 30, 30);

			//---- button3 ----
			button3.setText("text");
			panel1.add(button3);
			button3.setBounds(545, 175, 35, 30);

			//---- button4 ----
			button4.setText("text");
			panel1.add(button4);
			button4.setBounds(480, 205, 35, 35);

			//---- button5 ----
			button5.setText("text");
			panel1.add(button5);
			button5.setBounds(515, 205, 30, 35);

			//---- button6 ----
			button6.setText("text");
			panel1.add(button6);
			button6.setBounds(545, 205, 35, 35);

			//---- button7 ----
			button7.setText("text");
			panel1.add(button7);
			button7.setBounds(480, 240, 35, 35);

			//---- button8 ----
			button8.setText("text");
			panel1.add(button8);
			button8.setBounds(515, 240, 30, 30);

			//---- button9 ----
			button9.setText("text");
			panel1.add(button9);
			button9.setBounds(545, 240, 35, 30);

			//---- button0 ----
			button0.setText("text");
			panel1.add(button0);
			button0.setBounds(515, 270, 30, 35);

			//---- button11 ----
			button11.setText("text");
			panel1.add(button11);
			button11.setBounds(480, 275, 35, 30);

			//---- button12 ----
			button12.setText("text");
			panel1.add(button12);
			button12.setBounds(545, 275, 35, 30);
			panel1.add(textField1);
			textField1.setBounds(280, 175, 145, 130);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel1.getComponentCount(); i++) {
					Rectangle bounds = panel1.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel1.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel1.setMinimumSize(preferredSize);
				panel1.setPreferredSize(preferredSize);
			}
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Morgan Nager
	private JPanel panel1;
	private JLabel label1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton button11;
	private JButton button12;
	private JTextField textField1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
