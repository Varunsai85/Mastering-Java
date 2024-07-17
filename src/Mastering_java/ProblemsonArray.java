package Mastering_java;

public class ProblemsonArray {
    public static void main(String[] args) {
        //reversing an array
        int[] arr={1,2,3,4,5};
        int l=arr.length;
        int div=Math.floorDiv(l,2);
        for(int i=0;i<div;i++){
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //Maximum element in an array
        int[] arr1={26,43,88,23,55,77};
        int max=0;
        for(int ele:arr1){
            if(ele>max){
                max=ele;
            }
        }
        System.out.println(max);
        // Minimum element in an array
        int min=arr1[0];
        for(int ele:arr1){
            if(ele<min){
                min=ele;
            }
        }
        System.out.println(min);
    }
}
