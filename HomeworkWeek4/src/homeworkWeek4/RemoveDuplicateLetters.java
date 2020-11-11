package homeworkWeek4;

public class RemoveDuplicateLetters {
	public static int removeDuplicateElements(String arr[], int n) {
		String[]temp = new String[n];
		int j = 0;
		int match = 99;
		
		for (int i=0; i<n; i++) {
			match =99;
			for (int k=0; k<n; k++) {
				if (arr[i] == temp[k]) {
					match = k;
				}
			}
			if (match == 99) {
				temp[j] = arr[i];
				j = j+1;
			}
		}
		for (int i=0; i<j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		String arr[] = {"b","d","a","b","f","a","g","a","a","f"};
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		for (int i=0; i<length; i++)
			System.out.print(arr[i]+" ");
	}

}
