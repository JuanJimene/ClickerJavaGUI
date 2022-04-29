package project4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class project4GUI implements ActionListener {
	private int clicks = 0; 
	private JLabel label; 
	private JFrame frame; 
	private JPanel panel;  
	private JLabel hiscore; 
	private int hi;
	private int virus = 0; 
	private ImageIcon wow; 
	private String name;
	public project4GUI() { 
		frame = new JFrame(); 
		
		
		
		JButton button = new JButton("POKE BOB"); 
		JButton reset = new JButton("RESET"); 
		
		ImageIcon icon = new ImageIcon(getClass().getResource("output-onlinepngtools.png"));
		wow = new ImageIcon(getClass().getResource("okboi.png"));
		
		button.setBounds(100, 50, 50, 23);
		button.addActionListener(this);
		button.setFocusable(false);
		button.setIcon(icon);
		
		reset.setBackground(Color.red);
		reset.setForeground(Color.white);
		reset.setBounds(500, 50, 50, 23);
		reset.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	label.setText("Clicker: 0"); 
				      
				      System.out.println("Quitter "); 
				      if (clicks == 0) {
				      System.out.println("You can't quit if you haven't even started ... ");
				      }
				
				      clicks = 0; 
				    }
				  }
				);
		reset.setFocusable(false);
		label = new JLabel("Clicker: 0"); 
		hiscore = new JLabel("High Score: " +hi);
		
		label.setFont(new Font("Comic Sans", Font.BOLD, 20));
		hiscore.setFont(new Font ("", Font.ITALIC, 20));
		panel = new JPanel(); 
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 200, 300));
		panel.setLayout(new GridLayout(0, 1));  
		panel.add(button); 
		panel.add(reset); 
		panel.add(label); 
		panel.add(hiscore); 
		panel.setBackground(Color.cyan);
		
		
		
		frame.add(panel, BorderLayout.CENTER); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("COOL CLICKER");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		
	}

	public static void main(String[] args) {
		new project4GUI(); 

	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		clicks++; 
		label.setText("Clicker: "+clicks);
		 if (clicks > hi) {
			 hi = clicks; 
		 hiscore.setText("High score: "+hi); }
		 
		 
		if (clicks == 5) {
		System.out.println("Hello");
		int reply = JOptionPane.showConfirmDialog(null, "Do you really want to do this?", "Say no pls", JOptionPane.YES_NO_OPTION);	
		if (reply == 1) {
			JOptionPane.showMessageDialog(null, "Knew you were a quitter. ", "GG EZ", JOptionPane.PLAIN_MESSAGE);
			System.exit(0); 
			 }
		
		
		
		}                            //BOB'S DEMISE
		
		if (clicks == 15) {
			System.out.println("Only 15 clicks? Wow... ");
			JOptionPane.showMessageDialog(null, "Dont you have something better to do than click a mouse?", "...", JOptionPane.QUESTION_MESSAGE);
		}
		if (clicks == 20) {
			System.out.println("Okay, you're geting annoying.");
			JOptionPane.showMessageDialog(null, "This is getting annoying. ", "Stop", JOptionPane.INFORMATION_MESSAGE);}
		if (clicks == 25) {
			name = JOptionPane.showInputDialog("What should I call you, annoying weirdo?");}
		if (clicks == 30) { 
			JOptionPane.showMessageDialog(null, "Please shut down your computer :)", ":D", JOptionPane.PLAIN_MESSAGE);}		
		if (clicks == 40) {
			JOptionPane.showMessageDialog(null, "Fine", "...", JOptionPane.PLAIN_MESSAGE);}
		if (clicks == 50) {
			System.out.println("Can you stop."); 
			JOptionPane.showMessageDialog(null, ">:(", "...", JOptionPane.PLAIN_MESSAGE);
		}
		if (clicks == 60) {
			System.out.println("AHHHHHHHHHHHH!!!"); 
		JOptionPane.showMessageDialog(null, "Stop or I will inject a very evil virus on your computer", "STOPCLICKINGME", JOptionPane.WARNING_MESSAGE);	}		
		if (clicks == 75) {
		JOptionPane.showMessageDialog(null, "YOU SHOULD SERIOUSLY STOP", "STOP!!!!", JOptionPane.WARNING_MESSAGE);	}
		if (clicks == 85) {
			JOptionPane.showMessageDialog(null, "I warned you.", "SEARCHING //:VIRUS.EXE...", JOptionPane.WARNING_MESSAGE);	}
		if (clicks == 95) {
			JOptionPane.showMessageDialog(null, "Running VIRUS.exe", "... @USERS:"+name+"//CORRUPT/VIRUS.EXE", JOptionPane.INFORMATION_MESSAGE);	}
		if (clicks == 100) {
			while(virus < 7) {
			JOptionPane.showMessageDialog(null, "@ # Y OU HAVE A V1RUS! ! ! ", "VIRUS.EXE", JOptionPane.ERROR_MESSAGE);			
			virus = virus + 1; }}
		if (clicks == 101) { 
		JOptionPane.showOptionDialog(null, "Wow, not even scared of the virus?", ">_>", JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, wow, null, 0);	}
		if (clicks == 110) { 
			JOptionPane.showMessageDialog(null, "ARE YOU SERIOUS", "????", JOptionPane.WARNING_MESSAGE);	}
		if (clicks == 120) { 
			JOptionPane.showMessageDialog(null, "?!?!?!?!?!?!?!?!?!?", "????", JOptionPane.WARNING_MESSAGE);	}
		if (clicks == 121) { 
			JOptionPane.showMessageDialog(null, "?@#%^$#@%??#%!!?!@?!@%!@%#%!%?!@%", ":(", JOptionPane.ERROR_MESSAGE);	}
		if (clicks == 122) { 
			JOptionPane.showMessageDialog(null, "...", ":(", JOptionPane.PLAIN_MESSAGE);	}
		if (clicks == 123) { 
			JOptionPane.showMessageDialog(null, "curse..", ":(", JOptionPane.PLAIN_MESSAGE);	}
		if (clicks == 124) { 
			JOptionPane.showMessageDialog(null, "you...", ":(", JOptionPane.PLAIN_MESSAGE);	}		
		if (clicks == 125) { 
			JOptionPane.showMessageDialog(null, name+"...!!", "x_x", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "Bob has been defeated!", "You_win", JOptionPane.INFORMATION_MESSAGE);	}
		if (clicks == 125) { 
			JOptionPane.showMessageDialog(null, "Sending Bob to the hospital...", "!", JOptionPane.INFORMATION_MESSAGE);	}

		if (clicks == 125) {
			finish finish = new finish(); 
			frame.dispose(); 
		}
		   
	}
	
}


