import java.util.Scanner;
import java.util.Random;

public class craps{

    public static int premier_tour(){
        Random generateur = new Random();
        dee_un = generateur.nextInt(2,12);
        int res;
        if(dee_un == 7 || dee_un == 11)
            res = 1;
        else if( dee_un == 2 || dee_un == 3 || dee_un == 12)
            res = 2;
        else 
            res = dee_un;
        return dee_un;
    }

    public static boolean autre_tour(int but, int mise){
        dee_autre = generateur.nextInt(2, 12);
        res = false;
        while (dee_autre != x || dee_autre != 7)
            dee_autre = generateur.nextint(2,12);
        if(dee_autre == x){
            res = true;
            System.out.println("Bravo");
        else{
            System.out.println("Dommage");
        return res;

     
    public static int crediter(int credit, int mise){
        System.out.print("Bravo");
        return credit + mise;



    

    public static int decrediter(int credit, int mise){
        System.out.println("Dommage");
        return credit - mise;
        


    public static int miser(int credit){
           int mise = s.nextInt();
           while(mise == -1){
                System.out.println("votre credit s'élève à " + credit);
                System.out.println("Combien voulez vous misez : ")
                mise = s.nextInt();
           }
           while(mise > credit){
                  System.out.print("Vous n'avez pas assez ");
                  System.out.println("Combien voulez vous misez");
                  mise = nextInt();
              }
           return mise;
    }


    public static void main(St1ring[] args) {
        Scanner s = new Scanner(System.in);
        boolean gagne;
        int credit = 10;
        while(credit != 0 && mise != 0){
            int but;
            int mise = miser(credit);
            if(mise != 0);{
                if(premier_tour == 1)
                    credit = crediter(credit, mise);
                else if(premier_tour == 2)
                    credit = decrediter(credit, mise)
                else
                    but = premier_tour;

                if(but != 0){                    
                    if(gagne(but))
                        credit = crediter(credit, mise);
                    else
                        credit = decrediter(credit, mise);
                        
                }
         }
                     
    }
}
