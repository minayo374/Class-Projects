
import javax.swing.*;
import java.awt.event.*;
public class RetailPricaCalculator extends JFrame{
	private JPanel panel;
	private JFrame retailPriceFrame;
	private JLabel wholeSaleLabel;
	private JTextField wholeSaleTextBox;
	private JLabel percetLabel;
	private JTextField percentTextBox;
	private JButton calcBotton;
	private final int WINDOW_WIDTH = 510;
	private final int WINDOW_HEIGHT = 550;
	
	public RetailPricaCalculator() {
		setTitle("Retail Price Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel() {
		wholeSaleLabel = new JLabel("Enter the wholesale cost: ");
		wholeSaleTextBox = new JTextField(10);
		percetLabel = new JLabel("Enter the markup percentage");
		percentTextBox = new JTextField(10);
		calcBotton = new JButton("Calculate");
		panel = new JPanel();
		calcButtonListener action = new calcButtonListener();
		panel.add(wholeSaleLabel);
		panel.add(wholeSaleTextBox);
		panel.add(percetLabel);
		panel.add(percentTextBox);
		panel.add(calcBotton);
		calcBotton.addActionListener(action);
	}
	
	private class calcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String inp;
			String inp2;
			double wholeSale;
			double markup;
			double total;
			
			inp = wholeSaleTextBox.getText();
			wholeSale = Double.parseDouble(inp);
			inp2 = percentTextBox.getText();
			markup = Double.parseDouble(inp2);
			total = wholeSale + (markup * wholeSale)/100;
			JOptionPane.showMessageDialog(null, "The retail price is $" + total);
		}
	}
	
	public static void main(String[] arg) {
		new RetailPricaCalculator();
	}
}