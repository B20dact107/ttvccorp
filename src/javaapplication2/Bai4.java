/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String line=scanner.nextLine();
          String[]input=line.split(" ");
          ArrayList<Integer> arr= new ArrayList<>();
          for(String s:input){
              arr.add(Integer.parseInt(s));
          }
        int[] arr1 = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr1[i]=arr.get(i);
        }
        int[] sortedArr = countingSort(arr1);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        int [] count= new int[max+1];
        for( int num: arr){
            count[num]++;
        }
        
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        int [] sortedArr= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int num=arr[i];
            sortedArr[count[num]-1]=num;
            count[num]--;
        }
        return sortedArr;
    }
}

