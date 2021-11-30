import java.io.*;
import java.net.*;
import java.util.*;
public class client {
    public static void main(String[] args) throws Exception {
        Socket s= new Socket("localhost",8080);
        System.out.println("Server Connected...");

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter student name : ");
            String name = sc.nextLine();
            if(name.equals("Exit")){
                dout.writeUTF(name);
                break;
            }
            dout.writeUTF(name);
            String str2 = din.readUTF();
            System.out.println("Roll No of that Student : "+str2);
        }
        s.close();
        din.close();
        dout.close();
        sc.close();
    }
}