
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Q2 implements Runnable,ActionListener 
{
    static int counter = 0;
    JFrame f;
    JTextField t;
    JButton[] b = new JButton[2];
    public Q2()
    {
        f=  new JFrame("Counter");
        t=  new JTextField("0");
        b[0]=new JButton("Add 1");
        b[1]=new JButton("Add 2");
        t.setBounds(30,40,280,30);
        b[0].setBounds(40,100,50,40);
        b[1].setBounds(110,100,50,40);
        f.add(t);
        f.add(b[0]);
        f.add(b[1]);    
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(3500,5000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        b[0].addActionListener(this);
        b[1].addActionListener(this);
    }
    static synchronized void Counter(int i) 
    {
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e);
        }
        if(i==1)    
            counter++;
        else if(i==2)
            counter+=2;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b[0]){
            Counter(1);
            t.setText(String.valueOf(counter));

        }
        else if(e.getSource()==b[1]){
            Counter(2);
            t.setText(String.valueOf(counter));
        }
    }  
    @Override
    public void run() {

    }  
    public static void main(String[] args) {
        Q2 te = new Q2();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);
        thread1.start();
        thread2.start();
    }
}