package Mastering_java.OOPs;

import java.util.Scanner;

class Square{
    int side;
    public int Area(){
        return side*side;
    }
    public int Perimeter(){
        return 4*side;
    }
    public void printAP(){
        System.out.println("Area of this square = "+Area()+" sqauremeters");
        System.out.println("Perimeter of this square = "+Perimeter()+" meters");
    }
}
public class Geometry {
    public static void main(String[] args) {
        Square sqr1=new Square();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of the Square in meteres: ");
        sqr1.side=sc.nextInt();
        sqr1.printAP();
        sc.close();
    }

}
