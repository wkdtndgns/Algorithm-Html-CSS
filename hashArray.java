package algo;


public class hashArray {

    static class MyArray {

        Object[] a;
        int count;

        public MyArray(int size) {
            a = new Object[size];
            count = 0;
        }

        public void add(Object value) {
            a[count] = value;
            ++count;
        }

        public int findIndex(Object value) {
            for (int i = 0; i < a.length; ++i)
                if (a[i] == value)
                    return i;
            return -1;
        }

        public void remove(Object value) {
            int index = findIndex(value);
            if (index == -1) return;
            for (int i = index; i < a.length - 1; ++i)
                a[i] = a[i + 1];
        }

        public boolean contains(Object value) {
            return findIndex(value) != -1;
        }

        public Object get(int index) {
            return a[index];
        }
    }

    public static void main(String[] args) {
        int maxValue = 200, maxCount = 10;
        MyArray myArray = new MyArray(maxCount);

        int[] data = { 1, 13, 105, 7, 9, 11, 14, 115, 107, 197 };
        for (int i = 0; i < data.length; ++i)
            myArray.add(data[i]);

        for (int i = 0;  i < maxCount; ++i)
            System.out.println(myArray.get(i));
    }
}
