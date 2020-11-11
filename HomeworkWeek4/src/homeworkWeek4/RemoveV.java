package homeworkWeek4;

import java.util.Arrays;

public class RemoveV {
 
    public static int[] removeElements(int[] array, int v)
    {
    	int index = 0;
    	for (int i=0; i<array.length; i++)
    		if (array[i] !=v)
    			array[index++] = array[i];
    	
    	return Arrays.copyOf(array, index);  
    }
    
    public static void main(String[] args) 
    {
    	int[] array = {0,1,3,2,3,0,3,1};
    	int v = 3;
    	array = removeElements(array, v);
    	System.out.println(Arrays.toString(array));
    }
}