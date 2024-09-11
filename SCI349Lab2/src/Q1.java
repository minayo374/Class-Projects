
public class Q1 {
	static public void main(String[] arg) {
		int size = 5;
		int[] num = new int[size];
		//assign numbers from 0 to 4 to array
		for (int i = 0; i < size; i++) {
			num[i] = i;
		}
		//print values from array from first to last
		for (int i = 0; i < size; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		//print values from last to first
		for (int i = size-1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}
