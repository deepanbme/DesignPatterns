package main.java.prototypeRegistry;

public class Student {
    private String batchName;
    private int averagePsp;
    private String instructorName;
    private String monthOfEnrollment;
    private String currentModule;
    private String name;
    private String email;
    private  String phn;

    public Student copy(){
        Student newSt = new Student();
        newSt.averagePsp = this.getAveragePsp();
        newSt.currentModule = this.getCurrentModule();
        newSt.batchName = this.getBatchName();
        newSt.instructorName = this.getInstructorName();
        newSt.monthOfEnrollment = this.getMonthOfEnrollment();
        return newSt;
    }

    public String getBatchName() {
        return batchName;
    }

    public Student setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public int getAveragePsp() {
        return averagePsp;
    }

    public Student setAveragePsp(int averagePsp) {
        this.averagePsp = averagePsp;
        return this;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public Student setInstructorName(String instructorName) {
        this.instructorName = instructorName;
        return this;
    }

    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }

    public Student setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
        return this;
    }

    public String getCurrentModule() {
        return currentModule;
    }

    public Student setCurrentModule(String currentModule) {
        this.currentModule = currentModule;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhn() {
        return phn;
    }

    public Student setPhn(String phn) {
        this.phn = phn;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "batchName='" + batchName + '\'' +
                ", averagePsp=" + averagePsp +
                ", instructorName='" + instructorName + '\'' +
                ", monthOfEnrollment='" + monthOfEnrollment + '\'' +
                ", currentModule='" + currentModule + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phn='" + phn + '\'' +
                '}';
    }
}
