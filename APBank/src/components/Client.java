package components;


// 1.1.1 Creation of the client class
public class Client 
{
	private static int incrCustomerNumber = 1;
	private String name;
	private String firstName;
	private int customerNumber;
	
	public Client(String firstName, String name) 
	{
		this.firstName = firstName;
		this.name = name;
		this.customerNumber = incrCustomerNumber++;
	}

	@Override
	public String toString() {
	    return "Client{" +
	           "customerNumber=" + customerNumber +
	           ", name='" + name + '\'' +
	           ", firstName='" + firstName + '\'' +
	           '}';
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getcustomerNumber() {
		return customerNumber;
	}

	public void setcustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	
	
}
