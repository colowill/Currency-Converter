package com.mycompany.currencycarlton;

import static com.mycompany.currencycarlton.Scraper.*;
import static com.mycompany.currencycarlton.Statements.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;


/**
 *
 * @author 2headaxe
 * Start Date: Monday, September 16, 2024
 * 
 */

// Driver class where all the Conversion happens

public class CurrencyCarlton {
      
    public static void main(String[] args) throws IOException, InterruptedException {

        LinkedHashMap<String,Double> currency_list = new LinkedHashMap<>();
        
        
        scrapeData(); readToArray(currency_list);
        
        final int LIST_MAX  = currency_list.size(); int index = 0;
        
        boolean exit = false;
        
        Scanner scan = new Scanner(System.in);
        
        
        for (HashMap.Entry<String, Double> entry : currency_list.entrySet()) {
            System.out.printf("%-10s %-10.2f%n", entry.getKey(), entry.getValue());
        }
            /*
            while (!exit) {
            
            intro();
              UNCOMMENT THIS LINE
            System.out.println("\nConverting from? [Enter a #] ");

            // TODO: Format currencies in organized lists
            
            
            
            for (int i = 0; i < LIST_MAX; i++) {
                System.out.println("[ "+i+" ] "+name_list.get(i));
            }
            
            // TODO: Handle InputMismatchException for index
 
            index = scan.nextInt();
            
            while (index > LIST_MAX || index < 0) {
                errorIndex();
                scan.nextInt();
            }
            
            */
        
    }
  }
