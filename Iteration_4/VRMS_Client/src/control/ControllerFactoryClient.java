/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import interfacce_remote.control.ControllerFactoryServerInterface;
import interfacce_remote.entity.TerminaleInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Observer;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class ControllerFactoryClient {
    private static ControllerFactoryClient instance;
    private static ControllerFactoryServerInterface controllerInterface;
    private String terminale= "u04";
    static Logger logger=Logger.getLogger("global");


    private ControllerFactoryClient() throws RemoteException, NotBoundException, MalformedURLException{
    
        System.setSecurityManager(new RMISecurityManager());
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        controllerInterface =(ControllerFactoryServerInterface) registry.lookup(ControllerFactoryServerInterface.class.getSimpleName());
       
    }



    public static ControllerFactoryClient getInstance() throws RemoteException, NotBoundException, MalformedURLException{
        if(instance==null)
            instance = new ControllerFactoryClient();
        return instance;
    }

    public ControllerFactoryServerInterface getFornitoreInterface(){
        return controllerInterface;
    }

    public String  getTerminale() {
        return terminale;
    }

   
    
}


