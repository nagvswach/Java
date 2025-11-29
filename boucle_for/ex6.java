import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int n = 0;
        int it = s.nextInt();
        for(int i = 0; i < it; ++i){
            int nombre = s.nextInt();
            if(nombre > 0){
                n += 1;
                total += nombre;
                }
       }
       System.out.print((double)total/n);

    }
}
