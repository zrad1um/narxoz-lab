import java.util.Scanner;
 
public class BigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next(); String b = scanner.next();
 
        if (a.length() > b.length()) {
            System.out.println("A");
        } else if (a.length() < b.length()) {
            System.out.println("B");
        } else {
            int cmp = a.compareTo(b);
            if (cmp > 0) {
                System.out.println("A");
            } else if (cmp < 0) {
                System.out.println("B");
            } else {
                System.out.println("AB");
            }
        }
    }
}
