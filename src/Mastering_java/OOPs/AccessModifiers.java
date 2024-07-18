package Mastering_java.OOPs;

import java.util.Scanner;

class Cylinder{
    private float radius;
    private float height;
    public void setRadius(float r){
        radius=r;
    }

    public void setHeight(float h) {
        height = h;
    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }
    public float Surarea(float r,float h){
        return 2*(22/7)*r*(r+h);
    }
    public float Vol(float r, float h){
        return (22/7)*r*r*h;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Cylinder cy1=new Cylinder();
        Scanner sc=new Scanner(System.in);
        System.out.print("Height : ");
        cy1.setHeight(sc.nextFloat());
        System.out.print("Radius : ");
        cy1.setRadius(sc.nextFloat());
        System.out.println("Volume of the cylinder : "+cy1.Vol(cy1.getRadius(),cy1.getRadius()));
        System.out.println("Surface Area of the Cylinder : "+cy1.Surarea(cy1.getRadius(),cy1.getHeight()));
    }
}
