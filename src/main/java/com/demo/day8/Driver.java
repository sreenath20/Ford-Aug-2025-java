package com.demo.day8;

public class Driver {
    public static void main(String[] args){

        try {
            first();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of main() function");
    }
    static Double first() throws CustomException {

            throw new CustomException("Custome message");

        // next instruction
       // System.out.println("End of first method");
    }
}
