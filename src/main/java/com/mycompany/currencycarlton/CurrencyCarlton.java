package com.mycompany.currencycarlton;

import static com.mycompany.currencycarlton.Scraper.*;
import static com.mycompany.currencycarlton.Statements.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 2headaxe
 * Start Date: Monday, September 16, 2024
 * 
 */

// Driver class where all the Conversion happens

public class CurrencyCarlton {
    
    /**
     * ArrayList names: holds names of currencies
     * ArrayList rates: holds conversion rates of currencies to $USD
     * ArrayList icons: holds icons for each currency (TODO: make not hard coded)
     */
    
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<Double> rates = new ArrayList<>();
    static ArrayList<String> icons = new ArrayList<>();
      
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner scan = new Scanner(System.in); // Scanner for user input
        scrapeData();                                // Scraping data to data.txt than reading from it into the arrays
        
        String[] icon
                = {"#","$","₱","$","د.ب","P","R$","B$","лв","$","CLP$","¥","$",
                    "Kč","kr","€","$","Ft","kr","₹","Rp","﷼","₪","¥","₸","₩",
                    "د.ك","ل.","RM","₨","$","Rs","$","kr","﷼","₨","₱","zł","﷼",
                    "RON","₽","ر.س","S$","R","Rs","kr","Fr","NT$","฿","TT$","₺",
                    "د.إ","£","Bs"};
        
        names.add("DEFAULT");
        rates.add(0.00);
        names.add("US Dollar");                    // Adding USD since its not scraped from the website
        rates.add(1.00);
        
        //icons.add(Arrays.asList());
        String s = "";
        readToArray(names,rates);           // Puts names and rates from data.txt into ArrayLists
        
        // START OF PROGRAM
        intro();
        
        int from = 0;                               // Index of which currency user is converting from
        int to = 0;                                 // Index of which currency user is converting to
        boolean exit = false;                       // Decides to wether try/catch block should loop based off of invalid input
        
        // TODO: IMPLIMENT LOOP TO DO MULTIPLE CONVERSION IN ONE RUN
        currencyMenu(names,rates);
        System.out.println();
        System.out.println("\nSelect which currency to convert by typing it's corresponding # seperated by a colon [ from:to ]");
        
 
        while (!exit) {
        /**
         * Iterates through try block, and breaks if it doesn't get caught at any point through the code
         */
            try {
                
                // Scanning input from currencyMenu
                
                String input = scan.nextLine();
                // Splits inputs by : into two seperate vars
                String[] split = input.split(":");                            
       
                from = Integer.parseInt(split[0]);
                to = Integer.parseInt(split[1]);
        
                System.out.println("\n"+names.get(from)+" ("+icon[from]+")  to  "+names.get(to)+" ("+icon[to]+")");
                System.out.print("\nAmount? \n"+icon[from]+" ");
                break;
            } catch (IndexOutOfBoundsException | InputMismatchException | NumberFormatException e) {
                // error message
                errorIndex();               
            }
        }
        
        while (!exit) {
            try {
        
        // TODO figure out why this infinetly loops when catches exception
            double amt = scan.nextDouble();
        
            double conversion = (amt/rates.get(from))*rates.get(to);
            System.out.print("_____________\n");
            System.out.print(icon[to]+" ");
            System.out.println(String.format("%.2f",conversion));
            System.out.println(getTime());
        
            outro();
            break;
        } catch (IndexOutOfBoundsException | InputMismatchException | NumberFormatException e) {
            // error message
            errorIndex();
        }
    }
  }
}