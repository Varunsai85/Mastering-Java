package Mastering_java.OOPs;
class Pirate{
    void greet(){
        System.out.println("Hello Im varun");
    }
    void meth2(){
        System.out.println("meth2");
    }
}
class bay extends Pirate{
     void meth2(){
        System.out.println("im meth2 of bay class");
    }
    void meth3(){
        System.out.println("meth3");
    }
}
public class Trail {
    public static void main(String[] args) {
        Pirate p=new bay();
        p.greet();
    }
}
