
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.awt.Component;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.border.EtchedBorder;


import javax.swing.border.MatteBorder;

import java.util.ArrayList;


import javax.swing.border.LineBorder;

import javax.swing.border.TitledBorder;





public class Graphique {
	private JPanel panel_2;
	private JTextField textPane;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel_12;
	private JFrame frame;
	private JTextField numT;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
    private JLabel lblYes;
    private JButton btnNewButton;
    private String value;
    private int l;
    private JLabel numfaux;
    private DessinerRoundRectangle dessinerRoundRectangle = new DessinerRoundRectangle(5,301,490,250);
    private JFrame frameapp;
    private DessinerRoundRectangle insc = new DessinerRoundRectangle(5,250,490,370);
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblNewLabel_6;
    private JTextField textField_2;
    private JTextField textField_3;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_8;
    private JButton btnNewButton_1;
    private JLabel  namefaux ;
    private JLabel lblVeuillezSaisirUne;
    private JLabel lblVeuillezSaisirLe;
    private JLabel lblVeuillezSaisirLe_1;
    private int clind;
    private JPanel panel;
   
    private JLabel lblNewLabel_9;
    private Image pizzimg;
    private Image boissimg;
    private Image chartimg;
    private Image dessimg;
    private JButton button1;
    private JButton button2;
    private JButton button3;
   
    private JPanel panel_1;
    private JLabel nameclient;
    private JLabel soldeclient;
    private JButton btnNewButton_3;

    private  String[] taillepizza= { "Naine","Humaine","Ogresse"} ;
    private ArrayList<JLabel> labelsCom=new ArrayList<JLabel>();
    private ArrayList<JPanel> panelsPizza= new ArrayList<JPanel>();
  
    private ArrayList<JPanel> panelsCom= new ArrayList<JPanel>();
    private ArrayList<JComboBox<?>> combo= new ArrayList<JComboBox<?>>();
    private ArrayList<JTextField> texts= new ArrayList<JTextField>();
    
    private ArrayList<JButton> butpiz= new ArrayList<JButton>();
   
    private ArrayList<JLabel> labelsPiz=new ArrayList<JLabel>();
    
    private ArrayList<JTextArea> desPiz=new ArrayList<JTextArea>();
    
    private ArrayList<JLabel> prixPiz=new ArrayList<JLabel>();
  
    Image piz1;
   
    private int JB=0;
    private JPanel panel_3;
    private Main mn=new Main();
    private JLabel cp;
    private Pizza temp=null;
    private JButton btnNewButton_7;
    static Boolean  bol=false;
    private JScrollPane scrollFrame;

    private JScrollPane scrollFrameC;
    
  public String res;
    private JPanel cartePizza = new JPanel();
	public boolean bool=true;
    private Image logout;

    private JButton btnNewButton_4;
	private JLabel lblNewLabel_14;

	private JPanel panel_4;
	private JLabel lblNewLabel_16;
  
    
    private JButton commander;
   private JButton btnNewButton_6 ;
   private JLabel lblNewLabel_13;
   public Commande cs;
   
   private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;

  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graphique window = new Graphique();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public Graphique() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize( 500, 663);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Image back= new ImageIcon(this.getClass().getResource("/GoBack.png")).getImage();
	    
		
	    
	    btnNewButton_4 = new JButton("Lancer la Commande");
		btnNewButton_4.addActionListener(lancer);
		btnNewButton_4.setVisible(false);
		btnNewButton_4.setEnabled(false);
		
		btnNewButton_4.setBounds(120, 550, 244, 36);
		
		
		
		panel_4 = new JPanel();
		panel_4.setEnabled(false);
		panel_4.setVisible(false);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(5, 148, 490, 393);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		lblNewLabel_16 = new JLabel("Veuillez attendre la confirmation de votre commande...");
		lblNewLabel_16.setBounds(6, 55, 478, 28);
		panel_4.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(6, 155, 478, 28);
		panel_4.add(lblNewLabel_17);
		
		
		
		
		
	
		
		
		lblNewLabel_18 = new JLabel("entrain de trouvez un point Rappiz");
		lblNewLabel_18.setBounds(6, 95, 478, 28);
		
		
		
		
		
		
		panel_4.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setBounds(6, 123, 478, 28);
		panel_4.add(lblNewLabel_19);
		
		btnNewButton_7 = new JButton("Revenir");
		
		btnNewButton_7.setVisible(false);
		btnNewButton_7.setEnabled(false);
		
		btnNewButton_7.setBounds(181, 342, 117, 29);
		panel_4.add(btnNewButton_7);
		
		
		btnNewButton_8 = new JButton("non");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_8.setBounds(97, 229, 117, 29);
		panel_4.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("oui");
		
		btnNewButton_9.setBounds(265, 229, 117, 29);
		btnNewButton_9.setEnabled(false);
		btnNewButton_9.setVisible(false);
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.setVisible(false);
		
		panel_4.add(btnNewButton_9);
		
		lblNewLabel_15 = new JLabel("Pouvez-vous réaliser cette commande?");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(6, 185, 478, 38);
		panel_4.add(lblNewLabel_15);
		frame.getContentPane().add(btnNewButton_4);
	    
	    panel_3 = new JPanel();
	    scrollFrameC = new JScrollPane(panel_3);
		scrollFrameC.setBounds(5, 58, 490, 483);
		scrollFrameC.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       panel_3.setAutoscrolls(true);
		
		panel_3.setLayout(null);
		
		lblNewLabel_14 = new JLabel("MA COMMANDE");
		lblNewLabel_14.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setBounds(0, 0, 486, 49);
		
		 
		
		 lblNewLabel_14.setBackground(new Color(102, 51, 51));
		 lblNewLabel_14.setForeground(Color.WHITE);
		 lblNewLabel_14.setFont(new Font("Courier New", Font.PLAIN, 25));
		 panel_3.add(lblNewLabel_14);
		
		
		
		
		
		
		 lblNewLabel_13 = new JLabel("0");
		 lblNewLabel_13.setVisible(false);
		 lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_13.setForeground(Color.WHITE);
		 lblNewLabel_13.setBackground(Color.RED);
		lblNewLabel_13.setBounds(420, 6, 19, 16);
		lblNewLabel_13.setOpaque(true);
		
