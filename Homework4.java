import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수를 입력: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int resultRecursive = gcdRecursive(m, n);
        int resultIterative = gcdIterative(m, n);

        System.out.println("재귀호출 최대공약수: " + resultRecursive);
        System.out.println("반복문 최대공약수: " + resultIterative);
    }

 
    public static int gcdRecursive(int m, int n) {
        if (m == 0) {
            return n;
        }
        return gcdRecursive(n % m, m);
    }


    public static int gcdIterative(int m, int n) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}
