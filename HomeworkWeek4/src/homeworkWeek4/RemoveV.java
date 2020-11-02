package homeworkWeek4;

import java.util.Arrays;

public class RemoveV {
 
    public static int[] removeElements(int[] arr, int key)
    {
    	int index = 0;
    	for (int i=0; i<arr.length; i++)
    		if (arr[i] !=key)
    			arr[index++] = arr[i];
    	
    	return Arrays.copyOf(arr, index);  
    }
    
    public static void main(String[] args) 
    {
    	int[] array = {0,1,3,2,3,0,3,1};
    	int key = 3;
    	array = removeElements(array, key);
    	System.out.println(Arrays.toString(array));
    }
}