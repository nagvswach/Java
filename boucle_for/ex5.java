import java.util.Scanner;
public class ex5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int compteurz = 0;
        int compteurp = 0;
        int compteurn = 0;
        int it = s.nextInt();
        for(int i = 0; i < it; ++i){
            int nombre = s.nextInt();
            if(nombre > 0)
                compteurp += 1;
            else if(nombre < 0)
                compteurn += 1;
            else
                compteurz +=1;
        }
        System.out.println("pos = " + compteurp);
        System.out.println("neg = " + compteurn);
        System.out.println("nul = " + compteurz);

    }
}
