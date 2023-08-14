package main.java.builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student st = Student.builder()
                .setAge(18)
                .setEmail("asdsd")
                .setName("Deepan")
                .setSchoolPassOutYear(2022)
                .build();
        System.out.println(st);
    }
}
