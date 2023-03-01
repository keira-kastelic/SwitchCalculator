import java.util.Scanner;

/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s):
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:"); // prompting the user
        Scanner user = new Scanner(System.in); // creating a scanner
        int firstInt = user.nextInt(); // reading in the users input
        System.out.println("Please enter an operator:"); // prompting the user
        Scanner user2 = new Scanner(System.in); // creating a scanner to avoid the nextInt nextLine error
        String operator = user2.nextLine(); // reading in the users input
        System.out.println("Please enter an integer"); // prompting the user
        Scanner user3 = new Scanner (System.in); // creating a scanner
        int secondInt = user3.nextInt(); // reading in the users input

        switch (operator){ // creatin a switch statement for the operator
            case "+" : // creating a case for is they enter a + operator
                int sum = firstInt + secondInt; // finding the sum of the integers
                System.out.println(firstInt + " + " + secondInt + " = " + sum); break; // printing out the answer
            case "-" : // creating a case for is they enter a - operator
                int diff = firstInt - secondInt; // finding the difference of the integers
                System.out.println(firstInt + " - " + secondInt + " = " + diff); break; // printing out the answer
            case "*" :  // creating a case for is they enter a * operator
                int product = firstInt * secondInt; // finding the product of the integers
                System.out.println(firstInt + " * " + secondInt + " = " + product); break; // printing out the answer
            case "/" : // creating a case for is they enter a / operator
                if (secondInt == 0) { // creating an if statement to avoid the divide by 0 error
                    System.out.println("undefined"); // printing out undefined if true
                }else{ // creating an else statement if the second integer is not 0
                    int division = firstInt / secondInt; // finding the answer to the users problem
                    System.out.println(firstInt + " / " + secondInt + " = " + division); // printing out the answer
                } break; // adding a break statement
            case "%" :  // creating a case for is they enter a % operator
                if (secondInt == 0) { // creating an if statement to avoid the divide by 0 error
                    System.out.println("undefined"); // printing out undefined if true
                }else{ // creating as else statement if the second integer is not 0
                    int mod = firstInt % secondInt; // finding the answer to the users problem
                    System.out.println(firstInt + " % " + secondInt + " = " + mod); // printing out the answer
                } break; // creating a break statement
            case ">" : // creating a case for is they enter a > operator
                boolean greater = firstInt > secondInt; // creating a boolean statement to see if the first int is greater than the second
                System.out.println(firstInt + " > " + secondInt + " = " + greater); break; // printing out the answer
            case "<" :  // creating a case for is they enter a < operator
                boolean less = firstInt < secondInt; // creating a boolean statement to see if the first int is less than the second
                System.out.println(firstInt + " < " + secondInt + " = " + less); break; // printing out the answer
        }

    }
}
