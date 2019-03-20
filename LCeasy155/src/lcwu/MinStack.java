package lcwu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class StackItem {
    public int value;
    public StackItem next;
}

class MinStack {

    StackItem head = null;
    MinStack minStack = null;

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        StackItem si = new StackItem();
        si.value = x;
        si.next = head;
        head = si;
    }

    public void pop() {
        if(head == null){
            return;
        }
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        StackItem leader = head;

        while(leader != null){
            if(min > leader.value){
                min = leader.value;
            }
            leader = leader.next;
        }
        return min;
    }
}