package com.mycompany.currencycarlton;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;



/**
 *
 * @author 2headaxe
 * Start Date: Monday, September 16, 2024
 * 
 */


// Driver class where all the Conversion happens


public class CurrencyCarlton {
    
    public static void main(String[] args) {
        
        // ArrayList init to hold Currency names and conversion rates
        ArrayList<Double> rate_list = new ArrayList<Double>();
        ArrayList<String> name_list = new ArrayList<String>();

        
        // URL source
        final String url = 
                "https://www.x-rates.com/table/?from=USD&amount=1";
        
        try {
            // Scraping data using Jsoup
            final Document data = Jsoup.connect(url).get();
            
            for (Element row : data.select(
                    
                // Name of table class that holds exchange rates @ url
         "table.tablesorter.ratesTable tr")) {
                
                // Makes sure first data entry isn't empty
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                } 
                else {
                    // Selects row class @ URL and converts them to variables
                    final String currency_name = row.select("td:nth-of-type(1)").text();
                    final double currency_rate = Double.parseDouble(row.select("td:nth-of-type(2)").text());
                        System.out.println(currency_name+": "+currency_rate);
                        
                    name_list.add(currency_name);
                    rate_list.add(currency_rate);
                }
                
                
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}