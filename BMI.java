package into.java.basics;

import java.util.Scanner;

public class BMI {
    
    public static void main(String argh[]) {
        
        Scanner input = new Scanner(System.in);
        
        double height, weight;
        
        System.out.println("Welcome to the BMI Calculator.");
        System.out.println("Please input your weight: ");
        weight = input.nextDouble();
        
        System.out.println("Please input your height: \nReminder! Your height must a whole number and 2 decimal places. ex: 1.73");
        height = input.nextDouble();
        
        double BMI = weight / ( Math.pow(height, 2) );
        
        System.out.println("Your Body Mass Index is: " + BMI);
        
    }
    
}
