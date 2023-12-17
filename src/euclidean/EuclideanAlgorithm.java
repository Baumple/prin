package euclidean;

public class EuclideanAlgorithm {
    public static int bsD(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int r;
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);

        return a;
    }
}
