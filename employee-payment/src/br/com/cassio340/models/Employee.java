package br.com.cassio340.models;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }


    public Double payment(){
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        StringBuilder construct = new StringBuilder();
        construct.append ("nome do funcionario: ").append(name).append("\n");
        construct.append("Horas trabalhadas: ").append(hours).append("\n");
        construct.append("valor da hora: ").append(valuePerHour).append("\n");
        String info = construct.toString();
        return info;
    }
}
