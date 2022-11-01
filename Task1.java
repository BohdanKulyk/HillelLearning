import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double AGE,year;
        System.out.println("Enter the Age");
        year=input.nextDouble();
        if (!(year >= 0) || !(year <=146)) {
            System.out.println("Age must be from 0 to 146!");
            System.exit(0);
        }
        AGE=year;
        System.out.println("Your Age is "+AGE);
        if(AGE<0){
            System.out.println("Wrong age");
        }
        if(AGE>=0 && AGE<18){
            System.out.println("Underage");
        }
        if(AGE>=18 && AGE<=100){
            System.out.println("Adult");
        }
        if(AGE>100){
            System.out.println("Going for a record 146 years");
        }
    }
}