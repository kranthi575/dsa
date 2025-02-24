package dsa;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        //read input from the user
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        name = sc.nextLine();

        char[] charArray = name.toCharArray();

        System.out.println("chararray length: " + charArray.length +" and its half size is "+charArray.length/2);
        for (int i = 0; i < charArray.length/2; i++) {
            System.out.println("checking "+charArray[i]+"with"+charArray[charArray.length-1-i]);
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("given string is palindrome");

    }
}
