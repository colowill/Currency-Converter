package com.mycompany.currencycarlton;

import static com.mycompany.currencycarlton.Scraper.*;
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
        ArrayList<Double> rate_list = new ArrayList<Double>();
        ArrayList<String> name_list = new ArrayList<String>();
        
        scrapeData();
        
        readToArray(name_list,rate_list);
        
        System.out.println(name_list.get(1));
        
    }
}