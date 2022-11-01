import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        new Scanner(System.in);
        System.out.println("Введите число:");
        var a = 67;
        var b = 5;
        var rest = a % b;
        if (rest != 0) {
            System.out.println("Делится с остатком " + rest);
        } else {
            System.out.println("Делится, результат деления: " + (a / b));
        }
    }
}