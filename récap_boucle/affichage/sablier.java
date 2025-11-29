import java.util.Scanner;

public class sablier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        if(h%2 == 0)
            h = h+1;

        for(int i = 0; i < h; ++i){
            for(int j = 0; j < h; ++j){

                if(i < h/2 + 1){   // partie haute
                    if(j >= i && j <= h-1-i){
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }

                } else {           // partie basse
                    if(j <= i && j >= h-1-i){
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}

