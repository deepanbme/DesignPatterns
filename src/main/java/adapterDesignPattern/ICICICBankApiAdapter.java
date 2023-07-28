package main.java.adapterDesignPattern;

public class ICICICBankApiAdapter implements BankApiAdapter{

    private  IciciBankApi iciciBankApi;

    public ICICICBankApiAdapter() {

        this.iciciBankApi = new IciciBankApi();
    }

    @Override
    public String transfer(String from, String to, double amount) {
        String result = iciciBankApi.doPayment(returnIdFromUser(from), to, (int) amount);
        return result == "Done" ? "Success" : "Failed";
    }

    @Override
    public double checkBalance(String userDetails) {
        return iciciBankApi.balance(returnIdFromUser(userDetails));
    }

    @Override
    public boolean authenticate(String userDetails) {
        return iciciBankApi.checkUser(returnIdFromUser(userDetails));
    }

    private long returnIdFromUser(String user){
        return 1L;
    }
}
