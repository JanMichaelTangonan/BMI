import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Initializing Variables
        double heightInFeet,heightInInches,weightInKilograms,height,bmi;

        //Users input
        System.out.println("What is your height in feet?");
        heightInFeet = sc.nextDouble();

        System.out.println("What is your height in inches?");
        heightInInches = sc.nextDouble() + heightInFeet*12;
        height = heightInInches *0.0254;

        System.out.println("What is your weight in pounds?");
        weightInKilograms = sc.nextDouble()*0.453592;

        //Calculations
        bmi = weightInKilograms/(height * height);

        //Showing the user's BMI
        System.out.println("Your BMI is " + bmi);

    }
}

