package Mastering_java.OOPs;
class Rectangle{
    public int length;
    public int breadth;
    public Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(){
        return this.length*this.breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int l){
        this.length=l;
    }
    public void setBreadth(int b){
        this.breadth=b;
    }
}
class Cuboid extends Rectangle{
    public int height;
    public Cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    public int Volume(){
        return this.length*this.breadth*this.height;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        this.height=h;
    }
}
public class Rect {
    public static void main(String[] args) {
        Cuboid cb=new Cuboid(3,4,5);
        System.out.println(cb.getLength()+" "+cb.getBreadth()+" "+cb.getHeight());
        System.out.println("Area of Rectangle : "+cb.area());
        System.out.println("Area of Cuboid : "+cb.Volume());
        cb.setLength(1);
        System.out.println(cb.area());
        System.out.println(cb.Volume());
    }
}
