import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14, r,alan,cevre;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yarı Çapı Girin : ");
        r = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Alan : " +alan);
        System.out.println("Cevre : " +cevre);


    }
}