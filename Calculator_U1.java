import java.util.Scanner;

public class Calculator_U1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        double no1 = sc.nextDouble();

        System.out.print("Enter Second Number : ");
        double no2 = sc.nextDouble();

        System.out.println("---Choose Operations---");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.print("Enter your choise : ");
        int choise = sc.nextInt();

        if (choise == 1){
            System.out.println("Addition of "+ no1 + " and " + no2 + " is : " + (no1 + no2));
        }else if (choise == 2){
            System.out.println("Subtraction of "+ no1 + " and " + no2 + " is : " + (no1 - no2));
        }else if (choise == 3){
            System.out.println("Multiplication of "+ no1 + " and " + no2 + " is : " + (no1 * no2));
        }else if (choise == 4){
            if (no2 != 0){
                System.out.println("Division of "+ no1 + " and " + no2 + " is : " + (no1 / no2));
            }else{
                System.out.println("Error: Division by zero is not allowed.");
            }
        }else{
            System.out.println("Invalid Choice");
        }
        sc.close();

    }
    
}
