import java.util.Scanner;

public class ex13 {

    public static void carre(int a){
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < a; ++j)
                System.out.print("X");
            System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        carre(x);

    }
}