		frame.getContentPane().add(lblNewLabel_13);
		lblNewLabel_13.setEnabled(false);
		chartimg= new ImageIcon(this.getClass().getResource("/add-to-cart.png")).getImage();
		
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			 if(cs.Pizza_comm.size()!=0) {
				 
				 panel_3.removeAll();
				
				 résumercommande();
				 }
				 }
			
		});
		btnNewButton_6.setIcon(new ImageIcon(chartimg));
		btnNewButton_6.setBounds(374, 4, 56, 54);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.setVisible(false);
		btnNewButton_6.setEnabled(false);
		
		commander = new JButton("VOIR LE PANIER");
		commander.setBounds(120, 550, 244, 44);
		commander.setOpaque(true);
		commander.setBorderPainted(false);
		
		commander.addMouseListener(new MouseAdapter() {
	         Color color = commander.getForeground();
	         public void mouseEntered(MouseEvent me) {
	            color = commander.getForeground();
	            commander.setForeground(Color.lightGray); 
	         }
	         public void mouseExited(MouseEvent me) {
	        	 commander.setForeground(color);
	         }
	         public void  mouseClicked(MouseEvent me) {
	        	 if(cs.Pizza_comm.size()!=0) {
	        		 panel_3.removeAll();
	        		 panel_3.revalidate();
	        		 panel_3.repaint();
	        	résumercommande();
	        	
	        	 }
	        	
	        	 

	        	 
	         }
	      });
		commander.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		commander.setBackground(new Color(0, 204, 102));
		commander.setForeground(new Color(255, 255, 255));
		commander.setFont(new Font("Arial Unicode MS", Font.BOLD, 25));
	
		
		frame.getContentPane().add(commander);
		
		commander.setEnabled(false);
		commander.setVisible(false);
		 
	
	 
		 
		 
		 
		
		 
		 
	
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 cartePizza.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		cartePizza.setPreferredSize(new Dimension( 490,3600));
		 scrollFrame = new JScrollPane(cartePizza);
		scrollFrame.setBounds(5, 58, 490, 483);
		scrollFrame.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		cartePizza.setAutoscrolls(true);
		
		cartePizza.setLayout(null);
		
		
		btnNewButton_3 = new JButton();
		btnNewButton_3.addActionListener(b3);
			
		 
		 btnNewButton_3.setBounds(6, 0, 50, 41);
		 btnNewButton_3.setIcon(new ImageIcon(back));
		 cartePizza.add(btnNewButton_3);
		
		 cp = new JLabel("LES PIZZAS",SwingConstants.CENTER);
		 cp.setBounds(0, 0, 490, 41);
		 cartePizza.add(cp);
		 cp.setOpaque(true);
		 cp.setBackground(new Color(102, 51, 51));
		 cp.setForeground(new Color(255, 255, 255));
		 cp.setFont(new Font("Courier New", Font.PLAIN, 25));
		
		
		int Y=0;
		String infos=null;
		String na=null;
		
		for(int j=1;j<=12;j++) {
			int X=0;
	    for(int k=1;k<=2;k++) {	
	    
		panelsPizza.add(new JPanel());
		panelsPizza.get(JB).setBounds(10+X, 50+Y, 225, 289);
		
		cartePizza.add(panelsPizza.get(JB));
		
		combo.add(new JComboBox<Object>(taillepizza));
		combo.get(JB).setBounds(6, 228, 112, 27);
		combo.get(JB).setAlignmentY(Component.TOP_ALIGNMENT);
		combo.get(JB).setAlignmentX(Component.LEFT_ALIGNMENT);
		combo.get(JB).setSelectedIndex(1);
		combo.get(JB).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				       temp = (Pizza) Main.class.getField("P"+(combo.indexOf(e.getSource())+1)).get(mn);
				    } catch  (Exception d)  {}
				

				if(combo.get(combo.indexOf(e.getSource())).getSelectedItem().equals(taillepizza[0]))
					prixPiz.get(combo.indexOf(e.getSource())).setText(String.format("%.2f",temp.calcul_prixPizza(0))+"€");
				if(combo.get(combo.indexOf(e.getSource())).getSelectedItem().equals(taillepizza[1]))
					prixPiz.get(combo.indexOf(e.getSource())).setText(temp.calcul_prixPizza(1)+"€");
				if(combo.get(combo.indexOf(e.getSource())).getSelectedItem().equals(taillepizza[2]))
					prixPiz.get(combo.indexOf(e.getSource())).setText(String.format("%.2f",temp.calcul_prixPizza(2))+"€");
			}
			
		});
		
		
		panelsPizza.get(JB).setLayout(null);
		
		panelsPizza.get(JB).add(combo.get(JB));
		try {
		       temp = (Pizza) Main.class.getField("P"+(JB+1)).get(mn);
		       infos=temp.AficherIngs();
		       na=temp.getNom();
		    } catch  (Exception e)  {
		      }
		
		prixPiz.add(new JLabel(temp.getPrix()+"€"));
		prixPiz.get(JB).setAlignmentX(JLabel.CENTER_ALIGNMENT);
		prixPiz.get(JB).setBounds(150,222,61,37);
		panelsPizza.get(JB).add(prixPiz.get(JB));
		desPiz.add(new JTextArea(infos));
	    
	    desPiz.get(JB).setBorder(new TitledBorder(null, na, TitledBorder.LEFT, TitledBorder.TOP, null, new Color(102, 102, 102)));
	    desPiz.get(JB).setBounds(4, 120, 221, 110);
	    desPiz.get(JB).setEditable(false);
	    
	    panelsPizza.get(JB).add(desPiz.get(JB));
		 
		
	    texts.add(new JTextField());
		texts.get(JB).setText("1");
		texts.get(JB).setHorizontalAlignment(JTextField.CENTER);
		texts.get(JB).addKeyListener(pq);
		texts.get(JB).setBounds(26, 256, 61, 37);
		panelsPizza.get(JB).add(texts.get(JB));
		texts.get(JB).setColumns(10);
		butpiz.add(new JButton("AJOUTER"));
		butpiz.get(JB).setBorderPainted(false);
		butpiz.get(JB).setForeground(new Color(255, 255, 255));
		butpiz.get(JB).setOpaque(true);
		butpiz.get(JB).setBackground(new Color(204, 0, 0));
		butpiz.get(JB).setBounds(99, 261, 99, 29);
		
		butpiz.get(JB).addMouseListener(new MouseAdapter() {
			
		     
	         public void mouseClicked(MouseEvent me) {
	        	 int ind= butpiz.indexOf(me.getSource());
	        	 int Tx=combo.get(ind).getSelectedIndex();
	        	 int Qx= Integer.valueOf(texts.get(ind).getText());
	        	 
	        	 
	  		       try {
					temp = (Pizza) Main.class.getField("P"+(ind+1)).get(mn);
					
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
						| SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    
	  		    
	        	
	            if(!(texts.get(ind).getText().isBlank())) {
	            	cs.Add_Pizza(new LignePizza(temp,Tx,Qx));
	            	
	            	lblNewLabel_13.setText(cs.Pizza_comm.size()+"");
	                
	            } 
	          
	         }
	         
	      });
		panelsPizza.get(JB).add(butpiz.get(JB));
		
		labelsPiz.add(new JLabel());
		labelsPiz.get(JB).setBounds(0, 0, 225, 115);
		piz1=new ImageIcon(this.getClass().getResource("/P"+(JB+1)+".jpg")).getImage();
		labelsPiz.get(JB).setIcon(new ImageIcon(piz1));
		
		panelsPizza.get(JB).add(labelsPiz.get(JB));
		JB++;
		X=+240;
	    }
		Y=Y+295;
		}
		
		
		scrollFrame.setEnabled(false);
		scrollFrame.setVisible(false);
		
		scrollFrameC.setEnabled(false);
		scrollFrameC.setVisible(false);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(scrollFrameC);

	    
		frame.getContentPane().add(scrollFrame);
		
		
		
		
		
		panel_1 = new JPanel(null);
		panel_1.setEnabled(false);
		panel_1.setVisible(false);
		panel_1.setBounds(0, 596, 500, 44);
		panel_1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_1);
		
		nameclient = new JLabel("");
		nameclient.setBounds(6, 0, 225, 44);
		panel_1.add(nameclient);
		
		soldeclient = new JLabel("",SwingConstants.CENTER);
		soldeclient.setBorder(new LineBorder(new Color(204, 204, 204), 2, true));
		soldeclient.setBounds(209, 0, 66, 44);
		
		soldeclient.addMouseListener(new MouseAdapter() {
	         Color color = soldeclient.getForeground();
	         public void mouseEntered(MouseEvent me) {
	            color = soldeclient.getForeground();
	            soldeclient.setForeground(Color.lightGray); 
	         }
	         public void mouseExited(MouseEvent me) {
	        	 soldeclient.setForeground(color);
	         }
	         public void mouseClicked(MouseEvent me) {
	        	 aprrov();
	         }
	         
	         
	      });
		
		panel_1.add(soldeclient);
		  logout= new ImageIcon(this.getClass().getResource("/logout-2.png")).getImage();
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setIcon(new ImageIcon(logout));
		
		btnNewButton_2.addActionListener(b2);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setBounds(428, 0, 66, 44);
			 pizzimg= new ImageIcon(this.getClass().getResource("/Pizzas.jpeg")).getImage();
			 button1 = new JButton();
			button1.setIcon(new ImageIcon(pizzimg));
			button1.addActionListener(b1);
				
			
			button1.setBounds(40, 80,400,100);
			
			boissimg= new ImageIcon(this.getClass().getResource("/Boissons.png")).getImage();
			button2=  new JButton();
			button2.setIcon(new ImageIcon(boissimg));
			button2.setBounds(40, 200, 400, 100);
			
			dessimg=new ImageIcon(this.getClass().getResource("/Desserts.jpeg")).getImage();
			button3= new JButton();
			button3.setIcon(new ImageIcon(dessimg));
			button3.setBounds(40,320,400,100);
			
			panel = new JPanel(null);
			panel.setBounds(5, 58, 490, 483);
			panel.setPreferredSize(new Dimension(490,620));
			panel.setAutoscrolls(true);
			panel.add(button1);
			panel.add(button2);
			panel.add(button3);
			
			 
			 
			 
			
			
			 lblNewLabel_9 = new JLabel("LA CARTE",SwingConstants.CENTER);
			 lblNewLabel_9.setOpaque(true);
			 lblNewLabel_9.setBackground(new Color(102, 51, 51));
			 lblNewLabel_9.setForeground(Color.WHITE);
			 lblNewLabel_9.setFont(new Font("Courier New", Font.PLAIN, 25));
			 lblNewLabel_9.setBounds(0, 0, 490, 41);
			
			 panel.add(lblNewLabel_9);
			 
			frame.getContentPane().add(panel);
			
			panel.setVisible(false);
		    panel.setEnabled(false);
		
		
		 
		lblNewLabel_3 = new JLabel("NOUVEAU");
		lblNewLabel_3.setBounds(22, 268, 105, 26);
		lblNewLabel_3.setEnabled(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setFont(new Font("Courier New", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("CLIENT?");
		lblNewLabel_4.setBounds(139, 271, 105, 21);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setFont(new Font("Courier New", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("NOM ET PRÉNOM");
		lblNewLabel_5.setBounds(10, 329, 124, 27);
		lblNewLabel_5.setEnabled(false);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(139, 326, 342, 36);
		textField.setEnabled(false);
		textField.setVisible(false);
		textField.setFont(new Font("Arial", Font.PLAIN, 22));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addKeyListener(listener);
		textField_1 = new JTextField();
		textField_1.setVisible(false);
		textField_1.setBounds(149, 383, 342, 36);
		textField_1.setEnabled(false);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		textField_1.addKeyListener(listener);
		
		
		
		lblNewLabel_6 = new JLabel("VILLE OU CODE POSTALE");
		lblNewLabel_6.setBounds(5, 383, 143, 37);
		lblNewLabel_6.setEnabled(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setVisible(false);
		
	
		textField_2.setBounds(139, 444, 342, 36);
		textField_2.setEnabled(false);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		textField_2.addKeyListener(listener);
		textField_3 = new JTextField();
		textField_3.setVisible(false);
		textField_3.setBounds(139, 505, 342, 36);
		textField_3.setEnabled(false);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		textField_3.addKeyListener(listener);
		lblNewLabel_7 = new JLabel("N° RUE");
		lblNewLabel_7.setBounds(40, 447, 60, 27);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setEnabled(false);
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("RUE");
		lblNewLabel_8.setBounds(52, 511, 34, 27);
		lblNewLabel_8.setEnabled(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_8);
		
		
		btnNewButton_1 = new JButton("S'INSCRIRE");
		btnNewButton_1.setBounds(140, 565, 233, 44);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorder(new MatteBorder(5, 5, 4, 4, (Color) new Color(0, 204, 102)));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial Unicode MS", Font.BOLD, 25));
		btnNewButton_1.setBackground(new Color(0, 204, 102));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
	         Color color = btnNewButton_1.getForeground();
	         public void mouseEntered(MouseEvent me) {
	            color = btnNewButton_1.getForeground();
	            btnNewButton_1.setForeground(Color.lightGray); 
	         }
	         public void mouseExited(MouseEvent me) {
	        	 btnNewButton_1.setForeground(color);
	         }
	      });
		btnNewButton_1.addActionListener(btn1);
		frame.getContentPane().add(btnNewButton_1);
		
		namefaux = new JLabel();
		namefaux.setBounds(139, 355, 332, 26);
		namefaux.setVisible(false);
		namefaux.setEnabled(false);
		namefaux.setText("Veuillez Saisir Un Nom Ou Un Prénom ");
		namefaux.setForeground(Color.RED);
		namefaux.setFont(new Font("Courier New", Font.PLAIN, 13));
		frame.getContentPane().add(namefaux);
		
	
		
		lblVeuillezSaisirUne = new JLabel();
		lblVeuillezSaisirUne.setBounds(142, 416, 368, 26);
		lblVeuillezSaisirUne.setEnabled(false);
		lblVeuillezSaisirUne.setVisible(false);
		lblVeuillezSaisirUne.setText("Veuillez Saisir Une Ville Ou Un Code Postale  ");
		lblVeuillezSaisirUne.setForeground(Color.RED);
		lblVeuillezSaisirUne.setFont(new Font("Courier New", Font.PLAIN, 13));
		frame.getContentPane().add(lblVeuillezSaisirUne);
		
		lblVeuillezSaisirLe = new JLabel();
		lblVeuillezSaisirLe.setBounds(142, 473, 288, 26);
		lblVeuillezSaisirLe.setVisible(false);
		lblVeuillezSaisirLe.setEnabled(false);
		lblVeuillezSaisirLe.setText("Veuillez Saisir Le Numéro De La Rue");
		lblVeuillezSaisirLe.setForeground(Color.RED);
		lblVeuillezSaisirLe.setFont(new Font("Courier New", Font.PLAIN, 13));
		frame.getContentPane().add(lblVeuillezSaisirLe);
		
		lblVeuillezSaisirLe_1 = new JLabel();
		lblVeuillezSaisirLe_1.setBounds(139, 539, 288, 26);
		lblVeuillezSaisirLe_1.setEnabled(false);
		lblVeuillezSaisirLe_1.setVisible(false);
		lblVeuillezSaisirLe_1.setText("Veuillez Saisir Le Nom De La Rue");
		lblVeuillezSaisirLe_1.setForeground(Color.RED);
		lblVeuillezSaisirLe_1.setFont(new Font("Courier New", Font.PLAIN, 13));
		frame.getContentPane().add(lblVeuillezSaisirLe_1);
		insc.setBounds(0, 0, 500, 663);
		frame.getContentPane().add(insc);
		insc.setVisible(false);
		insc.setEnabled(false);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 500, 640);
		Image background= new ImageIcon(this.getClass().getResource("/Background_Pizza.png")).getImage();
		
		
		numT = new JTextField();
		numT.setBounds(20, 355, 445, 54);
		numT.setFont(new Font(Font.DIALOG,Font.BOLD,30));
		frame.getContentPane().add(numT);
		numT.setColumns(10);
	
	
		
		lblNewLabel_1 = new JLabel("CONNEXION");
		lblNewLabel_1.setBounds(30, 319, 140, 37);
		lblNewLabel_1.setFont(new Font("Courier New", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("PAR N° DE TÉLÉPHONE:");
		lblNewLabel_2.setBounds(174, 320, 260, 37);
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(lblYes=new JLabel());
		lblYes.setBounds(30, 406, 435, 26);
		lblYes.setFont(new Font("Courier New", Font.PLAIN, 17));
		lblYes.setForeground(Color.RED);
		
		frame.getContentPane().add(numfaux=new JLabel());
		numfaux.setBounds(7, 435, 488, 26);
		numfaux.setFont(new Font("Courier New", Font.PLAIN, 13));
		numfaux.setForeground(Color.RED);
		
		
		btnNewButton = new JButton("SE CONNECTER");
		btnNewButton.setBounds(129, 486, 244, 54);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(new Color(0, 204, 102));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.BOLD, 25));
		
		btnNewButton.addMouseListener(new MouseAdapter() {
	         Color color = btnNewButton.getForeground();
	         public void mouseEntered(MouseEvent me) {
	            color = btnNewButton.getForeground();
	            btnNewButton.setForeground(Color.lightGray); 
	         }
	         public void mouseExited(MouseEvent me) {
	        	 btnNewButton.setForeground(color);
	         }
	      });
		
		
		btnNewButton.addActionListener(btn);
			
			
		frame.getContentPane().add(btnNewButton);
		dessinerRoundRectangle.setBounds(0, 0, 500, 663);
		frame.getContentPane().add(dessinerRoundRectangle);
		
		lblNewLabel.setIcon(new ImageIcon(background)) ;
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	

		 numT.addKeyListener(kn);
	         
	
	
	
	}
public void aprrov() {
		
		frameapp = new JFrame();
        frameapp.setResizable(false);
        frameapp.getContentPane().setBackground(Color.LIGHT_GRAY);
        frameapp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameapp.setSize(348,260);
        frameapp.setLocationRelativeTo(null);
		  panel_2 = new JPanel();
		    panel_2.setBounds(0, 0, 348, 252);
		    	    panel_2.setLayout(null);
		    
		    textPane = new JTextField();
		    textPane.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		    textPane.setBounds(105, 143, 148, 36);
		    textPane.setHorizontalAlignment(JTextField.CENTER);
		    textPane.addKeyListener(tk);
		    panel_2.add(textPane);
		    
		    lblNewLabel_10 = new JLabel("Saisissez votre montant:");
		    lblNewLabel_10.setBounds(6, 98, 168, 33);
		    panel_2.add(lblNewLabel_10);
		    
		    lblNewLabel_11 = new JLabel("€\n");
		    lblNewLabel_11.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		    lblNewLabel_11.setBounds(265, 143, 24, 36);
		    panel_2.add(lblNewLabel_11);
		    
		    btnNewButton_5 = new JButton("VALIDER >");
		    btnNewButton_5.setBorderPainted(false);
		    btnNewButton_5.setOpaque(true);
		    btnNewButton_5.setBackground(new Color(0, 204, 0));
		    btnNewButton_5.setForeground(new Color(255, 255, 255));
		    btnNewButton_5.setBounds(105, 191, 148, 42);
		    btnNewButton_5.addActionListener(valsol);
		    panel_2.add(btnNewButton_5);
		    
		    lblNewLabel_12 = new JLabel("APPROVISIONNER",SwingConstants.CENTER);
		    lblNewLabel_12.setBounds(0, 0, 348, 25);
		    lblNewLabel_12.setBackground(new Color(102, 51, 51));
		    lblNewLabel_12.setForeground(new Color(255, 255, 255));
		    lblNewLabel_12.setFont(new Font("Courier New", Font.PLAIN, 25));
		    lblNewLabel_12.setOpaque(true);
		    panel_2.add(lblNewLabel_12);
		    
		    frameapp.getContentPane().setLayout(null);
		    frameapp.getContentPane().add(panel_2);
		    frameapp.setVisible(true);
			frameapp.addWindowListener(win);
	
		
}




	
	private void Inscription(boolean bi ) {
		
		
	
		insc.setVisible(bi);
		insc.setEnabled(bi);
		lblNewLabel_3.setEnabled(bi);
		lblNewLabel_3.setVisible(bi);
		lblNewLabel_4.setVisible(bi);
		lblNewLabel_4.setEnabled(bi);
		lblNewLabel_5.setEnabled(bi);
		lblNewLabel_5.setVisible(bi);
		textField.setEnabled(bi);
		textField.setVisible(bi);
		textField_1.setVisible(bi);
		textField_1.setEnabled(bi);
		lblNewLabel_6.setEnabled(bi);
		lblNewLabel_6.setVisible(bi);
		textField_2.setVisible(bi);
		textField_2.setEnabled(bi);
		textField_3.setEnabled(bi);
		textField_3.setVisible(bi);
		lblNewLabel_7.setVisible(bi);
		lblNewLabel_7.setEnabled(bi);
		lblNewLabel_8.setEnabled(bi);
		lblNewLabel_8.setVisible(bi);
		btnNewButton_1.setEnabled(bi);
		btnNewButton_1.setVisible(bi);
		namefaux.setEnabled(bi);
		lblVeuillezSaisirLe.setEnabled(bi);
		
		lblVeuillezSaisirUne.setEnabled(bi);
	
		lblVeuillezSaisirLe_1.setEnabled(bi);
		}
	
	
	
	
	public void résumercommande() {
		
        panel_3.setPreferredSize(new Dimension(490,(cs.Pizza_comm.size()*200)));
   
		
		int Yc=0;
		LignePizza PL;
	
		String taille;
		for(int sp=0;sp<cs.Pizza_comm.size();sp++) {
			panelsCom.add(new JPanel());
			panelsCom.get(sp).setBounds(0, 70+Yc, 486, 80);
			panel_3.add(panelsCom.get(sp));
			panelsCom.get(sp).setLayout(null);
			
			PL=cs.Pizza_comm.get(sp);
			if(PL.getTaille()==0)
				taille="Naîne";
				else if(PL.getTaille()==1)
					taille="Hummaine";
					else
						taille="Ogresse";
			
			labelsCom.add(new JLabel("X"+PL.getQuantité()+", "+PL.getP().getNom()+", taille: "+taille+", prix: "+String.format("%.2f",PL.calcul_prixPizza())+"€"));
			labelsCom.get(sp).setFont(new Font("Monospaced", Font.PLAIN, 12));
			labelsCom.get(sp).setBounds(50, 6, 360, 64);
			labelsCom.get(sp).setBackground(Color.white);
			labelsCom.get(sp).setOpaque(true);
			labelsCom.get(sp).setHorizontalAlignment(SwingConstants.CENTER);
			
			panelsCom.get(sp).add(labelsCom.get(sp));
			
			
			Yc=Yc+80;
			
		}
		
		panelsCom.add(new JPanel());
		panelsCom.get(cs.Pizza_comm.size()).setBounds(0, 70+Yc, 486, 80);
		panel_3.add(panelsCom.get(cs.Pizza_comm.size()));
		panelsCom.get(cs.Pizza_comm.size()).setLayout(null);
		
		lblNewLabel_13.setVisible(false);
		lblNewLabel_13.setEnabled(false);
		btnNewButton_6.setVisible(false);
		btnNewButton_6.setEnabled(false);
		Carte(false);
		pizzacarte(false);
		commander.setEnabled(false);
		commander.setVisible(false);
       scrollFrameC.setVisible(true);
       scrollFrameC.setEnabled(true);
       	panel_1.setVisible(true);	
       	panel_1.setEnabled(true);
		
		btnNewButton_4.setEnabled(true);
		btnNewButton_4.setVisible(true);
	
	
		labelsCom.add(new JLabel("Total de la commmande: "+String.format("%.2f",cs.Calcul_prixComm())+" €"));
		labelsCom.get(cs.Pizza_comm.size()).setFont(new Font("Monospaced", Font.PLAIN, 12));
		labelsCom.get(cs.Pizza_comm.size()).setBounds(50, 6, 360, 64);
		labelsCom.get(cs.Pizza_comm.size()).setBackground(Color.white);
		labelsCom.get(cs.Pizza_comm.size()).setOpaque(true);
		labelsCom.get(cs.Pizza_comm.size()).setHorizontalAlignment(SwingConstants.CENTER);
		panelsCom.get(cs.Pizza_comm.size()).add(labelsCom.get(cs.Pizza_comm.size()));
	}
	
	
	

	
	
	static class DessinerRoundRectangle extends Component{
		private int X,Y,W,H;
		public DessinerRoundRectangle(int x, int y, int w , int h) {
			X=x;
			Y=y;
			W=w;
		    H=h;
		
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g) {
			 Graphics2D g2d = (Graphics2D)g;
			 g2d.setPaint(Color.white);
			 
		     g2d.setStroke(new BasicStroke(2.0f));
			 g2d.fillRoundRect(X, Y, W, H, 50, 50);
			 
			
		}
	}
	



public  boolean CheckNum() {
	 
     if(l==10 && value.startsWith("0")) 
    	 return true;
     else 
    	 return false;
}

public boolean CheckClient() {
	

	for(int i=0;i<mn.clients.size();i++)
	{
		
		
		if(value.equals(mn.clients.get(i).getNumero_de_Telephone())) {
			clind=i;
			soldeclient.setText(mn.clients.get(clind).getSolde()+"€");
			nameclient.setText(mn.clients.get(clind).getNom());
			
			cs=new Commande(mn.clients.get(clind).commandesclient.size()+1,LocalDateTime.now());
			mn.clients.get(clind).commandesclient.add(cs);
			return true;
			
			
		}
		}
	
	clind=mn.clients.size()-1;
	return false;
			
	}

public boolean CheckNameAndAdress() {
	if(textField.getText().isBlank() || textField_1.getText().isBlank() || textField_2.getText().isBlank() || textField_3.getText().isBlank())
	return false;
	else {
		cs=new Commande(mn.clients.get(clind).commandesclient.size()+1,LocalDateTime.now());
		mn.clients.get(clind).commandesclient.add(cs);
		return true;}
	
}

public void Carte(boolean b) {
	panel.setVisible(b);
	panel.setEnabled(b);
	commander.setVisible(b);
	commander.setEnabled(b);
	panel_1.setVisible(b);
	panel_1.setEnabled(b);
	lblNewLabel_13.setVisible(b);
	lblNewLabel_13.setEnabled(b);
	btnNewButton_6.setEnabled(b);
	btnNewButton_6.setVisible(b);
}
	

public void pizzacarte( boolean bp) {
	scrollFrame.getVerticalScrollBar().setValue(0);
	scrollFrame.setEnabled(bp);
	scrollFrame.setVisible(bp);
	commander.setVisible(bp);
	commander.setEnabled(bp);
	panel_1.setVisible(bp);
	panel_1.setEnabled(bp);
	lblNewLabel_13.setVisible(bp);
	lblNewLabel_13.setEnabled(bp);
	btnNewButton_6.setEnabled(bp);
	btnNewButton_6.setVisible(bp);
}
	
		
	
		

	


public void numecran(boolean b) {
    numT.setVisible(b);
	numT.setEnabled(b);
	lblNewLabel_1.setVisible(b);
	lblNewLabel_1.setEnabled(b);
	lblNewLabel_2.setVisible(b);
	lblNewLabel_2.setEnabled(b);
	lblYes.setVisible(b);
	lblYes.setEnabled(b);
	numfaux.setVisible(b);
	numfaux.setEnabled(b);
	btnNewButton.setVisible(b);
	btnNewButton.setEnabled(b);
	dessinerRoundRectangle.setVisible(b);
	dessinerRoundRectangle.setEnabled(b);
	
	
	
	
}
ActionListener btn=new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		value = numT.getText();
	      l = value.length();
	     
	      if(CheckNum()) {
	  		 numecran(false);
	  		
				if(CheckClient()) {
					
					Carte(true);
					panel_1.setEnabled(true);
					panel_1.setVisible(true);
					commander.setEnabled(true);
					commander.setVisible(true);
					btnNewButton_6.setVisible(true);
					btnNewButton_6.setEnabled(true);
					lblNewLabel_13.setVisible(true);
					lblNewLabel_13.setVisible(true);
					
				}
				else {
					mn.clients.add(new Client(value,"",""));
					clind=mn.clients.size()-1;
					Inscription(true);
					}
			
			
		}
		else {
		numfaux.setText("Veuillez saisir un numéro de téléphone valide, e.g.:06xxxxxx");	
		}
	}
	
};
ActionListener b1=new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 Carte(false);
		pizzacarte(true);
		 btnNewButton_3.setEnabled(true);
		 btnNewButton_3.setVisible(true);
		
		 
	}
	
	
	
};

	
	



