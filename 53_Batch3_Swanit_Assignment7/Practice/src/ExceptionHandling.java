//Author:Swanit Rivankar
//RollNo:2453
//Title:Java Application Demonstrating Exception Handling, Generics, and Lambda Functions
//Start Date:22nd October 2024
//Modified Date:22nd October 2024
//Description:This Java program offers a simple menu-driven application with options to test various programming concepts, including exception handling, generic classes, and lambda functions.

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

    // Method to test ArithmeticException
    public void testArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // Method to test NullPointerException
    public void testNullPointerException() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // Method to test ArrayIndexOutOfBoundsException
    public void testArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Method to test IllegalArgumentException
    public void testIllegalArgumentException() {
        try {
            throw new IllegalArgumentException("Illegal argument provided!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    // Method to test ClassCastException
    public void testClassCastException() {
        try {
            Object obj = new Integer(42);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    // Method to test NumberFormatException
    public void testNumberFormatException() {
        try {
            int num = Integer.parseInt("NotANumber");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    // Method to test FileNotFoundException
    public void testFileNotFoundException() {
        try {
            throw new FileNotFoundException("File not found!");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }

    // Method to test IOException
    public void testIOException() {
        try {
            throw new IOException("I/O operation failed!"); 
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
    
}