import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame implements ActionListener{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel mainc;
 JRadioButton[] R = new JRadioButton[12];
 JLabel[] l = new JLabel[5];
 JTextField[] Tx = new JTextField[3];
 static JButton[] B = new JButton[3];
 double Nr[] = new double[14];
 
 
 double Total , Pay , Change;
 String Tot,Pay2,Change2;
 JTextField[] DS = new JTextField[12];
public Test(){
	getContentPane().setLayout(null);
	
mainc = new JLabel("Welcome to Sandwich Store");
mainc.setBounds(130,40,600,50);
mainc.setFont(new Font("Tohama",Font.BOLD,40));
getContentPane().add(mainc);

DS[0] = new JTextField("");
DS[0].setBounds(335,210,50,40);
DS[0].setText("   0");
DS[0].setEnabled(false);
DS[0].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[0]);

DS[1] = new JTextField("");
DS[1].setBounds(335,260,50,40);
DS[1].setText("   0");
DS[1].setEnabled(false);
DS[1].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[1]);

DS[2] = new JTextField("");
DS[2].setBounds(335,310,50,40);
DS[2].setText("   0");
DS[2].setEnabled(false);
DS[2].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[2]);

DS[3] = new JTextField("");
DS[3].setBounds(335,360,50,40);
DS[3].setText("   0");
DS[3].setEnabled(false);
DS[3].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[3]);

DS[4] = new JTextField("");
DS[4].setBounds(335,410,50,40);
DS[4].setText("   0");
DS[4].setEnabled(false);
DS[4].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[4]);

DS[5] = new JTextField("");
DS[5].setBounds(335,460,50,40);
DS[5].setText("   0");
DS[5].setEnabled(false);
DS[5].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[5]);

//Drink
DS[6] = new JTextField("");
DS[6].setBounds(645,210,50,40);
DS[6].setText("   0");
DS[6].setEnabled(false);
DS[6].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[6]);

DS[7] = new JTextField("");
DS[7].setBounds(645,260,50,40);
DS[7].setText("   0");
DS[7].setEnabled(false);
DS[7].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[7]);

DS[8] = new JTextField("");
DS[8].setBounds(645,310,50,40);
DS[8].setText("   0");
DS[8].setEnabled(false);
DS[8].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[8]);

DS[9] = new JTextField("");
DS[9].setBounds(645,360,50,40);
DS[9].setText("   0");
DS[9].setEnabled(false);
DS[9].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[9]);

DS[10] = new JTextField("");
DS[10].setBounds(645,410,50,40);
DS[10].setText("   0");
DS[10].setEnabled(false);
DS[10].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[10]);

DS[11] = new JTextField("");
DS[11].setBounds(645,460,50,40);
DS[11].setText("   0");
DS[11].setEnabled(false);
DS[11].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(DS[11]);

//Drink2
l[0] = new JLabel("Drinks");
l[0].setBounds(190,130,200,50);
l[0].setFont(new Font("Tohama",Font.BOLD,35));
getContentPane().add(l[0]);

R[0] = new JRadioButton(" Coffee");
R[0].setBounds(145,205,180,50);
R[0].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[0]);

R[1] = new JRadioButton(" Tea");
R[1].setBounds(145,255,180,50);
R[1].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[1]);

R[2] = new JRadioButton(" Cola");
R[2].setBounds(145,305,180,50);
R[2].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[2]);

R[3] = new JRadioButton(" MilkShake");
R[3].setBounds(145,355,180,50);
R[3].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[3]);

R[4] = new JRadioButton(" CoffeeShake");
R[4].setBounds(145,405,180,50);
R[4].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[4]);

R[5] = new JRadioButton(" TeaCoffee");
R[5].setBounds(145,455,180,50);
R[5].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[5]);

//Sandwich
l[1] = new JLabel("Sandwich");
l[1].setBounds(470,130,200,50);
l[1].setFont(new Font("Tohama",Font.BOLD,35));
getContentPane().add(l[1]);

R[6] = new JRadioButton(" Muffin");
R[6].setBounds(435,205,180,50);
R[6].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[6]);

R[7] = new JRadioButton(" Bufferl");
R[7].setBounds(435,255,180,50);
R[7].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[7]);

R[8] = new JRadioButton(" Bickit");
R[8].setBounds(435,305,180,50);
R[8].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[8]);

R[9] = new JRadioButton(" Hamburger");
R[9].setBounds(435,355,180,50);
R[9].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[9]);

