import java.util.Scanner;
 
public class ThirdSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
 
        int[] result = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = scanner.nextInt();
                if (value > result[j]) {
                    result[j] = value;
                }
            }
        }
 
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < m; j++) {
            sb.append(result[j]);
            if (j < m - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
