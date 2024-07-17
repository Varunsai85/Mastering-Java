package Mastering_java;

public class Array_learn {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0]=1;
        arr[1]=7;
        arr[2]=99;
        arr[3]=8;
        arr[4]=9;
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Prints all the elements in the array -- Called as for-each loop
        int[] newarray={1,4,5,6,7,8,44,55,22};
        for(int j:newarray){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println(newarray.length);
        String[] employees={"Varun","Dharani","Kiran","Siva"};
        System.out.println(employees[1]);
    }
}
