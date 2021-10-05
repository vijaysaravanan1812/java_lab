import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

class file1{
	
	void create(){
		try{
			Scanner file = new Scanner(System.in);
			System.out.print("\n\tEnter the filename : ");
			String filename = file.nextLine(); 
			FileWriter myWriter = new FileWriter(filename);
			System.out.println("\n\tA file named " + filename + " created");
		}
		catch (IOException e) {
      			System.out.println("\n\tAn error occurred.");
      			e.printStackTrace();
    		}
	}
}

class file2{	
	void write(){
		Scanner file = new Scanner(System.in);
		System.out.print("\n\tEnter the name of the file to be the text added: ");
		String file_name = file.nextLine(); 
		
		Scanner input = new Scanner(System.in);
		System.out.print("\n\tEnter the string to be written in the file :");
		String content = input.nextLine();
		
		String path = System.getProperty("user.dir") + "/" + file_name;

    	    	try {
     	      		Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.APPEND);
    	    	}
      	  	catch (IOException e){
      			System.out.println("\n\tAn error occurred.");
     	 		e.printStackTrace();
        	}
	}
}

class file3{
	void print(){
		Scanner fn = new Scanner(System.in);
		System.out.print("\n\tEnter the name of the file to be printed: ");
		String orgn_file = fn.nextLine(); 
			
      	  	try{
            		FileReader fr = new FileReader(orgn_file);
            		String str = "";
  
            		int i;
            		while ((i = fr.read()) != -1) {
                		str += (char)i;
            		}
            		System.out.println(str);
        	}
  
        	catch (IOException e) {
        	    	System.out.println("There are some IOException");
        	}
    	}
}

class file4{
	void copy(){
		Scanner file1 = new Scanner(System.in);
		System.out.print("\n\tEnter the name of the file to copied: ");
		String original_file = file1.nextLine(); 
		
		
		System.out.print("\n\tEnter the name of the xerox-file : ");
		String xerox_file = file1.nextLine(); 
		
      	  	try {
            		FileReader fr = new FileReader(original_file);
            		FileWriter fw = new FileWriter(xerox_file);
            		String str = "";
  
            		int i;
            		while ((i = fr.read()) != -1) {
                		str += (char)i;
            		}
            		System.out.println(str);
	            	fw.write(str);
            		fr.close();
            		fw.close();
  
            		System.out.println("File reading and writing both done");
        	}
  
        	catch (IOException e) {
        	    	System.out.println("There are some IOException");
        	}
    	}
}

class file5{
	void check_spc(){
		Scanner fn1 = new Scanner(System.in);
		System.out.print("\n\tEnter the name of the file to be checked for special characters: ");
		String spc_file = fn1.nextLine();
            	String str = "";
			
      	  	try{
            		FileReader fr = new FileReader(spc_file);
  			
            		int i,count=0;
            		while ((i = fr.read()) != -1) {
                		if((i<=47 && i >=33) || (i >=58 && i <=64) || (i<=91  && i>=96) || (i<=123  && i>=126)){
                			count+=1;
                			
                		}
                		else{
                			count=0;
                		}
            		}
            		if(count!=0){
            			System.out.println("There is a Special Character in the file.");
            		}
            		else{
            			System.out.println("There is NO Special Character in the file.");
            		}	
        	}
  
        	catch (IOException e) {
        	    	System.out.println("There are some IOException");
        	}
        }
}
        	
class file6{
	void remove_spc(){
		Scanner fn1 = new Scanner(System.in);
		System.out.print("\n\tEnter the name of the file to be checked for special characters: ");
		String spc_file = fn1.nextLine();
		
            	Path fileName = Path.of(spc_file);
		try{
			String actual = Files.readString(fileName);
			String resultStr="";
			System.out.println(actual);
			for (int i=0;i<actual.length();i++) {
				if (actual.charAt(i)>64 && actual.charAt(i)<=122)
					resultStr = resultStr + actual.charAt(i);
				if (actual.charAt(i) == '\n')
					resultStr = resultStr + "\n";
				if (actual.charAt(i) == ' ')
					resultStr = resultStr + " ";
			}  
			System.out.println("\nString after removing special characters: \n"+resultStr.trim());    
		}	
		catch (IOException e) {
            		System.out.print(e.getMessage());
        	}
        	     	
    	}	
}	

class shape{
	void triangle(){
		Scanner tri = new Scanner(System.in);
		System.out.print("\n\tEnter the height of the triangle: ");
		double a = tri.nextDouble();
		System.out.print("\tEnter the base of the triangle: ");
		double b = tri.nextDouble();
		
		double c = 0.5 * a * b;
		System.out.print("\tArea of the triangle with base "+b+" and height "+a+" is "+c);
	}
	
	void square(){
		Scanner sq = new Scanner(System.in);
		System.out.print("\n\tEnter the side of the square: ");
		int a = sq.nextInt();
		
		int b =  a * a;
		System.out.print("\tArea of the square with side "+a+" is "+b);
	}
	
	void rectangle(){
		Scanner rec = new Scanner(System.in);
		System.out.print("\n\tEnter the length of the rectangle: ");
		int a = rec.nextInt();
		System.out.print("\tEnter the breadth of the rectangle: ");
		int b = rec.nextInt();
		
		int c =  a * b;
		System.out.print("\tArea of the rectangle with length "+a+" and breadth "+b+" is "+c);
	}
}

public class filecreate{
	public static void main(String[] args){
		file1 f1 = new file1();
		file2 f2 = new file2();
		file3 f3 = new file3();
		file4 f4 = new file4();
		file5 f5 = new file5();
		file6 f6 = new file6();
		shape f7 = new shape();
		while(true){
			Scanner selection = new Scanner(System.in);
			System.out.print("\nEnter the selection : ");
			int a = selection.nextInt();
			
			switch(a){
				case 1:
					f1.create();
					break;
				case 2:
					f2.write();
					break;
				case 3:
					f3.print();
					break;
				case 4:
					f4.copy();
					break;
				case 5:
					f2.write();
					break;
				case 6:
					f5.check_spc();
					break;
				case 7:
					f6.remove_spc();
					break;
				case 8:
					f7.triangle();
					f7.square();
					f7.rectangle();
					break;
				case 9:
					System.exit(0);
			}
		}		
	}
}