package Dipendenti_scuola;

import java.time.LocalDate;

public abstract class Dipendente {
	private String nominativo;
	private char genere;
	private LocalDate dataNascita;
	private float stipendio;
	
	public Dipendente (String nominativo, char genere, LocalDate dataNascita, float stipendio) {
		this.nominativo = nominativo;
		this.genere = genere;
		this.dataNascita = dataNascita;
		this.stipendio = stipendio;
	}

	public String getNominativo() {
		return nominativo;
	}

	public char getGenere() {
		return genere;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public float getStipendio() {
		return stipendio;
	}
	
}