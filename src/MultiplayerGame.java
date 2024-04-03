import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
public class MultiplayerGame extends JFrame implements ActionListener{
	JButton square1;
	JButton square2;
	JButton square3;
	JButton square4;
	JButton square5;
	JButton square6;
	JButton square7;
	JButton square8;
	JButton square9;
	JButton square10;
	JButton square11;
	JButton square12;
	JButton square13;
	JButton square14;
	JButton square15;
	JButton square16;
	JButton square17;
	JButton square18;
	JButton square19;
	JButton square20;
	JButton square21;
	JButton square22;
	JButton square23;
	JButton square24;
	JButton square25;
	JButton square26;
	JButton square27;
	JButton square28;
	JButton square29;
	JButton square30;
	JButton square31;
	JButton square32;
	JButton square33;
	JButton square34;
	JButton square35;
	JButton square36;
	JButton goBack;
	JButton passTurn;
	JButton reset;
	JPanel Board;
	JPanel players;
	JPanel player1;
	JPanel player2;
	JLabel p1Score;
	JLabel p2Score;
	Card[][] Grid = new Card[6][6];
	int step = 1;
	Card toMatch;
	int time = 1000;
	int player = 1;
	int p1Points = 0;
	int p2Points = 0;
	JLabel turn;
	JLabel winner;
	JLabel winner2;
	int target = 36;
	int total = 0;
	int rows = 6;
	int cols = 6;
	JLabel picture;
	
