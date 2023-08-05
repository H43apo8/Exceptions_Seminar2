import java.util.InputMismatchException;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/
public class program1 {
    public static void main(String[] args) {
        float num = 0;
        boolean flag = true;
        do{
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Введите число (дробное число вводится через запятую): ");
                num = in.nextFloat();
                flag = false;
            }catch(InputMismatchException e){
                System.out.println("Введённое значение не является числом, поробуйте снова.");
            }
        }while(flag);
        System.out.println(num);
    }
}