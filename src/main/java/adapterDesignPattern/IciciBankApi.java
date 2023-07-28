package main.java.adapterDesignPattern;

public class IciciBankApi {

    public String doPayment(long from, String to, double amount){
        System.out.println("Amount transferred");
        return "Done";
    }

    public double balance(long accountDetails){
        System.out.println("Balance eligible");
        return 1000;
    }

    public boolean checkUser(long accountDetails){
        System.out.println("Authenticated user");
        return true;
    }
}
