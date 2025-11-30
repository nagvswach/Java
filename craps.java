import java.util.Scanner;
import java.util.Random;

public class craps {


    // Fonctions.
    

    public static int lance_dee() {
        Random generateur = new Random();
        int dee_un = generateur.nextInt(1, 7);   
        int dee_deux = generateur.nextInt(1, 7); 

        System.out.println("dé_un a fait : " + dee_un);
        System.out.println("dé_deux a fait : " + dee_deux);

        return dee_un + dee_deux; 
    }


    public static int premier_tour() {
        int dee_un = lance_dee();
        int res;

        if (dee_un == 7 || dee_un == 11) {
            res = 1;
        } else if (dee_un == 2 || dee_un == 3 || dee_un == 12) {
            res = 2;
        } else {
            res = dee_un;
            System.out.println("Vous devez obtenir : " + dee_un + " pour gagner");
        }

        return res;
    }

 
    public static boolean autre_tour(int but, int mise) {
        int dee_autre = lance_dee();
        boolean res = false;

        while (dee_autre != but && dee_autre != 7) {
            dee_autre = lance_dee();
        }

        if (dee_autre == but) {
            res = true;
        }

        return res;
    }

    public static int crediter(int credit, int mise) {
        System.out.println("Bravo");
        return credit + mise;
    }

    public static int decrediter(int credit, int mise) {
        System.out.println("Dommage");
        return credit - mise;
    }

    public static int miser(int credit, Scanner s) {
        int mise = s.nextInt();

        while (mise == -1) {
            System.out.println("votre credit s'élève à " + credit);
            System.out.println("Combien voulez vous miser : ");
            mise = s.nextInt();
        }

        while (mise > credit) {
            System.out.print("Vous n'avez pas assez ");
            System.out.println("Combien voulez vous miser : ");
            mise = s.nextInt();
        }

        return mise;
    }







   // Déroulement du jeu.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean gagne;
        int credit = 10;
        int mise = -1;

        while (credit != 0 && mise != 0) {
            int but = 0;

            System.out.println("Votre crédit : " + credit);
            System.out.println("Entrez votre mise (0 pour arrêter, -1 pour afficher le crédit) :");
            mise = miser(credit, s);

            if (mise != 0) {
                int premier = premier_tour();

                if (premier == 1) {
                    credit = crediter(credit, mise);
                } else if (premier == 2) {
                    credit = decrediter(credit, mise);
                } else {
                    but = premier;
                }

                if (but != 0) {
                    if (autre_tour(but, mise)) {
                        credit = crediter(credit, mise);
                    } else {
                        credit = decrediter(credit, mise);
                    }
                }
            }
        }

        s.close();
        System.out.println("Fin de la partie. Crédit final : " + credit);
    }
}

