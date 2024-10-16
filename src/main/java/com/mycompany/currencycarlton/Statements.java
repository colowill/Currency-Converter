package com.mycompany.currencycarlton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 *
 * @author 2headaxe
 */

// Class to organize print statements for the main class


public class Statements {
    
    // Intro message
    public static void intro() throws InterruptedException {
        System.out.print(
        "\t\t\t\t    ++++++++++++++++++++++++++++++++++++++++\n" +
        "\t\t\t\t   *****                                *****\n" +
        "\t\t\t\t *****    WELCOME TO CURRENCY CARLTON     *****\n" +
        "\t\t\t\t   *****                                *****\n" +
        "\t\t\t\t    ++++++++++++++++++++++++++++++++++++++++\n");
        Thread.sleep(800);
    }
    
    public static void errorIndex() {
        System.out.println("[ERROR] Input was invalid, please try again.");
    }
    
    public static String getTime() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm 'EST'");
        return time.format(formatted);
    }
    
    public static void currencyMenu(ArrayList<String> name, ArrayList<Double> rate) {
        int numColumns = 4;
        int perColumn = name.size()/numColumns; // 13 per column
        int tabs = 36; // # of tabs between each input
        
        for (int i = 1; i <= perColumn; i++) {
            
            String output = ("\n[ "+i+" ] "+name.get(i));
            int length = output.length();
            System.out.print(output);
            
            for (int j = 0; j < tabs-length; j++) System.out.print(" ");
            
            output = ("[ "+(i+perColumn)+" ] "+name.get(i+perColumn));
            length = output.length();
            System.out.print(output);
            
            for (int j = 0; j < tabs-length; j++) System.out.print(" ");
            
            output = ("[ "+(i+perColumn*2)+" ] "+name.get(i+perColumn*2));
            length = output.length();
            System.out.print(output);
            
            for (int j = 0; j < tabs-length; j++) System.out.print(" ");
            
            output = ("[ "+(i+perColumn*3)+" ] "+name.get(i+perColumn*3));
            System.out.print(output);
        }
    }
}