package org.abstractDemo;

public class Employee extends Person {

    private int empId;

    public Employee(String nm,String gen,int id)
    {
        super(nm,gen);
        this.empId = id;
    }

    @Override
    public void work() {
        if(empId==0)
        {
            System.out.println("Not Working");
        }
        else
        {
            System.out.println("Working as Employee");
        }
    }

    public static void main(String args[])
    {
        Person student = new Employee("Amit","Male",0);
        Person employee = new Employee("Bhadra","Female",101);
        student.work();
        employee.work();
        // using method implemented in abstract class  - inheriatance
        employee.changeName("Ankita");
        System.out.println(employee.toString());
    }
}
