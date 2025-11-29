import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nombre = s.nextInt();
        int min = nombre;
        int max = nombre;
        if(nombre == 0)
            System.out.print("pas de suite");
        else{
            while(nombre != 0){
                nombre = s.nextInt();
                if(nombre < min && nombre != 0)
                    min = nombre;
                if(nombre > max && nombre != 0)
                    max = nombre;
            }
            System.out.println("min = "+min);
            System.out.print("max = "+max);
        }
    }
}
