public class InsertionSort{
	
	public static int[] insertionSort(int[] arr){
		for(int i = 1; i<arr.length; i++){
			int j = i; 
			while(j>0 && arr[j-1]>arr[j]){
				int temp = arr[j];
				arr[j] = arr[j-1]; 
				arr[j-1] = temp; 
				System.out.print("Process: "); 
				for(int element: arr){
					System.out.print(element+ " ");
				}
				System.out.println();
				j--; 
			}
			
		}
		return arr; 
	}
	
	public static void main(String args[]){
		int[] unsortedList = {5, 4, 3, 2, 1}; 
		
		System.out.print("Unsorted List: ");
		for(int element: unsortedList){
			System.out.print(element+" ");
		}
		System.out.println();
		
		int[] sortedList = insertionSort(unsortedList); 
		
		System.out.print("Sorted List: ");
		for(int element: sortedList){
			System.out.print(element+" ");
		}
	}
	
}