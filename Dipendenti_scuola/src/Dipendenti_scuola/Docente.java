package Dipendenti_scuola;

import java.time.LocalDate;

public class Docente extends Dipendente{
	private int oreDocenza;
	public Docente(String nominativo, char genere, LocalDate dataNascita, float stipendio, int oreDocenza) {
		super(nominativo, genere, dataNascita, stipendio);
		this.oreDocenza = oreDocenza;
	}
	
	public int getOreDocenza() {
		return oreDocenza;
	}
	
	public String toString() {
		return super.toString();
	}
}
