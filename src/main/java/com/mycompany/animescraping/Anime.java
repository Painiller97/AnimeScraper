/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animescraping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Pues4Aula4
 */
public class Anime {
    private String url;
    private String titulo;
    private String descripcion;
    private ArrayList capitulos;
    private boolean emision;
    private boolean error;
    private String error_desc;

    public Anime(String url)  {
        try {
            this.url=url;
            Document doc = Jsoup.connect(url).get();
        } catch (IOException ex) {
            Logger.getLogger(Anime.class.getName()).log(Level.SEVERE, null, ex);
            this.error=true;
            this.error_desc=ex.getMessage();
        }
    }

}
