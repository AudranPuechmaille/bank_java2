package mainPack;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

import components.Account;
import components.Client;
import components.SavingsAccount;
import components.CurrentAccount;
import components.Transfert;
import components.Debit;
import components.Credit;

// 1.1.2 Creation of main class for tests

public class main_bank 
{
	private static List<Client> clients;
	private static List<Account> accounts;
	 
	public static void main(String[] args)
	{
		clients = loadClients(2);
		displayClients(clients);
		
		accounts = loadAccounts(clients);
        displayAccounts(accounts);
        
        List<Flow> flows = loadFlows(accounts);
        updateBalances(flows, createAccountTable(accounts));
	}
	
	// Méthode qui génère le nombre d'objets clients-test passé en paramètre de la méthode. 
	
	public static List<Client> loadClients(int numberOfClients)
	{
		List<Client> clients = new ArrayList<>();
		
		for(int i = 1; i <= numberOfClients; i++)
		{
			clients.add(new Client("Firstname" + i, "Name" + i));
		}
		
		return clients;
	}
	
	// Méthode qui affiche les données de l'ArrayList contenant les clients.
	
	public static void displayClients(List<Client> clients)
	{
		String clientsString = clients.stream()
				.map(Client::toString)
				.collect(Collectors.joining("\n"));
		
		System.out.println(clientsString);
	}
	

    // Méthode qui génère les comptes pour chaque client.
    public static List<Account> loadAccounts(List<Client> clients) {
        List<Account> accounts = new ArrayList<>();

        for (Client client : clients) {
            accounts.add(new SavingsAccount("Savings Account", client));
            accounts.add(new CurrentAccount("Current Account", client));
        }

        return accounts;
    }

    // Méthode qui affiche les données de l'ArrayList contenant les comptes.
    public static void displayAccounts(List<Account> accounts) {
        String accountsString = accounts.stream()
                .map(Account::toString)
                .collect(Collectors.joining("\n"));

        System.out.println("Accounts:");
        System.out.println(accountsString);
    }
    
    // Méthode qui crée une Hashtable à partir de la liste de comptes.
    public static Hashtable<Integer, Account> createAccountTable(List<Account> accounts) 
    {
        // Création d'une nouvelle Hashtable qui va contenir les comptes.
        Hashtable<Integer, Account> accountTable = new Hashtable<>();

        // Parcours de la liste d'objets Account fournie en paramètre.
        for (Account account : accounts) {
            // Ajout de chaque compte dans la Hashtable, en utilisant son numéro de compte comme clé.
            accountTable.put(account.getAccountNumber(), account);
        }

        // Retourne la Hashtable contenant tous les comptes.
        return accountTable;
    }

    // Méthode pour afficher la Hashtable triée par solde croissant.
    public static void displayAccountTable(Hashtable<Integer, Account> accountTable) 
    {
        // Utilisation d'un stream pour trier les valeurs de la Hashtable par solde croissant.
        String sortedAccountsString = accountTable.values().stream()
                .sorted((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()))
                .map(Account::toString) // Conversion de chaque Account en sa représentation textuelle.
                .collect(Collectors.joining("\n")); // Concaténation des représentations en une chaîne.

        // Affichage des comptes triés par solde croissant.
        System.out.println("Sorted Accounts by Balance:");
        System.out.println(sortedAccountsString);
    }
	
	
	
	
}
