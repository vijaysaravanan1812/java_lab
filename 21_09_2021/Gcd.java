import java.util.Scanner;
public class Gcd {
 private int a, b;
 Gcd() {
 System.out.print("\nEnter first number: ");
 Scanner sc = new Scanner(System.in);
 a = sc.nextInt();
 System.out.print("Enter second number: ");
 b = sc.nextInt();
 sc.close();
 }
 int gcd(int a, int b) {
 if (a == 0)
 return b;
 if (b == 0)
 return a;
 if (a == b)
 return a;
 if (a > b)
 return gcd(a - b, b);
 return gcd(a, b - a);
 }
 public static void main(String[] args) {
 Gcd obj = new Gcd();
 int result = obj.gcd(obj.a, obj.b);
 System.out.println("\nGcd of " + obj.a + " and " + obj.b + " is " + result);
 }
}