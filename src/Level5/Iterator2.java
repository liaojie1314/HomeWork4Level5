package Level5;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2<T> implements Iterable<T>{
      ArrayList<T>arrayList=new ArrayList<>();
      public void add (T x){
          arrayList.add(x);
      }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<arrayList.size();
            }

            @Override
            public T next() {
                return arrayList.get(index++);
            }
        };
    }
}
