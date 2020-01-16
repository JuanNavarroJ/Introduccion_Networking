package edu.escuelaing.arsw.networking;

import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class NetworkingTest {

    @Test
    public void deberiaDarLas8Solicitudes() throws MalformedURLException{
        Networking net = new Networking();
        System.out.println(net.getProtocol() + "  Este es el protocolo");
        System.out.println(net.getAuthority() + "  Este es el Autority");
        System.out.println(net.getHost() + "  Este es el Host");
        System.out.println(net.getPort() + "  Este es el Puerto");
        System.out.println(net.getPath() + "  Este es el Path");
        System.out.println(net.getQuery() + "  Este es el Query");
        System.out.println(net.getFile() + "  Este es el Archivo");
        System.out.println(net.getRef() + "  Este es el Ref");
    }
    
    @Test
    public void deberiaLeerDatosDeInternet() throws MalformedURLException, IOException{
        Networking net = new Networking();
        net.leerDatosDeInternet();
    }
    
    @Test
    public void deberiaPedirLaUrl() throws MalformedURLException{
        Networking net = new Networking();
        net.leerUrl();
    }
    
    
}
