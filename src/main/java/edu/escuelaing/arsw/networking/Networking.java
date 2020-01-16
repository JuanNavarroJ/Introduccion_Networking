package edu.escuelaing.arsw.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Networking {

    //Atributos
    private URL personalSite;

    public Networking() throws MalformedURLException {
        personalSite = new URL("http://ldbn.escuelaing.edu.co:80/index.html ");
    }

    public static void main(String[] args) throws Exception {
        URL google = new URL("http://www.google.com/");

        BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()));
        String inputLine = null;

        while ((inputLine = reader.readLine()) != null) {
            System.out.println(inputLine);
            System.out.println();
        }
    }
    

    public String getProtocol() {
        return personalSite.getProtocol();
    }

    public String getAuthority() {
        return personalSite.getAuthority();
    }

    public String getHost() {
        return personalSite.getHost();
    }

    public int getPort() {
        return personalSite.getPort();
    }

    public String getPath() {
        return personalSite.getPath();
    }

    public String getQuery() {
        return personalSite.getQuery();
    }

    public String getFile() {
        return personalSite.getFile();
    }

    public String getRef() {
        return personalSite.getRef();
    }
}
