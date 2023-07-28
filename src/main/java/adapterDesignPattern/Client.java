package main.java.adapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        PhonePayApi phonePayApi = new PhonePayApi();
        System.out.println(phonePayApi.checkBalance("assad"));
    }
}
