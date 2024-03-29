/*1. 
a. Create a Java class called Student with the following details as variables within it. 
(i) USN 
(ii) Name 
(iii) Programme /Branch
(iv) Phone 
Write a Java program to create nStudent objects and print the USN, Name, Programme, and 
Phoneof these objects with suitable headings.
*/
import java.util.Scanner;
class Student {
	private String usn,name,branch,ph;
	
	public void accept()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter USN\n");
		usn=scanner.next();
		
		System.out.println("Enter Name\n");
		name=scanner.next();
		
		System.out.println("Enter Branch\n");
		branch=scanner.next();
		
		System.out.println("Enter Phone number\n");
		ph=scanner.next();
	}
	
	public void display()
	{
		System.out.println("Student details\n");
		System.out.println("Usn: "+usn);
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Phone: "+ph);
		System.out.println();
	}

}

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter value for n");
		int n=scanner.nextInt();
		
		Student[] ob1=new Student[n];
		
		for(int i=0;i<n;i++)
		{
			ob1[i]=new Student(); //Intializing obj using constructors
			ob1[i].accept();
		}
		
		for(int i=0;i<n;i++)
				ob1[i].display();
	}
}
	