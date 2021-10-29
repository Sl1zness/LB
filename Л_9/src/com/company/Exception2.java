package com.company;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (Exception e) {
            System.out.println("ERR");
        } finally {
            System.out.println("END");
        }
        /*catch (ArithmeticException e) {
            System.out.println("Unable to divide by 0");
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse float");
        }*/
    }
}