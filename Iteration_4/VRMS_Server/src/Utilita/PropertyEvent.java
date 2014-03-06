/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilita;

import control.ControllerRicerca;


/**
 *
 * @author Andrea
 */
public class PropertyEvent {

    private Object Sorgente=null;
    private String nomeProprieta="";
    private Object vecchioValore=null;
    private Object nuovoValore=null;

    public PropertyEvent(Object Sorgente, String nomeProprieta, Object vecchioValore, Object nuovoValore  )
    {
        this.Sorgente=Sorgente;
        this.nomeProprieta=nomeProprieta;
        this.vecchioValore=vecchioValore;
        this.nuovoValore=nuovoValore;

    }
    public PropertyEvent(Object Sorgente, String nomeProprieta, Object nuovoValore  )
    {
        this.Sorgente=Sorgente;
        this.nomeProprieta=nomeProprieta;
        this.nuovoValore=nuovoValore;

    }

    public PropertyEvent(Object Sorgente, String nomeProprieta )
    {
        this.Sorgente=Sorgente;
        this.nomeProprieta=nomeProprieta;


    }
    public PropertyEvent(Object Sorgente)
    {
        this.Sorgente=Sorgente;
    }

    public PropertyEvent(String nomeProprieta)
    {

        this.nomeProprieta=nomeProprieta;


    }
    
    public PropertyEvent(){
    }

    public Object getSorgente() {
        return Sorgente;
    }

    public void setSorgente(Object Sorgente) {
        this.Sorgente = Sorgente;
    }

    public void setNomeProprieta(String nomeProprieta) {
        this.nomeProprieta = nomeProprieta;
    }

    public void setNuovoValore(Object nuovoValore) {
        this.nuovoValore = nuovoValore;
    }

    public void setVecchioValore(Object vecchioValore) {
        this.vecchioValore = vecchioValore;
    }

    public String getNomeProprieta() {
        return nomeProprieta;
    }

    public Object getNuovoValore() {
        return nuovoValore;
    }

    public Object getVecchioValore() {
        return vecchioValore;
    }



}
