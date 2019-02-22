import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Initializing Variables
        double foot,inch,kilograms,bmi;

        //Declaring Variables
        foot = 12 ;
        inch = 0.0833333;
        kilograms = 2.20462;
        bmi = ((kilograms/foot*foot));

        //Users input
        System.out.println("What is your height in feet?");
        foot = sc.nextDouble();

        System.out.println("What is your height in inches?");
        inch = sc.nextDouble();

        System.out.println("What is your weight in pounds?");
        kilograms = sc.nextDouble();

        //Showing the user's BMI
        System.out.println("Your BMI is" + bmi);

    }
}

