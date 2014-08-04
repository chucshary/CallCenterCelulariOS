/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author CHay
 */
public class Conexion {
    
    protected Socket sk;
    protected DataOutputStream envio;
    protected DataInputStream recibo;
    protected DataInputStream recibo2;

    public boolean conectar()
    {
       String mensaje="",mensaje2="";
        try {
            int puerto = 10578;
            sk = new Socket(variables.getIpServer(), puerto);
            envio = new DataOutputStream(sk.getOutputStream());
            recibo = new DataInputStream(sk.getInputStream());
            recibo2 = new DataInputStream(sk.getInputStream());
            mensaje=recibo.readUTF();
            audio(mensaje);
            variables.menuinicial= Integer.parseInt(recibo2.readUTF());
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
            return false;
        }
    }
    
    //Esto es lo que envia el celular
    public int mensajeconexion(String numero)
    {
        return mensaje(numero);//Esto es lo que se regresa al celular
    }
    
    public int mensajeconexioncaso(String numero)
    {
        return mensajecaso(numero);//Esto es lo que se regresa al celular
    }
    public int mensaje(String numero)
    {
        String menu="";
        int opciones=0;
        try{
            envio.writeUTF(numero);
            menu=recibo.readUTF();
            opciones=Integer.valueOf(recibo2.readUTF());
        }catch(IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
        //En este metodo se hara conexion con el servidor 
        //Se le enviara el String numero a  el metodo *respuesta* en la clase RespuestaResultado del 
        //servidor en el Package MetodoConexion y nos devolvera las respuestas
        //en las variables menu y opciones
        audio(menu);//Enviamos el audio a reproducir
        return opciones;//Regresamos las opciones
    }
    
    public int mensajecaso(String numero)
    {
        String menu="";
        int opciones=0;
        try{
            envio.writeUTF(numero);
            menu=recibo.readUTF();
            opciones=Integer.valueOf(recibo2.readUTF());
        }catch(IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
     
        //En este metodose hara conexion con el servidor 
        //Se le enviara el String numero a  el metodo *respuesta* en la clase RespuestaResultado del 
        //servidor en el Package MetodoConexion y nos devolvera las respuestas
        //en las variables menu y opciones
        audio(menu);//Enviamos el audio a reproducir
        return opciones;//Regresamos las opciones
    }
    
public void audio(String texto)
    {
        String aux="";
        for(int i=0; i<texto.length();i++)
        {
            aux=aux+Character.toString(texto.charAt(i));
            if(aux.length()==100)
            {
                aux=aux.trim();
                LeeTexto.Lee(aux.trim());
                aux="";
            }
        }
        aux=aux.trim();
        if(aux.length()!=0)
        LeeTexto.Lee(aux);
    }
    
//Final //Cuando el cliente nos dice si se resolvio su duda y asi~    
    public void conectarfin(String nombrecliente, String contacto, String comentario, String resultado , String idmenu)
    {
        try{
            envio.writeUTF(idmenu);
            envio.writeUTF(nombrecliente);
            envio.writeUTF(contacto);
            envio.writeUTF(resultado);
            envio.writeUTF(comentario);
            
            
        }catch(IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
        //Aqui se enviara estos datos a el metodo *fin
        //de la clase RespuestaResultado del package MetodosConexion
        //Para que lo inserte en la base de datos~
    }
}
