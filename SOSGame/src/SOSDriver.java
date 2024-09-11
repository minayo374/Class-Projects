
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SOSDriver implements ActionListener{
    private JFrame frame;
    private JRadioButton blueS, blueO, redS, redO, simpleGame, generalGame, blueHuman, blueComputer, redHuman, redComputer;
    private JTextField boardSize;
    private SOSBoard boardPanel;
    private int n = 3;
    private JButton newBoard;
    private JCheckBox recordGameCheckBox;
    

    public SOSDriver() {
        frame = new JFrame("SOS Game");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        boardPanel = new SOSBoard(n);
        
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("SOS"));
        
        simpleGame = new JRadioButton("Simple game", true);
        generalGame = new JRadioButton("General game");
        ButtonGroup gameModeGroup = new ButtonGroup();
        
        gameModeGroup.add(simpleGame);
        gameModeGroup.add(generalGame);
        topPanel.add(simpleGame);
        topPanel.add(generalGame);
        
        topPanel.add(new JLabel("Board size"));
        boardSize = new JTextField(2);
        boardSize.setText(String.valueOf(n));
        
        recordGameCheckBox = new JCheckBox("Record Game");
        topPanel.add(recordGameCheckBox);
        
        newBoard = new JButton("New Game");
        newBoard.addActionListener(this);
        
        topPanel.add(boardSize);
        topPanel.add(newBoard);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 1));
        leftPanel.add(new JLabel("Blue player"));
        
        blueHuman = new JRadioButton("Human", true);
        blueComputer = new JRadioButton("Computer");
        blueS = new JRadioButton("S", true);
        blueO = new JRadioButton("O");
        
        ButtonGroup blueGroup = new ButtonGroup();
        ButtonGroup bluePlayer = new ButtonGroup();
        
        bluePlayer.add(blueHuman);
        bluePlayer.add(blueComputer);
        blueGroup.add(blueS);
        blueGroup.add(blueO);
        
        leftPanel.add(blueHuman);
        leftPanel.add(blueS);
        leftPanel.add(blueO);
        leftPanel.add(blueComputer);
        
        blueHuman.addActionListener(new RadioButtonListener());
        blueComputer.addActionListener(new RadioButtonListener());
        blueS.addActionListener(new RadioButtonListener());
        blueO.addActionListener(new RadioButtonListener());

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(5, 1));
        rightPanel.add(new JLabel("Red player"));
        
        redHuman = new JRadioButton("Human", true);
        redComputer = new JRadioButton("Computer");
        redS = new JRadioButton("S", true);
        redO = new JRadioButton("O");
        
        ButtonGroup redPlayer = new ButtonGroup();
        ButtonGroup redGroup = new ButtonGroup();
        
        redPlayer.add(redHuman);
        redPlayer.add(redComputer);
        redGroup.add(redS);
        redGroup.add(redO);
        
        rightPanel.add(redHuman);
        rightPanel.add(redS);
        rightPanel.add(redO);
        rightPanel.add(redComputer);
        
        redHuman.addActionListener(new RadioButtonListener());
        redComputer.addActionListener(new RadioButtonListener());
        redS.addActionListener(new RadioButtonListener());
        redO.addActionListener(new RadioButtonListener());

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(boardPanel, BorderLayout.CENTER);
        frame.add(boardPanel.currentTurnLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    
        
    

    private class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	if (e.getSource() == simpleGame) {
               boardPanel.gameMode = "simple";
            } else if (e.getSource() == generalGame) {
                boardPanel.gameMode = "general";
            }

            // Handle player selection
            if (e.getSource() == blueS) {
                boardPanel.isBlueS = true;
            } else if (e.getSource() == blueO) {
                boardPanel.isBlueS = false;
            } else if (e.getSource() == redS) {
                boardPanel.isRedS = true;
            } else if (e.getSource() == redO) {
                boardPanel.isRedS = false;
            }
            
            if (e.getSource() == redComputer) {
            	boardPanel.isRedComputer = true;
            } else if (e.getSource() == blueComputer) {
            	boardPanel.isBlueComputer = true;
            	boardPanel.computerMoveTimer.setRepeats(false); // Execute the timer only once
            	boardPanel.computerMoveTimer.start();
            } else if (e.getSource() == redHuman) {
            	boardPanel.isRedComputer = false;
            } else if (e.getSource() == blueHuman) {
            	boardPanel.isBlueComputer = false;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newBoard) {
            try {
                int newSize = Integer.parseInt(boardSize.getText());
                if (newSize > 2) {
                    // Update the board size and reset the game
                    n = newSize;
                    frame.remove(boardPanel); // Remove the current board panel
                    frame.remove(boardPanel.currentTurnLabel);
                    boardPanel = new SOSBoard(n); // Create a new board panel with the updated size
                    
                    //set the recording option based on the checkbox
                    boolean recordGame = recordGameCheckBox.isSelected();
                    boardPanel.setRecordingOption(recordGame);
                    
                    frame.add(boardPanel, BorderLayout.CENTER); // Add the new board panel to the frame
                    frame.add(boardPanel.currentTurnLabel, BorderLayout.SOUTH);
                    frame.revalidate(); // Refresh the frame to reflect the changes
                    blueS.setSelected(true);
                    redS.setSelected(true);
                    boardPanel.bcounter = 0;
                    boardPanel.rcounter = 0;
                    if (simpleGame.isSelected()) {
                    	boardPanel.gameMode = "simple";
                    }
                    else if (generalGame.isSelected()) {
                    	boardPanel.gameMode = "general";
                    }
                    
                    if (redComputer.isSelected()) {
                    	boardPanel.isRedComputer = true;
                    } else if (blueComputer.isSelected()) {
                    	boardPanel.isBlueComputer = true;
                    	boardPanel.computerMoveTimer.setRepeats(false); // Execute the timer only once
                    	boardPanel.computerMoveTimer.start();
                    }
                    
                } else {
                    // Display an error message for invalid board size
                    JOptionPane.showMessageDialog(frame, "Invalid board size. Please enter a value greater than 2.");
                }
            } catch (NumberFormatException ex) {
                // Handle the case where the input is not a valid integer
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid integer for board size.");
            }
        }
    }
    
   
public static void main (String[] args) {
	new SOSDriver();
}
}
    
   
   