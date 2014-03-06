/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import entity.*;
import interfacce_remote.control.ControllerClienteInterface;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.TesseraInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

/**
 *
 * @author Antonio
 */
public class ControllerCliente extends UnicastRemoteObject implements ControllerClienteInterface {
    private static ControllerCliente instance;
    private  Map<String,Cliente> clienti = new HashMap();

    public ControllerCliente() throws RemoteException {
    }
   

    public ClienteInterface getCliente(String terminale) {
        return clienti.get(terminale);
    }

    public void setCliente(ClienteInterface cliente, String terminale) throws RemoteException, PersistentException {
      ClienteCriteria criteria = new ClienteCriteria();
      criteria.id_card.eq(cliente.getId_card());
      Cliente cl= ClienteDAO.loadClienteByCriteria(criteria);
      clienti.put(terminale,cl);
    }

    
    public static ControllerCliente getInstance() throws RemoteException {
         if (instance == null) {
            instance = new ControllerCliente();
        }
        return instance;
    }

    public void NuovoCliente(ClienteInterface cliente, TesseraInterface tessera)throws PersistentException {
        try {
            Cliente cl = new Cliente();
            Tessera te = new Tessera();
            cl.setNome(cliente.getNome());
            cl.setCognome(cliente.getCognome());
            cl.setEmail(cliente.getEmail());
            cl.setId_card(cliente.getId_card());
            cl.setTelefono(cliente.getTelefono());
            te.setCodice(tessera.getCodice());
            te.setAttiva(true);
            te.setCredito(0);
            te.setTipo_tariffa("Normale");
            cl.setTessera_personale(te);
            TesseraDAO.save(te);
            ClienteDAO.save(cl);
        } catch (RemoteException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Cliente CercaCliente(String cod) throws PersistentException {
        ClienteCriteria criteria = new ClienteCriteria();
        criteria.createTessera_personaleCriteria().codice.eq(cod);
        Cliente cliente = ClienteDAO.loadClienteByCriteria(criteria);
        return cliente;
    }

    public void ModificaCliente(ClienteInterface cliente)throws PersistentException {
        try {
            Cliente cl = ClienteDAO.getClienteByORMID(cliente.getID());
            Tessera te = TesseraDAO.getTesseraByORMID(cl.getTessera_personale().getORMID());
            cl.setNome(cliente.getNome());
            cl.setCognome(cliente.getCognome());
            cl.setEmail(cliente.getEmail());
            cl.setId_card(cliente.getId_card());
            cl.setTelefono(cliente.getTelefono());
            te.setCodice(cliente.getTessera_personale().getCodice());
            te.setAttiva(true);
            te.setCredito(cliente.getTessera_personale().getCredito());
            te.setTipo_tariffa("Normale");
            cl.setTessera_personale(te);
            TesseraDAO.update(te);
            ClienteDAO.update(cl);

        } catch (RemoteException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ModificaTessera(TesseraInterface tessera)throws PersistentException {
        try {
            Tessera te = TesseraDAO.getTesseraByORMID(tessera.getORMID());
            te.setCodice(tessera.getCodice());
            te.setAttiva(tessera.getAttiva());
            te.setCredito(tessera.getCredito());
            te.setTipo_tariffa(tessera.getTipo_tariffa());
            TesseraDAO.update(te);
        } catch (RemoteException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public Cliente CercaTessera(String text) throws PersistentException {
      ClienteCriteria criteria= new ClienteCriteria();
      criteria.id_card.eq(text);
      Cliente cliente= ClienteDAO.loadClienteByCriteria(criteria);
      return cliente;
    }

    public boolean CheckNoleggi(String terminale) throws PersistentException {
        try {
            TransizioneCriteria criteria = new TransizioneCriteria();
            criteria.createTesseraCriteria().codice.eq(clienti.get(terminale).getTessera_personale().getCodice());
            criteria.aperto.eq(Boolean.TRUE);
            criteria.tipo.eq("noleggio");
            Transizione[] t = TransizioneDAO.listTransizioneByCriteria(criteria);
            if (t.length == 0) {
                return true;
            }
            return false;
        } catch (RemoteException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;
 
    }

    public ClienteInterface CreaCliente() throws RemoteException {
       return new Cliente();
    }

    public TesseraInterface CreaTessera() throws RemoteException {
        return new Tessera();
    }


  

}
