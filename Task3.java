import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double years,salaryNow,salaryUpd;
        System.out.println("Enter the experience in years");
        years=input.nextDouble();
        if (years <= 0) {
            System.out.println("Work Experience must be from 1 year");
            System.exit(0);
        }
        System.out.println("Enter the Salary Now");
        salaryNow=input.nextDouble();
        salaryUpd=0;
        if (years >= 1 && years <= 3) {

            salaryUpd = salaryNow + (salaryNow * 10 / 100);

        }
        if (years > 3) {

            salaryUpd = salaryNow + (salaryNow * 20 / 100);

        }
        double salaryBonus;
        if (salaryUpd < 4000) {

            salaryBonus = salaryUpd + 1000;

        } else {

            salaryBonus = salaryUpd + 500;

        }
        System.out.println("Your updated salary: " + salaryBonus);

    }
}