import java.io.*;
import java.util.Scanner;

public class stringa {
    public static void main (String[] args){
        //a();
        //b();
        //c();
        d();
    }

    public static void a(){
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        int lunghezza = stringa.length();
        System.out.println("lunghezza: " + lunghezza);

        char carattereCentrale = stringa.charAt(lunghezza / 2);
        System.out.println("carattereCentrale = " + carattereCentrale);

        stringa = stringa.substring(0, 1).toUpperCase() + stringa.substring(1);
        System.out.println("Stringa con prima lettera maiuscola = " + stringa);

        int na=0;
        for (int i = 0; i < stringa.length(); i++) {
            if (stringa.charAt(i) == 'a') {
                na++;
            }
        }
        System.out.println("Numero di occorrenze di 'a' = " + na);

        String sottoStringa = stringa.substring(0, 4);
        System.out.println("Stringa dal primo al quarto carattere = " + sottoStringa);

        
        stringa = stringa.toUpperCase();
        System.out.println(stringa);

        
        stringa = stringa.toLowerCase();
        System.out.println(stringa);


}

    public static void b(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();
        System.out.print("Inserisci una stringa: ");
        String stringa2 = scanner.nextLine();

        
        if (stringa.equalsIgnoreCase(stringa2))
            System.out.println("le stringhe sono uguali");
        else
            System.out.println("le stringhe non sono uguali");

       
       
     
        System.out.print("Inserisci un numero intero: ");
        stringa2 = scanner.nextLine();
        int x = Integer.parseInt(stringa2);
        System.out.println("Il numero inserito è: " + x);

        
        System.out.println("Inserisci un numero decimale: ");
        stringa2 = scanner.nextLine();
        float y = Float.parseFloat(stringa2);
        System.out.println("Il numero inserito è: " + y);

        
        System.out.println("inserisci una frase: ");
        stringa = scanner.nextLine();

        String[] parole = stringa.split(" ");
        for (int i = 0; i < parole.length; i++) {
            System.out.println(parole[i]);
        }

        
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine();
        System.out.println(stringa.substring(0, 5));

        
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine();
        System.out.println(stringa.substring(stringa.length() - 5));

        
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
    }
    






    public static void c() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Inserisci un numero di telefono: ");
        String stringa = scanner.nextLine();

        boolean c;

        if (stringa.matches("3[0-9]{9}"))
            System.out.println("Numero di telefono valido");
        else
            System.out.println("Numero di telefono non valido");

     

        System.out.println("Inserisci un email: ");
        stringa = scanner.nextLine();

        if (stringa.matches("[a-zA-Z0-9.-_]+@[a-zA-Z0-9.-]+.[a-zA-Z.]")) 
            System.out.println("Email valido");
        else
            System.out.println("Email non valido");

      
      
        System.out.println("Inserisci un url: ");
        stringa = scanner.nextLine();

        if (stringa.matches("https://[a-zA-Z0-9.-]+.[a-zA-Z.]")) 
            System.out.println("url valido");
        else
            System.out.println("url non valido");

        
        
        System.out.println("inserisci un indirizzo ip: ");
        stringa = scanner.nextLine();

        if (stringa.matches("[0-255]{1}.[0-255]{1}.[0-255]{1}.[0-255]{1}"))
            System.out.println("indirizzo ip valido");
        else
            System.out.println("indirizzo ip non valido");

       
       
        System.out.println("Inserisci un codice fiscale: ");
        stringa = scanner.nextLine();

        if (stringa.matches("[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}"))
            System.out.println("codice fiscale valido");
        else
            System.out.println("codice fiscale non valido");

   
   

        System.out.println("Inserisci un iban: ");
        stringa = scanner.nextLine();

        if (stringa.matches("IT"))
            System.out.println("iban valido");
        else
            System.out.println("iban non valido");


}



     public static void d() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase: ");

        String stringa = scanner.nextLine();
        String stringa2 = stringa;

        String[] parole = stringa2.split(" ");



        stringa2 = String.join("-", parole);
        System.out.println("Kebab-Case: " + stringa2);

        stringa2 = stringa;


        stringa2 = String.join("_", parole);
        System.out.println("Snake_Case: " + stringa2);

        stringa2 = stringa;


        for (int i = 1; i < parole.length; i++) {
            parole[i] = parole[i].substring(0, 1).toUpperCase() + parole[i].substring(1);
        }

        stringa2 = String.join("", parole);
        System.out.println("camelCase: " + stringa2);

        stringa2 = stringa;


        for (int i = 0; i < parole.length; i++) {
            parole[i] = parole[i].substring(0, 1).toUpperCase() + parole[i].substring(1);
        }

        stringa2 = String.join("", parole);
        System.out.println("PascalCase: " + stringa2);

    }

    
}
