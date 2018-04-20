/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animescraping;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Pues4Aula4
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        
        for (int i = 1; i <= 47; i++) {
            Document doc = Jsoup.connect("https://www.animeid.tv/series?sort=asc&pag="+i).get();
            Elements elements = doc.select("#result > article > a > header");
        
        for (Element element : elements) {
            System.out.println(element.text());
        }
        }
        
        
    }

}
