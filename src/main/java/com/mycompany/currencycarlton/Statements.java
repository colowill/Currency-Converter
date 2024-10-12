package com.mycompany.currencycarlton;

/**
 *
 * @author 2headaxe
 */

// Class to organize print statements for the main class


public class Statements {
    
    public static void intro() throws InterruptedException {
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("****                  ****");
        System.out.println("**   CURRENCY CARLTON   **");
        System.out.println("****                  ****");
        System.out.println("++++++++++++++++++++++++++");
        Thread.sleep(2000);
    }
    
    public static void errorIndex() {
        System.out.println("[ ERROR ] The # you entered was out of the range of currencies, please try again.");
    }
    
}
