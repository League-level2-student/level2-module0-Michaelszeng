package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = {"no", "no", "no", "stop", "no"};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "NO";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int[] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0; i<nums.length; i++) {
			Random rand = new Random();
			nums[i] = rand.nextInt(999);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 999;
		for (int j=0; j<nums.length; j++) {
			if (nums[j]<smallest) {
				smallest = nums[j];
			}
		}
		System.out.println("The smallest number is " + smallest);
		System.out.println();
		//9 print the entire array to see if step 8 was correct
		for (int k=0; k<nums.length; k++) {
			System.out.println(nums[k]);
		}
		//10. print the largest number in the array.
		int biggest = 0;
		for (int l=0; l<nums.length; l++) {
			if (nums[l]>biggest) {
				biggest = nums[l];
			}
		}
		System.out.println("biggest is " + biggest);

	}
}
