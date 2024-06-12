package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTrain {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(11);
        hs.add(12);
        hs.add(13);
        hs.add(10);
        hs.add(9);
        hs.add(8);
        hs.add(18);
        System.out.println(hs);
        hs.remove(13);
        System.out.println(hs);
        System.out.println(hs.contains(7));


        for (Object ol : hs){
            System.out.println(ol);
        }

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }


        System.out.println();
        System.out.println("=====================");
        HashSet hs1 = new HashSet();
        hs1.add("welcome");
        hs1.add(1);
        System.out.println(hs1);
        System.out.println(hs1.contains("wel"));






    }
}
