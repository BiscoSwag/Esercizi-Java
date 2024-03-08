package Dipendenti_scuola;

import java.time.LocalDate;

public class ImpiegatoStraordinari extends Dipendente{

	public ImpiegatoStraordinari(String nominativo, char genere, LocalDate dataNascita, float stipendio) {
		super(nominativo, genere, dataNascita, stipendio);
		
	}

}
