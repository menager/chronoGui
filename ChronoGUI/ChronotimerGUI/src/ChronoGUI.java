

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.net.URL;

	import javax.swing.BorderFactory;
	import javax.swing.GroupLayout;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JComponent;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.LayoutStyle;
	import javax.swing.WindowConstants;
	import javax.swing.SwingUtilities;



	public class ChronoGUI extends javax.swing.JFrame {

		private JButton jButton1;
		private JButton Up;
		private JPanel jPanel1;
		private JButton jButton19;
		private JButton jButton18;
		private JButton jButton17;
		private JButton jButton16;
		private JButton jButton15;
		private JButton jButton14;
		private JButton jButton13;
		private JButton jButton12;
		private JButton jButton11;
		private JButton jButton10;
		private JButton jButton9;
		private JButton jButton8;
		private JButton jButton7;
		private JButton jButton6;
		private JButton jButton5;
		private JButton jButton4;
		private JTextArea Number;
		private JButton jButton3;
		private JButton jButton2;
		
		private JTextField jTextField1;
		
		private boolean On = false;
		private boolean POST = false;
		private boolean POPending = false;

		/**
		* Auto-generated main method to display this JFrame
		*/
		
		
		public static void main(String[] args) {
			
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					ChronoGUI inst = new ChronoGUI();
					inst.setLocationRelativeTo(null);
					inst.setVisible(true);
					
				}
			});
			

		}
		
		public ChronoGUI() {
			super();
			initGUI();
			
			
		}
		
		private void initGUI() {

			try {

				getContentPane().setLayout(null);
				setTitle("ChronoTimer");
			
				setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				
				//$protect>>$
				//Code we insert here will be protected against modification by Jigloo

				//This anonymous inner class extends Container and 
				// overrides the paint() method to paint the background
				Container contentPane = new Container()
				{
					//Create and load a background Image to be painted onto the JFrame's content pane
					// whenever the JFrame's paint() method is called
					ImageIcon background = new ImageIcon("chronotimer.png");

					//ImageIcon background1 = new ImageIcon(getClass().getClassLoader().getResource("d:/My Documents/My Pictures/phone2.jpg"));

					//Override of the anonymous inner class's paint() method, called 
					// automatically by Swing whenever painting of the content pane is needed
					public void paint(Graphics g)
					{
						// load the image (only happens once, as background is null only on the first paint()
						if( background == null ) {
							// Locate the image in the jarfile (if the app is deployed in a jarfile)
							URL url = getClass().getClassLoader().getResource("d:/My Documents/My Pictures/t101g.jpg"); // note no ./ in path
							if( url != null )  {// found the resource in the jarfile
								background = new ImageIcon(url); // load it
							}	
							else { // couldn't find the resource (we're probably not running out of a jarfile)
								//  try loading from the filesystem.
								background = new ImageIcon("d:/My Documents/My Pictures/t101g.jpg");
							}
						}

						// erase the rectangle defining the JFrame client area
						g.clearRect(0, 0, this.getWidth(), this.getHeight());

						// paint our background image
						if( background != null )
							background.paintIcon(this, g, 0, 0);

						//background.paintIcon(this, g, 0, 0);

						// delegate the rest of the painting of everything else to Container's default paint implementation()
						super.paint(g);
					}
				};

				//Resets the JFrame's content pane to be our custom background-painting pane
				this.getRootPane().setContentPane(contentPane);
				//$protect<<$

				
				this.setVisible(true);
				this.setResizable(false);
				
				

				{
					jButton1 = new JButton();
					GroupLayout jButton1Layout = new GroupLayout((JComponent)jButton1);
					jButton1.setLayout(null);
					jButton1.setBackground(new java.awt.Color(128,255,0));
					jButton1.setContentAreaFilled(false);
					jButton1Layout.setVerticalGroup(jButton1Layout.createParallelGroup());
					jButton1Layout.setHorizontalGroup(jButton1Layout.createParallelGroup());
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
				{
					jButton2 = new JButton();
					GroupLayout jButton2Layout = new GroupLayout((JComponent)jButton2);
					jButton2.setLayout(null);
					jButton2Layout.setVerticalGroup(jButton2Layout.createParallelGroup());
					jButton2Layout.setHorizontalGroup(jButton2Layout.createParallelGroup());
					jButton2.setContentAreaFilled(false);
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
				{
					jButton3 = new JButton();
					GroupLayout jButton3Layout = new GroupLayout((JComponent)jButton3);
					jButton3.setLayout(null);
					jButton3Layout.setVerticalGroup(jButton3Layout.createParallelGroup());
					jButton3Layout.setHorizontalGroup(jButton3Layout.createParallelGroup());
					jButton3.setContentAreaFilled(false);
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
			//	{
			//		jTextArea1 = new JTextArea();
				//	jTextArea1.setBackground(new java.awt.Color(0,0,0));
			//	}
				{
					jButton10 = new JButton();
					GroupLayout jButton10Layout = new GroupLayout((JComponent)jButton10);
					jButton10.setLayout(null);
					jButton10.setContentAreaFilled(false);
					jButton10Layout.setVerticalGroup(jButton10Layout.createParallelGroup());
					jButton10Layout.setHorizontalGroup(jButton10Layout.createParallelGroup());
					jButton10.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
				{
					jButton4 = new JButton();
					GroupLayout jButton4Layout = new GroupLayout((JComponent)jButton4);
					jButton4.setLayout(null);
					jButton4.setContentAreaFilled(false);
					jButton4Layout.setVerticalGroup(jButton4Layout.createParallelGroup());
					jButton4Layout.setHorizontalGroup(jButton4Layout.createParallelGroup());
					jButton4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
				{
					jButton5 = new JButton();
					GroupLayout jButton5Layout = new GroupLayout((JComponent)jButton5);
					jButton5.setLayout(null);
					jButton5.setContentAreaFilled(false);
					jButton5Layout.setVerticalGroup(jButton5Layout.createParallelGroup());
					jButton5Layout.setHorizontalGroup(jButton5Layout.createParallelGroup());
					jButton5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
				{
					jButton6 = new JButton();
					GroupLayout jButton6Layout = new GroupLayout((JComponent)jButton6);
					jButton6.setLayout(null);
					jButton6.setContentAreaFilled(false);
					jButton6Layout.setVerticalGroup(jButton6Layout.createParallelGroup());
					jButton6Layout.setHorizontalGroup(jButton6Layout.createParallelGroup());
					jButton6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
				{
					jButton7 = new JButton();
					GroupLayout jButton7Layout = new GroupLayout((JComponent)jButton7);
					jButton7.setLayout(null);
					jButton7.setContentAreaFilled(false);
					jButton7Layout.setVerticalGroup(jButton7Layout.createParallelGroup());
					jButton7Layout.setHorizontalGroup(jButton7Layout.createParallelGroup());
					jButton7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
				}
				{
					jButton8 = new JButton();
					jButton8.setContentAreaFilled(false);
					GroupLayout jButton8Layout = new GroupLayout((JComponent)jButton8);
					jButton8.setLayout(null);
					jButton8Layout.setVerticalGroup(jButton8Layout.createParallelGroup());
					jButton8Layout.setHorizontalGroup(jButton8Layout.createParallelGroup());
					jButton8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
					
				}
				{
					jButton9 = new JButton();
					getContentPane().add(jButton9);
					getContentPane().add(jButton8);
					getContentPane().add(jButton7);
					getContentPane().add(jButton4);
					getContentPane().add(jButton6);
					getContentPane().add(jButton5);
					getContentPane().add(jButton1);
					getContentPane().add(jButton3);
					getContentPane().add(jButton2);
				//	getContentPane().add(jTextArea1);
					getContentPane().add(jButton10);
					jButton10.setBounds(70, 286, 36, 15);
					jButton10.setText("0");
					jButton9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							ActionPerformed(evt);
						}
					});
					{
						jButton11 = new JButton();
						getContentPane().add(jButton11);
						jButton11.setBounds(24, 286, 41, 15);
						jButton11.setContentAreaFilled(false);
						jButton11.setText("*");
						jButton11.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jButton12 = new JButton();
						getContentPane().add(jButton12);
						jButton12.setBounds(111, 286, 44, 15);
						jButton12.setContentAreaFilled(false);
						jButton12.setText("#");
						jButton12.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						Up = new JButton();
						getContentPane().add(Up);
						Up.setText("Up");
						Up.setBounds(73, 166, 33, 14);
						Up.setContentAreaFilled(false);
						Up.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jButton13 = new JButton();
						getContentPane().add(jButton13);
						jButton13.setText("R");
						jButton13.setBounds(106, 176, 14, 27);
						jButton13.setContentAreaFilled(false);
						jButton13.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
						
					}
					{
						jButton14 = new JButton();
						getContentPane().add(jButton14);
						jButton14.setText("L");
						jButton14.setBounds(60, 174, 13, 27);
						jButton14.setContentAreaFilled(false);
						jButton14.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jButton15 = new JButton();
						getContentPane().add(jButton15);
						jButton15.setText("Down");
						jButton15.setBounds(73, 196, 33, 13);
						jButton15.setContentAreaFilled(false);
						jButton15.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jButton16 = new JButton();
						getContentPane().add(jButton16);
						jButton16.setBounds(73, 181, 33, 15);
						jButton16.setContentAreaFilled(false);
						jButton16.setText("OK");
						jButton16.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jButton17 = new JButton();
						getContentPane().add(jButton17);
						jButton17.setBounds(117, 203, 37, 17);
						jButton17.setContentAreaFilled(false);
						jButton17.setText("POWER");
						jButton17.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jButton18 = new JButton();
						getContentPane().add(jButton18);
						jButton18.setText("Menu");
						jButton18.setBounds(30, 165, 25, 16);
						jButton18.setContentAreaFilled(false);
						jButton18.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jButton19 = new JButton();
						getContentPane().add(jButton19);
						jButton19.setText("Browser");
						jButton19.setBounds(120, 167, 29, 14);
						jButton19.setContentAreaFilled(false);
						jButton19.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ActionPerformed(evt);
							}
						});
					}
					{
						jPanel1 = new JPanel(){
							public void paintComponent(Graphics g){
								Image image = new ImageIcon("d:/My Documents/My Pictures/OFF.gif").getImage();
								g.drawImage(image, 3, 4, this);
							}	
							
						};
						GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
						getContentPane().add(jPanel1);
						
						jPanel1.setLayout(jPanel1Layout);
						jPanel1.setBounds(36, 38, 108, 93);
						jPanel1.setBackground(new java.awt.Color(0,255,0));
						jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
						jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
					}

			/*		jTextArea1.setBounds(191, 237, 108, 93);
					jTextArea1.setEditable(false);
					jTextArea1.setSelectedTextColor(new java.awt.Color(0,0,0));
					jTextArea1.setWrapStyleWord(true);
					jTextArea1.setRequestFocusEnabled(false);
					jTextArea1.setLineWrap(true);*/
					jButton2.setBounds(70, 225, 36, 18);
					jButton2.setText("2");
					jButton3.setBounds(111, 226, 44, 16);
					jButton3.setText("3");
					jButton1.setBounds(24, 224, 41, 19);
					jButton1.setText("1");
					jButton5.setBounds(70, 247, 36, 17);
					jButton5.setText("5");
					jButton6.setBounds(111, 247, 44, 17);
					jButton6.setText("6");
					jButton4.setBounds(24, 247, 41, 17);
					jButton4.setOpaque(false);
					jButton4.setText("4");
					jButton7.setBounds(24, 264, 41, 17);
					jButton7.setText("7");
					jButton8.setBounds(70, 264, 36, 17);
					jButton8.setText("8");
					GroupLayout jButton9Layout = new GroupLayout((JComponent)jButton9);
					jButton9.setLayout(null);
					jButton9Layout.setVerticalGroup(jButton9Layout.createParallelGroup());
					jButton9Layout.setHorizontalGroup(jButton9Layout.createParallelGroup());
					jButton9.setContentAreaFilled(false);
					jButton9.setBounds(111, 264, 44, 17);
					jButton9.setText("9");
				}
				pack();
				this.setSize(280, 346);
				
			} catch (Exception e) {
			    //add your error handling code here
				e.printStackTrace();
			}
			
		}
		
		private void ActionPerformed(ActionEvent evt) {
			boolean call = false;
			boolean text = false;
			boolean message = false;
			boolean message2 = false;
			int num =0;

			if(((JButton)evt.getSource()).getText().equalsIgnoreCase("POWER")){
				if(!On && !POST && !POPending){

						POST = true;

						jPanel1 = new JPanel(){
							public void paintComponent(Graphics g){
								Image image = new ImageIcon("d:/My Documents/My Pictures/post.gif").getImage();
								g.drawImage(image, -88, -103, this);
							}	
						};
						GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
						getContentPane().add(jPanel1);
						
						jPanel1.setLayout(jPanel1Layout);
						jPanel1.setBounds(36, 38, 108, 93);
						jPanel1.setBackground(new java.awt.Color(0,255,0));
						jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
						jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
				//		jTextField1.setVisible(false);
					}
				else if(POST){

					jPanel1 = new JPanel(){
						public void paintComponent(Graphics g){
							Image image = new ImageIcon("d:/My Documents/My Pictures/MAIN.gif").getImage();
							g.drawImage(image, -50, -50, this);
						}	
						
					};
					GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
					getContentPane().add(jPanel1);
					
					jPanel1.setLayout(jPanel1Layout);
					jPanel1.setBounds(36, 38, 108, 93);
					jPanel1.setBackground(new java.awt.Color(0,255,0));
					jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
					jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
						On = true;
						POST = false;	
				//		jTextField1.setVisible(false);
			}
				else if(On){
					jPanel1 = new JPanel(){
						public void paintComponent(Graphics g){
							Image image = new ImageIcon("d:/My Documents/My Pictures/POPending.gif").getImage();
							g.drawImage(image, -169, -100, this);
						}	
						
					};
					GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
					getContentPane().add(jPanel1);
					
					jPanel1.setLayout(jPanel1Layout);
					jPanel1.setBounds(36, 38, 108, 93);
					jPanel1.setBackground(new java.awt.Color(0,255,0));
					jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
					jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
					On = false;
					POPending = true;
					message = false;
				//	jTextField1.setVisible(false);
				}
				else if(POPending) {
					jPanel1 = new JPanel(){
						public void paintComponent(Graphics g){
							Image image = new ImageIcon("d:/My Documents/My Pictures/OFF.gif").getImage();
							g.drawImage(image, -169, -100, this);
						}	
						
					};
					GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
					getContentPane().add(jPanel1);
					
					jPanel1.setLayout(jPanel1Layout);
					jPanel1.setBounds(36, 38, 108, 93);
					jPanel1.setBackground(new java.awt.Color(0,255,0));
					jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
					jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
					POST = false;
					POPending = false;
					On = false;
					message = false;
				//	jTextField1.setVisible(false);
			
				}
					
				}
			if(((JButton)evt.getSource()) != jButton17 && POPending){

				jPanel1 = new JPanel(){
					public void paintComponent(Graphics g){
						Image image = new ImageIcon("d:/My Documents/My Pictures/MAIN.gif").getImage();
						g.drawImage(image, -50, -50, this);
					}	
					
				};
				GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
				getContentPane().add(jPanel1);
				
				jPanel1.setLayout(jPanel1Layout);
				jPanel1.setBounds(36, 38, 108, 93);
				jPanel1.setBackground(new java.awt.Color(0,255,0));
					On = true;
					POST = false;	
					POPending = false;
					message = false;
				jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup());
				jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup());
			}

			
			if(On ){

		/*	if(((JButton)evt.getSource()==jButton18)&& !call){
					jPanel1 = new JPanel(){
						public void paintComponent(Graphics g){
							Image image = new ImageIcon("d:/My Documents/My Pictures/CALL.gif").getImage();
							g.drawImage(image, -50, -50, this);
						}	
						
					};
					GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
					getContentPane().add(jPanel1);
					
					jPanel1.setLayout(jPanel1Layout);
					jPanel1.setBounds(36, 38, 108, 93);
					jPanel1.setBackground(new java.awt.Color(0,255,0));
					jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
					jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
					call = true;
			}*/
			
			if(call = true){
			if(((JButton)evt.getSource()==jButton15)){
					
					jPanel1 = new JPanel(){
						public void paintComponent(Graphics g){
							Image image = new ImageIcon("d:/My Documents/My Pictures/TEXT.gif").getImage();
							g.drawImage(image, -50, -50, this);
						}	
						
					};
					GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
					getContentPane().add(jPanel1);
					
					jPanel1.setLayout(jPanel1Layout);
					jPanel1.setBounds(36, 38, 108, 93);
					jPanel1.setBackground(new java.awt.Color(0,255,0));
					jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
					jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
					call = false;
					text = true;
					}
					
			if(((JButton)evt.getSource()==Up)){
						jPanel1 = new JPanel(){
							public void paintComponent(Graphics g){
								Image image = new ImageIcon("d:/My Documents/My Pictures/CALL.gif").getImage();
								g.drawImage(image, -50, -50, this);
							}	
							
						};
						GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
						getContentPane().add(jPanel1);
						
						jPanel1.setLayout(jPanel1Layout);
						jPanel1.setBounds(36, 38, 108, 93);
						jPanel1.setBackground(new java.awt.Color(0,255,0));
						jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
						jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
						call = true;
						text = false;
					}	
			}
			if(text =true){
				if((JButton)evt.getSource()== jButton16 && message == false){
					{
						jPanel1 = new JPanel(){
							public void paintComponent(Graphics g){
								Image image = new ImageIcon("d:/My Documents/My Pictures/message.gif").getImage();
								g.drawImage(image, -10, -20, this);
							}	
							
						};
						GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
						getContentPane().add(jPanel1);
						
						jPanel1.setLayout(jPanel1Layout);
						jPanel1.setBounds(36, 38, 108, 93);
						jPanel1.setBackground(new java.awt.Color(0,255,0));
						{
							jTextField1 = new JTextField();
						}
						jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jTextField1, 0, 84, Short.MAX_VALUE)
							.addContainerGap());
						jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap(24, 24)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(42, Short.MAX_VALUE));
						

						message = true;
						message2 = true;
					}
							
							}
				if(message = true){
					
					if((JButton)evt.getSource()== jButton1 || (JButton)evt.getSource()== jButton2 || (JButton)evt.getSource()== jButton3 || (JButton)evt.getSource()== jButton4 
							|| (JButton)evt.getSource()== jButton5 || (JButton)evt.getSource()== jButton6 || (JButton)evt.getSource()== jButton7
							|| (JButton)evt.getSource()== jButton8 || (JButton)evt.getSource()== jButton9 || (JButton)evt.getSource()== jButton10){
						
						String text1 =((JButton)evt.getSource()).getText();
						jTextField1.setText(jTextField1.getText()+text1);	
					}
					else if((JButton)evt.getSource()==jButton11){
						
					}
				/*	
					if((JButton)evt.getSource()== jButton1){
						buttons("1");
					}
					if((JButton)evt.getSource()== jButton2){
						buttons("2");
					}
					if((JButton)evt.getSource()== jButton3){
						buttons("3");
					}
					if((JButton)evt.getSource()== jButton4){
						buttons("4");
					}
					if((JButton)evt.getSource()== jButton5){
						buttons("5");
					}
					if((JButton)evt.getSource()== jButton6){
						buttons("6");
					}
					
					if((JButton)evt.getSource()== jButton7){
						buttons("7");
					}
					if((JButton)evt.getSource()== jButton8){
						buttons("8");
					}
					if((JButton)evt.getSource()== jButton9){
						buttons("9");
					}
					if((JButton)evt.getSource()== jButton10){
						buttons("0");
					}*/
					
						
				if(message && message2){
					if((JButton)evt.getSource()== jButton16 && message ==true){
						
						jPanel1 = new JPanel(){
							public void paintComponent(Graphics g){
								Image image = new ImageIcon("d:/My Documents/My Pictures/message2.gif").getImage();
								g.drawImage(image, -10, -20, this);
							}	
							
						};
						GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
						getContentPane().add(jPanel1);
						
						jPanel1.setLayout(jPanel1Layout);
						jPanel1.setBounds(36, 38, 108, 93);
						jPanel1.setBackground(new java.awt.Color(0,255,0));
						{
							jTextField1 = new JTextField();
						}
						jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jTextField1, 0, 84, Short.MAX_VALUE)
							.addContainerGap());
						jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap(24, 24)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(42, Short.MAX_VALUE));

						}
					
					}
				

						
					else if((JButton)evt.getSource()== jButton18){
							
							
							jPanel1 = new JPanel(){
								public void paintComponent(Graphics g){
									Image image = new ImageIcon("d:/My Documents/My Pictures/SENT.gif").getImage();
									g.drawImage(image, -40, -10, this);
								}	
								
							};
							GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
							getContentPane().add(jPanel1);
							
							jPanel1.setLayout(jPanel1Layout);
							jPanel1.setBounds(36, 38, 108, 93);
							jPanel1.setBackground(new java.awt.Color(0,255,0));
							jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
							jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
							message = false;
							text = false;
							
							
						}
						else if((JButton)evt.getSource()== jButton19){
							jPanel1 = new JPanel(){
								public void paintComponent(Graphics g){
									Image image = new ImageIcon("d:/My Documents/My Pictures/MAIN.gif").getImage();
									g.drawImage(image, -50, -50, this);
								}	
								
							};
							GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
							getContentPane().add(jPanel1);
							
							jPanel1.setLayout(jPanel1Layout);
							jPanel1.setBounds(36, 38, 108, 200);
							jPanel1.setBackground(new java.awt.Color(0,255,0));
							jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup());
							jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup());
							text = false;
							message = false;
						
					}
					}
			
			}
			
			}

			
		}
				public void buttons(String button){

						int num1 = 0;
						
						while(button.equalsIgnoreCase("1")){
							String text1 ="1";
							jTextField1.setText(jTextField1.getText()+text1);	
						}
						while(button.equalsIgnoreCase("2")){
							num1++;
						}
						if(num1 ==1){
							String text1 = "2";
							jTextField1.setText(jTextField1.getText()+text1);
						}
						else if(num1 ==2){
							String text1 = "a";
							jTextField1.setText(jTextField1.getText()+text1);
						}
						else if(num1 ==3){
							String text1 = "b";
							jTextField1.setText(jTextField1.getText()+text1);
						}
						else if(num1 ==4){
							String text1 = "c";
							jTextField1.setText(jTextField1.getText()+text1);
						}
						
							//String text1 =((JButton)evt.getSource()).getText();
							//jTextField1.setText(jTextField1.getText()+text1);	
									
						
				}

	}


