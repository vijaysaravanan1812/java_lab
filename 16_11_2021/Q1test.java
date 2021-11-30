import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.*;
public class Q1test
{
    public static void createFile(String fileName)
    {
        try
        {
            File f0 = new File(fileName);
            if (f0.createNewFile()) 
            {
                System.out.println("\nThe file " +  f0.getName() + " is created successfully !!");
            }
            else
            {
                System.out.println("\nFile already exists !!");     
            }
        }
        catch (IOException exception)
        {
            System.out.println("\nError occurred !!");
            exception.printStackTrace();
        }
    }
    public static void writeToFile(String fileName, String dataToBeWritten) throws IOException
    {
        try
        {
            FileWriter fwrite = new
            FileWriter(fileName); fwrite.write(dataToBeWritten);
            fwrite.close();
            System.out.println("\nThe content has been written to the file successfully !!");
        }
        catch (IOException exception)
        {   
            System.out.println("\nError occurred !!");
            exception.printStackTrace();
        }
    }

    public static void main(String[] arg) throws IOException
    {
        SimpleArray sharedSimpleArray = new
        SimpleArray(6);
        ArrayWriter writer1 = new ArrayWriter(1,
        sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11,
        sharedSimpleArray);
        ExecutorService executor =
        Executors.newCachedThreadPool();
        executor.execute(writer1);
        executor.execute(writer2);
        executor.shutdown();
        try
        {
            boolean tasksEnded =
            executor.awaitTermination(1,TimeUnit.MINUTES);
            if (tasksEnded)
            {
                createFile("Example.txt");
                writeToFile("Example.txt",
                sharedSimpleArray.toString());
                System.out.println(sharedSimpleArray);
                System.out.println("\nThe array has been written to the file successfully !!");
            }
            else
                System.out.println("\nTimed out while waiting for tasks to finish !!s");
        }
        catch (InterruptedException ex)
        {
            System.out.println("\nInterrupted!!");
        }
    }
}