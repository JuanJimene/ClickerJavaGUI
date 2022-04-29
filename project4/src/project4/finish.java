package project4;


import javax.swing.JFrame;


public class finish extends JFrame{
	
	Panel panel; 
	
finish(){
	
	panel = new Panel(); 
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.add(panel); 
	this.pack(); 
	this.setLocationRelativeTo(null);
	this.setVisible(true);
}
}
