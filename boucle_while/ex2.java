import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nbs = s.nextInt();
        int total = 0;
        int iteration = 0;
        while(nbs < 1 ){
            System.out.println("entrée une bonne valeur");
            nbs = s.nextInt();
        }
        while(iteration < nbs){
            int current = s.nextInt();
            total += current;
            iteration += 1;
        }
        System.out.print((double)total/nbs);
    }

}
