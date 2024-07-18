package Mastering_java.OOPs;
class cylinder{
    private float radius;
    private float height;
    public cylinder(float r,float h){
        radius=r;
        height=h;
    }
    public void printparameters(){
        System.out.println("Radius : "+radius);
        System.out.println("Height : "+height);
    }
}
public class Usingconstructor {
    public static void main(String[] args) {
        cylinder cy1=new cylinder(22.6f,44.8f);
        cy1.printparameters();
    }
}
