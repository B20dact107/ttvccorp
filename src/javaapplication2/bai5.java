/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Admin
 */
import java.util.*;
public class bai5 {
    
    private static List<String> wordBreak(String s, List<String> wordDict){
        Set <String> dict= new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();
        return backtrack(s,dict,memo);
    }
    private static List<String> backtrack(String s,Set<String> dict,Map <String, List<String>> memo){
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        List<String> reslut= new ArrayList<>();
        if(s.isEmpty()){
            reslut.add("");
            return reslut;
        }
        for(String word: dict){
            if(s.startsWith(word)){
                 System.err.println(word);            
                 System.err.println(memo);     
               List<String> subList=backtrack(s.substring(word.length()), dict, memo);
               System.err.println(subList);  
               for(String sub:subList){
                   reslut.add(word+(sub.isEmpty()?"": " ")+sub);
               }
            }
        }
        System.out.println(reslut);
        memo.put(s, reslut);

                
        return reslut;
        
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        String [] s2 =s1.split(" "); 
         List<String> wordDict = new ArrayList<>();
        for(int i=0;i<s2.length;i++){
            wordDict.add(s2[i]);
        }

        
        List<String> sentences = wordBreak(s, wordDict);
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}

    

