public class IndexStorage {
    private int size = 0;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return index * ((index / 2) * 2 == index ? 1 : -1);
    }

    public int[] reverse() {
        int[] arrn = new int[size];
        for (int i = 0; i < size / 2; i++) {
            int tmp = get(i);
            arrn[i] = get(size - 1 - i);
            arrn[size - 1 - i] = tmp;
        }
        return arrn;
    }
}