import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u') {
                c++;
                if (c == 1) {
                    a[i] = '*';
                }
                if (c == 2) {
                    a[i] = '^';
                }
                if (c == 3) {
                    a[i] = '!';
                }
            }
        }
        System.out.println(a);
    }
}