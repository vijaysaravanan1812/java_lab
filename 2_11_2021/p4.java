import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
public class p4
{
    public static void main(String[] args)
    {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};List<Character> list1 = new LinkedList<>();
        for (char alpha : alphabets)
        list1.add(alpha);
        char[] alphabets2;
        List<Character> list2 = new LinkedList<>();
        list2.addAll(list1);
        printList(list1);
        System.out.println("\nList2: (Reversed list1)");
        printReversedList(list2);
        System.out.println("");
}
private static void printList( List<Character> list )
{
    System.out.printf("%nList1:\n");
    for (char alpha : list)
    System.out.printf("%s ", alpha);
    System.out.println();
}
private static void printReversedList( List<Character> list )
{
    ListIterator<Character> iterator = list.listIterator(list.size());
    while (iterator.hasPrevious())System.out.printf("%s ", iterator.previous());
}
}