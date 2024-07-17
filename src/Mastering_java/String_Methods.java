package Mastering_java;

public class String_Methods {
	public static void main(String[] args) {
		String name="Varun Sai Nadiminti";
		System.out.println(name.length());
		System.out.println(name.indexOf("Sai"));
		System.out.println(name.indexOf("i"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String name2="   Varun Sai Nadiminti   ";
		String name3="Varun Sai Nadiminti";
		System.out.println(name2.trim());
		System.out.println(name.substring(4));
		System.out.println(name.substring(0,4));
		System.out.println(name.replace('i','r'));
		System.out.println(name.startsWith("Sai"));
		System.out.println(name.endsWith("ti"));
		System.out.println(name.charAt(4));
		//Shows the index of S after the character at index 7
		System.out.println(name.indexOf("S",7));
		//Shows the index of the desired character from the last of the string
		System.out.println(name.lastIndexOf("i"));
		//Shows the index of a before the character at index 7
		System.out.println(name.lastIndexOf("a",7));
		System.out.println(name.equals(name3));
		name3=name3.toLowerCase();
		System.out.println(name3);
		System.out.println(name.equalsIgnoreCase(name3));
	}
}
