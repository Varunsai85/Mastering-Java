package Mastering_java.Packages;
import Mastering_java.OOPs.Package_example;

class Modifier2 extends Package_example{
    void print(){
        System.out.println(y);
        System.out.println(x);
    }
}
public class Chapter12_Q extends Package_example{
    public static void main(String[] args) {
        Modifier2 m=new Modifier2();
        m.print();
    }
}
