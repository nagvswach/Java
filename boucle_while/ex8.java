import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int current = 0;
        if(nombre == -1)
            System.out.print("liste vide");
        else{
            int premier = nombre;
            while(nombre != -1){
                current = nombre;
                nombre = s.nextInt();
            }
            if(premier == current)
                System.out.print("égaux");
            else if(premier > current)
                System.out.print("premier plus grand que dernier");
            else
                System.out.print("dernier plus grand que le premier");
        }    
    }
}
