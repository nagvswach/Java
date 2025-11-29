import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int suite = s.nextInt();
        int cpt = 0;
        while(suite != -1){
            if(suite == nombre)
                cpt += 1;
            suite = s.nextInt();
        }
        System.out.print(cpt);
    }
}
