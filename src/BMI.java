import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Initializing Variables
        double heightInFeet,heightInInches,weightInKilograms,height,weight,bmi;

        //Declaring Variables
        heightInFeet = sc.nextDouble() *12;
        heightInInches = sc.nextDouble() + heightInFeet*12;
        weightInKilograms = 2.205;

        //Calculations
        height = heightInFeet + heightInInches;
        weight = weightInKilograms;
        bmi = weightInKilograms/heightInFeet*heightInInches;

        //Users input
        System.out.println("What is your height in feet?");
        height = sc.nextDouble();

        System.out.println("What is your height in inches?");
        height = sc.nextDouble();

        System.out.println("What is your weight in pounds?");
        weight = sc.nextDouble();

        //Showing the user's BMI
        System.out.println("Your BMI is" + bmi);

    }
}

