public class Equazione {
    public static void main(String[] args) {
         // Estrai i coefficienti a, b e c dalla stringa degli argomenti e li trasforma in double
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Calcola il discriminante
        double discriminante = b * b - 4 * a * c;

        // Verifica se l'equazione ha soluzioni reali
        if (discriminante > 0) {
            // Due soluzioni reali distinte
            double soluzione1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double soluzione2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Le soluzioni dell'equazione sono: " + soluzione1 + " e " + soluzione2);
        } else if (discriminante == 0) {
            // Una sola soluzione reale (radice doppia)
            double soluzione = -b / (2 * a);
            System.out.println("L'equazione ha una sola soluzione: " + soluzione);
        } else {
            // Nessuna soluzione reale (soluzioni complesse)
            System.out.println("L'equazione non ha soluzioni reali.");
        }
    }
      
      
           
}

       