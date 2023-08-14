package main.java.builderDesignPattern;

import main.java.builderDesignPattern.exceptions.InvalidAgeExceptions;
import main.java.builderDesignPattern.exceptions.InvalidEmailExceptions;
import main.java.builderDesignPattern.exceptions.NameNotGivenlExceptions;

public class Student {
    private int age;
    private String name;
    private String email;
    private int schoolPassOutYear;

    private Student(Builder builder){
        this.age = builder.age;
        this.name = builder.name;
        this.email = builder.email;
        this.schoolPassOutYear = builder.schoolPassOutYear;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getSchoolPassOutYear() {
        return schoolPassOutYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", schoolPassOutYear=" + schoolPassOutYear +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

     static class Builder{
        private int age;
        private String name;
        private String email;
        private int schoolPassOutYear;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getSchoolPassOutYear() {
            return schoolPassOutYear;
        }

        public Builder setSchoolPassOutYear(int schoolPassOutYear) {
            this.schoolPassOutYear = schoolPassOutYear;
            return this;
        }

        private void validateAge(){
            if(age < 18 || age > 22){
                throw new InvalidAgeExceptions("Student should be above 18 and below 22 years old");
            }
        }

        private void validateEmail(){
            if(email == null){
                throw new InvalidEmailExceptions("Email needs to be entered");
            }
        }

        private void validateName(){
            if(name == null){
                throw new NameNotGivenlExceptions("name needs to be entered");
            }
        }

        private void validateSchoolPassOutYear(){
            if(schoolPassOutYear > 2022){
                throw new NameNotGivenlExceptions("year of passing out should be 2022");
            }
        }

        private void validateFields(){
            validateAge();
            validateEmail();
            validateName();
            validateSchoolPassOutYear();
        }

        public Student build(){
            validateFields();
            return new Student(this);
        }
    }
}
