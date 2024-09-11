import javax.swing.*;
import java.awt.event.*;
public class MonthlySalesTax extends JFrame{
	private JPanel panel;
	private JFrame MonthlySalesTax;
	private JLabel saleLabel;
	private JTextField saleText;
	private JButton calcBotton;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 150;
	private double COUNTRY_TAX = 0.02;
	private double STATE_TAX = 0.04;
	
	public MonthlySalesTax(){
		setTitle("Monthly Sales Tax Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	private void buildPanel() {
		saleLabel = new JLabel("Enter the sales for a month: ");
		saleText = new JTextField(10);
		calcBotton = new JButton("Calculate");
		panel = new JPanel();
		calcButtonListener action = new calcButtonListener();
		panel.add(saleLabel);
		panel.add(saleText);
		panel.add(calcBotton);
		calcBotton.addActionListener(action);
	}
	private class calcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String inp;
			double sale;
			double countryTax, stateTax, total;
			
			inp = saleText.getText();
			sale = Double.parseDouble(inp);
			countryTax = sale * COUNTRY_TAX;
			stateTax = sale * STATE_TAX;
			total = countryTax + stateTax;
			JOptionPane.showMessageDialog(null, "Country tax is $" + countryTax +
												"\nState tax is $" + stateTax +
												"\nTotal tax is $" + total);
		}
	}
	
	public static void main(String[] arg) {
		new MonthlySalesTax();
	}
}
