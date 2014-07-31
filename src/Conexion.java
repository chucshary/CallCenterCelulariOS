/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHay
 */
public class Conexion {
    
    
    public boolean conectar()
    {
       boolean conexion=true; 
      //Aqui se va a iniciar el contacto con el servidor
       //Si si se pudo conectarse va a reproducir el menu inicial desde aqui
       String menuinicial="Si usted es un pelana marque uno. si no marque dos";//Esto lo vas a pedir al servidor desde el metodo inicio de la clase RespuestaResulta del Package MetodosConexion
       LeeTexto.Lee(menuinicial);
       //Y regresaria verdadero
       //Si no pss solo regresa falso
        return conexion;
    }
    
    //Esto es lo que envia el celular
    public int mensajeconexion(String numero)
    {
        return mensaje(numero);//Esto es lo que se regresa al celular
    }
    
    
    
    public int mensaje(String numero)
    {
        String menu="Usted es un pelana de todos modos";
        int opciones=2;
        //Parte de Lee
        //En este metodo se supone que se hara conexion con el servidor 
        //Se le enviara el String numero a  el metodo *respuesta* en la clase RespuestaResultado del 
        //servidor en el Package MetodoConexion y nos devolvera las respuestas
        //en las variables menu y opciones
        audio(menu);//Enviamos el audio a reproducir
        return opciones;//Regresamos las opciones
    }
    
    public void audio(String texto)
    {
        LeeTexto.Lee(texto);
    }
    
//Final //Cuando el cliente nos dice si se resolvio su duda y asi~    
    public void conectarfin(String nombre, String numero, String comentario, String resolucion )
    {
        //Parte de Lee
        //Aqui se supone que enviaras estos datos a el metodo *fin
        //de la clase RespuestaResultado del package MetodosConexion
        //Para que lo inserte en la base de datos~
        
       
    }
    
}
