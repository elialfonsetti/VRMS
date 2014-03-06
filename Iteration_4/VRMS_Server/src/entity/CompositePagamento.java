package entity;

import interfacce_remote.entity.PagamentoInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public abstract class CompositePagamento extends UnicastRemoteObject implements PagamentoInterface {

	List<PagamentoInterface> pagamenti= new ArrayList();

    public CompositePagamento() throws RemoteException {
    }

	/**
	 * 
	 * @param p
	 * @return 
	 */


	public void add(PagamentoInterface p) {
		pagamenti.add(p);
	}


        public float CalcolaCosto(Descrizione d, Formato f, int n){
             return 0;
             };
}