ActionListener b2= new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Carte(false);
		pizzacarte(false);
		
		
        
		
		panel_1.setEnabled(false);
		panel_1.setVisible(false);
		commander.setEnabled(false);
		commander.setVisible(false);
		btnNewButton_6.setVisible(false);
		btnNewButton_6.setEnabled(false);
		lblNewLabel_13.setVisible(false);
		lblNewLabel_13.setVisible(false);
		
		scrollFrameC.setVisible(false);
		scrollFrameC.setVisible(false);
		btnNewButton_4.setVisible(false);
		btnNewButton_4.setEnabled(false);
		numecran(true);
		lblNewLabel_13.setText("0");
		
	}
	
};

ActionListener b3=new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setVisible(false);
		pizzacarte(false);
		
		Carte(true);
		
	}
	
};
KeyListener listener = new KeyAdapter() {
    public void keyPressed(KeyEvent e) {
   	 if(e.getKeyCode() == KeyEvent.VK_ENTER) { 
   		 if(CheckNameAndAdress()) {
   			 mn.clients.get(clind).setAdresse(textField_2.getText()+", "+textField_3.getText()+", "+textField_1.getText());
				 mn.clients.get(clind).setNom(textField.getText());
				
				nameclient.setText(mn.clients.get(clind).getNom());
				
				 Carte(true);
				soldeclient.setText(mn.clients.get(clind).getSolde()+"€");
				panel_1.setEnabled(true);
				panel_1.setVisible(true);
				Inscription(false);
				namefaux.setVisible(false);
				lblVeuillezSaisirUne.setVisible(false);
				lblVeuillezSaisirLe.setVisible(false);
				lblVeuillezSaisirLe_1.setVisible(false);
			}
			else
			{
				if(textField.getText().isBlank()) {
					namefaux.setEnabled(true);
				    namefaux.setVisible(true);
				    }
				if(textField_1.getText().isBlank()) {
				
				lblVeuillezSaisirUne.setVisible(true);}
				if(textField_2.getText().isBlank()) {
				lblVeuillezSaisirLe.setVisible(true);
				}
				if(textField_3.getText().isBlank()) {
				
				lblVeuillezSaisirLe_1.setVisible(true);}
			}
   	   
   	 }
   	 
    }
};

	
KeyListener  kn = new KeyAdapter() {
	public void keyPressed(KeyEvent ke) {
	if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||ke.getKeyCode() == KeyEvent.VK_SHIFT || ke.getKeyCode() == KeyEvent.VK_LEFT || ke.getKeyCode() == KeyEvent.VK_RIGHT || ke.getKeyCode() == KeyEvent.VK_UP || ke.getKeyCode() == KeyEvent.VK_DOWN  ) {
        numT.setEditable(true);
        lblYes.setText("");
        numfaux.setText("");
		}
        else if(ke.getKeyCode() == KeyEvent.VK_ENTER) { 
     	   value = numT.getText();
		      l = value.length();
		      if(CheckNum()) {
		  		 numecran(false);
		  		
					if(CheckClient()) {
						Carte(true);
						panel_1.setEnabled(true);
						panel_1.setVisible(true);
						commander.setEnabled(true);
						commander.setVisible(true);
						btnNewButton_6.setVisible(true);
						btnNewButton_6.setEnabled(true);
						lblNewLabel_13.setVisible(true);
						lblNewLabel_13.setVisible(true);
					}
					else {
						mn.clients.add(new Client(value,"",""));
						clind=mn.clients.size()-1;
						Inscription(true);
					}	
				
						
						
					
					
				}
				else {
				numfaux.setText("Veuillez saisir un numéro de téléphone valide, e.g.:06xxxxxx");	
				}
     	   }
     	   
      else {
        numT.setEditable(false);
        lblYes.setText("Entrez uniquement des chiffres numériques");
     }
	}
};


