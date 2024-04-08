package designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    List<String> employeeName;


    public Employees(List<String> employeeName){
        this.employeeName = new ArrayList<>();
        this.employeeName = employeeName;
    }

    @Override
    public Employees clone(){
        List<String> temp = new ArrayList<>();

        for(String name: employeeName){
            temp.add(name);
        }

        return new Employees(temp);

    }
}
