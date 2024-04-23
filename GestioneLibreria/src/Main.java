import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int libriZaino = 5;
        final int libriCasa = 20;
        Libro[] zaino = new Libro[libriZaino];
        for (Libro libro : zaino) {
            libro = new Libro();
        }
        Libro[] casa = new Libro[libriCasa];
        int contaLibriCasa = 0;
        int indice = 0;

        String[] opzioni = {"LA LIBRERIA", "[1] Inserisci libro", "[2] Sposta Libro", "[3] Vedi zaino", "[4] Vedi casa", "[5] Esci"};

        int scelta;
        do {
            displayMenu(opzioni);
            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                case 1 -> {
                    if (contaLibriCasa < libriCasa) {
                        casa[contaLibriCasa] = new Libro();
                        casa[contaLibriCasa].InserisciLibro(sc);
                        contaLibriCasa++;
                    } else {
                        System.out.println("La casa è piena. Non è possibile inserire altri libri.");
                    }
                }
                case 2 -> {
                    if (indice < libriZaino) {
                        zaino[indice] = new Libro();
                        Libro.spostaLibro(casa,zaino,contaLibriCasa,indice,sc);
                        indice++;
                    } else {
                        System.out.println("Lo zaino è pieno. Non è possibile spostare altri libri.");
                    }
                    indice++;
                }
                case 3 -> visualizzaLibri(zaino);
                case 4 -> visualizzaLibri(casa);
                case 5 -> System.out.println("Chiusura");
                default -> System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 5);
    }

    public static void visualizzaLibri(Libro[] x) {
        for (Libro libro : x) {
            if (libro != null) {
                System.out.println(libro);
            }
        }
    }

    public static void displayMenu(String[] opzioni) {
        System.out.println("==== LA LIBRERIA ====");
        for (String opzione : opzioni) {
            System.out.println(opzione);
        }
        System.out.print("Scelta: ");
    }
}