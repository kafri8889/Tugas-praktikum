// ---------------------------------------------- No 1 -----------------------------------------------
public static int hitungVokal(String s) {
	int res = 0;
	for (char c : s.toCharArray()) if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o' || c == 'A' || c == 'I' || c == 'U' || c == 'E' || c == 'O') res++;
	return res;
}
// ---------------------------------------------- No 1 -----------------------------------------------

// ---------------------------------------------- No 2 -----------------------------------------------
public static int firstDigit(int n) {
	int mn = n;
	while (mn > 10) mn /= 10;
	return mn;
}

public static int lastDigit(int n) {
	return n % 10;
}

public static int banyakDigit(int n) {
	int mn = n;
	int count = 0;
	while (mn > 0) {
		mn /= 10;
		count++;
	}
	return count;
}
// ---------------------------------------------- No 2 -----------------------------------------------

// ---------------------------------------------- No 3 -----------------------------------------------
public static double hitungPresentValue(double target, double interest, int period) {
    return target / Math.pow((1 + interest), period);
}
// ---------------------------------------------- No 3 -----------------------------------------------

// ---------------------------------------------- No 4 -----------------------------------------------
  public static double hitungRatarata(double... values) {
		double count = 0.0;
		double sum = 0.0;
		for (double value : values) {
			sum += value;
			count++;
		}

		return sum / count;
	}

	public static char tentukanGrade(double value) {
		if (value >= 90) return 'A';
		if (value >= 80) return 'B';
		if (value >= 70) return 'C';
		if (value >= 60) return 'D';
		else return 'E';
	}
// ---------------------------------------------- No 4 -----------------------------------------------
