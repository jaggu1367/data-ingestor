package com.tcs;

public class DataIngestionApp{
	
		
	public static void main(String args[]){
		
			System.out.println("Data ingestion is completed..");
			
	}
	
	public static int findMax(int arr[]){  
        int max=0; 
		if(arr.length > 0) max = arr[0];
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
	
}