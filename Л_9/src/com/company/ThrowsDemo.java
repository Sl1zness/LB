package com.company;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try {
            Scanner myScanner = new Scanner( System.in );
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            printDetails(key);
        } catch (Exception e) {
            try {
                Scanner myScanner = new Scanner( System.in );
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
            } catch (Exception e1) {
                System.out.println("ERR");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}

/*public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e){
            throw e;
        }
    }
    private String getDetails(String key) {
        try {
            if(key.equals("")) {
                throw new Exception();
            }
        } catch (Exception e) {
            return "Key is set to empty string";
        }
        return "data for " + key;
    }
}*/

/*public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            return "null";
        }
        return "data for " + key;
    }
}*/