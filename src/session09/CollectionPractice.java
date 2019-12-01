package session09;

import java.util.ArrayList;

/**
 * @author dkruger
 */
public class CollectionPractice {
    public static ArrayList<Integer> f1(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 1000000; i++)
            a.add(i);
        System.out.println(a.size());
        return a;
    }

    // add the elements of the list
    public static long sum(ArrayList<Integer> x) {
        long sum = 0L;
        for (int i = 0, size = x.size(); i < size; i++) {
            sum += x.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        final int n = 1000000;
        long t0 = System.nanoTime();
        ArrayList<Integer> a = f1(n);
        long t1 = System.nanoTime();
        System.out.print("ArrayList Creating n elements ");
        System.out.println(t1 - t0);
        // Do the same for an arraylist which is preallocated to n elements

        // Do the same for DoubleList

        System.out.println(sum(a));
    }
}

/*

(1) for each循环

List<Integer> list = new ArrayList<Integer>();
for (Integer j : list) {
	// use j
}

(2) 显示调用集合迭代器

List<Integer> list = new ArrayList<Integer>();
for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
	iterator.next();
}
或

List<Integer> list = new ArrayList<Integer>();
Iterator<Integer> iterator = list.iterator();
while (iterator.hasNext()) {
	iterator.next();
}

(3) 下标递增循环，终止条件为每次调用size()函数比较判断

List<Integer> list = new ArrayList<Integer>();
for (int j = 0; j < list.size(); j++) {
	list.get(j);
}

(4) 下标递增循环，终止条件为和等于size()的临时变量比较判断

List<Integer> list = new ArrayList<Integer>();
int size = list.size();
for (int j = 0; j < size; j++) {
	list.get(j);
}

(5) 下标递减循环

List<Integer> list = new ArrayList<Integer>();
for (int j = list.size() - 1; j >= 0; j--) {
	list.get(j);
}

*/