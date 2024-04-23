import java.util.Scanner;

public class Libro {
    private String titolo;
    private String autore;
    private int npagine;
    private String materia;

    public void InserisciLibro(Scanner tastiera){
        System.out.println("Inserisci il titolo del libro: ");
        this.titolo = tastiera.nextLine();
        System.out.println("Inserisci l'autore del libro: ");
        this.autore = tastiera.nextLine();
        System.out.println("Inserisci il numero di pagine del libro: ");
        this.npagine = tastiera.nextInt();
        tastiera.nextLine();
        System.out.println("Inserisci la materia del libro: ");
        this.materia = tastiera.nextLine();
        System.out.println("Libro inserito\n");
    }
    public static void spostaLibro(Libro[] x, Libro[] y, int contaLibri, int indice, Scanner sc){
        System.out.println("Come si chiama il libro che vuoi spostare?");
        String nomeLibro = sc.nextLine();
        for (int i = 0; i < contaLibri; i++) {
            if(x[i].titolo.equalsIgnoreCase(nomeLibro)){
                y[contaLibri] = x[indice];
                x[i] = null;
                System.out.println("Libro spostato");
            }
        }
    }
    public String toString() {
        return "Titolo: " + titolo + ", Autore: " + autore + ", Pagine: " + npagine + ", Materia: " + materia;
    }
}