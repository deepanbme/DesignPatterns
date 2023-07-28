package main.java.adapterDesignPattern;

public class PhonePayApi {

    private BankApiAdapter bankApiAdapter;

    public PhonePayApi() {
        this.bankApiAdapter = new ICICICBankApiAdapter();
    }

    public String transferMoney(String from, String to, double amount){
        String result = bankApiAdapter.transfer(from, to, (int) amount);
        if(result == "Done") return  "Transfer was successful";
        return "Transfer failed";
    }

    public double checkBalance(String userDetails){
        return bankApiAdapter.checkBalance(userDetails);
    }

    public boolean loginUser(String userDetails){
        return bankApiAdapter.authenticate(userDetails);
    }
}
