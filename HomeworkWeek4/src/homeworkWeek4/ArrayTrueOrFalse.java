package homeworkWeek4;

public class ArrayTrueOrFalse {

	public static void main(String[] args) {
		System.out.println("Index\tValue");
		int trueOrFalse[]= {83,70,5,23,6};
		
		for(int counter=0;counter<trueOrFalse.length;counter++) {
			System.out.println(counter + "\t" + trueOrFalse[counter]);
		}
		
		System.out.println();
		if (trueOrFalse[0]>trueOrFalse[1]) {
			System.out.println(trueOrFalse[0] + " is larger than " + trueOrFalse[1]);
		}else {
			System.out.println(trueOrFalse[0] + " is smaller than " + trueOrFalse[1]);
		}
		
		System.out.println();
		if (trueOrFalse[1]>trueOrFalse[2]) {
			System.out.println(trueOrFalse[1] + " is larger than " + trueOrFalse[2]);
		}else {
			System.out.println(trueOrFalse[1] + " is smaller than " + trueOrFalse[2]);
		}
		
		System.out.println();
		if (trueOrFalse[2]>trueOrFalse[3]) {
			System.out.println(trueOrFalse[2] + " is larger than " + trueOrFalse[3]);
		}else {
			System.out.println(trueOrFalse[2] + " is smaller than " + trueOrFalse[3]);
		}
		
		System.out.println();
		if (trueOrFalse[3]>trueOrFalse[4]) {
			System.out.println(trueOrFalse[3] + " is larger than " + trueOrFalse[4]);
		}else {
			System.out.println(trueOrFalse[3] + " is smaller than " + trueOrFalse[4]);
		}
	}

}
