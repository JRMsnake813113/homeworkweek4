package homeworkWeek4;

public class ArrayTrueOrFalse {

	public static boolean isStrictlyIncreasing(double[] in) {
		boolean result = true;
		for(int i=0; i< (in.length - 1); i++) {
			if(in[i+1] <= in[i])
				result = false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		double[] x = {1,2,4,8,16,32,64};
		
		boolean value = isStrictlyIncreasing(x);
			System.out.println(value);
			
	}
}
