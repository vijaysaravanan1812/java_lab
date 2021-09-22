import java.util.*;
public class Perfect 
{
    private ArrayList<Integer> factors = new ArrayList<Integer>();
    boolean isPerfect(long x) 
    {
        int i = 1, sum = 0;
        while (i <= x / 2) 
        {
            if (x % i == 0) {
            sum = sum + i;
            factors.add(i);
        }
        i++;
    }
    if (sum == x) 
    {
        return true;
    }
    else 
    {
        return false;
    }
 }

void display_perfect(long num) 
{
    System.out.println("\nPerfect numbers till " + num + " and their corresponding factors\n");
    for (long i = 1; i < num; i++)
    {
        if (isPerfect(i)) 
        {
            System.out.println(i + " - " + factors);
        }
        factors.clear();
    }
}
    public static void main(String[] args) 
    {
        System.out.print("\nEnter upper limit number : ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        sc.close();
        Perfect obj = new Perfect();
        obj.display_perfect(num);
    }
}