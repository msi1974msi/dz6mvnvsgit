import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIndexArray {

    @Test
    public void testMethodSize(){
        int needSize = 10;
        IndexStorage idx = new IndexStorage(needSize);
        int resSize = idx.size();
        Assertions.assertEquals(needSize,resSize);
    }

    @Test
    public void testMethodGet(){
        // get:  even = + / not even = -
        IndexStorage idx = new IndexStorage(10);
        int needValue = -5;
        int resValue = idx.get(5);
        Assertions.assertEquals(needValue,resValue);
    }

    @Test
    public void testMethodReverse(){
        IndexStorage idx = new IndexStorage(10);
        int[] arrn = new int[idx.size()];
        for (int i = 0; i < arrn.length; i++) {
            arrn[i] = idx.get(i);
        }
        ArrayIndexStorage arrNew = new ArrayIndexStorage(arrn);
        arrNew.setArray(arrNew.reverse());
        int size = arrNew.getArray().length;
        // first element arrn VS last element arrNew
        Assertions.assertEquals(arrn[0],arrNew.getArray()[size-1]);
    }
}
