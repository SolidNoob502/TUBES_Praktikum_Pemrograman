package TUBES;

import java.util.List;
import java.util.Scanner;

public class BankDemo {
	
	private static Scanner scanner = new Scanner(System.in);
    private static BankGraph bank = new BankGraph();

    public static void main(String[] args) {
    	
        transferUang();
        
    }

    private static void transferUang() {
    	
        System.out.print("Masukkan No Rek Asal: ");
        String dariNoRek = scanner.nextLine();
        
        System.out.print("Masukkan No Rek Tujuan ");
        String keNoRek = scanner.nextLine();
        
        System.out.print("Masukkan Jumlah Uang: ");
        double jumlah = scanner.nextDouble();
        
        scanner.nextLine(); // consume newline

        bank.transfer(dariNoRek, keNoRek, jumlah);
        
        List<Transaction> transactions = bank.getTransactions(dariNoRek);
        
        System.out.println("\nTransaction History for Account " + dariNoRek + ":");
        
        if (transactions.isEmpty()) {
        	
            System.out.println("Transaksi Tidak Ditemukan.");
            
        } else {
        	
            for (Transaction transaction : transactions) {
            	
                System.out.println(transaction);
                
            }
            
        }
        
    }

}
