package Mastering_java;

public class Chapter3_Q {
	public static void main(String[] args) {
		String name="Convertion of Spaces to Underscores";
		System.out.println(name.replace(" ","_"));
		//Problem 4:
		String name2="This the detection   of double  and Triple  Spaces";
		System.out.println(name2.indexOf("  ",21));
		System.out.println(name2.indexOf("   "));
	}
}
