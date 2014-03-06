/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;


import interfacce_remote.entity.ProdottoInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

/**
 *
 * @author Utente
 */
public class AdapterProdotto extends UnicastRemoteObject implements Serializable,interfacce_remote.entity.ProdottoInterface{

    ProdottoFornitore adaptee;
    private String name = "NO NAME";
    public void define(String titolo, int durata, String genere, String formato, int anno) {
        adaptee.setNome(titolo);
        adaptee.setTempo(durata);
        adaptee.setGenere(genere);
        adaptee.setSupporto(formato);
        adaptee.setAnno_produzione(anno);
        
    }
    public AdapterProdotto()throws RemoteException{
        adaptee = new ProdottoFornitore();
    }
        
    public String getTitolo() {
        return adaptee.getNome();
    }

    public String getGenere() {
       return adaptee.getGenere();
    }

    public String getFormato() {
        return adaptee.getSupporto();
    }

    public int getDurata() {
         return adaptee.getTempo();
    }

    public int getAnno() {
        return adaptee.getAnno_produzione();
    }

    public void setAdaptee(ProdottoFornitore adaptee) {
        this.adaptee = adaptee;
    }

    public ProdottoFornitore getAdaptee() {
        return adaptee;
    }

   /* public ArrayList<AdapterProdotto> ListaFilm(String text){
        
        ProdottoFornitoreCriteria criteria;
        try {
            criteria = new ProdottoFornitoreCriteria();
            criteria.nome.like("%"+text +"%");
            ProdottoFornitore [] p = ProdottoFornitoreDAO.listProdottoFornitoreByCriteria(criteria);
            ArrayList<AdapterProdotto> pf = new ArrayList(Arrays.asList(p));
            return pf;
           
        } catch (PersistentException ex) {
            Logger.getLogger(AdapterProdotto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }*/
     public ArrayList<AdapterProdotto> ListaFilm(String text) throws RemoteException   {
            ProdottoFornitore pf = new ProdottoFornitore();
        try {
            ArrayList<AdapterProdotto> elencoadapter=new  ArrayList();
            ArrayList<ProdottoFornitore> elencopf= pf.CatalogoFilm(text);
            Iterator<ProdottoFornitore> it= elencopf.iterator();
            int i=0;
            ProdottoFornitore  prod;
             AdapterProdotto adapter=new AdapterProdotto();
            while (it.hasNext())
            {
                prod=it.next();
                adapter.setAdaptee(prod);
                elencoadapter.add(adapter);
            }
             return elencoadapter;
        } catch (PersistentException ex) {
            Logger.getLogger(AdapterProdotto.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;
     }

    public AdapterProdotto ottieniFilmOrdinato(int id) throws RemoteException  {
        try {
            ProdottoFornitore pf = new ProdottoFornitore();
            AdapterProdotto adapter= new AdapterProdotto();
            adapter.setAdaptee(pf.ottieniFilm(id));
            return adapter;

        } catch (PersistentException ex) {
            Logger.getLogger(AdapterProdotto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getID() throws RemoteException {
        return this.getAdaptee().getID();
    }

}
