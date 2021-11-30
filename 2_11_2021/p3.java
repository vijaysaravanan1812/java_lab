import java.util.*;
public class p3
{
    public static void main(String[] args){
    int sum=0;
    double avg=0.0;
    List<Integer> list1=new LinkedList<>();
    for(int i=0;i<25;i++)
    {
        Random r=new Random();
        int l=0;
        int h=100;
        int res=r.nextInt(h-l)+l;
        list1.add(res);
    }
    printList(list1);
    Collections.sort(list1);
    System.out.println();
    printList(list1);
    Integer[] array1 = new Integer[list1.size()];array1 = list1.toArray(array1);
    for(int i=0;i<25;i++)
    {
        sum=sum+array1[i];
    }
    avg=(double)sum/25.0;
    System.out.printf("\nSum : %d",sum);
    System.out.printf("\nAvg : %.2f",avg);
}
private static void printList(List<Integer> list)
{
    for(Integer n : list)
    System.out.printf("%d ",n);
}
}