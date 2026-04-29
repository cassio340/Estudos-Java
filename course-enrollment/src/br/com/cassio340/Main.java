package br.com.cassio340;
import br.com.cassio340.entities.Courses;
import br.com.cassio340.entities.User;

import java.util.HashSet;
import java.util.Set;

import static br.com.cassio340.entities.Students.getStudents;



public class Main {
    static void main() {

        User usuario1 = new User("5423","cassio");
        User usuario2 = new User("3235","Luanna");
        User usuario3 = new User("2145","Maria");
        User usuario4 = new User("6363","Lucas");
        User usuario5 = new User("2190","Ana");
        User usuario6 = new User("4378","João");

        usuario1.addCourse(Courses.A);
        usuario1.addCourse(Courses.B);
        usuario2.addCourse(Courses.D);
        usuario3.addCourse(Courses.B);
        usuario3.addCourse(Courses.C);
        usuario3.addCourse(Courses.E);
        usuario4.addCourse(Courses.E);
        usuario4.addCourse(Courses.D);
        usuario5.addCourse(Courses.A);
        usuario5.addCourse(Courses.C);
        usuario6.addCourse(Courses.E);


        Set<User> alexStudents = new HashSet<>();

        for (User student : getStudents()) {
            Set<Courses> courses = student.getRegisteredCourses();
            if (courses.contains(Courses.A) || courses.contains(Courses.B) || courses.contains(Courses.C)) {
                alexStudents.add(student);
            }
        }

        System.out.println("Total de alunos do instrutor Alex: " + alexStudents.size());
    }
}
