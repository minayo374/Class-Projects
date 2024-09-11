import java.util.Scanner;  // Needed for the Scanner class

public class Average {
	private int data[] = {0, 0, 0, 0, 0}; 	//The array which will contain the scores
	private double mean; 	//The arithmetic avarage of the scores
	
	/**The constructor. 
	 * This will prompt for the user to input their score repeatedly by loop for 5 times.
	 * after that call selectionSort and calclateMean methods*/
	Average(){
		Scanner in = new Scanner(System.in);
		int temp;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter score number " + (i + 1) + ": ");
			temp = in.nextInt();
			data[i] = temp;
		}
		selectionSort();
		calculateMean();
	}
	/**This method will calculate the mean of scores from array by for-loop
	 * total divided by the number of scores.
	 * The result will be stores in the mean.*/
	public void calculateMean() {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		mean = total / data.length;
	}
	/**This method will return data to String*/
	public String toString() {
		return "Average [data=" + (data != null ? arrayToString(data, data.length) : null) + ", mean=" + mean + "]";
	}
	/**This method return arrays to String*/
	private String arrayToString(Object array, int len) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < len; i++) {
			if (i > 0)
				buffer.append(", ");
			if (array instanceof int[])
				buffer.append(((int[]) array)[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}
	/**This method uses the selection sort algorithm 
	 * to rearrange the data set from highest to lowest*/
	public void selectionSort() {
		int maxIndex;	//Store the index that hold the biggest data
		
		//hold the first value and compare with the rest of the value in data
		for (int i = 0; i < data.length - 1; i++) {
			maxIndex = i;
			//loop from the second value and compare the value with the first one
			//if the value is bigger than the one holding, change the maxIndex
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] > data[maxIndex]) {
					maxIndex = j;
				}
				int temp = data[maxIndex];	//hold the value in the maxIndex
				//swap the value
				data[maxIndex] = data[i];
				data[i] = temp;
			}
		}
	}
}
