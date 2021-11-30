import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.*;
import RestrictingThreads;


public class Q3
{
    public void run()
    {
        System.out.println("Thread is running");
        for (int i = 0; i < 10; ++i)
        {
            System.out.println("Thread loop running " + i);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            new RestrictingThreads();
            throw new RuntimeException();
        }       
        catch (Exception e)
        {
            System.out.println("Another thread is not supported");
        }
    }   
}

class Case2Exception extends Thread
{
    public void run()
    {      
        System.out.println("Throwing exception in MyThread");
        throw new RuntimeException();
    }
}

public class Q3_exception
{
    public static void main(String[] args)
    {   
        Case2Exception t = new Case2Exception(); t.start();
        try
        {
            Thread.sleep(2000);
        }
        catch (Exception x) {
            System.out.println("Exception" + x);
            }
        System.out.println("Completed");
    }
}