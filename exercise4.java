/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        String uString = null;
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Введите строку: ");
            uString =  in.nextLine();
            if(uString == ""){
                throw new RuntimeException();
            }
        } catch (RuntimeException e){
            System.out.println("Пустая строка недопустима");
        }
        System.out.println("Вы ввели: " + uString);

    }
}
