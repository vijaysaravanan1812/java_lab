import java.util.*;
public class Reverse {
 private int num;
 Reverse() {
 System.out.print("\nEnter number to be reversed : ");
 Scanner sc = new Scanner(System.in);
 num = sc.nextInt();
 sc.close();
 }
 int reverse(int n) {
 int reverse = 0;
 while (n != 0) {
 int remainder = n % 10;
 reverse = reverse * 10 + remainder;
 n = n / 10;
 }
 return reverse;
 }
 public static void main(String[] args) {
 Reverse obj = new Reverse();
 int result = obj.reverse(obj.num);
 System.out.println("\nReverse of number " + obj.num + " is " + result);
 }
}