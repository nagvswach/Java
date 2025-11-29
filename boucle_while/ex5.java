import java.util.Scanner;

public class en_tete{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre  = s.nextInt();
        int total = 0;
        int n = 0;
        if(nombre == -1)
            System.out.print(-1);
        else{
            while(nombre != -1){
                total += nombre;
                nombre = s.nextInt();
                n += 1;
            }
            System.out.println(n);
            System.out.print((double)total/n);
        }
    }
}
