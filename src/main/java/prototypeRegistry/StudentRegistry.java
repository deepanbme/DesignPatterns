package main.java.prototypeRegistry;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String, Student> mp;

    public StudentRegistry() {
        this.mp = new HashMap<>();
    }

    public StudentRegistry registry(String protoName, Student student){
        mp.put(protoName, student);
        return this;
    }

    public Student getProto(String name){
        return mp.get(name);
    }
}
