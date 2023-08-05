/*
Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
Решение:
Добавим исключение деления на ноль - ArithmeticException - это более точно, нежели просто Exception.
Заменим Throwable на Exception, т.к. Throwable я вляется родителем не только для Exception, но и для Error,
а Error разрулить в try-catch невозможно.
В методе printSum исключение FileNotFoundException  не нужно, т.к. в нём вообще не работаем с файлами.
Ну и оставим всё же Exception, на случай непредвиденных исключений.
*/
public class program3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2};
            abc[3] = 9;
        } catch(ArithmeticException e){
            System.out.println("Деление ноль невозможно!!!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
