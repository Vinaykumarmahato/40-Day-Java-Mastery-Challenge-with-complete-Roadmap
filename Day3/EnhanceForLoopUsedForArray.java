package Day3;

public class EnhanceForLoopUsedForArray {
	
	public static void main(String[] args) {
		
		int arr[][]= {
				
				{12,63,65,32},
				{58 ,24},
				{96,68,85}
		};
		for(int a[]: arr) {
			
			for(int b:a) {
				
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
	}
}
//🔹 Day 3: Arrays and Strings

//On the third day of our Java programming journey, we'll dive into the fascinating world of arrays and strings. These data structures are essential for managing and manipulating collections of values.

//📅 Arrays
//Arrays allow you to store multiple values of the same data type in a single variable. We'll explore how to declare, initialize, and access elements in arrays.

//📅 Strings
//Strings are fundamental for handling text and character data in Java. We'll cover string creation, manipulation, and common operations like concatenation.

//📅 Practice and Hands-On
//To solidify our understanding, we'll engage in practical exercises, from working with arrays to manipulating strings. Hands-on experience is key to mastering these essential concepts.

//Stay tuned for more as we continue our Java journey!
