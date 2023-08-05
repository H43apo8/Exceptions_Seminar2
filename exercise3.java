import java.io.FileNotFoundException;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b); // Печатаем результат деления a на b (30)
            printSum(23, 234); // Вызываем метод printSum с аргументами 23 и 234
            int[] abc = {1, 2};
            abc[3] = 9; // Пытаемся обратиться к элементу массива с индексом 3, что приведет к IndexOutOfBoundsException
        } catch (NullPointerException ex) {
            // Обработка исключения типа NullPointerException
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            // Обработка исключения типа IndexOutOfBoundsException
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            // Обработка всех остальных исключений, которые не попали в предыдущие блоки catch
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        // Метод, который принимает два аргумента типа Integer и печатает их сумму
        System.out.println(a + b);
    }
}
