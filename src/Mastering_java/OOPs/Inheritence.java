package Mastering_java.OOPs;
class Circle{
    public int radius;
    public Circle(int r){
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    public Cylinder1(int r, int h){
        super(r);
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}
public class Inheritence {
    public static void main(String[] args) {
        Cylinder1 c1=new Cylinder1(22,66);
        System.out.format("Area of Circle : %.2f%n",c1.area());
        System.out.format("Volume of the cylinder : %.2f%n",c1.volume());
    }
}
