/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Admin
 */ 
import java.util.Scanner;
public class Bai2 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String regex= "^(http:\\/\\/|https:\\/\\/)(www\\.)?([a-zA-Z0-9]+)\\.[a-z]{2,6}(\\/\\S*)?$";
       // "^(http:\\/\\/|https:\\/\\/)(www\\.)?([a-zA-Z0-9]+)\\.[a-z]{2,6}(\\/\\S*)?$"
        System.out.println(url + " is valid: " +url.matches(regex));
    }
}

/*
Test[] = {
            "https://tiki.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu",
            "http://example.com",
            "https://www.example.com/path/to     resource  ",
            "ftp://example.com",
            "https://example.toolongdomain",
            "https://example.c",
            "https://example.com/path with spaces",
            "https://www.thegioididong.com/dtdd-choi-game"
        };
*/
