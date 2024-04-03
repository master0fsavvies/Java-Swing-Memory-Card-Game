import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TestGame extends JFrame implements ActionListener{
	JButton square1;
	JButton square2;
	JButton square3;
	JButton square4;
	JButton goBack;
	JButton passTurn;
	JButton reset;
	JPanel Board;
	JPanel players;
	JPanel player1;
	JPanel player2;
	JLabel p1Score;
	JLabel p2Score;
	Card[][] Grid = new Card[2][2];
	int step = 1;
	Card toMatch;
	int time = 1000;
	int player = 1;
	int p1Points = 0;
	int p2Points = 0;
	JLabel turn;
	JLabel winner;
	JLabel winner2;
	int target = 4;
	int total = 0;
	
	
	TestGame(){
		this.setTitle("Test Game");			//FRAME
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600, 540);
		this.setVisible(true);
		this.setLayout(null); 
		ImageIcon image = new ImageIcon("Big Dipper.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0, 55, 98));
		
		
		Board = new JPanel();								//BOARD
		Board.setLayout(new GridLayout(2, 2, 10, 10));
		Board.setBackground(new Color(0, 55, 98));
		Board.setBounds(0, 0, 400, 400);
		
		
		square1 = new JButton();						//BUTTONS
		square1.addActionListener(this);
		square1.setOpaque(false);
		square1.setBackground(getForeground());
		Board.add(square1);

		square2 = new JButton();
		square2.addActionListener(this);
		square2.setOpaque(false);
		square2.setBackground(getForeground());
		Board.add(square2);
		
		square3 = new JButton();
		square3.addActionListener(this);
		square3.setOpaque(false);
		square3.setBackground(getForeground());
		Board.add(square3);
		
		square4 = new JButton();
		square4.addActionListener(this);
		square4.setOpaque(false);
		square4.setBackground(getForeground());
		Board.add(square4);
		
		square1.setIcon(resizer("Cover.png"));
		square2.setIcon(resizer("Cover.png"));
		square3.setIcon(resizer("Cover.png"));
		square4.setIcon(resizer("Cover.png"));
		
		Deck deck4 = new Deck();			//INITIALIZE BOARD
		deck4.add(new Card("Big Dipper.png", null));
		deck4.add(new Card("Big Dipper.png", null));
		deck4.add(new Card("Little Dipper.png", null));
		deck4.add(new Card("Little Dipper.png", null));
		deck4.shuffle();
		
		
		Grid[0][0] = deck4.removeTopCard();			
		Grid[0][1] = deck4.removeTopCard();
		Grid[1][0] = deck4.removeTopCard();
		Grid[1][1] = deck4.removeTopCard();
		
		Grid[0][0].setButton(square1);
		Grid[0][1].setButton(square2);
		Grid[1][0].setButton(square3);
		Grid[1][1].setButton(square4);
		
		
		
		player1 = new JPanel();							//PLAYERS
		player1.setBackground(new Color(0, 0, 150));
		player1.setLayout(new GridLayout(1, 1));
		
		player2 = new JPanel();
		player2.setBackground(new Color(255, 0, 106));
		player2.setLayout(new GridLayout(1, 1));
		
		players = new JPanel();
		players.setLayout(new GridLayout(1, 2));
		players.add(player1);
		players.add(player2);
		players.setBounds(0, 400, 400, 100);
		
		p1Score = new JLabel();
		p1Score.setText("       Player 1: " + p1Points);
		p1Score.setForeground(new Color(189, 249, 255));
		player1.add(p1Score);
		
		p2Score = new JLabel();
		p2Score.setText("       Player 2: " + p1Points);
		p2Score.setForeground(new Color(189, 249, 255));
		player2.add(p2Score);
		
		turn = new JLabel();
		turn.setText("Your turn!");
		turn.setForeground(new Color(189, 249, 255));
		player1.add(turn);
		
		winner = new JLabel();
		winner.setText("You win!");
		winner.setForeground(new Color(200, 200, 255));
		winner.setFont(new Font("Arial", Font.BOLD, 16));
		
		winner2 = new JLabel();
		winner2.setText("You win!");
		winner2.setForeground(new Color(200, 200, 255));
		winner2.setFont(new Font("Arial", Font.BOLD, 16));
		
		
		this.add(Board);
		this.add(players);
		
		goBack = new JButton();
		goBack.addActionListener(this);
		goBack.setText("Return");
		goBack.setBounds(445, 425, 100, 50);
		this.add(goBack);
		
		passTurn = new JButton();
		passTurn.addActionListener(this);
		passTurn.setText("Pass Turn");
		passTurn.setBounds(445, 225, 100, 50);
		this.add(passTurn);
		
		reset = new JButton();
		reset.addActionListener(this);
		reset.setText("Reset");
		reset.setBounds(445, 325, 100, 50);
		this.add(reset);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {			//BUTTONS WHEN PRESSED
		if (e.getSource() == square1) {
			Card card = Grid[0][0];
	        cardFlip(square1, card);
	    } 
		else if (e.getSource() == square2) {
	        Card card = Grid[0][1];
	        cardFlip(square2, card);
	    } 
	    else if (e.getSource() == square3) {
	        Card card = Grid[1][0];
	        cardFlip(square3, card);
	    } 
	    else if (e.getSource() == square4) {
	        Card card = Grid[1][1];
	        cardFlip(square4, card);
	    }
	    else if(e.getSource() == goBack) {
			this.dispose();
			new Menu();
		}
	    else if(e.getSource() == passTurn) {
	    	if(player == 1) {
    			player = 2;
    			player1.remove(turn);
    			player2.add(turn);
    		}
            else if(player == 2) {
    			player = 1;
    			player2.remove(turn);
    			player1.add(turn);
    		}
            
            player1.revalidate();
            player1.repaint();
            player2.revalidate();
            player2.repaint();
	    }
	    else if(e.getSource() == reset) {
			this.dispose();
			new TestGame();
		}
	}
	
	
	
	
	public ImageIcon resizer(String x) {
		ImageIcon original = new ImageIcon(x);
		Image pic = original.getImage();
		Image resizedImage = pic.getScaledInstance(200, 200, pic.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		return resizedIcon;
	}
	public void cardFlip(JButton button, Card card) {
        if(step == 1 && !card.getFaceUp()) {			//IF first card, flip and wait
        	button.setIcon(resizer(card.getPicture()));
        	card.setFaceUp(true);
        	step = 2;
        	toMatch = card;
        }
        else if(step == 2 && !card.getFaceUp() && toMatch != card) {  //IF second card, flip then...
        	button.setIcon(resizer(card.getPicture()));
        	card.setFaceUp(true);
        	if(card.getPicture().equals(toMatch.getPicture())) {	//IF same, match.
        		step = 1;
        		if(player == 1) {
        			p1Points = p1Points + 2;
        			total = total + 2;
        			p1Score.setText("       Player 1: " + p1Points);
        		}
        		if(player == 2) {
        			p2Points = p2Points + 2;
        			total = total + 2;
        			p2Score.setText("       Player 1: " + p2Points);
        		}
        		
        		if(total == target) {
                	player1.remove(turn);
                	player2.remove(turn);
                	if(p1Points == p2Points) {
                		winner.setText("Tie!");
                		winner2.setText("Tie!");
                		player1.add(winner);
                		player2.add(winner2);
                	}
                	else if(p1Points > p2Points) {
                		player1.add(winner);
                	}
                	else if(p1Points < p2Points) {
                		player2.add(winner2);
                	}
                }
        		player1.revalidate();
                player1.repaint();
                player2.revalidate();
                player2.repaint();
        	}
        	else{
        		card.setFaceUp(false);			//ELSE flip back and pass.
                toMatch.setFaceUp(false);
        		Timer timer = new Timer(time, new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        button.setIcon(resizer("Cover.png"));
                        toMatch.getButton().setIcon(resizer("Cover.png"));
                        step = 1;
                        if(player == 1) {
                			player = 2;
                			player1.remove(turn);
                			player2.add(turn);
                		}
                        else if(player == 2) {
                			player = 1;
                			player2.remove(turn);
                			player1.add(turn);
                		}
                        
                        player1.revalidate();
                        player1.repaint();
                        player2.revalidate();
                        player2.repaint();
                    }
                });
                timer.setRepeats(false);
                timer.start();
        	}
        }
	}
}
