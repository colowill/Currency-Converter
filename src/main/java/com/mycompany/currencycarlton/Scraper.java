package com.mycompany.currencycarlton;

import static com.mycompany.currencycarlton.Statements.getTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.LinkedHashMap;

public class Scraper {
    
    static String source_file = "src/main/java/com/mycompany/currencycarlton/data.txt";
    
    static File data_file = new File(source_file);
    
    public static void scrapeData() throws IOException {
        
        // URL source for conversion rates
        final String url = 
                "https://www.x-rates.com/table/?from=USD&amount=1";
        
        /**
         * FileWriter in order to write to data.txt, also marks the time that the data was scraped
         * Using a .txt file ensures that the user can still convert if they don't
         * have access to the website or internet
         */
        
        FileWriter writer = new FileWriter(data_file);
        String time_update = "Updated as of "+getTime()+" (from URL: "+url+")";
        writer.write(time_update+"\n\n");
        
        
        
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
                    
                    writer.write(currency_name+":"+currency_rate+"\n");
                }   
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
       writer.close(); 
    }
    
    // Method to input currency data from data.txt into a HashMap passed through the parameters
    public static void readToArray(ArrayList<String> name, ArrayList<Double> rate) throws FileNotFoundException {
        
        Scanner scan = new Scanner(data_file);
        scan.useDelimiter("[:\\n]");
        
        scan.nextLine();
        while (scan.hasNext()) {
            name.add(scan.next().trim());
            rate.add(parseDouble(scan.next().trim()));
        }
        scan.close();
    
    }
}

