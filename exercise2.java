public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d; // Попытка деления на ноль
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            // Обработка исключения типа ArithmeticException
            System.out.println("Catching exception: " + e);
        } finally {
            // Блок finally выполняется независимо от того, было ли исключение или нет
            System.out.println("Finally block is executed");
        }

        System.out.println("After try-catch block");
    }
}
