package designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void main(String[] args){

        List<String> employeeName = new ArrayList<>();
        employeeName.add("Harsh");
        employeeName.add("Jay");
        employeeName.add("Deeksha");

        Employees emp = new Employees(employeeName);

        Employees emp1 = emp.clone();
        emp1.employeeName.add("Ram");

        Employees emp2 = emp1.clone();
        emp2.employeeName.remove("Harsh");

        for(String name: emp.employeeName){
            System.out.println(name);
        }

        for(String name: emp1.employeeName){
            System.out.println(name);
        }

        for(String name: emp2.employeeName){
            System.out.println(name);
        }


    }
}
