import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class SOSBoard extends JPanel{
    
	public JButton[][] buttons;
    public JLabel currentTurnLabel ;
    public JLabel invalid;
    public int n = 3;
    public String winner = null;
    public boolean isBlueS = true, isRedS = true, isBlueComputer = false, isRedComputer = false;
    public String currentPlayer = "blue";
    public String gameMode = "simple";
    public int bcounter = 0, rcounter = 0;
    public Point SOPosition;
    private ComputerPlayer cp;
    public Timer computerMoveTimer;
    public int totalCells, filledCells;
    private List<String> moveHistory;
    boolean shouldRecord = false;
    
	SOSBoard(int n){
		this.n = n;
		totalCells = 0;
		filledCells = 0;
		
		if(n <= 2) {
			invalid = new JLabel("Invalid number for board size");
		}
		setLayout(new GridLayout(n, n));
	    buttons = new JButton[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	buttons[i][j] = new JButton("");  // Create the buttons
            	add(buttons[i][j]);   // Add buttons to the boardPanel
                buttons[i][j].addActionListener(new ButtonListener(i, j));
                totalCells++;
            }
        }
        
        currentTurnLabel = new JLabel("Current turn: blue");
        SOPosition = new Point();
        cp = new ComputerPlayer();
        computerMoveTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cp.makeMove(SOSBoard.this);
                System.out.println("SOSBoard line 48");
                
            }
        });
        
        moveHistory = new ArrayList<>();
    }
	
	private class ButtonListener implements ActionListener {
        int x, y;

        ButtonListener(int i, int j) {
            this.x = i;
            this.y = j;
        }

        public void actionPerformed(ActionEvent e) {
        	
            if (buttons[x][y].getText().equals("") && winner == null) {
            	System.out.println("SOSBoard line 65");
            	if (currentPlayer.equals("blue")) {
            		if (isBlueS) {
            			buttons[x][y].setText("S");
            		}
            		else if(!isBlueS) {
            			buttons[x][y].setText("O");
            		}
            	}
            	if (currentPlayer.equals("red")) {
            		if(isRedS){
            			buttons[x][y].setText("S");
            		}
            		else if(!isRedS) {
            			buttons[x][y].setText("O");
            		}
            	}   
                
            	filledCells++;
            	checkForWin(x, y); 
            	toggleTurn();
            		
            	if ((currentPlayer.equals("red") && isRedComputer) || (currentPlayer.equals("blue") && isBlueComputer)) { 
            		 computerMoveTimer.setRepeats(false); // Execute the timer only once
            	     computerMoveTimer.start();
            	     System.out.println("SOSBoard line 90");
            	}
            	
            }
        }
    }

	private void toggleTurn() {
        if (currentPlayer.equals("blue")) {
            currentTurnLabel.setText("Current turn: red");
            currentPlayer = "red";
        } else {
            currentTurnLabel.setText("Current turn: blue");
            currentPlayer = "blue";
        }
    }
	
	public void checkForWin(int x, int y) {
		
		// record the move
    	if (shouldRecord) {
    		moveHistory.add("Player: " + currentPlayer + ", Move:[" + x + ", " + y + "], Letter: " + buttons[x][y].getText());
    	}
    	
		boolean gameIsDraw = false;
		
		 if(gameMode.equals("simple")) {
			 if (buttonCheck(buttons)) {
	            	JOptionPane.showMessageDialog(null," draw!");
	            	gameIsDraw = true;
	            }
	        if (checkDirection(x, y)) {
	            winner = currentPlayer;
	            JOptionPane.showMessageDialog(null, winner + " wins!");
	        }
	     } 
		 else if (gameMode.equals("general")) {
			 counterScore(x, y);
			 
			 if (buttonCheck(buttons)) {
				 if(bcounter > rcounter) {
					 winner = "blue";
					 JOptionPane.showMessageDialog(null, winner + " wins!");
				 }
				 else if (bcounter == rcounter) {
					 JOptionPane.showMessageDialog(null," draw!");
					 gameIsDraw = true;
				 }
				 else {
					 winner = "red";
					 JOptionPane.showMessageDialog(null, winner + " wins!");
					 }
			 }
		 }
		 
		 if (winner != null || gameIsDraw) {
			 exportGameResultToFile("SOSGameResult.txt");
		 }
	 }
	 
    public boolean checkDirection(int x, int y) {
        String text = buttons[x][y].getText();
        
        //if the input text is S, look for "OS" 
        if (text.equals("S")){
        	//right from input location
        	if(x + 1 < n && buttons[x + 1][y].getText().equals("O")) {
        		if(x + 2 < n && buttons[x + 2][y].getText().equals("S")) {return true;}
        	}
        	//left from input location
        	if(x - 1 < n && x - 1 >= 0 && buttons[x - 1][y].getText().equals("O")) {
        		if (x - 2 < n && x - 2 >= 0 && buttons[x - 2][y].getText().equals("S")) {return true;}
        	}
        	//top from input location
        	if(y + 1 < n && buttons[x][y + 1].getText().equals("O")) {
        		if (y + 2 < n && buttons[x][y + 2].getText().equals("S")) {return true;}
        	}
        	//down from input location
        	if (y - 1 < n && y - 1 >= 0 && buttons[x][y - 1].getText().equals("O")) {
        		if (y - 2 < n && y - 2 >= 0 && buttons[x][y - 2].getText().equals("S")) {return true;}
        	}
        	//top right from input location
        	if (x + 1 < n && y + 1 < n && buttons[x + 1][y + 1].getText().equals("O")) {
        		if (x + 2 < n && y + 2 < n && buttons[x + 2][y + 2].getText().equals("S")) {return true;}
        	}
        	//top left from input location
        	if (x - 1 < n && x - 1 >= 0 && y + 1 < n && buttons[x - 1][y + 1].getText().equals("O")) {
        		if (x - 2 < n && x - 2 >= 0 && y + 2 < n && buttons[x - 2][y + 2].getText().equals("S")) {return true;}
        	}
        	//down left from input location
        	if (x - 1 < n && x - 1 >= 0 && y - 1 < n && y - 1 >= 0 && buttons[x - 1][y - 1].getText().equals("O")) {
        		if (x - 2 < n && x - 2 >= 0 && y - 2 < n && y - 2 >= 0 && buttons[x - 2][y - 2].getText().equals("S")) {return true;}
        	}
        	//down right from input location
        	if (x + 1 < n && y - 1 < n && y - 1 >= 0 && buttons[x + 1][y - 1].getText().equals("O")) {
        		if (x + 2 < n && y - 2 < n && y - 2 >= 0 && buttons[x + 2][y - 2].getText().equals("S")) {return true;}
        	}
        }
        //if the input is look for "S"s
        else if (text.equals("O")) {
        	// x direction 
        	if (x - 1 < n && x - 1 >= 0 && buttons[x - 1][y].getText().equals("S")) {
        		if (x + 1 < n && buttons[x + 1][y].getText().equals("S")) {return true;}
        	}
        	// y direction
        	if (y + 1 < n && buttons[x][y + 1].getText().equals("S")) {
        		if (y - 1 < n && y - 1 >= 0 && buttons[x][y - 1].getText().equals("S")) {return true;}
        	}
        	//right inclination
        	if (x + 1 < n && y + 1 < n && buttons[x + 1][y + 1].getText().equals("S")) {
        		if (x - 1 < n && x - 1 >= 0 && y - 1 < n && y - 1 >= 0 && buttons[x - 1][y - 1].getText().equals("S")) {return true;}
        	}
        	//left inclination
        	if (x - 1 < n && x - 1 >= 0 && y + 1 < n && buttons[x - 1][y + 1].getText().equals("S")) {
        		if (x + 1 < n && y - 1 < n && y - 1 >= 0 && buttons[x + 1][y - 1].getText().equals("S")) {return true;}
        	}
        }
        
        return false;
    }
    
    public void counterScore(int x, int y) {
    	String text = buttons[x][y].getText();
        
        //if the input text is S, look for "OS" 
        if (text.equals("S")){
        	//right from input location
        	if(x + 1 < n && buttons[x + 1][y].getText().equals("O")) {
        		if(x + 2 < n && buttons[x + 2][y].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
        			else{rcounter++;}
        			}
        		}
        	}
        	//left from input location
        	if(x - 1 < n && x - 1 >= 0 && buttons[x - 1][y].getText().equals("O")) {
        		if (x - 2 < n && x - 2 >= 0 && buttons[x - 2][y].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
        			else{rcounter++;}
        		}
        	
        	}
        	//top from input location
        	if(y + 1 < n && buttons[x][y + 1].getText().equals("O")) {
        		if (y + 2 < n && buttons[x][y + 2].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
        			else{rcounter++;}
        			
        		}
        	}
        	//down from input location
        	if (y - 1 < n && y - 1 >= 0 && buttons[x][y - 1].getText().equals("O")) {
        		if (y - 2 < n && y - 2 >= 0 && buttons[x][y - 2].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
        			else{rcounter++;}
        		}
        	}
        	//top right from input location
        	if (x + 1 < n && y + 1 < n && buttons[x + 1][y + 1].getText().equals("O")) {
        		if (x + 2 < n && y + 2 < n && buttons[x + 2][y + 2].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
        			else{rcounter++;}
        		}
        	}
        	//top left from input location
        	if (x - 1 < n && x - 1 >= 0 && y + 1 < n && buttons[x - 1][y + 1].getText().equals("O")) {
        		if (x - 2 < n && x - 2 >= 0 && y + 2 < n && buttons[x - 2][y + 2].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
        			else{rcounter++;}
        		}
        	}
        	//down left from input location
        	if (x - 1 < n && x - 1 >= 0 && y - 1 < n && y - 1 >= 0 && buttons[x - 1][y - 1].getText().equals("O")) {
        		if (x - 2 < n && x - 2 >= 0 && y - 2 < n && y - 2 >= 0 && buttons[x - 2][y - 2].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
         			else{rcounter++;}
        		}
        	}
        	//down right from input location
        	if (x + 1 < n && y - 1 < n && y - 1 >= 0 && buttons[x + 1][y - 1].getText().equals("O")) {
        		if (x + 2 < n && y - 2 < n && y - 2 >= 0 && buttons[x + 2][y - 2].getText().equals("S")) {
        			if (currentPlayer.equals("blue")) {bcounter++;}
        			else{rcounter++;}
        		}
        	}
        	
        	 //if the input is look for "S"s
            else if (text.equals("O")) {
            	// x direction 
            	if (x - 1 < n && x - 1 >= 0 && buttons[x - 1][y].getText().equals("S")) {
            		if (x + 1 < n && buttons[x + 1][y].getText().equals("S")) {
            			if (currentPlayer.equals("blue")) {bcounter++;}
            			else{rcounter++;}
            		}
            	}
            	// y direction
            	if (y + 1 < n && buttons[x][y + 1].getText().equals("S")) {
            		if (y - 1 < n && y - 1 >= 0 && buttons[x][y - 1].getText().equals("S")) {
            			if (currentPlayer.equals("blue")) {bcounter++;}
            			else{rcounter++;}
            		}
            	}
            	//right inclination
            	if (x + 1 < n && y + 1 < n && buttons[x + 1][y + 1].getText().equals("S")) {
            		if (x - 1 < n && x - 1 >= 0 && y - 1 < n && y - 1 >= 0 && buttons[x - 1][y - 1].getText().equals("S")) {
            			if (currentPlayer.equals("blue")) {bcounter++;}
            			else{rcounter++;}
            		}
            	}
            	//left inclination
            	if (x - 1 < n && x - 1 >= 0 && y + 1 < n && buttons[x - 1][y + 1].getText().equals("S")) {
            		if (x + 1 < n && y - 1 < n && y - 1 >= 0 && buttons[x + 1][y - 1].getText().equals("S")) {
            			if (currentPlayer.equals("blue")) {bcounter++;}
            			else{rcounter++;}
            		}
            	}
            }
    }
                          
    public List<Point> findAllSO(){
    	List<Point> SOLocations = new ArrayList<>();
    	
    	//loop through entire board for finding SO next each other
    	for (int x = 0; x < n; x++) {
    		for (int y = 0; y < n; y++) {
    			if (hasSO(x, y)) {
    				SOLocations.add(new Point(x, y));
    				SOLocations.add(SOPosition);
                }
    		}
    	}
    	return SOLocations;
    }
    
    public boolean hasSO(int x, int y) {
    	 if (x < 0 || x >= n || y < 0 || y >= n) {
    	        // Check if the cell is out of bounds
    	        return false;
    	    }
    	 String text = buttons[x][y].getText();
    	 if ("S".equals(text)) {
    	        // Check for "SO" to the right
    	        if (x + 1 < n && "O".equals(buttons[x + 1][y].getText())) {
    	        	SOPosition.setLocation(x + 1, y);
    	            return true;
    	        }

    	        // Check for "SO" to the left
    	        if (x - 1 >= 0 && "O".equals(buttons[x - 1][y].getText())) {
    	        	SOPosition.setLocation(x - 1, y);
    	            return true;
    	        }

    	        // Check for "SO" upward
    	        if (y - 1 >= 0 && "O".equals(buttons[x][y - 1].getText())) {
    	        	SOPosition.setLocation(x, y - 1);
    	            return true;
    	        }

    	        // Check for "SO" downward
    	        if (y + 1 < n && "O".equals(buttons[x][y + 1].getText())) {
    	        	SOPosition.setLocation(x, y + 1);
    	            return true;
    	        }
    	    }

    	    return false;
    }
    
    public boolean isCellEmpty(int x, int y) {
    	//boundary check
    	if (x < 0 || x >= n || y < 0 || y >= n) {
	        // Check if the cell is out of bounds
	        return false;
	    }
    	
    	if (buttons[x][y].getText().isEmpty()) {
    		return true;
    	}
    	return false;
    }
    
	private boolean buttonCheck(JButton[][] bs) {
		int isFilled = 0;
		 for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	            	if (!bs[i][j].getText().isEmpty()) {
	            		isFilled++;
	            	}  
	            }
	        }
		 if(isFilled == n*n) {
			 return true;
		 }
		 else {return false;}
	}
	
	public void simulateButtonClick(int x, int y) {
		if (x >= 0 && x < n && y >= 0 && y < n) {
	        buttons[x][y].doClick(); 
	    }
	}
	
	public void exportGameResultToFile(String filename) {
		try (FileWriter writer = new FileWriter(filename)){
			for (String move : moveHistory) {
				writer.write(move + "\n");
			}
			writer.write("Winner: " + winner + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setRecordingOption(boolean shouldRecord) {
		this.shouldRecord = shouldRecord;
		if(shouldRecord) {
			moveHistory = new ArrayList<>(); //reset the list
		}
	}
}
