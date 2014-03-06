/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import entity.*;
import interfacce_remote.entity.PagamentoInterface;
import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class PagamentoFactory {

    private static PagamentoFactory instance;

    public static PagamentoFactory getInstance() {
         if (instance == null) {
            instance = new PagamentoFactory();
        }
        return instance;
    }


    public PagamentoInterface getNormalePagamento() throws RemoteException{
        
        PagamentoInterface p;
        p= new NormalePagamento();
        return p;
     }

    public PagamentoInterface getPremiumPagamento() throws RemoteException{

        PagamentoInterface p;
        p= new PremiumPagamento();
        return p;
     }

    public PagamentoInterface CreaPagamento(Tessera t) throws RemoteException
    { 
       CompositeCustomer c= new CompositeCustomer();
       if (t.getTipo_tariffa().equals("Premium"))
              c.add(getPremiumPagamento());
       else
       {      
              c.add(getNormalePagamento());
        }
      ScontoNatale s= new ScontoNatale();
       Date d= new Date();
       
      if (d.before(s.getData_fine()))
           if(d.after(s.getData_inizio()))
           {
               
               c.add(s);
           }
       return c;
     }

    

}