R[10] = new JRadioButton(" Cake");
R[10].setBounds(435,405,180,50);
R[10].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[10]);

R[11] = new JRadioButton(" ChocolateCake");
R[11].setBounds(435,455,180,50);
R[11].setFont(new Font("Tohama",Font.BOLD,20));
getContentPane().add(R[11]);

//LineRec
l[2] = new JLabel();
l[2].setBorder(BorderFactory.createLineBorder(Color.BLUE));
l[2].setFont(new Font("Tohama", Font.BOLD, 20));
l[2].setBounds(120, 200, 270, 320);
getContentPane().add(l[2]);

l[3] = new JLabel();
l[3].setBorder(BorderFactory.createLineBorder(Color.RED));
l[3].setFont(new Font("Tohama", Font.BOLD, 20));
l[3].setBounds(430, 200, 270, 320);
getContentPane().add(l[3]);

l[4] = new JLabel();
l[4].setBorder(BorderFactory.createLineBorder(Color.RED));
l[4].setFont(new Font("Tohama", Font.BOLD, 20));
l[4].setBounds(120, 530, 580, 80);
getContentPane().add(l[4]);
//Button1
B[0] = new JButton("Pay");
B[0].setFont(new Font("Tohama", Font.BOLD, 20));
B[0].setEnabled(false);
B[0].setBounds(370,630,100,50);
getContentPane().add(B[0]);


B[2] = new JButton("Exit");
B[2].setFont(new Font("Tohama", Font.BOLD, 20));
B[2].setBounds(600,630,100,50);
getContentPane().add(B[2]);

JLabel T = new JLabel("Total : ");
T.setFont(new Font("Tohama", Font.BOLD, 25));
T.setBounds(125,550,200,50);
getContentPane().add(T);

Tx[0] = new JTextField();
Tx[0].setFont(new Font("Tohama",Font.BOLD,20));
Tx[0].setBounds(203,555,100,40);
Tx[0].setEditable(false);
getContentPane().add(Tx[0]);

JLabel T1 = new JLabel("Pay : ");
T1.setFont(new Font("Tohama",Font.BOLD,25));
T1.setBounds(310,550,200,50);
getContentPane().add(T1);

Tx[1] = new JTextField();
Tx[1].setFont(new Font("Tohama",Font.BOLD,20));
Tx[1].setEnabled(false);
Tx[1].setBounds(375,555,100,40);
getContentPane().add(Tx[1]);

JLabel T2 = new JLabel("Change : ");
T2.setFont(new Font("Tohama",Font.BOLD,25));
T2.setBounds(480,550,200,50);
getContentPane().add(T2);

Tx[2] = new JTextField();
Tx[2].setFont(new Font("Tohama",Font.BOLD,20));
Tx[2].setBounds(595,555,100,40);
Tx[2].setEditable(false);
getContentPane().add(Tx[2]);

R[0].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[0].isSelected()){
			  DS[0].setText("   1");
		  }
		 else if(!R[0].isSelected()){
			 DS[0].setText("   0");
			 DS[0].setEnabled(false);
	  }
	}
});

R[1].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[1].isSelected()){
			  DS[1].setText("   1");
		  }
		 if(!R[1].isSelected()){
			 DS[1].setText("   0");
			 DS[1].setEnabled(false);
	  }
	}
});

R[2].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[2].isSelected()){
			  DS[2].setText("   1");
		  }
		 else if(!R[2].isSelected()){
			 DS[2].setText("   0");
			 DS[2].setEnabled(false);
	  }
	}
});

R[3].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[3].isSelected()){
			  DS[3].setText("   1");
		  }
		 else if(!R[3].isSelected()){
			  DS[3].setText("   0");
			  DS[3].setEnabled(false);
	  }
	}
});

R[4].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		if(R[4].isSelected()){
			  DS[4].setText("   1");
		  }
		else if(!R[4].isSelected()){
			 DS[4].setText("   0");
			 DS[4].setEnabled(false);
	  }
	}
});

R[5].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[5].isSelected()){
			  DS[5].setText("   1");
		  }
		 else if(!R[5].isSelected()){
			 DS[5].setText("   0");
			 DS[5].setEnabled(false);
	  }
	}
});

R[6].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
	      if(R[6].isSelected()){
			  DS[6].setText("   1");
		  }
	      else if(!R[6].isSelected()){
	    	  DS[6].setText("   0");
			  DS[6].setEnabled(false);
		
	  }
	}
});

