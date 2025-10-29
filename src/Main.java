import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст и нажмите <Enter>:");
        String text = input.nextLine();
        System.out.println("Длина текста:" + text.length());
    }
}