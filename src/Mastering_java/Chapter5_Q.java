package Mastering_java;
import java.util.Scanner;
public class Chapter5_Q {
	public static void main(String[] args) {
		/*//Quiz 1
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of numbers you want to print : ");
		int a=sc.nextInt();
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=a);
		//Quiz 2
		System.out.println();
		System.out.println();
		System.out.print("Enter n : ");
		a=sc.nextInt();
		for(int k=a;k!=0;k--){
			System.out.print(k+" ");
		}
		sc.close();*/
		//Q1
		/*for(int i=4;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		//Q3
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for the Table : ");
		int a=sc.nextInt();
		for(int i=1;i<=20;i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
		sc.close();
	}
}
