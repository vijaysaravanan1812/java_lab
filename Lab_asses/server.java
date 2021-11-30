import java.io.*;   
import java.util.*;
import java.net.*;
public class server {
    public static void main(String[] args) throws Exception {
        File f = new File("student.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("File Created...");
        FileWriter fw = new FileWriter(f,true);
        String name;
        String rn;
        while(true){
            System.out.print("Enter Name : ");
            name = sc.nextLine();
            if(name.equals("Exit")){
                fw.close();
                break;
            }
            System.out.print("Enter Roll No : ");
            rn = sc.nextLine();
            fw.write(name+"\n"+rn+"\n");
        }
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("Socket Created and Listening...");
        

        Socket s=ss.accept();
        System.out.println("Client Connnected...");

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String str2;
        Scanner fr = new Scanner(f);
        while(true){
            str2 = din.readUTF();
            String str;
            Boolean ff = false;
            if(str2.equals("Exit")){
                break;
            }
            while(fr.hasNextLine()){
                str=fr.nextLine();
                if(str2.equals(str)){
                    ff=true;
                    dout.writeUTF(fr.nextLine());
                    break;
                }
            }
            if(!ff){
                dout.writeUTF("Name not there");
            }
        }
        ss.close();
        din.close();
        dout.close();
    }
}