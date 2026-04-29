package br.com.cassio340.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private String userName;
    private String userCode;
    private Set<Courses> registeredCourses = new HashSet<>();
    private static Set<String> existingUserCodes = new HashSet<>();



    public User(String userCode, String userName) {
        setUserCode(userCode);
        this.userName = userName;
        existingUserCodes.add(userCode);
        Students.include(this);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        if (userCode == null || !userCode.matches("[0-9]+")) {
            throw new IllegalArgumentException("O userCode deve conter apenas numeros!");
        }
        if (existingUserCodes.contains(userCode)) {
            throw new IllegalArgumentException("Erro: O código " + userCode + " já está em uso!");
        }
        this.userCode = userCode;
    }

    public static Set<String> getExistingUserCodes() {
        return existingUserCodes;
    }



    public Set<Courses> getRegisteredCourses() {
        return registeredCourses;
    }

    public void addCourse (Courses course){
        if(registeredCourses.contains(course)) {
            throw new IllegalArgumentException("O aluno " + userName + " já esta matriculado no curso " + course);
        }
        registeredCourses.add(course);
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append("\nCodigo único do aluno: "+ userCode);
        stb.append("\nNome do aluno: " + userName);
        stb.append("\nCursos Matriculados: " + getRegisteredCourses());

        return stb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return  Objects.equals(userCode, user.userCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userCode);
    }
}
