package Mastering_java;
import java.util.Scanner;
public class Chapter4_Q {
	public static void main(String[] args) {
		//Question 2
		/*byte m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks for m1 : ");
		m1=sc.nextByte();
		System.out.print("Enter marks for m2 : ");
		m2=sc.nextByte();
		System.out.print("Enter marks for m3 : ");
		m3=sc.nextByte();
		float avg=(m1+m2+m3)/3.0f;
		System.out.printf("Your Overall Average is : %.2f\n",avg);
		if(avg>=40 && m1>=33 && m2>=33) {
			System.out.println("Congratulation have passed!");
		}else {
			System.out.println("You have failed!");
		}*/
		
		//Question 4
		byte day;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the day : ");
		day=sc.nextByte();
		switch(day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Sunday");
		}
		sc.close();
}
}