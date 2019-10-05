
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string:");
        String s = sc.nextLine();
        System.out.println("enter the character: ");
        char c = sc.next().trim().charAt(0);
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c) {
                System.out.println(i);
               
            }
    }
}