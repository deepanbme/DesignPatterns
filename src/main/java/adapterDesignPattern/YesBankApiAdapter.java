package main.java.adapterDesignPattern;

public class YesBankApiAdapter implements BankApiAdapter{

    private  YesBankApi yesBankApi;

    public YesBankApiAdapter() {
        this.yesBankApi = new YesBankApi();
    }

    @Override
    public String transfer(String from, String to, double amount) {
        char result = yesBankApi.transferAmount(from, to, (int) amount);
        if(result == 'D') return "Success";
        return "Failed";
    }

    @Override
    public double checkBalance(String userDetails) {
        return yesBankApi.checkBalance(userDetails);
    }

    @Override
    public boolean authenticate(String userDetails) {
        return yesBankApi.authenticateTransfer(userDetails) == 'Y';
    }
}
