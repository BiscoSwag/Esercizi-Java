package CarrieraUniversitaria;

import java.time.LocalDate;

public class Libretto {
    private Studente studente;
    private Esame esami[];
    private int numEsami;

    public Libretto() {
        esami = new Esame[20];
        numEsami = 0;
    }

    public void setStudente(Studente studente) {
        this.studente = studente;
    }

    public void setEsame(Esame esame) {
        if (numEsami < esami.length) {
            esami[numEsami] = esame;
            numEsami++;
        } else {
            System.out.println("Il libretto è pieno. Impossibile aggiungere altri esami.");
        }
    }

    public void stampaLibretto() {
        System.out.println("Libretto di " + studente.getNome() + " " + studente.getCognome() + ":");
        int totCrediti = 0;
        double mediaPonderata = 0.0;

        for (int i = 0; i < numEsami; i++) {
            Esame esame = esami[i];
            System.out.println("Esame " + (i + 1) + ": " + esame.getNomeCorso());

            if (esame.getTipo() == 'V') {
                int crediti = esame.getCrediti();
                int voto = esame.getVoto();
                totCrediti += crediti;
                mediaPonderata += voto * crediti;
                System.out.println("Voto: " + voto);
                if (esame.getLode()) {
                    System.out.println("Con lode. \n");
                } else {
                    System.out.println("Senza lode. \n");
                }
            } else if (esame.getTipo() == 'I') {
                System.out.println("Esame superato con idoneità.");
            }
        }

        if (totCrediti > 0) {
            mediaPonderata /= totCrediti;
        }

        System.out.println("Totale crediti acquisiti: " + totCrediti);
        System.out.println("Media ponderata dei voti: " + mediaPonderata);
    }
}