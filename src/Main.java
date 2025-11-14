import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validPathCount = 0;
        while (true) {
            System.out.print("Введите путь к файлу: ");
            String filePath = scanner.nextLine();

            File file = new File(filePath);
            boolean fileExists = file.exists();
            boolean isFile = file.isFile();
            if (!fileExists) {
                System.out.println("Ошибка: файл не существует.");
                continue;
            }
            if (!isFile) {
                System.out.println("Ошибка: указанный путь ведёт к папке, а не к файлу.");
                continue;
            }
            validPathCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + validPathCount);
        }
    }
}