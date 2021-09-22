import java.util.*;
public class StudPoint {
 private float num;
 StudPoint() {
 System.out.print("\nEnter student average : ");
 Scanner sc = new Scanner(System.in);
 num = sc.nextFloat();
 sc.close();
 }
 int qualityPoints(float x) {
 if (x >= 90 && x <= 100) {
 return 4;
 }
 if (x >= 80 && x <= 89) {
 return 3;
 }
 if (x >= 70 && x <= 79) {
 return 2;
 }
 if (x >= 60 && x <= 69) {
 return 1;
 } else {
 return 0;
 }
 }
 public static void main(String[] args) {
 StudPoint obj = new StudPoint();
 int points = obj.qualityPoints(obj.num);
 System.out.println("\nQuality point of student for average " + obj.num+ " is " + points + " points");
 }
}