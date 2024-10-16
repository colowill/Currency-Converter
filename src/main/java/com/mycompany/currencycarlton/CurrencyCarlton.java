package com.mycompany.currencycarlton;

import static com.mycompany.currencycarlton.Scraper.*;
import static com.mycompany.currencycarlton.Statements.*;
import java.io.IOException;
import java.util.ArrayList;
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
        
        // names and rates holds the respective information about the currencies
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> rates = new ArrayList<>();
        
        // Scraping data to data.txt than reading from it into the arrays
        scrapeData(); 
        readToArray(names,rates);
      
        final int LIST_MAX  = rates.size(); 
        int index = 0;     
        boolean exit = false;
        
        Scanner scan = new Scanner(System.in);
        
        intro();
        mainMenu();
        
        while (!exit) {
            
          
            index = scan.nextInt();
            
            switch(index){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    errorIndex();
                    break;
            }
                    
        
    }
  }
}