ActionListener btn1=new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(CheckNameAndAdress()) {
			mn.clients.get(clind).setAdresse(textField_2.getText()+", "+textField_3.getText()+", "+textField_1.getText());
			 mn.clients.get(clind).setNom(textField.getText());
			nameclient.setText(mn.clients.get(clind).getNom());
			
			soldeclient.setText(mn.clients.get(clind).getSolde()+"€");
			 Inscription(false);
			 namefaux.setVisible(false);
				lblVeuillezSaisirUne.setVisible(false);
				lblVeuillezSaisirLe.setVisible(false);
				lblVeuillezSaisirLe_1.setVisible(false);
			panel_1.setEnabled(true);
				panel_1.setVisible(true);
				commander.setEnabled(true);
				commander.setVisible(true);
				btnNewButton_6.setVisible(true);
				btnNewButton_6.setEnabled(true);
				lblNewLabel_13.setVisible(true);
				lblNewLabel_13.setVisible(true);
			Carte(true);
			
		}
		else
		{
			if(textField.getText().isBlank()) {
				
			    namefaux.setVisible(true);
			    }
			if(textField_1.getText().isBlank()) {
			lblVeuillezSaisirUne.setEnabled(true);
			lblVeuillezSaisirUne.setVisible(true);}
			if(textField_2.getText().isBlank()) {
			lblVeuillezSaisirLe.setVisible(true);
			lblVeuillezSaisirLe.setEnabled(true);}
			if(textField_3.getText().isBlank()) {
			lblVeuillezSaisirLe_1.setEnabled(true);
			lblVeuillezSaisirLe_1.setVisible(true);}
		}
	}
};

