package Day3;

public class MultiDim {

		public static void main(String[] args) {
			
			int arr[][]=new int[4][4];
			
			arr[0][0]=5;
			arr[0][1]=6;
			arr[0][2]=8;
			arr[0][3]=9;
			
			arr[1][0]=5;
			arr[1][1]=6;
			arr[1][2]=8;
			arr[1][3]=89;
			
			arr[2][0]=5;
			arr[2][1]=6;
			arr[2][2]=8;
			arr[2][3]=89;
			
			arr[3][0]=5;
			arr[3][1]=6;
			arr[3][2]=8;
			arr[3][3]=89;
			
			for(int i=0; i<arr.length;i++) {
				
				for(int j=0;j< arr[i].length;j++) {
					
					System.out.print(arr[i][j]+" ");
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

