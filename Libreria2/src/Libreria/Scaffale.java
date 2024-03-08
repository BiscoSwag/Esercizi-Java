package Libreria;

import java.util.ArrayList;

public class Scaffale {
	private float lunghezzaScaffale;
	private ArrayList<Libro> libri;
	private float sommaLarghezza;
	
	public Scaffale(float lunghezzaScaffale){
		this.lunghezzaScaffale = lunghezzaScaffale;
		this.libri = new ArrayList<>();
		this.sommaLarghezza = 0.0f;
	}
	 
	public void aggLibro(Libro libro) {
        if (libro.getLarghezza() + sommaLarghezza <= lunghezzaScaffale) {
            libri.add(libro);
            sommaLarghezza += libro.getLarghezza();
        } else {
            System.out.println("Lo scaffale è pieno, impossibile aggiungere questo libro");
        }
    }

    public void rimuoviLibro(String attrLibro) {
        ArrayList<Libro> libriDaRimuovere = new ArrayList<>();

        for (Libro libro : libri) {
            if (cercaAttr(libro, attrLibro)) {
                libriDaRimuovere.add(libro);
                sommaLarghezza -= libro.getLarghezza();
            }
        }

        libri.removeAll(libriDaRimuovere);

        if (!libriDaRimuovere.isEmpty()) {
            System.out.println("Sono stati rimossi tutti i libri contenenti l'attributo '" + attrLibro + "'");
        } else {
            System.out.println("Non è presente nessun libro avente l'attributo inserito");
        }
    }

    private boolean cercaAttr(Libro libro, String attrLibro) {
        return libro.getTitolo().equalsIgnoreCase(attrLibro) ||
               libro.getAutore().equalsIgnoreCase(attrLibro) ||
               libro.getCodice().equalsIgnoreCase(attrLibro) ||
               libro.getAnnoDiPubblicazione()== Integer.parseInt(attrLibro)||
               libro.getLarghezza()== Float.parseFloat(attrLibro);
               
    }

    public void mostraLibri() {
        for (Libro libro : libri) {
            System.out.println("Titolo: " + libro.getTitolo() +
                    "\nAutore: " + libro.getAutore() +
                    "\nAnno di pubblicazione: " + libro.getAnnoDiPubblicazione() +
                    "\nCodice: " + libro.getCodice() +
                    "\nLarghezza: " + libro.getLarghezza() + " cm\n");
        }
    }
}