package com.yogi;

/**
 * @author yogeswaran
 *
 */

 public class BubbleSort {

	public static void main(String args[]){
		int[] input ;
		BubbleSort bsObject = new BubbleSort();
		input = new int[] {4,2,6,4,1,5,3};

		bsObject.printArray(input,"Unsorted Array");
		
		//	For each element in input array
		for( int i=0 ; i<input.length ; i++ ){
			//	For each element from unsorted part of input array 
			//	[Sorted elements will be moved to the start of the input array]
			for(int j=input.length-1 ; j>=i+1 ; j--){
				if( input[j] < input[j-1] ){
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		
		bsObject.printArray(input,"Sorted Array");

	}
	
	public void printArray(int[] input, String message){
		System.out.print("\n"+message.toUpperCase()+"\n");
		for( int in : input ){
			System.out.print("\t"+in);
		}
	}
	
}
