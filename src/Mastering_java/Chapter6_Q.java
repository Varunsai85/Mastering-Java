package Mastering_java;

//import java.util.Scanner;

public class Chapter6_Q {
    public static void main(String[] args) {
        //Q1
        float[] marks={22.6f,66.8f,22.99f,90.7f,88.4f};
        float sum=0;
        for(byte i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println(sum);
        /*//Q2
        int[] arr={1,5,6,7,5,3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Array Element : ");
        int a=sc.nextInt();
        boolean isinArray=false;
        for(int element:arr){
            if(element==a){
                isinArray=true;
                break;
            }
        }
        if(isinArray)
            System.out.println("The Element is present in the Array");
        else System.out.println("The Element is Not Present");
        sc.close();*/
        float[] phy_marks={44.6f,34.77f,23.8f,43.73f,99.5f};
        float avg=0;
        for(float ele:phy_marks){
            avg+=ele;
        }
        System.out.println("The average marks is : "+avg/phy_marks.length);
    }
}
