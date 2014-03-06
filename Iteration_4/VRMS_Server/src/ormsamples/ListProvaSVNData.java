/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListProvaSVNData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Utente...");
		entity.Utente[] entityUtentes = entity.UtenteDAO.listUtenteByQuery(null, null);
		int length = Math.min(entityUtentes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityUtentes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		entity.Cliente[] entityClientes = entity.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(entityClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tessera...");
		entity.Tessera[] entityTesseras = entity.TesseraDAO.listTesseraByQuery(null, null);
		length = Math.min(entityTesseras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityTesseras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Terminale...");
		entity.Terminale[] entityTerminales = entity.TerminaleDAO.listTerminaleByQuery(null, null);
		length = Math.min(entityTerminales.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityTerminales[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Operazione...");
		entity.Operazione[] entityOperaziones = entity.OperazioneDAO.listOperazioneByQuery(null, null);
		length = Math.min(entityOperaziones.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityOperaziones[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Transizione...");
		entity.Transizione[] entityTransiziones = entity.TransizioneDAO.listTransizioneByQuery(null, null);
		length = Math.min(entityTransiziones.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityTransiziones[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fornitore...");
		entity.Fornitore[] entityFornitores = entity.FornitoreDAO.listFornitoreByQuery(null, null);
		length = Math.min(entityFornitores.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityFornitores[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ricarica...");
		entity.Ricarica[] entityRicaricas = entity.RicaricaDAO.listRicaricaByQuery(null, null);
		length = Math.min(entityRicaricas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityRicaricas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Richiesta...");
		entity.Richiesta[] entityRichiestas = entity.RichiestaDAO.listRichiestaByQuery(null, null);
		length = Math.min(entityRichiestas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityRichiestas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Descrizione...");
		entity.Descrizione[] entityDescriziones = entity.DescrizioneDAO.listDescrizioneByQuery(null, null);
		length = Math.min(entityDescriziones.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityDescriziones[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Formato...");
		entity.Formato[] entityFormatos = entity.FormatoDAO.listFormatoByQuery(null, null);
		length = Math.min(entityFormatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityFormatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cassiere...");
		entity.Cassiere[] entityCassieres = entity.CassiereDAO.listCassiereByQuery(null, null);
		length = Math.min(entityCassieres.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityCassieres[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Magazzino...");
		entity.Magazzino[] entityMagazzinos = entity.MagazzinoDAO.listMagazzinoByQuery(null, null);
		length = Math.min(entityMagazzinos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityMagazzinos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Genere...");
		entity.Genere[] entityGeneres = entity.GenereDAO.listGenereByQuery(null, null);
		length = Math.min(entityGeneres.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityGeneres[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Film...");
		entity.Film[] entityFilms = entity.FilmDAO.listFilmByQuery(null, null);
		length = Math.min(entityFilms.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityFilms[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ProdottoFornitore...");
		entity.ProdottoFornitore[] entityProdottoFornitores = entity.ProdottoFornitoreDAO.listProdottoFornitoreByQuery(null, null);
		length = Math.min(entityProdottoFornitores.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(entityProdottoFornitores[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Utente by Criteria...");
		entity.UtenteCriteria utenteCriteria = new entity.UtenteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//utenteCriteria.ID.eq();
		utenteCriteria.setMaxResults(ROW_COUNT);
		entity.Utente[] entityUtentes = utenteCriteria.listUtente();
		int length =entityUtentes== null ? 0 : Math.min(entityUtentes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityUtentes[i]);
		}
		System.out.println(length + " Utente record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		entity.ClienteCriteria clienteCriteria = new entity.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//clienteCriteria.ID.eq();
		clienteCriteria.setMaxResults(ROW_COUNT);
		entity.Cliente[] entityClientes = clienteCriteria.listCliente();
		length =entityClientes== null ? 0 : Math.min(entityClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Tessera by Criteria...");
		entity.TesseraCriteria tesseraCriteria = new entity.TesseraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tesseraCriteria.codice.eq();
		tesseraCriteria.setMaxResults(ROW_COUNT);
		entity.Tessera[] entityTesseras = tesseraCriteria.listTessera();
		length =entityTesseras== null ? 0 : Math.min(entityTesseras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityTesseras[i]);
		}
		System.out.println(length + " Tessera record(s) retrieved."); 
		
		System.out.println("Listing Terminale by Criteria...");
		entity.TerminaleCriteria terminaleCriteria = new entity.TerminaleCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//terminaleCriteria.codice.eq();
		terminaleCriteria.setMaxResults(ROW_COUNT);
		entity.Terminale[] entityTerminales = terminaleCriteria.listTerminale();
		length =entityTerminales== null ? 0 : Math.min(entityTerminales.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityTerminales[i]);
		}
		System.out.println(length + " Terminale record(s) retrieved."); 
		
		System.out.println("Listing Operazione by Criteria...");
		entity.OperazioneCriteria operazioneCriteria = new entity.OperazioneCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//operazioneCriteria.ID.eq();
		operazioneCriteria.setMaxResults(ROW_COUNT);
		entity.Operazione[] entityOperaziones = operazioneCriteria.listOperazione();
		length =entityOperaziones== null ? 0 : Math.min(entityOperaziones.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityOperaziones[i]);
		}
		System.out.println(length + " Operazione record(s) retrieved."); 
		
		System.out.println("Listing Transizione by Criteria...");
		entity.TransizioneCriteria transizioneCriteria = new entity.TransizioneCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//transizioneCriteria.ID.eq();
		transizioneCriteria.setMaxResults(ROW_COUNT);
		entity.Transizione[] entityTransiziones = transizioneCriteria.listTransizione();
		length =entityTransiziones== null ? 0 : Math.min(entityTransiziones.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityTransiziones[i]);
		}
		System.out.println(length + " Transizione record(s) retrieved."); 
		
		System.out.println("Listing Fornitore by Criteria...");
		entity.FornitoreCriteria fornitoreCriteria = new entity.FornitoreCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//fornitoreCriteria.ID.eq();
		fornitoreCriteria.setMaxResults(ROW_COUNT);
		entity.Fornitore[] entityFornitores = fornitoreCriteria.listFornitore();
		length =entityFornitores== null ? 0 : Math.min(entityFornitores.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityFornitores[i]);
		}
		System.out.println(length + " Fornitore record(s) retrieved."); 
		
		System.out.println("Listing Ricarica by Criteria...");
		entity.RicaricaCriteria ricaricaCriteria = new entity.RicaricaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ricaricaCriteria.ID.eq();
		ricaricaCriteria.setMaxResults(ROW_COUNT);
		entity.Ricarica[] entityRicaricas = ricaricaCriteria.listRicarica();
		length =entityRicaricas== null ? 0 : Math.min(entityRicaricas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityRicaricas[i]);
		}
		System.out.println(length + " Ricarica record(s) retrieved."); 
		
		System.out.println("Listing Richiesta by Criteria...");
		entity.RichiestaCriteria richiestaCriteria = new entity.RichiestaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//richiestaCriteria.ID.eq();
		richiestaCriteria.setMaxResults(ROW_COUNT);
		entity.Richiesta[] entityRichiestas = richiestaCriteria.listRichiesta();
		length =entityRichiestas== null ? 0 : Math.min(entityRichiestas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityRichiestas[i]);
		}
		System.out.println(length + " Richiesta record(s) retrieved."); 
		
		System.out.println("Listing Descrizione by Criteria...");
		entity.DescrizioneCriteria descrizioneCriteria = new entity.DescrizioneCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//descrizioneCriteria.ID.eq();
		descrizioneCriteria.setMaxResults(ROW_COUNT);
		entity.Descrizione[] entityDescriziones = descrizioneCriteria.listDescrizione();
		length =entityDescriziones== null ? 0 : Math.min(entityDescriziones.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityDescriziones[i]);
		}
		System.out.println(length + " Descrizione record(s) retrieved."); 
		
		System.out.println("Listing Formato by Criteria...");
		entity.FormatoCriteria formatoCriteria = new entity.FormatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//formatoCriteria.nome_formato.eq();
		formatoCriteria.setMaxResults(ROW_COUNT);
		entity.Formato[] entityFormatos = formatoCriteria.listFormato();
		length =entityFormatos== null ? 0 : Math.min(entityFormatos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityFormatos[i]);
		}
		System.out.println(length + " Formato record(s) retrieved."); 
		
		System.out.println("Listing Cassiere by Criteria...");
		entity.CassiereCriteria cassiereCriteria = new entity.CassiereCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cassiereCriteria.ID.eq();
		cassiereCriteria.setMaxResults(ROW_COUNT);
		entity.Cassiere[] entityCassieres = cassiereCriteria.listCassiere();
		length =entityCassieres== null ? 0 : Math.min(entityCassieres.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityCassieres[i]);
		}
		System.out.println(length + " Cassiere record(s) retrieved."); 
		
		System.out.println("Listing Magazzino by Criteria...");
		entity.MagazzinoCriteria magazzinoCriteria = new entity.MagazzinoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//magazzinoCriteria.ID.eq();
		magazzinoCriteria.setMaxResults(ROW_COUNT);
		entity.Magazzino[] entityMagazzinos = magazzinoCriteria.listMagazzino();
		length =entityMagazzinos== null ? 0 : Math.min(entityMagazzinos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityMagazzinos[i]);
		}
		System.out.println(length + " Magazzino record(s) retrieved."); 
		
		System.out.println("Listing Genere by Criteria...");
		entity.GenereCriteria genereCriteria = new entity.GenereCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//genereCriteria.nome.eq();
		genereCriteria.setMaxResults(ROW_COUNT);
		entity.Genere[] entityGeneres = genereCriteria.listGenere();
		length =entityGeneres== null ? 0 : Math.min(entityGeneres.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityGeneres[i]);
		}
		System.out.println(length + " Genere record(s) retrieved."); 
		
		System.out.println("Listing Film by Criteria...");
		entity.FilmCriteria filmCriteria = new entity.FilmCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//filmCriteria.ID.eq();
		filmCriteria.setMaxResults(ROW_COUNT);
		entity.Film[] entityFilms = filmCriteria.listFilm();
		length =entityFilms== null ? 0 : Math.min(entityFilms.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityFilms[i]);
		}
		System.out.println(length + " Film record(s) retrieved."); 
		
		System.out.println("Listing ProdottoFornitore by Criteria...");
		entity.ProdottoFornitoreCriteria prodottoFornitoreCriteria = new entity.ProdottoFornitoreCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//prodottoFornitoreCriteria.ID.eq();
		prodottoFornitoreCriteria.setMaxResults(ROW_COUNT);
		entity.ProdottoFornitore[] entityProdottoFornitores = prodottoFornitoreCriteria.listProdottoFornitore();
		length =entityProdottoFornitores== null ? 0 : Math.min(entityProdottoFornitores.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(entityProdottoFornitores[i]);
		}
		System.out.println(length + " ProdottoFornitore record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProvaSVNData listProvaSVNData = new ListProvaSVNData();
			try {
				listProvaSVNData.listTestData();
				//listProvaSVNData.listByCriteria();
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
