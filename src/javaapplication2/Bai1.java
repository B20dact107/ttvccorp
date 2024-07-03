/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */

    public class Bai1 {
    public static boolean binarySearch(int[] array, int target) {
        int l=0;
        int r=array.length-1;
        while(l<=r){
             int mid=l+(r-l)/2;
            if(array[mid]==target){
                return true;
            }
            else if(array[mid]<target){
                l= mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int m= scanner.nextInt();
        int [] arr1 = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=scanner.nextInt();
        }
        int [] arr2 = new int[m+n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = -1;
        }
        for(int i=0;i<n;i++){
            if(binarySearch(arr1, arr[i])){
                arr2[i]= arr[i];
            }
        }
      
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
           if(arr2[i]!=-1)
               System.out.print(arr2[i]+" ");
        }
        System.out.println("");
    }
}


// String regax="^(http:\\/\\/|https:\\/\\/)(www\\.)?([a-zA-Z0-9]+)\\.[a-z]{2,6}(\\/[^\s]*)?$";
// String regex = "^(http:\\/\\/|https:\\/\\/)(www\\.)?([a-zA-Z0-9]+)\\.[a-z]{2,6}(\\/[^\s]*)?$";