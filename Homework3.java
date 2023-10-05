import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력(공백구분): ");
        String input = scanner.nextLine();
        String[] numString = input.split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String numberAsString : numbersAsString) {
            int number = Integer.parseInt(numberAsString);
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}

