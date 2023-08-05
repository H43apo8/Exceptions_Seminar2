/*
Если необходимо, исправьте данный код.
Решение: создан отсутствющий массив.
*/
public class program2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {3,5,6,7,8,5,4,5,6,7,7};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
