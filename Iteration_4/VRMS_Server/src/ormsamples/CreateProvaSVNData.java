/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateProvaSVNData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = entity.ProvaSVNPersistentManager.instance().getSession().beginTransaction();
		try {
			entity.Utente lentityUtente = entity.UtenteDAO.createUtente();
			// Initialize the properties of the persistent object here
			entity.UtenteDAO.save(lentityUtente);
			entity.Cliente lentityCliente = entity.ClienteDAO.createCliente();
			// Initialize the properties of the persistent object here
			entity.ClienteDAO.save(lentityCliente);
			entity.Tessera lentityTessera = entity.TesseraDAO.createTessera();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : attiva, credito, codice
			entity.TesseraDAO.save(lentityTessera);
			entity.Terminale lentityTerminale = entity.TerminaleDAO.createTerminale();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : codice
			entity.TerminaleDAO.save(lentityTerminale);
			entity.Operazione lentityOperazione = entity.OperazioneDAO.createOperazione();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aperto
			entity.OperazioneDAO.save(lentityOperazione);
			entity.Transizione lentityTransizione = entity.TransizioneDAO.createTransizione();
			// Initialize the properties of the persistent object here
			entity.TransizioneDAO.save(lentityTransizione);
			entity.Fornitore lentityFornitore = entity.FornitoreDAO.createFornitore();
			// Initialize the properties of the persistent object here
			entity.FornitoreDAO.save(lentityFornitore);
			entity.Ricarica lentityRicarica = entity.RicaricaDAO.createRicarica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ammontare, cassiere
			entity.RicaricaDAO.save(lentityRicarica);
			entity.Richiesta lentityRichiesta = entity.RichiestaDAO.createRichiesta();
			// Initialize the properties of the persistent object here
			entity.RichiestaDAO.save(lentityRichiesta);
			entity.Descrizione lentityDescrizione = entity.DescrizioneDAO.createDescrizione();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : costo, anno
			entity.DescrizioneDAO.save(lentityDescrizione);
			entity.Formato lentityFormato = entity.FormatoDAO.createFormato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : costo, nome_formato
			entity.FormatoDAO.save(lentityFormato);
			entity.Cassiere lentityCassiere = entity.CassiereDAO.createCassiere();
			// Initialize the properties of the persistent object here
			entity.CassiereDAO.save(lentityCassiere);
			entity.Magazzino lentityMagazzino = entity.MagazzinoDAO.createMagazzino();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lista_film___List_Film_
			entity.MagazzinoDAO.save(lentityMagazzino);
			entity.Genere lentityGenere = entity.GenereDAO.createGenere();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nome
			entity.GenereDAO.save(lentityGenere);
			entity.Film lentityFilm = entity.FilmDAO.createFilm();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : disponibile, descrizione_film
			entity.FilmDAO.save(lentityFilm);
			entity.ProdottoFornitore lentityProdottoFornitore = entity.ProdottoFornitoreDAO.createProdottoFornitore();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : anno_produzione, tempo, fornitore
			entity.ProdottoFornitoreDAO.save(lentityProdottoFornitore);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProvaSVNData createProvaSVNData = new CreateProvaSVNData();
			try {
				createProvaSVNData.createTestData();
			}
			finally {
				entity.ProvaSVNPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
