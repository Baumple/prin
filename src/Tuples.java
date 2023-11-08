@SuppressWarnings("unused")
public class Tuples {
    public static class Pair<R, T>  {
        public R first;
        public T second;

        public Pair(R first, T second) {
            this.first = first;
            this.second = second;
        }
    }

    public static class Triplet<R, T, S> {
        public R first;
        public T second;
        public S third;

        public Triplet(R first, T second, S third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

}
