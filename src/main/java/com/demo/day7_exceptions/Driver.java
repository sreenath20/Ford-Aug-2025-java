package com.demo.day7_exceptions;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Welcome to my application...");
        //int i = 10 / 0; // unchecked exception by compiler

        try { // business logic block
            // int i = 10 / 0;// application will terminate immediately @line of exception
            int[] array = {1, 2, 3};
            //System.out.println(array[4]);

            try { // inner try block exceptions are
                String name = null;
                System.out.println(name.length());
                // next instructions
                System.out.println("next instruction inside inner try block");
            } finally {
                System.out.println("Inner finally");
            }
            // next instructions
            System.out.println("next instruction inside try block");
        } catch (ArithmeticException e) { // error handling block
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) { // specefic exception handling
            System.out.println(e.getMessage());
        } finally { // deallocate resources i.e finally will always ges executed
            System.out.println("Finally will get executed always");
        }

        System.out.println("Reached end of my application..."); // normal program termination
    }
}
