package session06;

public class IntArrayList {
    private int[] a;
    private int used;

    private final void grow() {
        int[] old = a;
        a = new int[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            a[i] = old[i];
        }
    }

    public IntArrayList() {
//        a = new int[1];
        this(1);
    }

    public IntArrayList(int initialCapacity) {
        a = new int[initialCapacity];
        used = 0;
    }

    public void add(int v) {
        if (used >= a.length) {
            grow();
        }
        a[used++] = v;  // a[used] = v; used++;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(used * 10);
        for (int i = 0; i < used; i++) {
            builder.append(i).append(" ");
        }
        return builder.toString();
        /* BAD IDEA!!!
        String s = "";
        for (int i = 0; i < used; i++)
           s = s + a[i] + " ";
        return s;
        */
    }

    public static void main(String[] args) {
        long t0 = System.nanoTime();
        IntArrayList arrayList = new IntArrayList(1000);
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        long t1 = System.nanoTime();
        System.out.println(t1 - t0);
        System.out.println(arrayList);
    }
}
