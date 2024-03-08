package Libreria;
public class Libro {
	private String titolo;
	private String autore;
	private String codice;
	private int annoDiPubblicazione;
	private float larghezza;
	
	public Libro(String titolo, String autore, String codice, int annoDiPubblicazione, float larghezza){
		this.titolo = titolo;
		this.autore = autore;
		this.codice = codice;
		this.annoDiPubblicazione = annoDiPubblicazione;
		this.larghezza = larghezza;
	}
	
	public String getTitolo() {
		return titolo;
	}	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}

	public int getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}
	public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	public float getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}
}
