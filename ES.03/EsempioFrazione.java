public class EsempioFrazione {

    public static void main(String[] args) {
        // Creazione di due frazioni
        Frazione frazione1 = new Frazione(1, 2);
        Frazione frazione2 = new Frazione(3, 4);

        // Stampa delle frazioni
        System.out.println("Frazione 1: " + frazione1);
        System.out.println("Frazione 2: " + frazione2);

        // Somma delle frazioni
        Frazione somma = frazione1.somma(frazione2);
        System.out.println("Somma: " + somma);

        // moltiplicazione delle frazioni
        Frazione moltiplica = frazione1.moltiplica(frazione2);
        System.out.println("prodotto: " + moltiplica);

        // divisione delle frazioni
        Frazione dividi = frazione1.dividi(frazione2);
        System.out.println("risultato: " + dividi);

        // sottrazione delle frazioni
        Frazione sottrai = frazione1.sottrai(frazione2);
        System.out.println("sottrazione: " + sottrai);
    }
}