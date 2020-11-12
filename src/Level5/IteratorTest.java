package Level5;

import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args){
        Iterator1 listTest=new Iterator1();
        Iterator<Integer>it1= listTest.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        Iterator2<Integer>iterator=new Iterator2<>();
        iterator.add(1);
        iterator.add(2);
        Iterator<Integer>it2=iterator.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
