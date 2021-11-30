import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Scanner;
public class p1{
public static void main(String[] args)
{
        Scanner in=new Scanner(System.in);
        String[] names=new String[10];
        System.out.print("\nEnter the firstnames: ");
        for(int i=0;i<10;i++)
        {
            names[i]=in.nextLine();
        }   
        List<String>list=Arrays.asList(names);
        printNonDuplicates(list);
}
private static void printNonDuplicates(Collection<String> values)
{
    Scanner in=new Scanner(System.in);
    Set<String>set = new HashSet<>(values);
    System.out.printf("%nThe Non-duplicates are: ");
    for(String value : set)
    System.out.printf("%s ",value);
    System.out.print("\nEnter the firstname to be searched: ");
    String name=in.nextLine();  
    System.out.println("Does the set contains " + name + " ? "+set.contains(name));
    }
}