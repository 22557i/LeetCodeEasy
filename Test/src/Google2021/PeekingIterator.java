package Google2021;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer>{

    private Iterator<Integer> data;
    private Integer peekedValue = null;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        data = iterator;

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(peekedValue ==null){
            peekedValue = data.next();
        }
        return peekedValue;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(peekedValue!=null){
            Integer res =peekedValue;
            peekedValue =null;
            return res;
        }
        return data.next();

    }

    @Override
    public boolean hasNext() {
        return peekedValue != null || data.hasNext();
    }
}
