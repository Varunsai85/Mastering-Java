package Mastering_java.OOPs;

import java.util.Scanner;
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void pritndetails(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee name : ");
        emp1.name=sc.nextLine();
        System.out.print("Enter employee Salary : ");
        emp1.salary=sc.nextInt();
        emp1.pritndetails();
        sc.close();
    }
}
