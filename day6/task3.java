package day6;

import java.util.Arrays;

public class task3 {
	
	int[] arr= new int[5];
	int rear;
	int front;
	
	public task3()
	{
		rear=-1;
		front=-1;
	}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("queue spreadout");
		}
		else
		{
		 arr[++rear]=num;
		}
	}
	public void dequeue()
	{
		if(front==4)
		{
			System.out.println("empty Queue");
		}
		else
		{
		arr[++front]=0;
	}
	}
		public void display()
		{
			System.out.println(Arrays.toString(arr));
		}
		public static void main(String[]args)
		{
			task3 q1=new task3();
			
			q1.enqueue(33);
			q1.enqueue(44);
			q1.enqueue(55);
			q1.enqueue(66);
			q1.enqueue(77);
			q1.display();
			q1.dequeue();
			q1.dequeue();
			q1.dequeue();
			q1.dequeue();
			q1.display();
		}
	
}
