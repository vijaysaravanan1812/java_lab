 import java.util.*;
public class CoinToss {
    private static int heads;
    private static int tails;
    public enum Coin {
    HEADS, TAILS;
    };
    public static Coin flip() {
    Random r = new Random();
    int chance = r.nextInt(2);
    if (chance == 1) {
        tails = tails + 1;
        return Coin.TAILS;
    }
    else
    {
        heads = heads + 1;
        return Coin.HEADS;
    }
 }
    static void display_result() {
        System.out.println("\nResults");
        System.out.println("Head appeared " + heads + " times");
        System.out.println("Tail appeared " + tails + " times");
    }
 
    static void flip_result(Coin result) {
        System.out.println("\nIt's a " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Toss a coin\n2. View Result and Exit");
            System.out.print("\nEnter operation number: ");
            int n = sc.nextInt();
            if (n == 2) {
                display_result();
                System.exit(0);
                sc.close();
            }
            Coin c = flip();
            flip_result(c);
        }
 }
}