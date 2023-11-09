import tuples.Pair;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

      //  average();

        /*
        var total_time = 0f;
        for (int i =0; i < n; i++) {
            total_time += timeFunction(Main::isAnagram, new Pair<>("desperation", "a rope ends it"));
        }
        System.out.printf("Average time taken for isAnagram: %fms\n", total_time / n);

        total_time = 0f;
        for (int i =0; i < n; i++) {
            total_time += timeFunction(Main::isAnagram2, new Pair<>("desperation", "a rope ends it"));
        }
        System.out.printf("Average time taken for isAnagram2: %fms\n", total_time / n);
        */
    }

    /**
     * Method that takes in a {@link Function } f and a parameter t, with which the function is called.
     * It then returns the time it has taken to execute said function.
     * @author Linus Ziegler
     *
     * @param f Method to be timed
     * @param t Parameter with which f is called
     * @return Time it has taken to execute the function in ms
     * @since 0.0.1
    */
    public static <T, R> float timeFunction(Function<T, R> f, T t) {
        long start = System.nanoTime();
        f.apply(t);
        long end = System.nanoTime();

        return (float) (end - start) / 1_000_000f;
    }

    public static boolean isAnagram(Pair<String, String> pair) { return isAnagram(pair.first, pair.second); }

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        var n = s1.length();

        for (int i = 0; i < n; i++) {
            var c1 = s1.charAt(i); // d
            var contains_char = false;

            for (int k = 0; k < n; k++) {
                var c2 = s2.charAt(k);
                if (c1 == c2) {
                    contains_char = true;
                    s2 = s2.replaceFirst(String.valueOf(c1), "\0");
                    break;
                }
            }
            if (!contains_char) return false;
        }
        return true;
    }

    public static boolean isAnagramHashMap(Pair<String, String> pair) {
        return isAnagramHashMap(pair.first, pair.second);
    }
    public static boolean isAnagramHashMap(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;
        var n = s1.length();
        var char_map_s1 = new HashMap<Character, Integer>();
        var char_map_s2 = new HashMap<Character, Integer>();

        for (int i = 0; i < n; i++) {
            var current_1 = s1.charAt(i);
            char_map_s1.merge(current_1, 1, Integer::sum);

            var current_2 = s2.charAt(i);
            char_map_s2.merge(current_2, 1, Integer::sum);
        }
        return char_map_s1.equals(char_map_s2);

    }


    public static boolean isAnagramArray(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char char_range = 256;
        var chars = new char[char_range];

        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i)]++;
            chars[s2.charAt(i)]--;
        }

        for (char c : chars) if (c != 0) return false;

        return true;
    }

    public static boolean isAnagramArray(Pair<String, String> pair) { return isAnagramArray(pair.first, pair.second); }





























    public static void average() {
        // Scanner für user input
        // System.in anstatt System.out (input stream, nicht output stream)
        Scanner scanner = new Scanner(System.in);

        // input lesen
        var input = scanner.nextLine();

        // array initialisieren
        // 'new' operator allocated den nötigen speicher
        int length = 2;
        int[] array = new int[length];


    }














}

