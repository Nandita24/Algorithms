/*
1(b) 

Write a Java program to implement the Stack using arrays. Write Push(), Pop(), and 
Display() methods to demonstrate its working.

*/
import java.util.Scanner;
class Stack{
	private int arr[],top,size;
	
	public Stack(int size) {  //Parameterized Constructor
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	
	public void push(int i) {
		if(top==size-1) {
			System.out.println("Stack Overflow\n");
			return;
		}
		arr[++top]=i;
		
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack Unerflow\n");
			return;
		}
		System.out.println("Element popped is : "+arr[top--]);
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Stack Unerflow\n");
			return;
		}
		System.out.println("Stack\n");
		for(int i=top;i>=0;i--)
			System.out.println(arr[i]+" ");
	}
}


public class Array_Stack {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter size of integer stack\n");
		int n=scanner.nextInt();
		
		Stack stack=new Stack(n); //Intializing obj with parameterized constructor
		
		while(true) {
			System.out.println("Stack Operations\n");
			System.out.println("1.Push\n");
			System.out.println("2.Pop\n");
			System.out.println("3.Display\n");
			System.out.println("4.Exit\n");
			
			int choice=scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to push\n");
				stack.push(scanner.nextInt());
				break;
				
			case 2:
				stack.pop();
				break;
				
			case 3: 
				stack.display();
				break;
			 
			case 4: 
				System.exit(0);
			}
		}
	}
}