ActionListener valsol=new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(checkapp() ){
		mn.clients.get(clind).setSolde(Double.valueOf(textPane.getText()));
		soldeclient.setText(mn.clients.get(clind).getSolde()+"€");
		frameapp.dispose();	
		frame.setEnabled(true);} 
	}
};

ActionListener lancer=new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		
	Finally();
			}
			};

WindowListener win=new WindowAdapter() {
	public void windowOpened(WindowEvent evt)  
     {  
      frame.setEnabled(false); 
     }  
	public void windowClosing(WindowEvent evt)  
    {  
		frame.setEnabled(true); 
    }  
	
};
KeyListener  tk = new KeyAdapter() {
	public void keyPressed(KeyEvent ke) {
	if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||ke.getKeyCode() == KeyEvent.VK_SHIFT || ke.getKeyCode() == KeyEvent.VK_LEFT || ke.getKeyCode() == KeyEvent.VK_RIGHT || ke.getKeyCode() == KeyEvent.VK_UP || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyChar()=='.') 
	  textPane.setEditable(true);
	
	else if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
		if(checkapp()){
			mn.clients.get(clind).setSolde(Double.valueOf(textPane.getText()));
			soldeclient.setText(mn.clients.get(clind).getSolde()+"€");
			frameapp.dispose();	
			frame.setEnabled(true);} 
	}
	else
		textPane.setEditable(false);
	
	}};
	boolean checkapp() {
		
		for(int t=0;t<textPane.getText().length();t++) {
			
			if(textPane.getText().charAt(t) >= '0' && textPane.getText().charAt(t) <= '9')
				return true;
		}
		return false;
	}
	
	
	
				
		
	
	KeyListener pq=new KeyAdapter() {
		public void keyPressed(KeyEvent q) {
			if((q.getKeyChar() >= '1' && q.getKeyChar() <= '9') || q.getKeyCode() == KeyEvent.VK_BACK_SPACE || q.getKeyCode() == KeyEvent.VK_CAPS_LOCK ||q.getKeyCode() == KeyEvent.VK_SHIFT ||q.getKeyCode() == KeyEvent.VK_LEFT || q.getKeyCode() == KeyEvent.VK_RIGHT || q.getKeyCode() == KeyEvent.VK_UP || q.getKeyCode() == KeyEvent.VK_DOWN ){
		 
				texts.get(texts.indexOf(q.getSource())).setEditable(true);
	}
			else
				texts.get(texts.indexOf(q.getSource())).setEditable(false);
				
		}
	};
	
	
	
	
	public boolean checkcommande() {
		int i=0;
		while(i<mn.restos.size()) {
			
		        if(bol) {
		        	
		        	i++;
		        }
		        else
		        	return true;}
		  
		return false;
			
		
	}
				
	
	
	public void Finally() {
btnNewButton_7.addActionListener(rv);
 
		if(cs.Calcul_prixComm()>mn.clients.get(clind).getSolde()) 
			aprrov();
		else {
			
			Carte(false);
			pizzacarte(false);
			scrollFrameC.setEnabled(false);
			scrollFrameC.setVisible(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_4.setVisible(false);
			panel_4.setVisible(true);
			panel_4.setEnabled(true);}
		btnNewButton_9.setEnabled(true);
		btnNewButton_8.setEnabled(true);
		btnNewButton_9.setVisible(true);
		btnNewButton_8.setVisible(true);
		
		
		lblNewLabel_19.setText("Restaurant 1 ");
	
		
		
		
		
		
		btnNewButton_9.addActionListener(new ActionListener() {
			
			double somme=cs.Calcul_prixComm();
			String veh;
			Livraison L1=new Livraison((int) (Math.random()*(400-1)+1),LocalTime.now(),LocalTime.now().plusMinutes(20));
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			if(bool) {
				
				bool=false;
				lblNewLabel_17.setText("");
			
			    lblNewLabel_19.setText("");
			    btnNewButton_9.setVisible(false);
			    btnNewButton_9.setEnabled(false);
			    btnNewButton_8.setVisible(false);
			    btnNewButton_8.setEnabled(false);
			    
				
			   for(int k=0;k<cs.Pizza_comm.size();k++) {
				mn.clients.get(clind).addNbPizza(cs.Pizza_comm.get(k).getQuantité());}
			  if(mn.clients.get(clind).verifnbPizza()) {
				  lblNewLabel_16.setText("Félicitations,vous avez avez atteint 10 Pizzas achetées");
				  lblNewLabel_18.setText("On vous offre une pizza Reine gratuite");
				  mn.P2.setPrix(0.00);
				  
				  cs.Add_Pizza(new LignePizza(mn.P2,0,1));
				  
			  }
			  
			  
				
				int dd= (int) (Math.random()*(8-1)+1);
				switch(dd){
				case 1: cs.liv=mn.L1; break;
				case 2: cs.liv=mn.L2; break;
				case 3: cs.liv=mn.L3; break;
				case 4: cs.liv=mn.L4; break;
				case 5: cs.liv=mn.L5; break;
				case 6: cs.liv=mn.L6; break;
				case 7: cs.liv=mn.L7; break;
				
				}
				
				
				 
				L1.L=cs.liv;
				 
				 if(L1.L.getV()==1) {
					 veh="Moto";}
					 else {
						 veh="Voiture";
					 }
				 lblNewLabel_15.setText("Avez-vous Livré la commande");
				 lblNewLabel_19.setText("Si votre livraison dépasse les 30mns, la commande sera gratuite ");
			   
				 btnNewButton_9.setVisible(true);
				 btnNewButton_9.setEnabled(true);
			
				 
			}
			else {
				L1.setHeure_arrive(LocalTime.now());
				bol=true;
				 btnNewButton_9.setVisible(false);
				 btnNewButton_9.setEnabled(false);
			if(L1.Retard()) {
				
				lblNewLabel_15.setText("");
				 lblNewLabel_19.setText("");
				 lblNewLabel_17.setText("");
				 lblNewLabel_16.setText("La livraison a pris plus de 30mns, votre compte ne sera pas débiter ");
				 
				 
			
			
			}
			else {

				lblNewLabel_15.setText("");
				 lblNewLabel_19.setText("");
				 lblNewLabel_17.setText("");
				 lblNewLabel_16.setText("");
				mn.clients.get(clind).takeSolde(somme);
			}
			
			btnNewButton_8.setVisible(false);
			btnNewButton_8.setEnabled(false);
			lblNewLabel_18.setText("Bon appétit :)");
				
			cs.Pizza_comm.clear();
			btnNewButton_7.setVisible(true);
			btnNewButton_7.setEnabled(true);	
			mn.clients.get(clind).commandesclient.set(mn.clients.get(clind).commandesclient.size()-1, cs);
			cs=new Commande(mn.clients.get(clind).commandesclient.size()+1,LocalDateTime.now());
			mn.clients.get(clind).commandesclient.add(cs);
			}
			
		}
			
		});
			
		btnNewButton_8.addActionListener(new ActionListener() {
			int nbres=0;
		
				
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(nbres<mn.restos.size()) {
					
					nbres++;
					
			lblNewLabel_19.setText("Restaurant "+(nbres+1));
				}
				else {
					
					lblNewLabel_16.setText("Malheureusement, aucun point Rpizz peut réaliser votre commande");
					lblNewLabel_18.setText("Veuillez nous excuser pour tout inconvénient que nous avons pu causer");
					lblNewLabel_17.setVisible(false);
					lblNewLabel_19.setVisible(false);
					lblNewLabel_17.setEnabled(false);
					lblNewLabel_19.setEnabled(false);
					lblNewLabel_15.setVisible(false);
					lblNewLabel_15.setEnabled(false);
					nbres=0;
					btnNewButton_9.setEnabled(false);
					btnNewButton_8.setEnabled(false);
					btnNewButton_9.setVisible(false);
					btnNewButton_8.setVisible(false);
					btnNewButton_7.setVisible(true);
					btnNewButton_7.setEnabled(true);
					mn.clients.get(clind).commandesclient.remove(mn.clients.get(clind).commandesclient.size()-1);
					
					cs=new Commande(mn.clients.get(clind).commandesclient.size()+1,LocalDateTime.now());
					mn.clients.get(clind).commandesclient.add(cs);
				}
			
					
			}
				
			
			
			
		});

		
	}
	ActionListener rv=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			soldeclient.setText(mn.clients.get(clind).getSolde()+"€");
			Carte(true);
			panel_1.setEnabled(true);
			panel_1.setVisible(true);
			commander.setEnabled(true);
			commander.setVisible(true);
			btnNewButton_6.setVisible(true);
			btnNewButton_6.setEnabled(true);
			lblNewLabel_13.setVisible(true);
			lblNewLabel_13.setVisible(true);
			panel_4.setVisible(false);
			panel_4.setEnabled(false);
			lblNewLabel_17.setText("");
			lblNewLabel_18.setText("entrain de trouvez un point Rappiz");
			lblNewLabel_16.setText("Veuillez attendre la confirmation de votre commande...");
			lblNewLabel_19.setText("");
			lblNewLabel_15.setText("Pouvez-vous réaliser cette commande?");
			
			
		}
		};		     
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JLabel lblNewLabel_15;
double somme;

}

	

	
	
