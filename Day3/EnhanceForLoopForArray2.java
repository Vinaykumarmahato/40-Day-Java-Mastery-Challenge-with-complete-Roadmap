package Day3;


public class EnhanceForLoopForArray2 {
	
	public static void main(String[] args) {
		
		int nums[][]= {
				
				{32 ,25, 22 ,23, 32, 23, 32, 32 ,23},
				{52,52,59,54,414,11,441,1,54},
				{96,4,22,51},
				{36,89,41,24,1525,1152},
				{96,54,41},
				{85,54}
		};
		
		for(int a[]:nums) {
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
