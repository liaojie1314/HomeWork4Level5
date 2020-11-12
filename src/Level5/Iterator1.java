package Level5;

import java.util.Iterator;

public class Iterator1 implements Iterable<Integer> {
    Integer[]a={1,2,3,4,5};

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<a.length;
            }

            @Override
            public Integer next() {
                return a[index++];
            }
        };
    }
}