R[7].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[7].isSelected()){
			  DS[7].setText("   1");
		  }
		 else if(!R[7].isSelected()){
			 DS[7].setText("   0");
			 DS[7].setEnabled(false);
	  }
	}
});

R[8].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		if(R[8].isSelected()){
			  DS[8].setText("   1");
		  }
		else if(!R[8].isSelected()){
			 DS[8].setText("   0");
			 DS[8].setEnabled(false);
	  }
	}
});

R[9].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[9].isSelected()){
			  DS[9].setText("   1");
		  }
		 else if(!R[9].isSelected()){
			 DS[9].setText("   0");
			 DS[9].setEnabled(false);
	  }
	}
});

R[10].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[10].isSelected()){
			  DS[10].setText("   1");
		 }
		 else if(!R[10].isSelected()){
			 DS[10].setText("   0");
			 DS[10].setEnabled(false);
	  }
	}
});

R[11].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 if(R[11].isSelected()){
			  DS[11].setText("   1");
		  }
		 else if(!R[11].isSelected()){
			 DS[11].setText("   0");
			 DS[11].setEnabled(false);
	  }
	}
});


B[1] = new JButton("Total");
B[1].setFont(new Font("Tohama", Font.BOLD, 20));
B[1].setBounds(120,630,100,50);
getContentPane().add(B[1]);

B[1].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		 	
		Nr[0] = Double.parseDouble(DS[0].getText());
		Nr[1] = Double.parseDouble((DS[1].getText()));
		Nr[2] = Double.parseDouble((DS[2].getText()));
		Nr[3] = Double.parseDouble((DS[3].getText()));
		Nr[4] = Double.parseDouble((DS[4].getText()));
	    Nr[5] = Double.parseDouble((DS[5].getText()));
	    Nr[6] = Double.parseDouble(DS[6].getText());
		Nr[7] = Double.parseDouble((DS[7].getText()));
		Nr[8] = Double.parseDouble((DS[8].getText()));
		Nr[9] = Double.parseDouble((DS[9].getText()));
		Nr[10] = Double.parseDouble((DS[10].getText()));
	    Nr[11] = Double.parseDouble((DS[11].getText()));
	    
	    Total = ((Nr[0]*1.75) + (Nr[1]*2.00) + (Nr[2]*2.00)
	    		+(Nr[3]*3.00) + (Nr[4]*6.00) + (Nr[5]*3.00)
	    		+(Nr[6]*2.00) + (Nr[7]*5.00) + (Nr[8]*3.00)
	    		+(Nr[9]*3.00) + (Nr[10]*2.00) + (Nr[11]*3.00));
	    
	    Tot = String.format("%.2f", Total);
	    Tx[0].setText(Tot);
	    Nr[12] = Double.parseDouble((Tx[0].getText()));
	    if(Nr[12] <= 0.00){
			JOptionPane.showMessageDialog(null, "Please to select buy a goods at least one pieces ");
			
		}
	    else{
	    	B[0].setEnabled(true);
	    	Tx[1].setEnabled(true);
	    }
	}
});

B[0].addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		if(Tx[1].getText().equals("")){
		Nr[13] = 0;
		}
		else {
			Nr[13] = Double.parseDouble((Tx[1].getText()));
		}
		
		
		 	
		Pay = -Total + Nr[13] ;
		Pay2 = String.format("%.2f", Pay);
		
		  if(Nr[12] > Nr[13] ){
			  JOptionPane.showMessageDialog(null, "Sorry,You don't have enough money. ");
			  Tx[2].setText("");
		  }
		  else{
		    	JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
		    	Tx[2].setText(Pay2);
		    }
	}
	});
}
	
	public static void main(String[] args) {
		
		Test n = new Test();
		n.setTitle("Sandwich");
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n.setVisible(true);
		n.setSize(800,800);
		n.setResizable(false);
		n.setLocation(602,100);
		
		B[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				 int result = JOptionPane.showConfirmDialog(n,
				            "Do you want to Exit ?", "Exit Confirmation : ",
				            JOptionPane.YES_NO_OPTION);
				        if (result == JOptionPane.YES_OPTION)
				          n.setVisible(false);
				        else if (result == JOptionPane.NO_OPTION)
				          n.setVisible(true);			
			}
		});
	}

	public void paint(Graphics g){
		super.paint(g);
	     g.setColor(Color.black);
		 g.drawRect(100, 150, 630, 600);
		
	}
	@Override
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
