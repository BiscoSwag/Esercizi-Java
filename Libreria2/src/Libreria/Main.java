package Libreria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scaffale scaffale1 = new Scaffale(100.0f);
        Scaffale scaffale2 = new Scaffale(80.0f);
        Scaffale scaffale3 = new Scaffale(50.0f);
        Scaffale scaffale4 = new Scaffale(70.0f);
        Scaffale scaffale5 = new Scaffale(65.0f);

        int anno = 0;
        float larghezza = 0.0f;

        System.out.println("1 - Aggiungi un libro ");
        System.out.println("2 - Rimuovi un libro ");
        System.out.println("3 - Mostra tutti i libri");
        System.out.println("4 - Esci dal programma ");

        int scelta = input.nextInt();

        switch (scelta) {
            case 1:
                while (true) {
                    System.out.println("Inserisci il titolo del libro: ");
                    String titolo = input.nextLine();

                    System.out.println("Inserisci l'autore del libro: ");
                    String autore = input.nextLine();

                    System.out.println("Inserisci il codice del libro: ");
                    String codice = input.nextLine();

                    while (true) {
                        try {
                            System.out.println("Inserisci l'anno di pubblicazione del libro: ");
                            anno = input.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("La data deve essere composta solo da numeri.");
                        }
                        input.nextLine();
                    }

                    while (true) {
                        try {
                            System.out.println("Inserisci la larghezza del libro (in cm): ");
                            larghezza = input.nextFloat();
                            break;
                        } catch (Exception e) {
                            System.out.println("Devi mettere il carattere <<,>> prima del decimale");
                        }
                        input.nextLine();
                    }

                    Libro libro = new Libro(titolo, autore, codice, anno, larghezza);

                    while (true) {
                        System.out.println("Su quale scaffale lo vuoi inserire (da 1 a 5)? ");
                        int sceltaScaffale = input.nextInt();
                        input.nextLine();

                        switch (sceltaScaffale) {
                            case 1:
                                scaffale1.aggLibro(libro);
                                break;
                            case 2:
                                scaffale2.aggLibro(libro);
                                break;
                            case 3:
                                scaffale3.aggLibro(libro);
                                break;
                            case 4:
                                scaffale4.aggLibro(libro);
                                break;
                            case 5:
                                scaffale5.aggLibro(libro);
                                break;
                            default:
                                System.out.println("Lo scaffale non esiste.");
                                continue;
                        }
                        break;
                    }
                    break;
                }
                break;

            case 2:
                System.out.println("Da quale scaffale vuoi rimuoverlo?");
                int sceltaScaffale = input.nextInt();
                input.nextLine();

                switch (sceltaScaffale) {
                    case 1:
                        System.out.println("Questi sono i libri nello scaffale: ");
                        scaffale1.mostraLibri();

                        System.out.println(" Quale vuoi rimuovere? ");
                        String rimLibro = input.nextLine();
                        scaffale1.rimuoviLibro(rimLibro);

                        System.out.println("Sono stati rimossi tutti i libri contenenti l'attributo '" + rimLibro + "'");
                        break;
                    case 2:
                        System.out.println("Questi sono i libri nello scaffale. Quale vuoi rimuovere?");
                        scaffale2.mostraLibri();

                        rimLibro = input.nextLine();
                        scaffale2.rimuoviLibro(rimLibro);

                        System.out.println("Sono stati rimossi tutti i libri contenenti l'attributo '" + rimLibro + "'");
                        break;
                    case 3:
                        System.out.println("Questi sono i libri nello scaffale. Quale vuoi rimuovere?");
                        scaffale3.mostraLibri();

                        rimLibro = input.nextLine();
                        scaffale3.rimuoviLibro(rimLibro);

                        System.out.println("Sono stati rimossi tutti i libri contenenti l'attributo '" + rimLibro + "'");
                        break;
                    case 4:
                        System.out.println("Questi sono i libri nello scaffale. Quale vuoi rimuovere?");
                        scaffale4.mostraLibri();

                        rimLibro = input.nextLine();
                        scaffale4.rimuoviLibro(rimLibro);

                        System.out.println("Sono stati rimossi tutti i libri contenenti l'attributo '" + rimLibro + "'");
                        break;
                    case 5:
                        System.out.println("Questi sono i libri nello scaffale. Quale vuoi rimuovere?");
                        scaffale5.mostraLibri();

                        rimLibro = input.nextLine();
                        scaffale5.rimuoviLibro(rimLibro);

                        System.out.println("Sono stati rimossi tutti i libri contenenti l'attributo '" + rimLibro + "'");
                        break;
                    default:
                        System.out.println("Lo scaffale non esiste.");
                        break;
                }
                break;

            case 3:
                // Add logic for displaying all books
                break;

            case 4:
                System.out.println("Programma terminato.");
                break;

            default:
                System.out.println("Scelta non valida.");
                break;
        }

        input.close();
    }
}
