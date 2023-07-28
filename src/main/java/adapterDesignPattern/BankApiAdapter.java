package main.java.adapterDesignPattern;

public interface BankApiAdapter {

    public String transfer(String from, String to, double amount);

    public double checkBalance(String userDetails);

    public boolean authenticate(String userDetails);
}
