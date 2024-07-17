package Mastering_java;

public class Chapter7_Q {
    //Q1 Table
    static void Multiplication_table(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+" * "+i+" = "+x*i);
        }
    }
    //Q2 Pattern
    static void pattern(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Q2
    static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }
    //fibonacci
    static int fib(int n){
        if(n==1||n==2){
            return n-1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
    //patternwithrecursion
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Patter2_recursion
    static void pattern2_rec(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
            pattern2_rec(n-1);

        }
    }
    public static void main(String[] args) {
        Multiplication_table(5);
        pattern();
        System.out.println(sum(2));
        System.out.println(fib(7));
        pattern_rec(4);
        pattern2_rec(4);
    }
}
