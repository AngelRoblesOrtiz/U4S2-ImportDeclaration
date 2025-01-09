package partA.example;

import java.util.Scanner; //imported scanner item so that it can be used

public class Example01_ExplicitImport { //declares the parent class
    public static void main(String[] args) { //declares the main class
        Scanner sc = new Scanner(System.in); //initializes a scanner item named sc
        System.out.println("Hello user, please enter a number."); //printed message
        int numEntered = sc.nextInt(); //initialized an integer that takes input
        System.out.println("You entered " + numEntered); //printed a message with input
    } //closed main class
} //closed parent class
