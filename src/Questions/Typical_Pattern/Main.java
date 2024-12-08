package Questions.Typical_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Question 1
//        int N=5;
//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//                if(i==0 && j==N-1){
//                    System.out.print("*");
//                }else if(i!=0 && i!=1 && j>=N-i && j!=N-1) {
//                    System.out.print("  ");
//                }else if(i!=0 && j==N-1){
//                    System.out.print(" ");
//                }
//                else{
//                    System.out.print("*_");
//                }
//            }
//            System.out.println();
//        }
        //Question 2
//        int num=5;
//        for(int i=0;i<num;i++){
//            for(int j=num;j>0;j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        //Question 3
//        int a=5;
//        int[] arr={1,2,3,4,5};
//        Scanner sc=new Scanner(System.in);
//        for(int ele:arr){
//            System.out.println(ele);
//        }
        //Question 4
//        int find=5;
//        int[] arr={1,2,3,4,5,6,7,8};
//        for(int ele:arr){
//            if(ele==find){
//                System.out.println("true");
//            }else{
//                System.out.println("false");
//            }
//        }
        int num=2;
        double t;
        double squareroot=num/2;
        do{
            t=squareroot;
            squareroot=(t+(num/t))/2;
        }while((t-squareroot)!=0);

        System.out.println(squareroot);
        System.out.printf("%.2f",squareroot);
    }
}
