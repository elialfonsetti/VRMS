/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vrms_server;

import control.ControllerFactoryServer;
import control.ControllerLogin;
import interfacce_remote.control.ControllerFactoryServerInterface;
import interfacce_remote.control.ControllerLoginInterface;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Antonio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) {

        try {
            ControllerFactoryServer obj = new ControllerFactoryServer();

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind(ControllerFactoryServerInterface.class.getSimpleName(), obj);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    }


