import java.io.*;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Q3 implements ActionListener{
    JFrame jf;
    JTextArea ta;
    JButton db, sb;

    Q3() {
        jf = new JFrame("Student List");
        ta = new JTextArea("");
        db = new JButton("Display");
        sb = new JButton("Sort");

        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);
        jf.setLayout(null);

        ta.setEditable(false);
        ta.setBounds(30, 60, 500, 370);
        db.setBounds(150, 500, 100, 50);
        sb.setBounds(400, 500, 100, 50);

        jf.add(ta);
        jf.add(db);
        jf.add(sb);

        sb.addActionListener(this);
        db.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == db) {
            Thread displaythread=new Thread(){
                public void run()
                {
                    try
                        {   
                            File f = new File("student.txt");
                            String s="";
                            Scanner filer =new Scanner(f);
                            while(filer.hasNextLine()){
                            s=s+"\n  "+filer.nextLine();
                            }
                            ta.setText(s);
                            filer.close();
                        }
                        catch( FileNotFoundException e)
                        {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                }
            };
            displaythread.start();

        }
        if (e.getSource() == sb) {
            Thread sortthread=new Thread(){
                public void run()
                {
                    try
                        {   SortedMap<Integer,String> m=new TreeMap<Integer,String>();
                            File f = new File("student.txt");
                            String name,s="\n";
                            Integer rno;
                            Scanner filer =new Scanner(f);
                            while(filer.hasNextLine()){
                            rno=Integer.parseInt(filer.next());
                            name=filer.next();
                            m.put(rno, name);
                            }
                            for (SortedMap.Entry<Integer,String> itr: m.entrySet())
                            {
                                s=s+"  "+itr.getKey()+"  "+itr.getValue()+"\n";
                            }
                            ta.setText(s);
                            filer.close();
                        }
                        catch( FileNotFoundException e)
                        {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                }
            };
            sortthread.start();
        }
    }

    public static void main(String[] args){
        new Q3();
        System.out.println("Read from file student.txt");
    }
}