/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonatasmaxi
 */
public class TLS {

    public static String testConnection() {
        StringBuilder result = new StringBuilder();
        URL url;
        try {
            url = new URL("https://tls12.pagar.me");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
            return result.toString();
        } catch (MalformedURLException ex) {
            Logger.getLogger(TLS.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        } catch (IOException ex) {
            Logger.getLogger(TLS.class.getName()).log(Level.SEVERE, null, ex);
           return ex.getMessage();
        }
         
    }
    

    public static void main(String[] args) {
        System.out.println(testConnection());
    }

}
