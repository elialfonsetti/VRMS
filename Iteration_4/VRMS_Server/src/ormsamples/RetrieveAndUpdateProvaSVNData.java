/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProvaSVNData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = entity.ProvaSVNPersistentManager.instance().getSession().beginTransaction();
		try {
			entity.Utente lentityUtente = entity.UtenteDAO.loadUtenteByQuery(null, null);
			// Update the properties of the persistent object
			entity.UtenteDAO.save(lentityUtente);
			entity.Cliente lentityCliente = entity.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			entity.ClienteDAO.save(lentityCliente);
			entity.Tessera lentityTessera = entity.TesseraDAO.loadTesseraByQuery(null, null);
			// Update the properties of the persistent object
			entity.TesseraDAO.save(lentityTessera);
			entity.Terminale lentityTerminale = entity.TerminaleDAO.loadTerminaleByQuery(null, null);
			// Update the properties of the persistent object
			entity.TerminaleDAO.save(lentityTerminale);
			entity.Operazione lentityOperazione = entity.OperazioneDAO.loadOperazioneByQuery(null, null);
			// Update the properties of the persistent object
			entity.OperazioneDAO.save(lentityOperazione);
			entity.Transizione lentityTransizione = entity.TransizioneDAO.loadTransizioneByQuery(null, null);
			// Update the properties of the persistent object
			entity.TransizioneDAO.save(lentityTransizione);
			entity.Fornitore lentityFornitore = entity.FornitoreDAO.loadFornitoreByQuery(null, null);
			// Update the properties of the persistent object
			entity.FornitoreDAO.save(lentityFornitore);
			entity.Ricarica lentityRicarica = entity.RicaricaDAO.loadRicaricaByQuery(null, null);
			// Update the properties of the persistent object
			entity.RicaricaDAO.save(lentityRicarica);
			entity.Richiesta lentityRichiesta = entity.RichiestaDAO.loadRichiestaByQuery(null, null);
			// Update the properties of the persistent object
			entity.RichiestaDAO.save(lentityRichiesta);
			entity.Descrizione lentityDescrizione = entity.DescrizioneDAO.loadDescrizioneByQuery(null, null);
			// Update the properties of the persistent object
			entity.DescrizioneDAO.save(lentityDescrizione);
			entity.Formato lentityFormato = entity.FormatoDAO.loadFormatoByQuery(null, null);
			// Update the properties of the persistent object
			entity.FormatoDAO.save(lentityFormato);
			entity.Cassiere lentityCassiere = entity.CassiereDAO.loadCassiereByQuery(null, null);
			// Update the properties of the persistent object
			entity.CassiereDAO.save(lentityCassiere);
			entity.Magazzino lentityMagazzino = entity.MagazzinoDAO.loadMagazzinoByQuery(null, null);
			// Update the properties of the persistent object
			entity.MagazzinoDAO.save(lentityMagazzino);
			entity.Genere lentityGenere = entity.GenereDAO.loadGenereByQuery(null, null);
			// Update the properties of the persistent object
			entity.GenereDAO.save(lentityGenere);
			entity.Film lentityFilm = entity.FilmDAO.loadFilmByQuery(null, null);
			// Update the properties of the persistent object
			entity.FilmDAO.save(lentityFilm);
			entity.ProdottoFornitore lentityProdottoFornitore = entity.ProdottoFornitoreDAO.loadProdottoFornitoreByQuery(null, null);
			// Update the properties of the persistent object
			entity.ProdottoFornitoreDAO.save(lentityProdottoFornitore);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utente by UtenteCriteria");
		entity.UtenteCriteria utenteCriteria = new entity.UtenteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//utenteCriteria.ID.eq();
		System.out.println(utenteCriteria.uniqueUtente());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		entity.ClienteCriteria clienteCriteria = new entity.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//clienteCriteria.ID.eq();
		System.out.println(clienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Tessera by TesseraCriteria");
		entity.TesseraCriteria tesseraCriteria = new entity.TesseraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tesseraCriteria.codice.eq();
		System.out.println(tesseraCriteria.uniqueTessera());
		
		System.out.println("Retrieving Terminale by TerminaleCriteria");
		entity.TerminaleCriteria terminaleCriteria = new entity.TerminaleCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//terminaleCriteria.codice.eq();
		System.out.println(terminaleCriteria.uniqueTerminale());
		
		System.out.println("Retrieving Operazione by OperazioneCriteria");
		entity.OperazioneCriteria operazioneCriteria = new entity.OperazioneCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//operazioneCriteria.ID.eq();
		System.out.println(operazioneCriteria.uniqueOperazione());
		
		System.out.println("Retrieving Transizione by TransizioneCriteria");
		entity.TransizioneCriteria transizioneCriteria = new entity.TransizioneCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//transizioneCriteria.ID.eq();
		System.out.println(transizioneCriteria.uniqueTransizione());
		
		System.out.println("Retrieving Fornitore by FornitoreCriteria");
		entity.FornitoreCriteria fornitoreCriteria = new entity.FornitoreCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//fornitoreCriteria.ID.eq();
		System.out.println(fornitoreCriteria.uniqueFornitore());
		
		System.out.println("Retrieving Ricarica by RicaricaCriteria");
		entity.RicaricaCriteria ricaricaCriteria = new entity.RicaricaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ricaricaCriteria.ID.eq();
		System.out.println(ricaricaCriteria.uniqueRicarica());
		
		System.out.println("Retrieving Richiesta by RichiestaCriteria");
		entity.RichiestaCriteria richiestaCriteria = new entity.RichiestaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//richiestaCriteria.ID.eq();
		System.out.println(richiestaCriteria.uniqueRichiesta());
		
		System.out.println("Retrieving Descrizione by DescrizioneCriteria");
		entity.DescrizioneCriteria descrizioneCriteria = new entity.DescrizioneCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//descrizioneCriteria.ID.eq();
		System.out.println(descrizioneCriteria.uniqueDescrizione());
		
		System.out.println("Retrieving Formato by FormatoCriteria");
		entity.FormatoCriteria formatoCriteria = new entity.FormatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//formatoCriteria.nome_formato.eq();
		System.out.println(formatoCriteria.uniqueFormato());
		
		System.out.println("Retrieving Cassiere by CassiereCriteria");
		entity.CassiereCriteria cassiereCriteria = new entity.CassiereCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//cassiereCriteria.ID.eq();
		System.out.println(cassiereCriteria.uniqueCassiere());
		
		System.out.println("Retrieving Magazzino by MagazzinoCriteria");
		entity.MagazzinoCriteria magazzinoCriteria = new entity.MagazzinoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//magazzinoCriteria.ID.eq();
		System.out.println(magazzinoCriteria.uniqueMagazzino());
		
		System.out.println("Retrieving Genere by GenereCriteria");
		entity.GenereCriteria genereCriteria = new entity.GenereCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//genereCriteria.nome.eq();
		System.out.println(genereCriteria.uniqueGenere());
		
		System.out.println("Retrieving Film by FilmCriteria");
		entity.FilmCriteria filmCriteria = new entity.FilmCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//filmCriteria.ID.eq();
		System.out.println(filmCriteria.uniqueFilm());
		
		System.out.println("Retrieving ProdottoFornitore by ProdottoFornitoreCriteria");
		entity.ProdottoFornitoreCriteria prodottoFornitoreCriteria = new entity.ProdottoFornitoreCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//prodottoFornitoreCriteria.ID.eq();
		System.out.println(prodottoFornitoreCriteria.uniqueProdottoFornitore());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProvaSVNData retrieveAndUpdateProvaSVNData = new RetrieveAndUpdateProvaSVNData();
			try {
				retrieveAndUpdateProvaSVNData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProvaSVNData.retrieveByCriteria();
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
