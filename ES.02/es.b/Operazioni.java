public class Operazioni
{
    public static void main(String[]args)
    {
        
        // Inizializzazione delle variabili per la somma, il numero massimo e il numero minimo
        double somma = 0;
        double max = Double.parseDouble(args[0]);
        double min = Double.parseDouble(args[0]);

        // Calcolo della somma, del massimo e del minimo dei numeri inseriti
        for (int i = 0; i < args.length; i++) {
            double numero = Double.parseDouble(args[i]);
            somma += numero;
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        // Calcolo della media aritmetica esatta
        double media = somma / args.length;

        // Stampa delle informazioni
        System.out.println("Somma di tutti i numeri: " + somma);
        System.out.println("Media aritmetica esatta: " + media);
        System.out.println("Numero massimo: " + max);
        System.out.println("Numero minimo: " + min);
    }
}
    