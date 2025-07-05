import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Output : Even Number");
        } else {
            System.out.println("Output : Odd Number");
        }
        scanner.close();
    }
}

