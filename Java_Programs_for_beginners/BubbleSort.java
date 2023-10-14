import java.util.Scanner;
class BubbleSort { 
	void bubbleSort(int arr[]) 
	{ 
		int len = arr.length; 
		for (int i = 0; i < len - 1; i++) 
			for (int j = 0; j < len - i - 1; j++) 
				if (arr[j] > arr[j + 1]) { 
					// swap temp and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
				} 
	} 

	void printArray(int arr[]) 
	{ 
		int len = arr.length; 
		for (int i = 0; i < len; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		BubbleSort ob = new BubbleSort(); 
		int arr[] = { 78, 23, 29, 17, 25, 14, 98 }; 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
}
