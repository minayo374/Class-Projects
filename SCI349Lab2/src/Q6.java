import java.util.Random;

public class Q6 {
	static public void main(String[] arg) {
		//create array for size 10 and assign random int to array
		int[] nums = new int[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			nums[i] = rand.nextInt(101);
		}
		System.out.println("Original");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + nums[i] + " ");
			
		}
		System.out.println("Every element at even index");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + ": " + nums[i] + " ");
			}
		}
		System.out.println("Every even element");
		for (int i = 0; i < 10; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println(i + ": " + nums[i] + " ");
			}
		}
		System.out.println("All elements in reverse order");
		for (int i = 9; i >= 0; i--) {
			System.out.println(i + ": " + nums[i] + " ");
		}
		System.out.println("Only the first and last elements");
		System.out.println(0 + ": " + nums[0] + " ");
		System.out.println(9 + ": " + nums[9] + " ");
	}
}
