import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int facteur_un = s.nextInt();
        int facteur_deux = s.nextInt();
        int produit = 0;
        if(facteur_un > facteur_deux){
            for(int i = 0; i < facteur_deux; ++i)
                produit += facteur_un;
        }
        else{
            for(int i = 0; i < facteur_un; ++i)
                produit += facteur_deux;
        }
        System.out.print(produit);
    }
}
