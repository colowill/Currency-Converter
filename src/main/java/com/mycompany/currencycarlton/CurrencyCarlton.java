package com.mycompany.currencycarlton;

import static com.mycompany.currencycarlton.Scraper.*;
import static com.mycompany.currencycarlton.Statements.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 2headaxe
 * Start Date: Monday, September 16, 2024
 * 
 */

// Driver class where all the Conversion happens

public class CurrencyCarlton {
      
    public static void main(String[] args) throws IOException, InterruptedException {
        
        ArrayList<Double> rate_list = new ArrayList<Double>();
        ArrayList<String> name_list = new ArrayList<String>();
        
        scrapeData(); readToArray(name_list,rate_list);
        
        final int LIST_MAX  = rate_list.size(); int index;
        
        boolean exit = false;
        
        Scanner scan = new Scanner(System.in);
        
            while (!exit) {
            
            intro();
        
            System.out.println("\nConverting from? [Enter a #] ");
        
            
            /**
             * TODO: Format currencies in organized lists
             */
            
            
            for (int i = 0; i < LIST_MAX; i++) {
                System.out.println("[ "+i+" ] "+name_list.get(i));
            }
            
            
            /**
             * TODO: Handle InputMismatchException for index
             */
            
            
            index = scan.nextInt();
            
            while (index > LIST_MAX || index < 0) {
                errorIndex();
                scan.nextInt();
            }
        
    }
  }
}