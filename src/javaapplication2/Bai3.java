package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        String[] input = line.split(" ");
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for (String s : input) {
            arrList.add(Integer.parseInt(s));
        }
        
        int target = scanner.nextInt();
        
        int n = arrList.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = arrList.get(i);
        }
        
        int first = timsodau(arr, target);
        int last = timsocuoi(arr, target);

        if (first == -1 || last == -1) {
            System.out.println("[-1, -1]");
        } else {
            System.out.println("[" + first + ", " + last + "]");
        }
    }
    
    public static int timsodau(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left<=right){
            int mid= left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                right=mid-1; //
            }else if(arr[mid]<target)
                left= mid+1;
            else{
                right=mid-1;
            }
        }

        return result;
    }

    public static int timsocuoi(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;  
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
