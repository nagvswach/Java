import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int current = 0;
        while( nombre != -1 && current < nombre){
            current = nombre;
            nombre = s.nextInt();
            }
        if(nombre == -1)
            System.out.print("croissante");
        else
            System.out.print("décroissante");

    }
}
