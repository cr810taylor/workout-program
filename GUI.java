// Creighton Taylor
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
		JPanel panel;
		JLabel stitle,btitle,dtitle;	JLabel ttitle;
		JTextField sfield,bfield,dfield;	JTextField tfield;
	
		public GUI()
		{
			super("Workout Program");
			panel = new JPanel(); panel.setLayout(null); add(panel);
			stitle = new JLabel("SQUAT MAX");  stitle.setBounds(50,25,100,100);
			btitle = new JLabel("BENCH MAX"); btitle.setBounds(50,75,100,100);
			dtitle = new JLabel("DEADLIFT MAX"); dtitle.setBounds(50, 125, 100,100);
			ttitle = new JLabel("TYPE"); ttitle.setBounds(50,175,100,100);
			panel.add(stitle); panel.add(btitle); panel.add(dtitle); panel.add(ttitle);
			
			
			
		}
		private class thehandler implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				String string = "";
				if(event.getSource()==sfield)
				{
					string = String.format("field 1: %s",event.getActionCommand());
				}
				else if(event.getSource()==bfield)
				{
					string = String.format("field 2: %s",event.getActionCommand());
				}
				else if(event.getSource()==dfield)
				{
					string = String.format("field 3: %s",event.getActionCommand());
				}
				else if(event.getSource()==tfield)
				{
					string = String.format("password field is : %s",event.getActionCommand());
				}
				
				// JOptionPane.showMessageDialog(null,string);  // use to show the output
			}
		}
}

