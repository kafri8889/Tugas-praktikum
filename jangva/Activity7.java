// --------------------------------- No 1 ---------------------------------
public static int alternatingSum(int[] arr) {
    int tot = 0;
    for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 0) tot += arr[i];
        else tot -= arr[i];
    }
    return tot;
}
// --------------------------------- No 1 ---------------------------------


// --------------------------------- No 2 ---------------------------------
	public static int getTotal(int[] arr) {
		int sum = 0;
		for (int n : arr) sum += n;
		return sum;
	}

	public static double getAverage(int[] arr) {
		int sum = 0;
		for (int n : arr) sum += n;
		return (double) sum / arr.length;
	}

	public static int getHighest(int[] arr) {
		int highest = Integer.MIN_VALUE;
		for (int n : arr) if (n > highest) highest = n;
		return highest;
	}
	
	public static int getLowest(int[] arr) {
		int lowest = Integer.MAX_VALUE;
		for (int n : arr) if (n < lowest) lowest = n;
		return lowest;
	}
// --------------------------------- No 2 ---------------------------------


// --------------------------------- No 3 ---------------------------------
public class RataRata {

	public static void main(String[] args) {
		double sum = 0;
		for (String s : args) sum += Double.parseDouble(s);
		System.out.println(sum / args.length);
	}

}
// --------------------------------- No 3 ---------------------------------


// --------------------------------- No 4 ---------------------------------
	public static double getTotal(double[][] arr) {
		double sum = 0;
		for (double[] inarr : arr) for (double n : inarr) sum += n;
		return sum;
	}

	public static double getAverage(double[][] arr) {
		double sum = 0;
		for (double[] inarr : arr) for (double n : inarr) sum += n;
		return sum / (arr.length * arr[0].length);
	}

	public static double getRowTotal(double[][] arr, int row) {
		double sum = 0;
		for (double n : arr[row]) sum += n;
		return sum;
	}

	public static double getColumnTotal(double[][] arr, int col) {
		double sum = 0;
		for (double[] inarr : arr) sum += inarr[col];
		return sum;
	}

	public static double getHighestInRow(double[][] arr, int row) {
		double res = Double.MIN_VALUE;
		for (double n : arr[row]) if (n > res) res = n;
		return res;
	}
	
	public static double getLowestInRow(double[][] arr, int row) {
		double res = Double.MAX_VALUE;
		for (double n : arr[row]) if (n < res) res = n;
		return res;
	}
// --------------------------------- No 4 ---------------------------------
