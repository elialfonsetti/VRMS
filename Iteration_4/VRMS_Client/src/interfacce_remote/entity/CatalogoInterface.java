/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.entity;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public interface CatalogoInterface {


    public ArrayList<DescrizioneInterface> caricaCatalogo(String tipo) throws RemoteException;
}
