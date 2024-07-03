package components;

import components.Client;

public abstract class Account 
{
	private static int incrAccountNumber = 1;
	private String label;
	private String balance;
	private int accountNumber;
	private Client client;
	
	public Account(String label,Client client)
	{
		this.label = label;
		this.client = client;
		this.balance = balance;
		this.accountNumber = incrAccountNumber++;		
	}
	
	public class SavingsAccount extends Account 
	{
	    public SavingsAccount(String label, Client client) 
	    {
	        super(label, client);
	    }
	}
	
	public class CurrentAccount extends Account 
	{
	    public CurrentAccount(String label, Client client) 
	    {
	        super(label, client);
	    }
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

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
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
