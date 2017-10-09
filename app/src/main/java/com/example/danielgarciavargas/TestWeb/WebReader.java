package com.example.danielgarciavargas.TestWeb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by daniel.garcia.vargas on 09/10/2017.
 */

public class WebReader {

    public static String getURL(String string_url){

        String error = "Error: ";

        try {

            URL url = new URL(string_url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if(connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return error + error.toString();
            }

            //Connexió establerta
            InputStream in = connection.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            copyBytes(in,out);
            out.close();
            return out.toString();

        }
        catch (MalformedURLException e) {
            return error + e.toString();
        }
        catch (IOException e) {
            return error + e.toString();
        }

    }

    private static void copyBytes(InputStream in, ByteArrayOutputStream out) throws IOException {
        byte[] bytes = new byte[1024];
        int num_bytes = in.read(bytes);

        while(num_bytes>0){
            out.write(bytes,0,num_bytes);
            num_bytes = in.read(bytes);
        }

    }

}
