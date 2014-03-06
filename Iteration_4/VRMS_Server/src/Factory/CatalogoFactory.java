/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import entity.*;
import interfacce_remote.entity.DescrizioneInterface;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class CatalogoFactory {

    private static CatalogoFactory instance;

    public static CatalogoFactory getInstance() {
         if (instance == null) {
            instance = new CatalogoFactory();
        }
        return instance;
    }


    public  Catalogo getCatalogoRecenti() throws RemoteException{
        
        Catalogo c;
        c= new CatalogoRecenti();
        return  c;
        
     }

    public Catalogo getCatalogoConsigliati() throws RemoteException{

        Catalogo c;
        c= new CatalogoConsigliati();
        return  c;

     }
   

   public Catalogo CreaCatalogo(String tipo) throws RemoteException
    {
    
       if(tipo=="consigliato")
        
          return getCatalogoConsigliati();
        
       else
           
          return getCatalogoRecenti();
        
       
     }

    

}
