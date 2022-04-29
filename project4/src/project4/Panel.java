package project4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Panel extends JPanel implements ActionListener{
	
	final int PANELWIDTH = 500; 
	final int PANELHEIGHT = 500; 
	Image Bob; 
	Image bcg; 
	Image dvd; 
	Timer timer; 
	int xVel = 3; 
	int yVel = 2;
	int x = 350;
	int y = 0;

	Panel() {
		
		this.setPreferredSize(new Dimension(PANELWIDTH,PANELHEIGHT));
		this.setBackground(Color.black);
		Bob = new ImageIcon(getClass().getResource("Bob.png")).getImage();
		bcg = new ImageIcon(getClass().getResource("8BitHospital.png")).getImage();
		dvd = new ImageIcon(getClass().getResource("dvdlogo.png")).getImage();
		timer = new Timer(10, this);
		timer.start();
	}

	public void paint(Graphics g) { 
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g; 
		g2d.drawImage(bcg, 0, 20, null); 
		g2d.drawImage(Bob, x, y, null); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x>=PANELWIDTH - Bob.getWidth(null) || x < 0) {
			xVel = xVel * -1; }
			x = x + xVel;
		
		if(y>=PANELWIDTH - Bob.getWidth(null) || y < 0) {
			yVel = yVel * -1; }
			y = y + yVel;
		
		
		repaint();
	
		
		
	}
	
	
}