	MultiplayerGame(){
		this.setTitle("Multiplayer Game");			//FRAME
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600, 540);
		this.setVisible(true);
		this.setLayout(null); 
		ImageIcon image = new ImageIcon("Big Dipper.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0, 55, 98));
		
		picture = new JLabel();
		picture.setBounds(400, 75, 200, 175);
		picture.setIcon(resizer2("cat-dog-astronauts-background-globe-elements-image-furnished-nasa-cat-dog-astronauts-112510243.jpg"));
		this.add(picture);
		
		Board = new JPanel();								//BOARD
		Board.setLayout(new GridLayout(6, 6, 10, 10));
		Board.setBackground(new Color(0, 55, 98));
		Board.setBounds(0, 0, 400, 400);
		
		
		square1 = new JButton();
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

		square5 = new JButton();
		square5.addActionListener(this);
		square5.setOpaque(false);
		square5.setBackground(getForeground());
		Board.add(square5);

		square6 = new JButton();
		square6.addActionListener(this);
		square6.setOpaque(false);
		square6.setBackground(getForeground());
		Board.add(square6);

		square7 = new JButton();
		square7.addActionListener(this);
		square7.setOpaque(false);
		square7.setBackground(getForeground());
		Board.add(square7);

		square8 = new JButton();
		square8.addActionListener(this);
		square8.setOpaque(false);
		square8.setBackground(getForeground());
		Board.add(square8);

		square9 = new JButton();
		square9.addActionListener(this);
		square9.setOpaque(false);
		square9.setBackground(getForeground());
		Board.add(square9);

		square10 = new JButton();
		square10.addActionListener(this);
		square10.setOpaque(false);
		square10.setBackground(getForeground());
		Board.add(square10);

		square11 = new JButton();
		square11.addActionListener(this);
		square11.setOpaque(false);
		square11.setBackground(getForeground());
		Board.add(square11);

		square12 = new JButton();
		square12.addActionListener(this);
		square12.setOpaque(false);
		square12.setBackground(getForeground());
		Board.add(square12);

		square13 = new JButton();
		square13.addActionListener(this);
		square13.setOpaque(false);
		square13.setBackground(getForeground());
		Board.add(square13);

		square14 = new JButton();
		square14.addActionListener(this);
		square14.setOpaque(false);
		square14.setBackground(getForeground());
		Board.add(square14);

		square15 = new JButton();
		square15.addActionListener(this);
		square15.setOpaque(false);
		square15.setBackground(getForeground());
		Board.add(square15);

		square16 = new JButton();
		square16.addActionListener(this);
		square16.setOpaque(false);
		square16.setBackground(getForeground());
		Board.add(square16);

		square17 = new JButton();
		square17.addActionListener(this);
		square17.setOpaque(false);
		square17.setBackground(getForeground());
		Board.add(square17);

		square18 = new JButton();
		square18.addActionListener(this);
		square18.setOpaque(false);
		square18.setBackground(getForeground());
		Board.add(square18);

		square19 = new JButton();
		square19.addActionListener(this);
		square19.setOpaque(false);
		square19.setBackground(getForeground());
		Board.add(square19);

		square20 = new JButton();
		square20.addActionListener(this);
		square20.setOpaque(false);
		square20.setBackground(getForeground());
		Board.add(square20);

		square21 = new JButton();
		square21.addActionListener(this);
		square21.setOpaque(false);
		square21.setBackground(getForeground());
		Board.add(square21);

		square22 = new JButton();
		square22.addActionListener(this);
		square22.setOpaque(false);
		square22.setBackground(getForeground());
		Board.add(square22);

		square23 = new JButton();
		square23.addActionListener(this);
		square23.setOpaque(false);
		square23.setBackground(getForeground());
		Board.add(square23);

		square24 = new JButton();
		square24.addActionListener(this);
		square24.setOpaque(false);
		square24.setBackground(getForeground());
		Board.add(square24);

		square25 = new JButton();
		square25.addActionListener(this);
		square25.setOpaque(false);
		square25.setBackground(getForeground());
		Board.add(square25);

		square26 = new JButton();
		square26.addActionListener(this);
		square26.setOpaque(false);
		square26.setBackground(getForeground());
		Board.add(square26);

		square27 = new JButton();
		square27.addActionListener(this);
		square27.setOpaque(false);
		square27.setBackground(getForeground());
		Board.add(square27);

		square28 = new JButton();
		square28.addActionListener(this);
		square28.setOpaque(false);
		square28.setBackground(getForeground());
		Board.add(square28);

		square29 = new JButton();
		square29.addActionListener(this);
		square29.setOpaque(false);
		square29.setBackground(getForeground());
		Board.add(square29);

		square30 = new JButton();
		square30.addActionListener(this);
		square30.setOpaque(false);
		square30.setBackground(getForeground());
		Board.add(square30);

		square31 = new JButton();
		square31.addActionListener(this);
		square31.setOpaque(false);
		square31.setBackground(getForeground());
		Board.add(square31);

		square32 = new JButton();
		square32.addActionListener(this);
		square32.setOpaque(false);
		square32.setBackground(getForeground());
		Board.add(square32);

		square33 = new JButton();
		square33.addActionListener(this);
		square33.setOpaque(false);
		square33.setBackground(getForeground());
		Board.add(square33);

		square34 = new JButton();
		square34.addActionListener(this);
		square34.setOpaque(false);
		square34.setBackground(getForeground());
		Board.add(square34);

		square35 = new JButton();
		square35.addActionListener(this);
		square35.setOpaque(false);
		square35.setBackground(getForeground());
		Board.add(square35);

		square36 = new JButton();
		square36.addActionListener(this);
		square36.setOpaque(false);
		square36.setBackground(getForeground());
		Board.add(square36);
		
		square1.setIcon(resizer("Cover.png"));
		square2.setIcon(resizer("Cover.png"));
		square3.setIcon(resizer("Cover.png"));
		square4.setIcon(resizer("Cover.png"));
		square5.setIcon(resizer("Cover.png"));
		square6.setIcon(resizer("Cover.png"));
		square7.setIcon(resizer("Cover.png"));
		square8.setIcon(resizer("Cover.png"));
		square9.setIcon(resizer("Cover.png"));
		square10.setIcon(resizer("Cover.png"));
		square11.setIcon(resizer("Cover.png"));
		square12.setIcon(resizer("Cover.png"));
		square13.setIcon(resizer("Cover.png"));
		square14.setIcon(resizer("Cover.png"));
		square15.setIcon(resizer("Cover.png"));
		square16.setIcon(resizer("Cover.png"));
		square17.setIcon(resizer("Cover.png"));
		square18.setIcon(resizer("Cover.png"));
		square19.setIcon(resizer("Cover.png"));
		square20.setIcon(resizer("Cover.png"));
		square21.setIcon(resizer("Cover.png"));
		square22.setIcon(resizer("Cover.png"));
		square23.setIcon(resizer("Cover.png"));
		square24.setIcon(resizer("Cover.png"));
		square25.setIcon(resizer("Cover.png"));
		square26.setIcon(resizer("Cover.png"));
		square27.setIcon(resizer("Cover.png"));
		square28.setIcon(resizer("Cover.png"));
		square29.setIcon(resizer("Cover.png"));
		square30.setIcon(resizer("Cover.png"));
		square31.setIcon(resizer("Cover.png"));
		square32.setIcon(resizer("Cover.png"));
		square33.setIcon(resizer("Cover.png"));
		square34.setIcon(resizer("Cover.png"));
		square35.setIcon(resizer("Cover.png"));
		square36.setIcon(resizer("Cover.png"));
		
		Deck deck36 = new Deck();			
		deck36.add(new Card("Big Dipper.png", null)); //1
		deck36.add(new Card("Big Dipper.png", null)); //2
		deck36.add(new Card("Little Dipper.png", null)); //3
		deck36.add(new Card("Little Dipper.png", null)); //4
		deck36.add(new Card("Aquarius.png", null)); //5
		deck36.add(new Card("Aquarius.png", null)); //6
		deck36.add(new Card("Sirius.png", null)); //7
		deck36.add(new Card("Sirius.png", null)); //8
		deck36.add(new Card("Draco.png", null)); //9
		deck36.add(new Card("Draco.png", null)); //10
		deck36.add(new Card("Ophiuchus.png", null)); //11
		deck36.add(new Card("Ophiuchus.png", null)); //12
		deck36.add(new Card("Gemini.png", null)); //13
		deck36.add(new Card("Gemini.png", null)); //14
		deck36.add(new Card("Taurus.png", null)); //15
		deck36.add(new Card("Taurus.png", null)); //16
		deck36.add(new Card("Pisces.png", null)); //17
		deck36.add(new Card("Pisces.png", null)); //18
		deck36.add(new Card("Capricornus.png", null)); //19
		deck36.add(new Card("Capricornus.png", null)); //20
		deck36.add(new Card("Sagittarius.png", null)); //21
		deck36.add(new Card("Sagittarius.png", null)); //22
		deck36.add(new Card("Scorpius.png", null)); //23
		deck36.add(new Card("Scorpius.png", null)); //24
		deck36.add(new Card("Virgo.png", null)); //25
		deck36.add(new Card("Virgo.png", null)); //26
		deck36.add(new Card("Leo.png", null)); //27
		deck36.add(new Card("Leo.png", null)); //28
		deck36.add(new Card("Cancer.png", null)); //29
		deck36.add(new Card("Cancer.png", null)); //30
		deck36.add(new Card("Libra.png", null)); //31
		deck36.add(new Card("Libra.png", null)); //32
		deck36.add(new Card("Aries.png", null)); //33
		deck36.add(new Card("Aries.png", null)); //34
		deck36.add(new Card("Cygnus.png", null)); //35	
		deck36.add(new Card("Cygnus.png", null)); //36
		deck36.shuffle();
		
		for (int row = 0; row < rows; row++) {
	        for (int col = 0; col < cols; col++) {
	            Grid[row][col] = deck36.removeTopCard();
	        }
		}
		
		Grid[0][0].setButton(square1);
		Grid[0][1].setButton(square2);
		Grid[0][2].setButton(square3);
		Grid[0][3].setButton(square4);
		Grid[0][4].setButton(square5);
		Grid[0][5].setButton(square6);
		Grid[1][0].setButton(square7);
		Grid[1][1].setButton(square8);
		Grid[1][2].setButton(square9);
		Grid[1][3].setButton(square10);
		Grid[1][4].setButton(square11);
		Grid[1][5].setButton(square12);
		Grid[2][0].setButton(square13);
		Grid[2][1].setButton(square14);
		Grid[2][2].setButton(square15);
		Grid[2][3].setButton(square16);
		Grid[2][4].setButton(square17);
		Grid[2][5].setButton(square18);
		Grid[3][0].setButton(square19);
		Grid[3][1].setButton(square20);
		Grid[3][2].setButton(square21);
		Grid[3][3].setButton(square22);
		Grid[3][4].setButton(square23);
		Grid[3][5].setButton(square24);
		Grid[4][0].setButton(square25);
		Grid[4][1].setButton(square26);
		Grid[4][2].setButton(square27);
		Grid[4][3].setButton(square28);
		Grid[4][4].setButton(square29);
		Grid[4][5].setButton(square30);
		Grid[5][0].setButton(square31);
		Grid[5][1].setButton(square32);
		Grid[5][2].setButton(square33);
		Grid[5][3].setButton(square34);
		Grid[5][4].setButton(square35);
		Grid[5][5].setButton(square36);
		
		
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
		    Card card = Grid[0][2];
		    cardFlip(square3, card);
		} 
		else if (e.getSource() == square4) {
		    Card card = Grid[0][3];
		    cardFlip(square4, card);
		}
		else if (e.getSource() == square5) {
		    Card card = Grid[0][4];
		    cardFlip(square5, card);
		}
		else if (e.getSource() == square6) {
		    Card card = Grid[0][5];
		    cardFlip(square6, card);
		}
		else if (e.getSource() == square7) {
		    Card card = Grid[1][0];
		    cardFlip(square7, card);
		}
		else if (e.getSource() == square8) {
		    Card card = Grid[1][1];
		    cardFlip(square8, card);
		}
		else if (e.getSource() == square9) {
		    Card card = Grid[1][2];
		    cardFlip(square9, card);
		}
		else if (e.getSource() == square10) {
		    Card card = Grid[1][3];
		    cardFlip(square10, card);
		}
		else if (e.getSource() == square11) {
		    Card card = Grid[1][4];
		    cardFlip(square11, card);
		}
		else if (e.getSource() == square12) {
		    Card card = Grid[1][5];
		    cardFlip(square12, card);
		}
		else if (e.getSource() == square13) {
		    Card card = Grid[2][0];
		    cardFlip(square13, card);
		}
		else if (e.getSource() == square14) {
		    Card card = Grid[2][1];
		    cardFlip(square14, card);
		}
		else if (e.getSource() == square15) {
		    Card card = Grid[2][2];
		    cardFlip(square15, card);
		}
		else if (e.getSource() == square16) {
		    Card card = Grid[2][3];
		    cardFlip(square16, card);
		}
		else if (e.getSource() == square17) {
		    Card card = Grid[2][4];
		    cardFlip(square17, card);
		}
		else if (e.getSource() == square18) {
		    Card card = Grid[2][5];
		    cardFlip(square18, card);
		}
		else if (e.getSource() == square19) {
		    Card card = Grid[3][0];
		    cardFlip(square19, card);
		}
		else if (e.getSource() == square20) {
		    Card card = Grid[3][1];
		    cardFlip(square20, card);
		}
		else if (e.getSource() == square21) {
		    Card card = Grid[3][2];
		    cardFlip(square21, card);
		}
		else if (e.getSource() == square22) {
		    Card card = Grid[3][3];
		    cardFlip(square22, card);
		}
		else if (e.getSource() == square23) {
		    Card card = Grid[3][4];
		    cardFlip(square23, card);
		}
		else if (e.getSource() == square24) {
		    Card card = Grid[3][5];
		    cardFlip(square24, card);
		}
		else if (e.getSource() == square25) {
		    Card card = Grid[4][0];
		    cardFlip(square25, card);
		}
		else if (e.getSource() == square26) {
		    Card card = Grid[4][1];
		    cardFlip(square26, card);
		}
		else if (e.getSource() == square27) {
		    Card card = Grid[4][2];
		    cardFlip(square27, card);
		}
		else if (e.getSource() == square28) {
		    Card card = Grid[4][3];
		    cardFlip(square28, card);
		}
		else if (e.getSource() == square29) {
		    Card card = Grid[4][4];
		    cardFlip(square29, card);
		}
		else if (e.getSource() == square30) {
		    Card card = Grid[4][5];
		    cardFlip(square30, card);
		}
		else if (e.getSource() == square31) {
		    Card card = Grid[5][0];
		    cardFlip(square31, card);
		}
		else if (e.getSource() == square32) {
		    Card card = Grid[5][1];
		    cardFlip(square32, card);
		}
		else if (e.getSource() == square33) {
		    Card card = Grid[5][2];
		    cardFlip(square33, card);
		}
		else if (e.getSource() == square34) {
		    Card card = Grid[5][3];
		    cardFlip(square34, card);
		}
		else if (e.getSource() == square35) {
		    Card card = Grid[5][4];
		    cardFlip(square35, card);
		}
		else if (e.getSource() == square36) {
		    Card card = Grid[5][5];
		    cardFlip(square36, card);
		}
	    else if(e.getSource() == goBack) {
			this.dispose();
			new Menu();
		}
	    else if(e.getSource() == reset) {
			this.dispose();
			new MultiplayerGame();
		}
	}
	
	
	
	
	public ImageIcon resizer(String x) {
		ImageIcon original = new ImageIcon(x);
		Image pic = original.getImage();
		Image resizedImage = pic.getScaledInstance(50, 50, pic.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		return resizedIcon;
	}
	public ImageIcon resizer2(String x) {
		ImageIcon original = new ImageIcon(x);
		Image pic = original.getImage();
		Image resizedImage = pic.getScaledInstance(200, 175, pic.SCALE_SMOOTH);
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
        			p2Score.setText("       Player 2: " + p2Points);
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
