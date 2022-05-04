package array;

import java.util.Scanner;

public class Divde {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value:");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value:");
        for(int i=0;i<arr.length;i++){
         if(arr[i]/5 <=0)
             System.out.println("the result is :"  + arr[i]);
         }
        }
    }

