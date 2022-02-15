public class ArrayIndexStorage extends IndexStorage {
    private int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length); // need parent constructor
        this.arr = new int[size()];
        for (int i = 0; i < size(); i++) {
            this.arr[i] = arr[i];
        }
    }
    //Override method get by field this.class
    @Override
    public int get(int index) {
        return arr[index];
    }

    // method GET for array
    public int[] getArray() {
        return arr;
    }
    //Method SET for array
    public void setArray(int[] arr) {
        this.arr = arr;
    }

}
