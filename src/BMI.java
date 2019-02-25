import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Initializing Variables
        double heightInFeet,heightInInches,weightInKilograms,height,weight,bmi;

        //Users input
        System.out.println("What is your height in feet?");
        heightInFeet = sc.nextDouble() * 12 ;

        System.out.println("What is your height in inches?");
        heightInInches = sc.nextDouble() + heightInFeet*12;
        height = heightInInches;

        System.out.println("What is your weight in pounds?");
        weightInKilograms = sc.nextDouble()*0.453592;

        //Calculations
        height = heightInFeet;
        weight = weightInKilograms;
        bmi = weightInKilograms/(height * height);

        //Showing the user's BMI
        System.out.println("Your BMI is" + bmi);

    }
}

