package CarrieraUniversitaria;

import java.time.LocalDate;

public class Esame {
    private LocalDate dataEsame;
    private String codiceCorso;
    private String nomeCorso;
    private int crediti;
    private char tipo;
    private int voto;
    private Boolean lode;
    private String esito;

    // Costruttore per Esame con voto
    public Esame(LocalDate dataEsame, String codiceCorso, String nomeCorso, int crediti, int voto, Boolean lode) {
        this.dataEsame = dataEsame;
        this.codiceCorso = codiceCorso;
        this.nomeCorso = nomeCorso;
        this.crediti = crediti;
        this.tipo = 'V';
        this.voto = voto;
        this.lode = lode;
        this.esito = esitoEsameConVoto();
    }

    // Costruttore per Esame con idoneità
    public Esame(LocalDate dataEsame, String codiceCorso, String nomeCorso, int crediti) {
        this.dataEsame = dataEsame;
        this.codiceCorso = codiceCorso;
        this.nomeCorso = nomeCorso;
        this.crediti = crediti;
        this.tipo = 'I';
        this.esito = esitoEsameIdoneità();
    }

    public int getCrediti() {
        return crediti;
    }

    public char getTipo() {
        return tipo;
    }

    public int getVoto() {
        return voto;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }
    
    public boolean getLode() {
        return lode;
    }

    public String esitoEsameConVoto() {
        String lodeString = lode ? "con lode" : "senza lode";
        return String.format("In data %tF, nel corso di nome %s e il suo codice %s, lo studente ha ottenuto %d crediti con un voto di %d/30 %s", dataEsame, nomeCorso, codiceCorso, crediti, voto, lodeString);
    }

    public String esitoEsameIdoneità() {
        return String.format("In data %tF, nel corso di nome %s e il suo codice %s, lo studente è risultato idoneo ottenendo %d crediti", dataEsame, nomeCorso, codiceCorso, crediti);
    }
}