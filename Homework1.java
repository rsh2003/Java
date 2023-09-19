//Scanner.java
import java.util.Scanner;

class Homework1{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        int [] list= new int[5];
        int sum=0;

        for (int i=0;i<5;i++) {
            System.out.println((i+1)+"번째 정수를 입력:");
            int num= sc.nextInt();
            sum+=num;
            System.out.println("지금까지의 합:"+sum);
        }
    }
}
