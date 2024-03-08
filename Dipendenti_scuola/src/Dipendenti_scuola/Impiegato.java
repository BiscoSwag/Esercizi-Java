package Dipendenti_scuola;

import java.time.LocalDate;

public class Impiegato extends Dipendente{
	private int livello;
	
	public Impiegato (int livello, String nominativo, char genere,LocalDate dataNascita, float stipendio) {
		super(nominativo, genere, dataNascita, stipendio);
		this.livello = livello;
	}

	public int getLivello() {
		return livello;
	}
	
}