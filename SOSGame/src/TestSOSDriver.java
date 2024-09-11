import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import org.junit.Test;

public class TestSOSDriver {

	
	@Test
	public void testBoardSize5() {
		SOSBoard board = new SOSBoard(5);
		int col = board.buttons.length;
		assertEquals(5, col);
		int row = board.buttons[0].length;
		assertEquals(5, row);
		row = board.buttons[1].length;
		assertEquals(5, row);
		row = board.buttons[2].length;
		assertEquals(5, row);
		row = board.buttons[3].length;
		assertEquals(5, row);
		row = board.buttons[4].length;
		assertEquals(5, row);
	}

	@Test
	public void testBoardSizeRow3() {
		SOSBoard board = new SOSBoard(3);
		int col = board.buttons.length;
		assertEquals(3, col);
		int row = board.buttons[0].length;
		assertEquals(3, row);
		row = board.buttons[1].length;
		assertEquals(3, row);
		row = board.buttons[2].length;
		assertEquals(3, row);
	}
	
	@Test
	public void testBoardSizeRow6() {
		SOSBoard board = new SOSBoard(6);
		int col = board.buttons.length;
		assertEquals(6, col);
		int row = board.buttons[0].length;
		assertEquals(6, row);
		row = board.buttons[1].length;
		assertEquals(6, row);
		row = board.buttons[2].length;
		assertEquals(6, row);
		row = board.buttons[3].length;
		assertEquals(6, row);
		row = board.buttons[4].length;
		assertEquals(6, row);
		row = board.buttons[5].length;
		assertEquals(6, row);
	}
	
	@Test
	public void testSimpleGameOSCheckRight1() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("S");
		board.buttons[1][0].setText("O");
		board.buttons[2][0].setText("S");
		assertEquals(true, board.checkDirection(0,0));
	}
	
	@Test
	public void testSimpleGameOSCheckRight2() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("S");
		board.buttons[1][0].setText("O");
		board.buttons[2][0].setText("O");
		assertEquals(false, board.checkDirection(0,0));
	}
	
	@Test
	public void testSimpleGameOSCheckLeft1() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("S");
		board.buttons[1][0].setText("O");
		board.buttons[2][0].setText("O");
		assertEquals(false, board.checkDirection(2,0));
	}
	
	@Test
	public void testSimpleGameOSCheckLeft2() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("S");
		board.buttons[1][0].setText("O");
		board.buttons[2][0].setText("S");
		assertEquals(true, board.checkDirection(2,0));
	}
	
	@Test
	public void testSimpleGameOSCheckTop1() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("S");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("O");
		assertEquals(false, board.checkDirection(0,0));
	}
	
	@Test
	public void testSimpleGameOSCheckTop2() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("S");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("S");
		assertEquals(true, board.checkDirection(0,2));
	}
	
	@Test
	public void testSimpleGameOSCheckTop3() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("O");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("S");
		assertEquals(false, board.checkDirection(0,2));
	}
	
	@Test
	public void testSimpleGameOSCheckDown1() {
		SOSBoard board = new SOSBoard(4);
		board.buttons[0][0].setText("S");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("S");
		assertEquals(true, board.checkDirection(0,0));
	}
	
	@Test
	public void testSimpleGameOSCheckDown2() {
		SOSBoard board = new SOSBoard(5);
		board.buttons[0][2].setText("S");
		board.buttons[0][3].setText("O");
		board.buttons[0][4].setText("O");
		assertEquals(false, board.checkDirection(0,2));
	}
	
	@Test
	public void testSimpleGameOSCheckTopright1() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[2][0].setText("S");
		board.buttons[1][1].setText("O");
		board.buttons[0][2].setText("O");
		assertEquals(false, board.checkDirection(0,2));
	}

	@Test
	public void testSimpleGameOSCheckTopright2() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[2][0].setText("S");
		board.buttons[1][1].setText("O");
		board.buttons[0][2].setText("S");
		assertEquals(true, board.checkDirection(0,2));
	}
	
	@Test
	public void testSimpleGameOSCheckDownLeft1() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[2][0].setText("S");
		board.buttons[1][1].setText("O");
		board.buttons[0][2].setText("S");
		assertEquals(true, board.checkDirection(2,0));
	}
	
	@Test
	public void testSimpleGameOSCheckTopLeft1() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("S");
		board.buttons[1][1].setText("O");
		board.buttons[2][2].setText("S");
		assertEquals(true, board.checkDirection(2,2));
	}
	
	@Test
	public void testSimpleGameOSCheckDownRight1() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("S");
		board.buttons[1][1].setText("O");
		board.buttons[2][2].setText("S");
		assertEquals(true, board.checkDirection(0,0));
	}
	
	@Test
	public void testGeneralGameOSCheckRight() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("S");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("S");
		board.counterScore(0,0);
		assertEquals(1, board.bcounter);
	}

	@Test
	public void testGeneralGameOSCheckRight2() {
		SOSBoard board = new SOSBoard(5);
		board.buttons[0][0].setText("S");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("O");
		board.counterScore(0,0);
		assertEquals(0, board.bcounter);
	}
	
	@Test
	public void testGeneralGameOSCheckLeft() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("S");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("S");
		board.counterScore(0,2);
		assertEquals(1, board.bcounter);
	}
	
	@Test
	public void testGeneralGameOSCheckLeft2() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("O");
		board.buttons[0][1].setText("O");
		board.buttons[0][2].setText("S");
		board.counterScore(0,2);
		assertEquals(0, board.bcounter);
	}
	
	@Test
	public void testGeneralGameOSCheckTopLeftandRight1() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[2][0].setText("S");
		board.buttons[1][1].setText("O");
		board.buttons[0][2].setText("S");
		board.counterScore(1,1);
		assertEquals(1, board.bcounter);
	}
	
	@Test
	public void testGeneralGameOSCheckTopLeftandRight2() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[2][0].setText("O");
		board.buttons[1][1].setText("O");
		board.buttons[0][2].setText("S");
		board.counterScore(1,1);
		assertEquals(0, board.bcounter);
	}
	
	@Test
	public void testHasSO() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("S");
		board.buttons[1][0].setText("O");
		assertEquals(true, board.hasSO(0, 0));
	}
	
	@Test
	public void testHasSO2() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("S");
		board.buttons[0][1].setText("O");
		assertEquals(true, board.hasSO(0, 0));
	}
	
	@Test
	public void testHasSO3() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("O");
		board.buttons[0][1].setText("S");
		assertEquals(true, board.hasSO(0, 1));
	}
	
	@Test
	public void testHasSO4() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("O");
		board.buttons[1][0].setText("S");
		assertEquals(true, board.hasSO(1, 0));
	}
	
	@Test
	public void testFindALLSO() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("O");
		board.buttons[0][1].setText("S");
		board.buttons[1][1].setText("S");
		
		assertEquals(2, board.findAllSO().size());
	}
	
	@Test
	public void testFindALLSO2() {
		SOSBoard board = new SOSBoard(3);
		board.buttons[0][0].setText("O");
		board.buttons[0][1].setText("S");
		board.buttons[1][0].setText("S");
		
		assertEquals(4, board.findAllSO().size());
	}
	
	@Test 
	public void testComputerMove() {
		SOSBoard board = new SOSBoard(3);
		ComputerPlayer cp = new ComputerPlayer();
		int filledCounter = 0;
		cp.makeMove(board);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!board.isCellEmpty(i, j)) {
					filledCounter++;
				}
			}
		}
		
		assertEquals(1, filledCounter);
	}
}
