import java.io.*;

public class EsArray {

    public static void main(String args[]) throws NumberFormatException, IOException {
        
        sommaArray();
        sommaArrayPersonalizzata();
        contaMinoriDiZero();
        trovaMassimo();
    }

    public static void sommaArray() throws NumberFormatException, IOException {
        int i = 0;
        int[] array = new int[10];
        
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(inputReader);

        for (i = 0; i < 10; i++) {
            System.out.print("Valore: array[" + i + "]= ");
            array[i] = Integer.parseInt(tastiera.readLine());
        }
        for (i = 0; i < 10; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }
        int somma = 0;
        for (i = 0; i < 10; i++) {
            somma = somma + array[i];
        }
        System.out.println("Somma=" + somma);
    }
    
    public static void sommaArrayPersonalizzata() throws NumberFormatException, IOException {
        int x;
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(inputReader);
        do {
            System.out.print("Immettere un numero: ");
            x = Integer.parseInt(tastiera.readLine());
        } while (x <= 0);
        System.out.println("Numero inserito: " + x);
        int i = 0;
        int[] array = new int[x];
        for (i = 0; i < x; i++) {
            System.out.print("Valore: ");
            array[i] = Integer.parseInt(tastiera.readLine());
        }

        for (i = 0; i < x; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }
        int somma = 0;
        for (i = 0; i < x; i++) {
            somma = somma + array[i];
        }
        System.out.println("Somma=" + somma);
    }

    public static void contaMinoriDiZero() throws NumberFormatException, IOException {
        int x;
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(inputReader);
        do {
            System.out.print("Immettere un numero: ");
            x = Integer.parseInt(tastiera.readLine());
        } while (x <= 0);

        double[] array = new double[x];
        int contatore = 0;

        for (int i = 0; i < x; i++) {

            System.out.print("Valore: ");
            array[i] = Double.parseDouble(tastiera.readLine());

            if(array[i] < 0) contatore++;
        }


        System.out.println("Numeri minori di 0 = " + contatore);
    }

    public static void trovaMassimo() throws NumberFormatException, IOException {
        int x;
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(inputReader);
        do {
            System.out.print("Immettere un numero: ");
            x = Integer.parseInt(tastiera.readLine());
        } while (x <= 0);

        double[] array = new double[x];
        
        for (int i = 0; i < x; i++) {
            System.out.print("Valore: ");
            array[i] = Double.parseDouble(tastiera.readLine());
        }

        double massimo = array[0];

        for(int i = 1; i < x; i++)
            if(array[i] > massimo) massimo = array[i];

        System.out.println("Numero massimo = " + massimo);
    }
}
