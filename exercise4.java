import java.util.Scanner;

public class EmptyStringExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите текст: "); // Приглашение к вводу текста
            String input = scanner.nextLine(); // Считываем введенную строку с помощью Scanner

            // Проверяем, является ли введенная строка пустой, используя метод isEmpty() класса String
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!"); // Если строка пустая, выбрасываем исключение с сообщением
            }

            System.out.println("Вы ввели: " + input); // Выводим введенный текст на экран

        } catch (Exception e) {
            // Обработка исключения
            System.out.println("Ошибка: " + e.getMessage()); // Выводим сообщение об ошибке
        }
    }
}
