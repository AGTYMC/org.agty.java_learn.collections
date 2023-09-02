package org.agty.learn_learn.collections.list;
import org.agty.learn_learn.collections.list.interfaces.List;

import java.util.Arrays;

public class ArrayList implements List {
    private int maxListLenght = 5;

    private int nowListLength = 0;

    private Object[] list = new Object[ maxListLenght ];

    private class Element implements org.agty.learn_learn.collections.list.interfaces.Element {
        private Object value;

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public void setValue(Object value) {
            this.value = value;
        }
    }

    public void add(Object o) {
        list[ nowListLength ++ ] = o;

        if (nowListLength == maxListLenght) {
            maxListLenght = maxListLenght * 2;
            list = Arrays.copyOf(list, maxListLenght);
        }
    }

    public Object get(int index) {
        return list[ index ];
    }

    public int size() {
        return nowListLength;
    }
}
