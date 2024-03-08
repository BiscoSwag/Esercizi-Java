package CarrieraUniversitaria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il cognome dello studente: ");
        String cognome = input.nextLine();

        System.out.println("Inserisci il nome dello studente: ");
        String nomeStud = input.nextLine();

        System.out.println("Inserisci la data di nascita (formato yyyy-MM-dd): ");
        String dataDiNascitaStr = input.nextLine();
        LocalDate dataDiNascita = LocalDate.parse(dataDiNascitaStr);

        System.out.println("Inserisci l'indirizzo dello studente: ");
        String indirizzo = input.nextLine();

        System.out.println("Inserisci la città dello studente: ");
        String citta = input.nextLine();

        Studente stud = new Studente(nomeStud, cognome, dataDiNascita, indirizzo, citta);

        System.out.println("la matricola dello studente è: " + stud.getMatricola());

        Libretto libretto = new Libretto();
        libretto.setStudente(stud);

        while (true) {
            System.out.println("Inserisci la data dell'esame (formato yyyy-MM-dd): ");
            String dataStr = input.nextLine();
            LocalDate data = LocalDate.parse(dataStr);

            System.out.println("Inserisci il codice del corso: ");
            String codice = input.nextLine();

            System.out.println("Inserisci il nome del corso: ");
            String nomeCorso = input.nextLine();

            System.out.println("Inserisci la quantità di crediti da assegnare (3/6/9/12): ");
            int crediti = input.nextInt();

            System.out.println("Inserisci il tipo di valutazione che vuoi utilizzare (inserisci V per voto o I per idoneità): ");
            char tipo = input.next().charAt(0);

            boolean lode = false;

            Esame esameConVoto = null;
            Esame esameConIdoneità = null;

            if (tipo == 'V' || tipo == 'v') {
                System.out.println("Inserisci il voto che vuoi assegnare (con un minimo di 18 e un massimo di 30): ");
                int voto = input.nextInt();
                input.nextLine();
                if (voto >= 18 && voto < 30) {
                    esameConVoto = new Esame(data, codice, nomeCorso, crediti, voto, false);
                } else if (voto == 30) {
                    System.out.println("Con lode (rispondi con si o no)?");
                    String scelta = input.nextLine();
                    if (scelta.equalsIgnoreCase("si")) {
                        lode = true;
                    }
                    esameConVoto = new Esame(data, codice, nomeCorso, crediti, voto, lode);
                }
            } else if (tipo == 'I' || tipo == 'i') {
                esameConIdoneità = new Esame(data, codice, nomeCorso, crediti);
            }

            if (esameConVoto != null) {
                libretto.setEsame(esameConVoto);
            }

            if (esameConIdoneità != null) {
                libretto.setEsame(esameConIdoneità);
            }

            System.out.println("Vuoi inserire un altro esame? (Sì/No)");
            String risposta = input.next().toLowerCase();
            if (risposta.equals("no")) {
                break;
            }
            input.nextLine();
        }

        libretto.stampaLibretto();
        input.close();
    }
}