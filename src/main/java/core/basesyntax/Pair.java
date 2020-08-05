package core.basesyntax;

public class Pair<T, S> {
    private T item1;
    private S item2;

    private Pair(T item1, S item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getFirst() {
        return (T) item1;
    }

    public S getSecond() {
        return (S) item2;
    }

    public static <T1, T2> Pair of(T1 item1, T2 item2) {
        return new Pair<>(item1, item2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !o.getClass().equals(o.getClass())) {
            return false;
        }
        Pair<T, S> pair = (Pair<T, S>) o;
        return item1 != null ? item1.equals(pair.getFirst()) : item1 == pair.getFirst()
                && item1 != null ? item2.equals(pair.getSecond()) : item2 == pair.getSecond();
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + (item1 == null ? 0 : item1.hashCode());
        hash = hash * 31 + (item2 == null ? 0 : item2.hashCode());
        return hash;
    }
}
