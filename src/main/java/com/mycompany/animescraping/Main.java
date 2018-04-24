/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animescraping;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Pues4Aula4
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 47; i++) {
            Document doc = null;
            
            try {
                doc = Jsoup.connect("https://www.animeid.tv/series?sort=asc&pag=" + i).get();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (doc != null) {
                Elements elements = doc.select("#result > article > a > header");
                for (Element element : elements) {
                    System.out.println(element.text());
                }
            }
                //https://github.com/in28minutes/java-best-practices
        }

    }

}
