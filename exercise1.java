import java.util.Scanner;

public class UserInputFloat {
    public static void main(String[] args) {
        // Вызываем метод для запроса дробного числа у пользователя и получаем результат
        float userInput = readFloatFromUser();
        System.out.println("Вы ввели число: " + userInput);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Введите дробное число: "); // Подсказка пользователю
                String input = scanner.nextLine(); // Считываем введенную строку с консоли
                number = Float.parseFloat(input); // Преобразуем строку в число типа float
                validInput = true; // Если удалось преобразовать, считаем ввод корректным и выходим из цикла
            } catch (NumberFormatException e) {
                // Обработка исключения, возникающего при некорректном вводе
                System.out.println("Ошибка ввода! Введите дробное число.");
            }
        }

        return number; // Возвращаем введенное пользователем дробное число
    }
}
