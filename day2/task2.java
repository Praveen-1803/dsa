package day2;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
	public static void main(String[]args) {
		Scanner pk=new Scanner(System.in);
		int n=pk.nextInt();
        int[] num = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            num[i] = pk.nextInt();
        }
		Arrays.sort(num);
		System.out.println("before swappng:"+ Arrays.toString(num));
		int start=0;
		int end=num.length-1;
		while(start<end) {
			int temp=num[end];
			num[end]=num[start];
			num[start]=temp;
			
			start ++;
			end --;
		}
		System.out.println("after swapping:" + Arrays.toString(num));
		
	}

}
