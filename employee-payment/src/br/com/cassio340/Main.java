package br.com.cassio340;

import br.com.cassio340.models.Employee;
import br.com.cassio340.models.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.println("Digite o tipo de funcionario");
            System.out.println("1- funcionario propio ");
            System.out.println("2- funcionario terceirizado");
            System.out.println("0- Encerrar");


            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 0){
                run = false;
                continue;
            }

            System.out.println("Digite o nome do funcionario");
            String name  = scan.nextLine();
            System.out.println("Digite o total de horas trabalhadas");
            int hours = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o valor por hora");
            double valuePerHours = scan.nextDouble();
            scan.nextLine();

            if (opcao == 1){
                employees.add (new Employee(name, hours, valuePerHours));
            }
            if (opcao == 2){
                System.out.println("Digite a despesa adicional");
                double additionalCharge = scan.nextDouble();

                employees.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
            }

        }

        for(Employee employee : employees){
            System.out.println(employee);

        }
        System.out.println("Pagamentos");
        for (Employee employee : employees){
            System.out.println(employee.getName()+ " - $ " + employee.payment());
        }




    }
}
