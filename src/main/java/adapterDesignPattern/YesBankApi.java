package main.java.adapterDesignPattern;

public class YesBankApi {

    public char transferAmount(String from, String to, int amount){
        System.out.println("Amount transferred");
        return 'D';
    }

    public int checkBalance(String accountDetails){
        System.out.println("Balance eligible");
        return 1000;
    }

    public char authenticateTransfer(String accountDetails){
        System.out.println("Authenticated user");
        return 'Y';
    }
}
