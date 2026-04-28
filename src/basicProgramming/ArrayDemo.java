package basicProgramming;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        System.out.println(arr1[0]);
        System.out.println(arr1.length);

        int[] arr2 = new int[5];
        System.out.println(arr2.length);

        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
/*
        Scanner sc = new Scanner(System.in);
        for(int  i=0; i<arr2.length; i++){
            System.out.println("enter the value for " + (i+1) +"th number");
            arr2[i] = sc.nextInt();
        }
        // for each loop
        for(int i:arr2){
            if(i == 30){
                System.out.println("Mihir");
            }
            System.out.println(i);
        }
        //linear search
        for(int  i=0; i<arr2.length; i++){
            if(arr2[i] == 30){
                System.out.println("item found");
                break;
            }
        }
*/
        // 2D array
        int[][] arr3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("whats the length of arr3 columns " + arr3[0].length);
        System.out.println(arr3);
        System.out.println(arr3[1][1]);
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                System.out.println(arr3[i][j]);   // arr3[row][col] = value
            }
        }

    }
}
