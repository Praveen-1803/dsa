package day8;

public class task2 {
	 public static int binarySearch( int[] arr,int target,int left, int right) {
		 
	        if (left > right) {
	            return -1;  
	        }
	        int mid = left + (right - left) / 2;
	        if (arr[mid] == target) 
	        {
	            return mid;  
	        }
	        else if (arr[mid] > target)
	        {
	            return binarySearch(arr, target, left, mid - 1);  
	        } else 
	        {
	            return binarySearch(arr, target, mid + 1, right); 
	        }
	    }
	 public static void main(String[] args) {
	        int[] data = {1, 3, 5, 7, 9, 11, 13};
	        int target = 7;
	        int result = binarySearch(data, target, 0, data.length - 1);

	        if (result != -1) {
	            System.out.println("Target found at index: " + result);
	        } else {
	            System.out.println("Target not found.");
	        }
	    }
	 }

