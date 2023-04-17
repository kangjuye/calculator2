import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.println("사칙연산을 선택하세요:");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.print("선택: ");

        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                } else {
                    result = num1 / num2;
                    break;
                }
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        System.out.println("결과: " + result);

        scanner.close();
    }
}
