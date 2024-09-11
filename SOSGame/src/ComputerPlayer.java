import java.util.Random;
import java.util.List;
import java.awt.Point;

public class ComputerPlayer {
	private Random random;
	
	
	ComputerPlayer(){
		random = new Random();
	}
	
	public void makeMove(SOSBoard board) {
		
		int boardSize = board.n;
		Point potentialWin = null;
		boolean moveMade = false;
		if (board.totalCells == board.filledCells) {
			return;
		}
		while (!moveMade) {
			//check if there is SO on the board for finding winning opportunity
			if (!board.findAllSO().isEmpty()) {
				
				potentialWin = SOcheck(board);
				
				if (potentialWin != null ) {
					int potenrialWinX = (int)potentialWin.getX();
					int potentialWinY = (int)potentialWin.getY();
					if (board.isCellEmpty(potenrialWinX, potentialWinY)) {
						clickCell(board, potentialWin);
						break;
					}
				}
			}
			//pick random location 
			
			boolean cellDecision = false;
			while(board.winner == null && !cellDecision) {
				int x = random.nextInt(boardSize);
				int y = random.nextInt(boardSize);
				System.out.println("ComputerPlayer line 21");
				int randomSO = random.nextInt(2);
				//check if the board is empty
				if (board.isCellEmpty(x, y)) {
					if (board.currentPlayer.equals("red")) {
						if (randomSO == 0) {
							board.isRedS = true;
						}
						else if (randomSO == 1) {
							board.isRedS = false;
						}
					}
					if (board.currentPlayer.equals("blue")){
						if (randomSO == 0) {
							board.isBlueS = true;
						}
						else if (randomSO == 1) {
							board.isBlueS = false;
						}
					}
					board.simulateButtonClick(x, y);
					cellDecision = true;
				}
			}
			moveMade = true;
			System.out.println("ComputerPlayer line 62");
		}
	}
	
	public Point SOcheck(SOSBoard board) {
		List<Point> SOlocations = board.findAllSO();
		Point tempS = null;
		Point tempO = null;
		Point S = null;
		int sX = 0, sY = 0;
		//if (board.isCellEmpty(x, y)) {
		//clickCell(board, x, y);
		while (S == null && !board.isCellEmpty(sX, sY)) {
			for (int i = 0; i < SOlocations.size(); i++) {
			
				if (i == 0 || i % 2 == 0) {
					tempS = SOlocations.get(i);
				}
				else {tempO = SOlocations.get(i);}
			
				if (tempO != null) {
					S = findSLocation(tempS, tempO);
					sX = (int)S.getX();
					sY = (int)S.getY();
				}
			}
		}
		return S;
	}
	
	private void clickCell(SOSBoard board, Point point) {		
		int x = (int)point.getX();
		int y = (int)point.getY();
		
		if (board.currentPlayer.equals("red")) {
			board.isRedS = true;
		}
		if (board.currentPlayer.equals("blue")){
			board.isBlueS = true;
		}
		board.simulateButtonClick(x, y);		
	}
	
	//return point next SO
	private Point findSLocation(Point s, Point o) {
		int x = 0;
		int y = 0;
		
		if (s.getX() < o.getX()) {
			
			x = (int)o.getX() + 1;
			y = (int)o.getY();
		}
		if (s.getX() > o.getX()) {
			
			x = (int)o.getX() - 1;
			y = (int)o.getY();
		}
		if (s.getY() < o.getY()) {
			
			x = (int)o.getX();
			y = (int)o.getY() + 1;					
		}
		if (s.getY() > o.getY()) {
			
			x = (int)o.getX();
			y = (int)o.getY() - 1;					
		}
		
		Point pointO = new Point(x, y);
		return pointO;
	}
}
