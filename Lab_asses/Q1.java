import java.util.Scanner;
class student
{
public void action(int rollno,int TotalMember1,int TotalMember2,int TotalMember3,int TotalMember4,String StaffName1,String StaffName2,String StaffName3,String StaffName4,String name,String subjname1,String subjname2,String subjname3,String subjname4)
{
System.out.println("rollno :" + rollno);
System.out.println("studen name :" + name);
System.out.println("selected subject name1 : " + subjname1 + ":" + "staffname for this subject : " + StaffName1 + ":" + "Total member for this subject : " + TotalMember1);
System.out.println("selected subject name2 : " + subjname2 + ":" + "staffname for this subject : " + StaffName2 + ":" + "Total member for this subject : " + TotalMember2);
System.out.println("selected subject name3 : " + subjname3 + ":" + "staffname for this subject : " + StaffName3 + ":" + "Total member for this subject : " + TotalMember3);
System.out.println("selected subject name4 : " + subjname4 + ":" + "staffname for this subject : " + StaffName4 + ":" + "Total member for this subject : " + TotalMember4);
}
}
public class Q1{
public static void main(String[] args){

try (Scanner reader = new Scanner(System.in)) {
    System.out.println("enter your rollno : ");
    int rollno = reader.nextInt();
    
    System.out.println("total member of the team1 : ");
    int TotalMember1 = reader.nextInt();
    
    System.out.println("total member of the team2 : ");
    int TotalMember2 = reader.nextInt();
    
    System.out.println("total member of the team3 : ");
    int TotalMember3 = reader.nextInt();
    
    System.out.println("total member of the team4 : ");
    int TotalMember4 = reader.nextInt();
    
    reader.nextLine();
    
    System.out.println("enter your staffname1 : ");
    String StaffName1 = reader.nextLine();
    
    System.out.println("enter your staffname2 : ");
    String StaffName2 = reader.nextLine();
    
    System.out.println("enter your staffname3 : ");
    String StaffName3 = reader.nextLine();
    
    System.out.println("enter your staffname4 : ");
    String StaffName4 = reader.nextLine();
    
    System.out.println("enter your name : ");
    String name = reader.nextLine();
    System.out.println("enter your subject name1 : ");
    String subjname1 = reader.nextLine();
    System.out.println("enter your subject name2 : ");
    String subjname2 = reader.nextLine();
    System.out.println("enter your subject name3 : ");
    String subjname3 = reader.nextLine();
    System.out.println("enter your subject name4 : ");
    String subjname4 = reader.nextLine();
    System.out.println("          **MICROSOFT TEAMS**         ");
    student obj = new student();
    obj.action(rollno,TotalMember1,TotalMember2,TotalMember3,TotalMember4,StaffName1,StaffName2,StaffName3,StaffName4,name,subjname1,subjname2,subjname3,subjname4);
}
}
}