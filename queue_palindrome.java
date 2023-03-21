import java.util.*;
import java.util.Scanner;

public class queue_palindrome {
    public static void main(String[] args) {

        System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);
        String inputstring = in.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputstring.length()-1; i >=0; i--) {
            queue.add(inputstring.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputstring.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}
