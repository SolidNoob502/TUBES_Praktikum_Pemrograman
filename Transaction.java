package TUBES;

import java.util.Date;

public class Transaction {
	
	private String dariNoRek;
    private String keNoRek;
    private double jumlah;
    private Date timestamp;

    public Transaction(String dariNoRek, String keNoRek, double jumlah) {
    	
        this.dariNoRek = dariNoRek;
        this. keNoRek = keNoRek;
        this.jumlah = jumlah;
        this.timestamp = new Date(); // Set tanggal dan waktu transaksi saat objek dibuat
        
    }

    public String getDariNoRek() {
    	
        return dariNoRek;
        
    }

    public String getKeNoRek() {
    	
        return keNoRek;
        
    }

    public double getJumlah() {
    	
        return jumlah;
        
    }

    public Date getTimestamp() {
    	
        return timestamp;
        
    }

    @Override
    public String toString() {
    	
        return "Transaction [From: " + dariNoRek + ", To: " + keNoRek +
                ", Amount: " + jumlah + ", Timestamp: " + timestamp + "]";
        
    }

}
