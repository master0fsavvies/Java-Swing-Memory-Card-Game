import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Rules extends JFrame implements ActionListener{
	JLabel label;
	JButton goBack;
	Rules(){
		
		this.setTitle("Rules");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420, 420);
		this.setVisible(true);
		this.setLayout(null);
		
		ImageIcon image = new ImageIcon("Big Dipper.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0, 55, 98));
		
		label = new JLabel();
		label.setText("<html>Once cards are arranged in a grid randomly, the turn player flips one card,"
	              + "and then another. <br>If the cards don’t match, both are flipped back face down and the turn ends.<br>"
	              + "If they do match, the matched cards stay face up, the turn player gets a point, and gets another turn.<br>"
	              + "The game ends when all cards are face up. The player with the most points wins.</html>");
		label.setBounds(60, 25, 300, 200);
		label.setForeground(new Color(189, 249, 255));
		this.add(label);
		
		goBack = new JButton();
		goBack.setText("Return");
		goBack.setBounds(160, 300, 100, 50);
		goBack.addActionListener(this);
		this.add(goBack);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == goBack) {
			this.dispose();
			new Menu();
		}
		
	}
}
