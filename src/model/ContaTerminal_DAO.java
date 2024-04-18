package model;
import javax.swing.JOptionPane;

public class ContaTerminal_DAO {
	// Variables
	private int Number;
	private String Agency;
	private String ClientName;
	private double Balance;
	
	// Default constructor
	public ContaTerminal_DAO() {
		String UserInput = JOptionPane.showInputDialog(null, "Please, type the agency's number:\n");
		Agency = UserInput;
		
		UserInput = JOptionPane.showInputDialog(null, "Please, type the bank account's number:\n");
		Number = Integer.parseInt(UserInput);
		
		UserInput = JOptionPane.showInputDialog(null, "Please, type the client's name:\n");
		ClientName = UserInput;
		
		UserInput = JOptionPane.showInputDialog(null, "Please, type the account's balance:\n");
		Balance = Double.parseDouble(UserInput);
		
		JOptionPane.showMessageDialog(null, "Hello " + ClientName + ", thank you for creating an account with our bank, your agency is " + Agency + " account " + Number + " and your balance " + Balance + " is alrealdy available for withdraw");
	}
}
