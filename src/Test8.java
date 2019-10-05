
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        char[] a1=s.toCharArray();
        int lowerWeight=0;
        for (int i=0;i<s.length();i++){
            int j=a1[i];
            lowerWeight=lowerWeight+j;
        }
        char[] a2=s.toUpperCase().toCharArray();
        int upperWeight=0;
        for (int i=0;i<s.length();i++){
            int j=a2[i];
            upperWeight=upperWeight+j;
        }
        int absoluteWeight=lowerWeight-upperWeight;
        System.out.println(absoluteWeight);
    }
}