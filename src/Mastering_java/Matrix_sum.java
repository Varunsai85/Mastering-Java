package Mastering_java;

public class Matrix_sum {
    public static void main(String[] args) {
        int[][] mat1={{5,10,20},
                      {8,6,5}};
        int[][] mat2={{3,8,5},
                     {2,9,3}};
        int[][] result={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
