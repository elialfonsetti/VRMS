/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteProvaSVNData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = entity.ProvaSVNPersistentManager.instance().getSession().beginTransaction();
		try {
			entity.Utente lentityUtente = entity.UtenteDAO.loadUtenteByQuery(null, null);
			// Delete the persistent object
			entity.UtenteDAO.delete(lentityUtente);
			entity.Cliente lentityCliente = entity.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			entity.ClienteDAO.delete(lentityCliente);
			entity.Tessera lentityTessera = entity.TesseraDAO.loadTesseraByQuery(null, null);
			// Delete the persistent object
			entity.TesseraDAO.delete(lentityTessera);
			entity.Terminale lentityTerminale = entity.TerminaleDAO.loadTerminaleByQuery(null, null);
			// Delete the persistent object
			entity.TerminaleDAO.delete(lentityTerminale);
			entity.Operazione lentityOperazione = entity.OperazioneDAO.loadOperazioneByQuery(null, null);
			// Delete the persistent object
			entity.OperazioneDAO.delete(lentityOperazione);
			entity.Transizione lentityTransizione = entity.TransizioneDAO.loadTransizioneByQuery(null, null);
			// Delete the persistent object
			entity.TransizioneDAO.delete(lentityTransizione);
			entity.Fornitore lentityFornitore = entity.FornitoreDAO.loadFornitoreByQuery(null, null);
			// Delete the persistent object
			entity.FornitoreDAO.delete(lentityFornitore);
			entity.Ricarica lentityRicarica = entity.RicaricaDAO.loadRicaricaByQuery(null, null);
			// Delete the persistent object
			entity.RicaricaDAO.delete(lentityRicarica);
			entity.Richiesta lentityRichiesta = entity.RichiestaDAO.loadRichiestaByQuery(null, null);
			// Delete the persistent object
			entity.RichiestaDAO.delete(lentityRichiesta);
			entity.Descrizione lentityDescrizione = entity.DescrizioneDAO.loadDescrizioneByQuery(null, null);
			// Delete the persistent object
			entity.DescrizioneDAO.delete(lentityDescrizione);
			entity.Formato lentityFormato = entity.FormatoDAO.loadFormatoByQuery(null, null);
			// Delete the persistent object
			entity.FormatoDAO.delete(lentityFormato);
			entity.Cassiere lentityCassiere = entity.CassiereDAO.loadCassiereByQuery(null, null);
			// Delete the persistent object
			entity.CassiereDAO.delete(lentityCassiere);
			entity.Magazzino lentityMagazzino = entity.MagazzinoDAO.loadMagazzinoByQuery(null, null);
			// Delete the persistent object
			entity.MagazzinoDAO.delete(lentityMagazzino);
			entity.Genere lentityGenere = entity.GenereDAO.loadGenereByQuery(null, null);
			// Delete the persistent object
			entity.GenereDAO.delete(lentityGenere);
			entity.Film lentityFilm = entity.FilmDAO.loadFilmByQuery(null, null);
			// Delete the persistent object
			entity.FilmDAO.delete(lentityFilm);
			entity.ProdottoFornitore lentityProdottoFornitore = entity.ProdottoFornitoreDAO.loadProdottoFornitoreByQuery(null, null);
			// Delete the persistent object
			entity.ProdottoFornitoreDAO.delete(lentityProdottoFornitore);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProvaSVNData deleteProvaSVNData = new DeleteProvaSVNData();
			try {
				deleteProvaSVNData.deleteTestData();
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
