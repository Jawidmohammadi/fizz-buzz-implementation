package dev.jawidmohammadi;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
       int upperLimit;
       if (args.length > 0){
           upperLimit = Integer.parseInt(args[0]);
           emitResult(upperLimit);
       } else {
           do {
               upperLimit = getUpperLimit();
               emitResult(upperLimit);
           } while (upperLimit > 0);
       }
    }

    public static int getUpperLimit(){
        int upperLimit;
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Enter a number to count upto!");
                upperLimit = scanner.nextInt();
        } while (upperLimit <= 0);
        return upperLimit;
    }

    public static String getFizzBuzz(int input){
        String fizzBuzz = "";
        if (input>=1) {
            if (input % 3 == 0 && input % 5 == 0) {
                fizzBuzz = "FizzBuzz";
            } else if (input % 5 == 0) {
                fizzBuzz = "Buzz";
            } else if (input % 3 == 0) {
                fizzBuzz = "Fizz";
            } else {
                fizzBuzz = Integer.toString(input);
            }
        }
        return fizzBuzz;
    }

    public static void emitResult(int upperLimit){
        for (int i = 1; i <= upperLimit; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }
}
