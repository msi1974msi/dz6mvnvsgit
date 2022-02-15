import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        IndexStorage idx = new IndexStorage(10);
        int[] arrn = new int[idx.size()];
        for (int i = 0; i < arrn.length; i++) {
            arrn[i] = idx.get(i);
        }
        System.out.println("First array : " + Arrays.toString(arrn));
        ArrayIndexStorage arrNew = new ArrayIndexStorage(arrn);
        System.out.println("New array size: " + arrNew.size());
        System.out.println("New array: " + Arrays.toString(arrNew.getArray()));
        //view values by method get()
        for (int i = 0; i < arrNew.size(); i++) {
            System.out.println((i + 1) + " Value = " + arrNew.get(i));
        }
        // reverse
        arrNew.setArray(arrNew.reverse());
        System.out.println("New array reverse: " + Arrays.toString(arrNew.getArray()));
    }
}