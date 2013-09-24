public class Stats {
	
	public static void main(String[] args) {
		
		int[] a = {1,3,5,9,24,57,105};

		int maxi = max(a);
		int mini = min(a);
		double mean = average(a);
		double med = median(a);


		System.out.println("Maximum number in array: " + maxi);
		System.out.println("Minimum number in array: " + mini);
		System.out.println("Average of array: " + mean);
		System.out.println("Median of array: " + med);
	}



	public static int max(int[] a) {

		int result = 0;

		for (int i = 0; i < a.length;i++ ) {
			if(a[i] > result) {
				result = a[i];
			}
		}

		return result;

	}

	public static int min(int[] a) {

		int result = a[0];

		for (int i = 0; i < a.length;i++ ) {
			if(a[i] < result) {
				result = a[i];
			}
		}

		return result;
	}

	public static double average(int[] a) {

		double result = 0.0;

		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		result /=a.length;

		return result;
	}

	public static double median(int[] a) {

		double median = 0.0;

		for (int i = 0, j = a.length; i < a.length; i++, j--) {
			if(a[i] == a[j]) {
				median = a[i];
				break;
			}

		}

		return median;

	}
}