package day6;

public class task1 {
	
	int mystack[]=new int[5];
	int top=-1;
	
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("stack overflow ");
		}
		else
		{
			mystack[++top]=num;
		}
		
	}
	
	public void display()
	{
		System.out.print(" stack elements : ");
		for(int i=0;i<=top;i++)
		{
			System.out.print(+mystack[i] +" ");
		}
		 System.out.println(" ");
		
	}
	
	 public void pop() {
		 if(top<0)
			{
				System.out.println("stack error ");
			}
			else
			{
				System.out.println(" " +mystack[top] + " popped stack");  
	            --top; 
			}
			
		}
		 
	     
	        
	    
	 public void peek() {
		 if(top<0)
			{
				System.out.println("stack error ");
			}
			else
			{
	        
	            System.out.println(" Top element is: " + mystack[top]);
	        }
		 }
	 public static void main(String[]args)
		{
			task1 s1=new task1();
			s1.push(23);
			s1.push(66);
			s1.push(88);
			s1.push(45);
			s1.push(36);
			s1.display();
			s1.pop();
			s1.pop();
			s1.display();
			s1.peek();
			s1.display();
			
		}

	 }
