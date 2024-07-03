package components;

import components.Client;
import components.Flow;

// 1.2.1 Creation of the account class

public abstract class Account 
{
	private static int incrAccountNumber = 1;
	private String label;
	private double balance;
	private int accountNumber;
	private Client client;
	
	public Account(String label,Client client)
	{
		this.label = label;
		this.client = client;
		this.balance = 0.0;
		this.accountNumber = incrAccountNumber++;		
	}
	
	@Override
	public String toString() {
	    return "Account{" +
	           "accountNumber=" + accountNumber +
	           ", balance='" + balance + '\'' +
	           ", label='" + label + '\'' +
	           '}';
	}

	public static int getIncrAccountNumber() {
		return incrAccountNumber;
	}

	public static void setIncrAccountNumber(int incrAccountNumber) {
		Account.incrAccountNumber = incrAccountNumber;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance, Flow flow) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
