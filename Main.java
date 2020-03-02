// Developed by Creighton Taylor             
import javax.swing.*;
import java.awt.*;

public class Main {
	public static final int height = 400; public static final int width = 600;
	public static void main(String[] args) {
		
		GUI window = new GUI();
		window.setVisible(true); window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(width, height); 
		
		
	}

}
