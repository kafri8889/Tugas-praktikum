import java.lang.Character;

public class StringUtil {

    /**
     * Membuat semua karakter [s] menjadi huruf kapital
     *
     * @param s
     * @return a copy of [s] string converted to upper case
     */
    public static String uppercase(String s) {
        // Jika menggunakan built-in function
        // return s.toUpperCase(Locale.ROOT);

        StringBuilder uppercased = new StringBuilder();

        for (char c : s.toCharArray()) {
            // Karakter 'a' dalam ascii = 97
            // Karakter 'A' dalam ascii = 65
            // Untuk mengkonversi karakter kecil ke besar => asciiIndex - 32

            if (Character.isAlphabetic(c)) {
                if (c < 97) uppercased.append(c);
                else uppercased.append((char) (c - 32));
            } else uppercased.append(c);
        }

        return uppercased.toString();
    }

    /**
     * Membuat semua karakter [s] menjadi huruf kecil
     *
     * @param s
     * @return a copy of [s] string converted to lower case
     */
    public static String lowercase(String s) {
        // Jika menggunakan built-in function
        // return s.toLowerCase(Locale.ROOT);

        StringBuilder lowercased = new StringBuilder();

        for (char c : s.toCharArray()) {
            // Karakter 'a' dalam ascii = 97
            // Karakter 'A' dalam ascii = 65
            // Untuk mengkonversi karakter besar ke kecil => asciiIndex + 32

            if (Character.isAlphabetic(c)) {
                if (c > 90) lowercased.append(c);
                else lowercased.append((char) (c + 32));
            } else lowercased.append(c);
        }

        return lowercased.toString();
    }

    /**
     * Membuat karakter pertama dalam suatu string menjadi kapital,
     * dan membuat karakter lainnya menjadi huruf kecil.
     * <p>
     * Contoh: "hello woRLd" => "Hello World"
     */
    public static String uppercaseFirstCharInWord(String s) {
        char[] ca = s.toCharArray();
        StringBuilder uppercased = new StringBuilder(uppercase(String.valueOf(ca[0])));

        for (int i = 1; i < ca.length; i++) {
            if (Character.isAlphabetic(ca[i])) {
                if (Character.isWhitespace(ca[i - 1])) uppercased.append(uppercase(String.valueOf(ca[i])));
                else uppercased.append(lowercase(String.valueOf(ca[i])));
            } else uppercased.append(ca[i]);
        }

        return uppercased.toString();
    }

    /**
     * Membuat karakter pada string [s] di index ke-[index] menjadi huruf kapital.
     */
    public static String uppercaseAt(String s, int... index) {
        char[] ca = s.toCharArray();
        for (int i : index) ca[i] = uppercase(String.valueOf(ca[i])).charAt(0);
        return new String(ca);
    }

    /**
     * Membuat karakter pada string [s] di index ke-[index] menjadi huruf kecil.
     */
    public static String lowercaseAt(String s, int... index) {
        char[] ca = s.toCharArray();
        for (int i : index) ca[i] = lowercase(String.valueOf(ca[i])).charAt(0);
        return new String(ca);
    }

}
