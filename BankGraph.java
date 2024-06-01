package TUBES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankGraph {
	
	private Map<String, List<Transaction>> transactions;

    public BankGraph() {
    	
        transactions = new HashMap<>();
        
    }

    public void transfer(String dariNoRek, String keNoRek, double jumlah) {
    	
        Transaction transaction = new Transaction(dariNoRek, keNoRek, jumlah);
        transactions.computeIfAbsent(dariNoRek, k -> new ArrayList<>()).add(transaction);
        transactions.computeIfAbsent(keNoRek, k -> new ArrayList<>()).add(transaction);
        
    }

    public List<Transaction> getTransactions(String noRek) {
    	
        return transactions.getOrDefault(noRek, new ArrayList<>());
        
    }

}
