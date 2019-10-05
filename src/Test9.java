import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String a =in.nextLine().trim();
        String upper = a.toUpperCase();
        String lower = a.toLowerCase();
        int x =0;
        int y = 0;
        for(int i = 0; i < upper.length();i++ ){
            char d = upper.charAt(i);
            int d1 = d;
            x = x+ d1;
        }
        System.out.println(x);
        for (int j = 0; j < lower.length();j++){
            char f = lower.charAt(j);
            int f1 = f;
            y = y + f1;
        }
        System.out.println(y);
        System.out.println("absoluteWeight is " + (y - x));
    }
}
