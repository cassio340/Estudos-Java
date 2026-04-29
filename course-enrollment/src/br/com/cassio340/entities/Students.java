package br.com.cassio340.entities;

import java.util.HashSet;
import java.util.Set;

public class Students {
    private static Set <User> students = new HashSet<>();
    private Students(){}
    public static void include (User student){
        students.add(student);
    }

    public static Set<User> getStudents() {
        return students;
    }
}
