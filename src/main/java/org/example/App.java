package org.example;
import java.text.DecimalFormat;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        double BMI, weight, height;
        DecimalFormat df = new DecimalFormat("###.#");
        Scanner input = new Scanner(System.in);
        System.out.println( "What is your weight in pounds?" );
        while( !input.hasNextDouble() ){
            System.out.println("Invalid, try again:");
            input.next();
        }
        weight = input.nextDouble();
        System.out.println( "What is your height in inches?" );
        while( !input.hasNextDouble() ){
            System.out.println("Invalid, try again:");
            input.next();
        }
        height = input.nextDouble();
        BMI = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + df.format(BMI) + ".");
        if( BMI >= 18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range.");
            return;
        }
        else if( BMI < 18.5){
            System.out.println("You are underweight. You should see your doctor.");
            return;
        }
        else if( BMI > 25){
            System.out.println("You are overweight. You should see your doctor.");
            return;
        }
    }
}
