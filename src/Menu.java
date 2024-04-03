import javax.sound.sampled.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{
	JButton testGame;
	JButton multGame;
	JButton rules;
	JButton singleGame;
	JLabel picture;

	Menu() {
		testGame = new JButton();
		testGame.setText("Test Game");
		testGame.setBounds(200, 50, 100, 50);
		testGame.addActionListener(this);
		
		multGame = new JButton();
		multGame.setText("Multiplayer Game");
		multGame.setBounds(225, 125, 150, 50);
		multGame.addActionListener(this);
		
		singleGame = new JButton();
		singleGame.setText("SinglePlayer Game");
		singleGame.setBounds(225, 200, 150, 50);
		singleGame.addActionListener(this);
		
		rules = new JButton();
		rules.setText("Rules");
		rules.setBounds(200, 275, 100, 50);
		rules.addActionListener(this);
		
		
		picture = new JLabel();
		picture.setIcon(resizer2("tjxLg2V.jpg"));
		picture.setBounds(10, 100, 175, 175);
		
		
		this.setTitle("Memory");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420, 420);
		this.setVisible(true);
		this.setLayout(null);
		this.add(testGame);
		this.add(multGame);
		this.add(rules);
		this.add(singleGame);
		this.add(picture);
		
		ImageIcon image = new ImageIcon("Big Dipper.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0, 55, 98));
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == rules) {
			this.dispose();
			new Rules();
		}
		else if(e.getSource() == testGame) {
			this.dispose();
			new TestGame();
		}
		else if(e.getSource() == multGame) {
			this.dispose();
			new MultiplayerGame();
		}
		else if(e.getSource() == singleGame) {
			this.dispose();
			new SinglePlayer();
		}
	}
	
	public ImageIcon resizer2(String x) {
		ImageIcon original = new ImageIcon(x);
		Image pic = original.getImage();
		Image resizedImage = pic.getScaledInstance(200, 175, pic.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		return resizedIcon;
	}
}