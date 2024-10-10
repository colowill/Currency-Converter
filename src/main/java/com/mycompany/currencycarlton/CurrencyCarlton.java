package com.mycompany.currencycarlton;
import static com.mycompany.currencycarlton.Scraper.scrapeData;
import java.io.IOException;
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
    
    public static void main(String[] args) throws IOException {
        
        scrapeData();
        
    }
}