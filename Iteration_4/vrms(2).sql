-- phpMyAdmin SQL Dump
-- version 3.1.3.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generato il: 26 nov, 2011 at 02:56 PM
-- Versione MySQL: 5.1.33
-- Versione PHP: 5.2.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vrms`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `descrizione`
--

CREATE TABLE IF NOT EXISTS `descrizione` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `GenereNome` varchar(255) DEFAULT NULL,
  `Titolo` varchar(255) DEFAULT NULL,
  `Durata` varchar(255) DEFAULT NULL,
  `Anno` int(11) NOT NULL,
  `Costo` float NOT NULL,
  `Locandina` varchar(255) DEFAULT NULL,
  `Trama` varchar(255) DEFAULT NULL,
  `Consigliato` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKDescrizion761291` (`GenereNome`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dump dei dati per la tabella `descrizione`
--

INSERT INTO `descrizione` (`ID`, `GenereNome`, `Titolo`, `Durata`, `Anno`, `Costo`, `Locandina`, `Trama`, `Consigliato`) VALUES
(1, 'horror', 'Scream', '40', 2001, 2, '/locandine/scream.jpg', 'Una telefonata che sussurra "so cosa hai fatto", la paura e l''angoscia del riemergere d terribili azioni passate "', 1),
(2, 'comico', 'le comiche', '78', 1990, 1, '/locandine/comiche.jpg', 'film di Paolo Villaggio e Renato Pozzetto, che interpretano una coppia in vari ruoli e vicende nel corso del film.', 0),
(3, 'avventura', 'Indiana Jones ', '80', 2010, 2, '/locandine/indiana.jpg', 'Nuovo episodio della celebre saga di Gorge Lucas', 1),
(4, 'comico', 'Una notte al museo', '69', 2009, 2, '/locandine/museo.jpg', 'Segui la bizzarra avventura di uno sventurato amgazziniere all''interno di un museo "stranamente" animato', 0),
(5, 'horror', 'Paranolrmal Activity', '60', 2008, 3, '/locandine/paranormal.jpg', 'La storia di un uomo che viene posseduto dal demonio fino amorire', 1),
(6, 'comico', 'Scemo e più scemo', '70', 2001, 2, '/locandine/scemo.jpg', 'Segui le comiche avventure  di una coppai di amici un po'' particolarie', 1),
(7, 'fantasy', 'Il mistero di Sleepy Hollow', '60', 2007, 1, '/locandine/sleepy.jpg', 'Un medico di città si trova ad analizzare una strana serie di omicidi in un sinistro villaggio di campagna', 0);

-- --------------------------------------------------------

--
-- Struttura della tabella `film`
--

CREATE TABLE IF NOT EXISTS `film` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FormatoNome_formato` varchar(255) DEFAULT NULL,
  `DescrizioneID` int(11) NOT NULL,
  `MagazzinoID` int(11) NOT NULL,
  `Disponibile` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKFilm864825` (`MagazzinoID`),
  KEY `FKFilm697673` (`DescrizioneID`),
  KEY `film` (`FormatoNome_formato`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dump dei dati per la tabella `film`
--

INSERT INTO `film` (`ID`, `FormatoNome_formato`, `DescrizioneID`, `MagazzinoID`, `Disponibile`) VALUES
(1, 'dvd', 1, 1, 1),
(2, 'dvd', 2, 1, 1),
(3, 'vhs', 2, 1, 1),
(4, 'BlueRay', 3, 1, 1),
(5, 'BetaMax', 3, 1, 1),
(6, 'BlueRay', 7, 1, 1),
(7, 'vhs', 6, 1, 1),
(8, 'dvd', 6, 1, 1),
(9, 'vhs', 4, 1, 1),
(10, 'dvd', 4, 1, 1),
(11, 'BlueRay', 4, 1, 1),
(12, 'BetaMax', 4, 1, 1),
(13, 'dvd', 5, 1, 1),
(14, 'vhs', 5, 1, 1),
(15, 'BetaMax', 5, 1, 1),
(16, 'BetaMax', 5, 1, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `formato`
--

CREATE TABLE IF NOT EXISTS `formato` (
  `Nome_formato` varchar(255) NOT NULL,
  `Costo` float NOT NULL,
  PRIMARY KEY (`Nome_formato`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `formato`
--

INSERT INTO `formato` (`Nome_formato`, `Costo`) VALUES
('BetaMax', 1),
('BlueRay', 3),
('dvd', 2),
('vhs', 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `fornitore`
--

CREATE TABLE IF NOT EXISTS `fornitore` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dump dei dati per la tabella `fornitore`
--

INSERT INTO `fornitore` (`ID`, `Nome`) VALUES
(1, 'astraVideo');

-- --------------------------------------------------------

--
-- Struttura della tabella `genere`
--

CREATE TABLE IF NOT EXISTS `genere` (
  `Nome` varchar(255) NOT NULL,
  PRIMARY KEY (`Nome`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `genere`
--

INSERT INTO `genere` (`Nome`) VALUES
('avventura'),
('comico'),
('fantasy'),
('horror');

-- --------------------------------------------------------

--
-- Struttura della tabella `magazzino`
--

CREATE TABLE IF NOT EXISTS `magazzino` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Indirizzo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dump dei dati per la tabella `magazzino`
--

INSERT INTO `magazzino` (`ID`, `Indirizzo`) VALUES
(1, 'ss17bis');

-- --------------------------------------------------------

--
-- Struttura della tabella `operazione`
--

CREATE TABLE IF NOT EXISTS `operazione` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TesseraCodice` varchar(255) DEFAULT NULL,
  `TerminaleCodice` varchar(255) DEFAULT NULL,
  `FilmID` int(11) DEFAULT NULL,
  `Aperto` tinyint(1) NOT NULL,
  `Data_ordine` date DEFAULT NULL,
  `Titolo` varchar(255) DEFAULT NULL,
  `Fornitore` varchar(255) DEFAULT NULL,
  `Formato` varchar(255) DEFAULT NULL,
  `Data_inizio` date DEFAULT NULL,
  `Data_fine` date DEFAULT NULL,
  `Tipo` varchar(255) DEFAULT NULL,
  `Costo_totale` float DEFAULT NULL,
  `Discriminator` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKOperazione250615` (`FilmID`),
  KEY `FKOperazione247745` (`TerminaleCodice`),
  KEY `FKOperazione222091` (`TesseraCodice`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dump dei dati per la tabella `operazione`
--

INSERT INTO `operazione` (`ID`, `TesseraCodice`, `TerminaleCodice`, `FilmID`, `Aperto`, `Data_ordine`, `Titolo`, `Fornitore`, `Formato`, `Data_inizio`, `Data_fine`, `Tipo`, `Costo_totale`, `Discriminator`) VALUES
(3, 'a01', 'u04', 1, 0, NULL, NULL, NULL, NULL, '2011-11-22', '2011-11-24', 'Noleggio', 8, 'Transizione');

-- --------------------------------------------------------

--
-- Struttura della tabella `prodottofornitore`
--

CREATE TABLE IF NOT EXISTS `prodottofornitore` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FornitoreID` int(11) NOT NULL,
  `Nome` varchar(255) DEFAULT NULL,
  `Tempo` int(11) NOT NULL,
  `Genere` varchar(255) DEFAULT NULL,
  `Supporto` varchar(255) DEFAULT NULL,
  `Anno_produzione` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKProdottoFo519793` (`FornitoreID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dump dei dati per la tabella `prodottofornitore`
--

INSERT INTO `prodottofornitore` (`ID`, `FornitoreID`, `Nome`, `Tempo`, `Genere`, `Supporto`, `Anno_produzione`) VALUES
(1, 1, 'rambo', 78, 'avventura', 'dvd', 1230);

-- --------------------------------------------------------

--
-- Struttura della tabella `ricarica`
--

CREATE TABLE IF NOT EXISTS `ricarica` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TesseraCodice` varchar(255) DEFAULT NULL,
  `UtenteID` int(11) NOT NULL,
  `Data` date DEFAULT NULL,
  `Ammontare` float NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKRicarica183480` (`UtenteID`),
  KEY `FKRicarica533296` (`TesseraCodice`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dump dei dati per la tabella `ricarica`
--


-- --------------------------------------------------------

--
-- Struttura della tabella `terminale`
--

CREATE TABLE IF NOT EXISTS `terminale` (
  `Codice` varchar(255) NOT NULL,
  PRIMARY KEY (`Codice`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `terminale`
--

INSERT INTO `terminale` (`Codice`) VALUES
('u01'),
('u02'),
('u03'),
('u04'),
('u05');

-- --------------------------------------------------------

--
-- Struttura della tabella `tessera`
--

CREATE TABLE IF NOT EXISTS `tessera` (
  `Codice` varchar(255) NOT NULL,
  `Credito` float NOT NULL,
  `Attiva` tinyint(1) NOT NULL,
  `Tipo_tariffa` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Codice`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `tessera`
--

INSERT INTO `tessera` (`Codice`, `Credito`, `Attiva`, `Tipo_tariffa`) VALUES
('a01', 187, 1, 'Normale'),
('a02', 300, 1, 'Premium');

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE IF NOT EXISTS `utente` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TesseraCodice` varchar(255) DEFAULT NULL,
  `Nome` varchar(255) DEFAULT NULL,
  `Cognome` varchar(255) DEFAULT NULL,
  `Telefono` varchar(255) DEFAULT NULL,
  `PIN` varchar(255) DEFAULT NULL,
  `Id_card` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Discriminator` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKUtente757180` (`TesseraCodice`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`ID`, `TesseraCodice`, `Nome`, `Cognome`, `Telefono`, `PIN`, `Id_card`, `Email`, `Discriminator`) VALUES
(1, 'a01', 'Elisabetta', 'Alfonsetti', '3343458267', '', 'AQ293882761N', 'bertoldia@hotmail.it', 'Cliente'),
(2, 'a02', 'Antonio', 'Bertoldi', '3200187607', NULL, 'A4848378398798NU', 'aaaa@gmail.com', 'Cliente'),
(3, NULL, 'Stefano', 'Dell''Osa', '3333627898', NULL, '1234', 'aaaa@gmail.com', 'Cassiere');

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `descrizione`
--
ALTER TABLE `descrizione`
  ADD CONSTRAINT `FKDescrizion761291` FOREIGN KEY (`GenereNome`) REFERENCES `genere` (`Nome`);

--
-- Limiti per la tabella `film`
--
ALTER TABLE `film`
  ADD CONSTRAINT `film` FOREIGN KEY (`FormatoNome_formato`) REFERENCES `formato` (`Nome_formato`),
  ADD CONSTRAINT `FKFilm697673` FOREIGN KEY (`DescrizioneID`) REFERENCES `descrizione` (`ID`),
  ADD CONSTRAINT `FKFilm864825` FOREIGN KEY (`MagazzinoID`) REFERENCES `magazzino` (`ID`);

--
-- Limiti per la tabella `operazione`
--
ALTER TABLE `operazione`
  ADD CONSTRAINT `FKOperazione222091` FOREIGN KEY (`TesseraCodice`) REFERENCES `tessera` (`Codice`),
  ADD CONSTRAINT `FKOperazione247745` FOREIGN KEY (`TerminaleCodice`) REFERENCES `terminale` (`Codice`),
  ADD CONSTRAINT `FKOperazione250615` FOREIGN KEY (`FilmID`) REFERENCES `film` (`ID`);

--
-- Limiti per la tabella `prodottofornitore`
--
ALTER TABLE `prodottofornitore`
  ADD CONSTRAINT `FKProdottoFo519793` FOREIGN KEY (`FornitoreID`) REFERENCES `fornitore` (`ID`);

--
-- Limiti per la tabella `ricarica`
--
ALTER TABLE `ricarica`
  ADD CONSTRAINT `FKRicarica183480` FOREIGN KEY (`UtenteID`) REFERENCES `utente` (`ID`),
  ADD CONSTRAINT `FKRicarica533296` FOREIGN KEY (`TesseraCodice`) REFERENCES `tessera` (`Codice`);

--
-- Limiti per la tabella `utente`
--
ALTER TABLE `utente`
  ADD CONSTRAINT `FKUtente757180` FOREIGN KEY (`TesseraCodice`) REFERENCES `tessera` (`Codice`);
