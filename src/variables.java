/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHay
 */
public class variables {
    
    public static String menu="", numeroingr="";
    public static String nombre="", contacto="", comentario="";
    public static int menuinicial=0;
    public static void clear()
    {
     String menu="", numeroingr="";
     String nombre="", contacto="", comentario="";
     menuinicial=0;
    }
    private static String ipServer="";

    /**
     * @return the ipServer
     */
    public static String getIpServer() {
        return ipServer;
    }

    /**
     * @param aIpServer the ipServer to set
     */
    public static void setIpServer(String aIpServer) {
        ipServer = aIpServer;
    }

}
