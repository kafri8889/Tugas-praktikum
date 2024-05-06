// ------------------------------------------------------------------------ No 1
  public static void main(String[] args) {
		double n;
		ArrayList<Double> doubles = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
			n = scanner.nextDouble();

			if (n != -1) doubles.add(n);
		} while (n != -1);

		if (doubles.isEmpty()) return;

		System.out.println("Rata-rata = " + avg(doubles));
		System.out.println("Maksimum = " + max(doubles));
		System.out.println("Minimum = " + min(doubles));
		System.out.println("Selisih Maks dan Min = " + (max(doubles) - min(doubles)));
	}

	private static double avg(ArrayList<Double> li) {
		double sum = 0f;
		for (Double v : li) sum += v;
		return sum / li.size();
	}

	private static double max(ArrayList<Double> li) {
		double max = li.get(0);
		for (Double v : li) if (v > max) max = v;
		return max;
	}

	private static double min(ArrayList<Double> li) {
		double min = li.get(0);
		for (Double v : li) if (v < min) min = v;
		return min;
	}
// ------------------------------------------------------------------------ No 1

// ------------------------------------------------------------------------ No 2
public static void main(String[] args) {
		int velocity = 0, time = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			if (velocity <= 0) {
				System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
				velocity = scanner.nextInt();

				if (velocity <= 0) {
					System.out.println("Kecepatan tidak bisa negatif. Masukkan kembali kecepatan.");
					continue;
				}
			}

            System.out.print("Masukkan waktu tempuh (jam): ");
            time = scanner.nextInt();

            if (time < 1) {
                System.out.println("Waktu tempuh harus lebih besar dari atau sama dengan 1 jam. Masukkan kembali waktu tempuh.");
            } else break;
        } while (true);

		System.out.println("Waktu (jam)\tJarak (km)");

		for (int t = 1; t <= time; t++) System.out.printf("%-11d\t%6d\n", t, t * velocity);
	}
// ------------------------------------------------------------------------ No 2

// ------------------------------------------------------------------------ No 3
public static void main(String[] args) {
		int buyer = 0, ticket = 10;
		Scanner scanner = new Scanner(System.in);

		do {
			int buyCount;

			System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
			buyCount = scanner.nextInt();

			if (buyCount > 4) {
				System.out.println("Anda tidak bisa membeli lebih dari 4 tiket.");
				continue;
			} else if (buyCount > ticket) {
				System.out.println("Maaf, sisa tiket yang tersisa adalah 3 tiket.");
				continue;
			}

			System.out.printf("Anda membeli sebanyak %d tiket.", buyCount);
			System.out.println();

			ticket -= buyCount;
			buyer++;

			if (ticket <= 0) break;
			else System.out.println("Sisa tiket yang tersedia: " + ticket);
		} while (true);

		System.out.printf("Semua tiket telah terjual kepada %d pembeli.", buyer);
	}
// ------------------------------------------------------------------------ No 3

// ------------------------------------------------------------------------ No 4
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;

		System.out.print("Masukkan sebuah bilangan asli: ");
		num = scanner.nextInt();

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
	}
// ------------------------------------------------------------------------ No 4
