/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 21 - Numbers to Names
 *  Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month,
 *  with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.
 *
 *  Constraint:
 *  Use a switch or case statement for this program.
 *  Use a single output statement for this program.
 *
 */

package ex21;
import java.util.Scanner;

public class base {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        // Variable Initialization
        base myBase = new base();
        String month;

        // User Input Step
        System.out.printf("Please enter the number of the month: ");
        int num = userInput.nextInt();

        // If statement determines function based on value
        if (num < 5)
        {
            month = myBase.section1(num);
        }
        else if (num < 9)
        {
            month = myBase.section2(num);
        }
        else
        {
            month = myBase.section3(num);
        }

        // Single statement output
        System.out.printf("The name of the month is %s", month);
    }

    // Function uses switch statement to return the month
    public String section1(int num)
    {
        switch(num)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            default:
                return "Error";
        }
    }

    // Function uses switch statement to return the month
    public String section2(int num)
    {
        switch(num)
        {
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            default:
                return "Error";
        }

    }

    // Function uses switch statement to return the month
    public String section3(int num)
    {
        switch(num)
        {
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Error";
        }

    }
}
