
import java.util.*;
import java.util.PriorityQueue;
class The_Comparator implements Comparator<String>
{public int compare(String str1, String str2)
{
String first_Str;
String second_Str;
first_Str = str1;
second_Str = str2;
return second_Str.compareTo(first_Str);
}
}
public class p6 {
public static void main(String[] args)
{
PriorityQueue<String> queue = new
PriorityQueue<String>(new The_Comparator());
queue.add("4");
queue.add("1");
queue.add("5");
queue.add("3");
queue.add("9");
System.out.println("The elements in descending order is: ");
while(!queue.isEmpty()){
System.out.print(" "+queue.poll());
}
}
}