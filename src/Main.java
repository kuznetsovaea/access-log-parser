import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        System.out.println("Сумма: " + (firstNumber + secondNumber));
        System.out.println("Разность: " + (firstNumber - secondNumber));
        System.out.println("Произведение: " + (firstNumber * secondNumber));
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Частное: " + quotient);
    }
}