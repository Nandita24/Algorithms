/*
2.
a.Design a superclass called Staff with details as StaffId, Name, Phone, Salary. Extend this 
  class by writing three subclasses namely Teaching (domain, publications), Technical
  (skills), and Contract (period). Write a Java program to read and display at least 3 staff
   objects of all three categories
 */
import java.util.Scanner;
class Staff{
	private String staffId,name;
	private int phone;
	private float salary;
	
	public void accept() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Staff Id\n");
		staffId=scanner.next();
		System.out.println("Enter Name\n");
		name=scanner.next();
		System.out.println("Enter Phone\n");
		phone=scanner.nextInt();
		System.out.println("Enter Salary\n");
		salary=scanner.nextFloat();
		
	}
	public void display() {
		System.out.println("Staff Id: "+staffId);
		System.out.println("Name:"+name);
		System.out.println("Phone: "+phone);
		System.out.println("Salary: "+salary);
		
	}
}

class Teaching extends Staff{
	private String domain;
	private String [] publications;
	public void accept() {
		super.accept();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Domain\n");
		domain=scanner.next();
		System.out.println("Enter Number of Publications\n");
		int n=scanner.nextInt();
		publications=new String[n];
		System.out.println("Enter Publications\n");
		for(int i=0;i<n;i++)
				publications[i]=scanner.next();
	
	}
	public void display() {
		super.display();
		System.out.println("Domain: "+domain);
		System.out.println("Publications\n");
		for(int i=0;i<publications.length;i++)
			System.out.println(publications[i]);
				
		
	}
}

class Technical extends Staff{
	private String[] skills;
	public void accept() {
		super.accept();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of skills\n");
		int n=scanner.nextInt();
		skills=new String[n];
		System.out.println("Enter skills\n");
		for(int i=0;i<n;i++)
			skills[i]=scanner.next();
	}
	public void display() {
		super.display();
		System.out.println("Skills\n");
		for(int i=0;i<skills.length;i++)
			System.out.println(skills[i]);
		
	}
}

class Contract extends Staff{
	private int period;
	
	public void accept()
	{
		super.accept();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Period\n");
		period=scanner.nextInt();
		
	}
	public void display() {
		super.display();
		System.out.println("Periods: "+period);
		
	}
}

public class p2 {
	public static void main(String[] args)
	{
		Teaching teaching=new Teaching();
		Technical technical=new Technical();
		Contract contract=new Contract();
		
		System.out.println("Enter details for Teaching Stafff Member\n");
		teaching.accept();
		System.out.println("Enter details for Technical Stafff Member\n");
		technical.accept();
		System.out.println("Enter details for Contract Stafff Member\n");
		contract.accept();
		System.out.println("Details for Teaching Stafff Member are\n");
		teaching.display();
		System.out.println("Details for Technical Stafff Member are\n");
		technical.display();
		System.out.println("Details for Contract Stafff Member are\n");
		contract.display();
		
		
	}
	
}
