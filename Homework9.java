import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> credentials = readCredentialsFromFile("db.txt");

        if (credentials.isEmpty()) {
            System.out.println("Error reading credentials from the file.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("id와 password를 입력해주세요. id : ");
            String enteredId = scanner.nextLine().trim();

            if (!credentials.containsKey(enteredId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            } else {
                String correctPassword = credentials.get(enteredId);
                System.out.print("password : ");
                String enteredPassword = scanner.nextLine().trim();

                if (enteredPassword.equals(correctPassword)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }
        }

        scanner.close();
    }

    private static Map<String, String> readCredentialsFromFile(String filename) {
        Map<String, String> credentials = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    String id = parts[0].trim();
                    String password = parts[1].trim();
                    credentials.put(id, password);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return credentials;
    }
}
