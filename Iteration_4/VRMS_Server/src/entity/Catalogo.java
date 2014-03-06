package entity;

import interfacce_remote.entity.CatalogoInterface;
import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FormatoInterface;
import interfacce_remote.entity.PagamentoInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public  class Catalogo extends UnicastRemoteObject implements CatalogoInterface{
   

    public Catalogo() throws RemoteException {
    }


  

    public ArrayList<DescrizioneInterface> caricaCatalogo() throws RemoteException {
       return null;
    }

    public ArrayList<DescrizioneInterface> caricaCatalogo(String tipo) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

 


   
}