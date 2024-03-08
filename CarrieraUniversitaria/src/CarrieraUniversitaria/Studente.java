package CarrieraUniversitaria;

import java.time.LocalDate;

public class Studente {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private String indirizzo;
    private String citta;
    private String matricola;

    public Studente(String nome, String cognome, LocalDate dataDiNascita, String indirizzo, String citta) {
        this.cognome = cognome;
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.matricola = Matricola();
    }

    public String getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String Matricola() {
        char inizialeCognome = cognome.charAt(0);
        char LetteraNome = nome.charAt(1);
        char ultimaLetteraCognome = cognome.charAt(cognome.length() - 1);
        int meseNascita = dataDiNascita.getMonthValue();
        String primeDueLettereCitta = citta.substring(0, 2);

        return String.format("%c%c%c%d%s", inizialeCognome, LetteraNome, ultimaLetteraCognome, meseNascita, primeDueLettereCitta);
    }
}