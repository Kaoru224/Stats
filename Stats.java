public class Stats {
	
	public static void main(String[] args) {
		
		int[] a = {2,6,5,7,9,24,103,62};

		int maxi = max(a);
		System.out.println("Maximum number in array: " + maxi);
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
}