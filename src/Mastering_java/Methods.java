package Mastering_java;

public class Methods {
    //When we give static then the method can be used in the other static methods without creation of objects
    //Example
    static int sum(int x,int y){
        return x+y;
    }
    //When static is not used object need to be created with the class name that our method is present
    int product(int x,int y){
        return x*y;
    }
    //Method Overloading
    static int product(int x ,int y, int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        int result=sum(2,6);
        System.out.println(result);
        Methods obj=new Methods();
        int prod=obj.product(3,5);
        System.out.println(prod);
        System.out.println(product(2,3,5));
    }
}
