package Mastering_java;
abstract class Parent{
    int a=45;
    public Parent(){
        System.out.println("Im the parent");
    }
    abstract public void greet();
}
class Child extends Parent{
    public Child(){
        System.out.println("Constructor of child");
    }
    @Override
    public void greet(){
        System.out.println("Hello and Good evening");
    }
}
class Child1 extends Child{
    public Child1(){
        System.out.println("Im constructor of child1");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Child1 ch=new Child1();
        ch.greet();
        ch.a=454;
        System.out.println(ch.a);
    }
}
