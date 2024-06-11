package domain;

import java.util.Map;

public class Catalogo extends Risorsa{
	
	private Map <Integer, PacchettoVacanze> m;
	
	
	public Catalogo() {
		
	}
	
	public void consultaCatalogo(int id) {
		
	}
	
	public void inserisciPacchettoVacanze(double costo, Date dataInizio, Date dataFine, Viaggio viaggio, string alloggio,int disponibilità, NumeroStelle stelle) {
		associaPacchettoVacanze(new PacchettoVacanze().setInserisciDatiPacchetto(costo, dataInizio, dataFine, viaggio, alloggio, disponibilità, stelle));
	}
	
	public void associaPacchettoVacanze(PacchettoVacanze p) {
		
	}

}
