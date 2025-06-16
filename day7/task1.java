package day7;

import java.util.Arrays;

public class task1 {
	
	public static void bubble(int []sample)
	{
		System.out.println(Arrays.toString(sample));	
		
		for(int i=0;i < sample.length;i++)
		{
			for(int j=0;j<sample.length-1;j++)
			{
				if(sample[j]> sample[j+1])
				{
					int temp=sample[j];
					sample[j]=sample[j+1];
					sample[j+1]=temp;
				}
			}
		}
		System.out.println( Arrays.toString(sample));
		}
	public static void main(String[]args)
	{
	 int[] arr= {22,3,55,33,4};
	 bubble(arr);
	}

}
