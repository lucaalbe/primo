package alberoproject;

public class Dipendente {
	private String nominativo;
	private String sesso;
	private String indirizzo;
	
	public Dipendente(String nominativo, String sesso, String indirizzo) {
		this.nominativo = nominativo;
		this.sesso = sesso;
		this.indirizzo = indirizzo;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
}
