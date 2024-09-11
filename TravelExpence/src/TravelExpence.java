import javax.swing.*;

import PropertyTax.calcButtonListener;

import java.awt.event.*;
public class TravelExpence extends JFrame{
	private JPanel panel;
	private JFrame TravelExpence;
	private JLabel daysLabel;
	private JTextField daysText;
	private JLabel planeTicketLabel;
	private JTextField planeTicketText;
	private JLabel carRentalLabel;
	private JTextField carRentalText;
	private JLabel milesLabel;
	private JTextField milesText;
	private JLabel parkingLabel;
	private JTextField parkingText;
	private JLabel taxiLabel;
	private JTextField taxiText;
	private JLabel registrationLabel;
	private JTextField registrationText;
	private JLabel hotelLabel;
	private JTextField hotelText;
	private JButton calcBotton;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 150;
	
	public TravelExpence() {
		setTitle("Travel Expence");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	private void buildPanel() {
		daysLabel = new JLabel("Enter the number of days: ");
		daysText = new JTextField(10);
		planeTicketLabel = new JLabel("Enter the amount airplane ticket: ");
		planeTicketText = new JTextField(10);
		carRentalLabel = new JLabel("Enter the car rental fee: ");
		carRentalText = new JTextField(10);
		milesLabel = new JLabel("Enter the number of miles driven for private car: ");
		milesText = new JTextField(10);
		parkingLabel = new JLabel("Enter the amount of parking fee: ");
		parkingText = new JTextField(10);
		taxiLabel = new JLabel("Enter the amount of taxi charge: ");
		taxiText = new JTextField(10);
		registrationLabel = new JLabel("Enter the amount of conference or seminar registration fee: ");
		registrationText = new JTextField(10);
		hotelLabel = new JLabel("Enter the amount of lodging charge: ");
		hotelText = new JTextField(10);
		
		calcBotton = new JButton("Calculate");
		panel = new JPanel();
		calcButtonListener action = new calcButtonListener();
		panel.add(daysLabel);
		panel.add(daysText);
		panel.add(planeTicketLabel);
		panel.add(planeTicketText);
		panel.add(carRentalLabel);
		panel.add(carRentalText);
		panel.add(milesLabel);
		panel.add(milesText);
		panel.add(parkingLabel);
		panel.add(parkingText);
		panel.add(taxiLabel);
		panel.add(taxiText);
		panel.add(registrationLabel);
		panel.add(registrationText);
		panel.add(hotelLabel);
		panel.add(hotelText);
		panel.add(calcBotton);
		calcBotton.addActionListener(action);
	}
	
	private class calcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String inpDay, inpAir, inpRent, inpMile,inpParking, inpTaxi,
				   inpReg, inpHotel;
			double days, air, rent, mile, park, taxi, reg, hotel;
			
			inp = wholeSaleTextBox.getText();
			wholeSale = Double.parseDouble(inp);
			inp2 = percentTextBox.getText();
			markup = Double.parseDouble(inp2);
			total = wholeSale + (markup * wholeSale)/100;
			JOptionPane.showMessageDialog(null, "The retail price is $" + total);
		}
}
