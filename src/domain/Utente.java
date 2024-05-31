package domain;

public class Utente {
	
	private String nome;
	private String cognome;
	private String password;
	private String email;
	private boolean consenso = false;
	private String username;
	
	public Utente() {
		
	}
	
	public void setPassword(String psw) {
		
	}

	public void setNome(String n) {
		
	}

	public void setCognome(String c) {

	}

	public void setEmail(String e) {

	}

	public void setConsensoInformativaPrivacy(boolean consenso) {

	}

	public void setUsername(String us) {
		
	}

	public void inserisciDatiUtente(String psw, String n, String c, String e, String us){
		setPassword(psw);
		setNome(n) ;
		setCognome(c);
		setEmail(e);
		setUsername(us);
	}
	
	
}
