import java.security.SecureRandom;
import java.util.Arrays;
public class SimpleArray
{
    private static final SecureRandom generator = new SecureRandom();
    private final int[] array;
    private int writeIndex = 0;
    public SimpleArray(int size)
    {
        array = new int[size];
    }
    public synchronized void add(int value)
    {
        int position = writeIndex;
        try
        {
            Thread.sleep(generator.nextInt(500));
        }
        catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.%n",
        Thread.currentThread().getName(), value, position);
        ++writeIndex;
        System.out.printf("Next write index : %d%n", writeIndex);
    }
    @Override
    public synchronized String toString()
    {
        return Arrays.toString(array);
    }
}
