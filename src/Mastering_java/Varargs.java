package Mastering_java;

public class Varargs {
    static int sum(int... arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    //if we need atleast one argument in the method.
    static int product(int x,int... arr){
        int result=x;
        for(int a:arr){
            result*=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(4,5,6,8,9));
        System.out.println(sum(734,5656,434,232));
        System.out.println(product(1));
        System.out.println(product(2,4,5,7,5));
    }
}
