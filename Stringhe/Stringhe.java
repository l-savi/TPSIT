import java.io.*;
import java.util.Scanner;

public class Stringhe {

    public static void main(String[] args) {

        // a();
        // b();
        // c();
        d();

    }

    /*
     * Questa funzione restituisce true se la stringa è palindroma, false altrimenti
     */
    public static boolean isPalindromo(String stringa) {
        for (int i = 0; i < stringa.length() / 2; i++) {
            if (stringa.charAt(i) != stringa.charAt(stringa.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // esercizio a
    public static void a() {
        // crea scanner
        Scanner scanner = new Scanner(System.in);

        // legge stringa
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        // elimina spazi davanti e dietro
        stringa.trim();

        // stampa stringa
        System.out.println("Stringa inserita: " + stringa);

        // stampa lunghezza stringa
        int lunghezza = stringa.length();
        System.out.println("lunghezza = " + lunghezza);

        // stampa carattere centrale
        char carattereCentrale = stringa.charAt(lunghezza / 2);
        System.out.println("carattereCentrale = " + carattereCentrale);

        // trasforma il primo carattere in maiuscolo
        stringa = stringa.substring(0, 1).toUpperCase() + stringa.substring(1);
        System.out.println("Stringa modificata con prima lettera maiuscola = " + stringa);

        // stampa numero occorrenze di 'a'
        int nOccorenzeA = 0;
        for (int i = 0; i < stringa.length(); i++) {
            if (stringa.charAt(i) == 'a') {
                nOccorenzeA++;
            }
        }
        System.out.println("Numero di occorrenze di 'a' = " + nOccorenzeA);

        // stampa dal primo al qaurto carattere
        String sottoStringa = stringa.substring(0, 4);
        System.out.println("Stringa dal primo al quarto carattere = " + sottoStringa);

        // trasforma la stringa in maiuscolo
        stringa = stringa.toUpperCase();
        System.out.println(stringa);

        // trasforma la stringa in minuscolo
        stringa = stringa.toLowerCase();
        System.out.println(stringa);

        // controlla se la stringa e palindroma
        if (isPalindromo(stringa))
            System.out.println("La stringa è palindroma");
        else
            System.out.println("La stringa non è palindroma");

        scanner.close();
    }

    // esercizio b
    public static void b() {

        Scanner scanner = new Scanner(System.in);

        // legge stringa
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        // legge una seconda stringa
        System.out.print("Inserisci una stringa: ");
        String stringa2 = scanner.nextLine();

        // controlla se le stringhe sono uguali
        if (stringa.equalsIgnoreCase(stringa2))
            System.out.println("le stringhe sono uguali");
        else
            System.out.println("le stringhe non sono uguali");

        // legge un numero intero
        System.out.print("Inserisci un numero intero: ");
        stringa2 = scanner.nextLine();

        int x = Integer.parseInt(stringa2);
        System.out.println("Il numero inserito è: " + x);

        // legge un numero decimale
        System.out.println("Inserisci un numero decimale: ");
        stringa2 = scanner.nextLine();

        float y = Float.parseFloat(stringa2);
        System.out.println("Il numero inserito è: " + y);

        // legge una stringa e la riscrive una parola per riga
        System.out.println("inserisci una frase: ");
        stringa = scanner.nextLine();

        String[] parole = stringa.split(" ");
        for (int i = 0; i < parole.length; i++) {
            System.out.println(parole[i]);
        }

        // legge una stringa e stampa i primi 5 caratteri
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine();
        System.out.println(stringa.substring(0, 5));

        // legge una stringa e ne stampa gli ultimi 5 caratteri
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine();
        System.out.println(stringa.substring(stringa.length() - 5));

        // legge una frase e stampa la parola piu lunga
        System.out.println("inserisci una frase: ");
        stringa = scanner.nextLine();
        parole = stringa.split(" ");

        x = 0;

        for (int i = 0; i < parole.length; i++) {
            if (parole[i].length() > parole[x].length()) {
                x = i;
            }
        }

        System.out.println("la parola piu lunga e: " + parole[x]);

        // legge una stringa e controlla se e una sigla
        System.out.println("inserisci una stringa: ");
        stringa = scanner.nextLine();
        boolean c = true;

        for (int i = 0; i < stringa.length(); i += 2) {
            if (stringa.charAt(i) != '.') {
                c = false;
            }
        }

        if (c)
            System.out.println("la stringa e una siglia");
        else
            System.out.println("la stringa non e una siglia");

        // legge due stringhe e controlla se sono anagrammi
        System.out.println("inserisci due parole: ");
        stringa = scanner.nextLine();
        stringa2 = scanner.nextLine();

        char[] lettere = stringa.toCharArray();
        c = true;

        for (int i = 0; i < stringa2.length(); i++)
            if (stringa2.indexOf(lettere[i]) == -1)
                c = false;

        if (c)
            System.out.println("le stringhe sono anagrammi");
        else
            System.out.println("le stringhe non sono anagrammi");

        scanner.close();
    }

    // esercizio c
    public static void c() {
        Scanner scanner = new Scanner(System.in);

        // controlla se un numero di telefono e valido
        System.out.println("Inserisci un numero di telefono: ");
        String stringa = scanner.nextLine();

        boolean c = true;

        for (int i = 0; i < stringa.length(); i++) {
            if (!Character.isDigit(stringa.charAt(i))) {
                c = false;
            }
        }

        if (c && stringa.charAt(0) == '3' && stringa.length() == 10)
            System.out.println("Numero di telefono valido");
        else
            System.out.println("Numero di telefono non valido");

        // controlla se un email e valida

        System.out.println("Inserisci un email: ");
        stringa = scanner.nextLine();

        if (stringa.indexOf("@") != -1)
            System.out.println("Email valido");
        else
            System.out.println("Email non valido");

        // controlla se un url e valido
        System.out.println("Inserisci un url: ");
        stringa = scanner.nextLine();

        if (stringa.indexOf("http://") != -1)
            System.out.println("url valido");
        else
            System.out.println("url non valido");

        // controlla se e un indirizzo ip valido
        System.out.println("inserisci un indirizzo ip: ");
        stringa = scanner.nextLine();

        String[] numeri = stringa.split("\\.");
        int[] numeri2 = new int[numeri.length];
        c = true;

        for (int i = 0; i < numeri.length; i++) {
            numeri2[i] = Integer.parseInt(numeri[i]);
            if ((numeri2[i] > 255 && numeri2[1] < 0) || i > 3)
                c = false;
        }

        if (c)
            System.out.println("indirizzo ip valido");
        else
            System.out.println("indirizzo ip non valido");

        // controlla se un codice fiscale e valido
        System.out.println("Inserisci un codice fiscale: ");
        stringa = scanner.nextLine();

        String lettere = stringa.substring(0, 7) + stringa.substring(9, 10) + stringa.substring(12, 13)
                + stringa.substring(16);

        String num = stringa.substring(7, 9) + stringa.substring(10, 12) + stringa.substring(13, 16);

        c = true;

        for (int i = 0; i < lettere.length(); i++)
            if (!Character.isLetter(lettere.charAt(i))) {
                c = false;
            }

        for (int i = 0; i < num.length(); i++)
            if (!Character.isDigit(num.charAt(i))) {
                c = false;
            }

        if (c && stringa.length() == 16)
            System.out.println("codice fiscale valido");
        else
            System.out.println("codice fiscale non valido");

        // controlla se un iban e valido

        System.out.println("Inserisci un iban: ");
        stringa = scanner.nextLine();

        c = true;

        if (stringa.length() != 27)
            c = false;
        if (stringa.substring(0, 3) != "IT")
            c = false;

        if (c)
            System.out.println("iban valido");
        else
            System.out.println("iban non valido");

        // controlla se un codice ISBN-13 e valido
        System.out.println("Inserisci un codice ISBN-13: ");
        stringa = scanner.nextLine();

        c = true;

        for (int i = 0; i < stringa.length(); i++)
            if (!Character.isDigit(stringa.charAt(i))) {
                c = false;
            }

        if (c && stringa.length() == 13)
            System.out.println("codice ISBN-13 valido");
        else
            System.out.println("codice ISBN-13 non valido");

        scanner.close();

    }

    // esercizio d
    public static void d() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase: ");

        String stringa = scanner.nextLine();
        String stringa2 = stringa;

        String[] parole = stringa2.split(" ");

        // Kebab-case
        stringa2 = String.join("-", parole);
        System.out.println("Kebab-Case: " + stringa2);

        stringa2 = stringa;

        // Snake_Case
        stringa2 = String.join("_", parole);
        System.out.println("Snake_Case: " + stringa2);

        stringa2 = stringa;

        //camelCase
        for (int i = 1; i < parole.length; i++) {
            parole[i] = parole[i].substring(0, 1).toUpperCase() + parole[i].substring(1);
        }

        stringa2 = String.join("", parole);
        System.out.println("camelCase: " + stringa2);

        stringa2 = stringa;

        //PascalCase

        for (int i = 0; i < parole.length; i++) {
            parole[i] = parole[i].substring(0, 1).toUpperCase() + parole[i].substring(1);
        }

        stringa2 = String.join("", parole);
        System.out.println("PascalCase: " + stringa2);

    }
}
