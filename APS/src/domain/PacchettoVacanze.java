package domain;

import java.util.List;

import Supporto.DateTime;
import Supporto.NumeroStelle;

public class PacchettoVacanze extends Servizio{

	private String alloggio;
	private NumeroStelle stelle;
	private int disponibilita;
	private List <Viaggio> listaViaggi;
	
	public PacchettoVacanze() {
		super();
	}

	public void setAlloggio(String alloggio) {

	}

	public void setStelle(NumeroStelle stelle) {

	}

	public void setDisponibilita(int disponibilita) {
		
	}

	public void setViaggio(Viaggio v) {
		
	}
	
	public void inserisciDatiPacchetto(int costo, DateTime dataInizio, DateTime dataFine, Viaggio v, String alloggio, int disponibilita, NumeroStelle stelle) {
		
		setCosto(costo);
		setDataInizio(dataInizio);
		setDataFine(dataFine);
		setAlloggio(alloggio);
		setStelle(stelle);
		setDisponibilita(disponibilita);
		setViaggio(v);
			
	}
	
	
}
