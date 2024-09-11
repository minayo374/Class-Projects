import javax.swing.*;
import java.awt.event.*;

public class PropertyTax extends JFrame{
	private JPanel panel;
	private JFrame PropertyTax;
	private JLabel valueLabel;
	private JTextField valueText;
	private JButton calcBotton;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 150;
	private double PROPERTY_TAX = 0.6;
	
	public PropertyTax(){
		setTitle("Monthly Sales Tax Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	private void buildPanel() {
		valueLabel = new JLabel("Enter the sales for a month: ");
		valueText = new JTextField(10);
		calcBotton = new JButton("Calculate");
		panel = new JPanel();
		calcButtonListener action = new calcButtonListener();
		panel.add(valueLabel);
		panel.add(valueText);
		panel.add(calcBotton);
		calcBotton.addActionListener(action);
	}
	private class calcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String inp;
			double value, propertyTax, assesmemt;
			
			inp = valueText.getText();
			value = Double.parseDouble(inp);
			propertyTax = value * PROPERTY_TAX;
			assesmemt = propertyTax / 100 * 0.64;
			JOptionPane.showMessageDialog(null, "Property tax is $" + propertyTax +
												"\nAssesment tax is $" + assesmemt);
		}
		
	}
	public static void main (String[] arg) {
		new PropertyTax();
	}
}
