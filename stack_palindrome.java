import java.util.*;
import java.util.Scanner;

public class stack_palindrome {
    public static void main(String[] args){
        System.out.print("Enter any strings : ");
        Scanner in = new Scanner(System.in);
        String inputstring = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputstring.length(); i++) {
            stack.push(inputstring.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputstring.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}

