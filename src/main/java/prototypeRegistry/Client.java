package main.java.prototypeRegistry;

public class Client {
    public static void main(String[] args) {
        Student stdProtoMar23 = new Student()
                .setAveragePsp(80)
                .setBatchName("Mar 23")
                .setCurrentModule("DSA")
                .setInstructorName("Abcd")
                .setMonthOfEnrollment("0323");

        Student stdProtoApr23 = new Student()
                .setAveragePsp(70)
                .setBatchName("Apr 23")
                .setCurrentModule("DSA")
                .setInstructorName("dcba")
                .setMonthOfEnrollment("0423");

        StudentRegistry studentRegistry = new StudentRegistry()
                .registry("Mar 23", stdProtoMar23)
                .registry("Apr 23", stdProtoApr23);


        Student deepan23 = studentRegistry.getProto("Mar 23").copy();
        deepan23.setName("deepan").setEmail("deepan@asds").setPhn("123456");

        Student raj23 = studentRegistry.getProto("Mar 23").copy();
        raj23.setName("raj").setEmail("raj@asds").setPhn("123456");

        Student barathi23 = studentRegistry.getProto("Apr 23").copy();
        barathi23.setName("barathi").setEmail("barathi@asds").setPhn("123456");

        System.out.println(deepan23);
        System.out.println(raj23);
        System.out.println(barathi23);

    }
}
