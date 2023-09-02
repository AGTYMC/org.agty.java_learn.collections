package org.agty.learn_learn.collections;
import org.agty.learn_learn.collections.interfaces.List;

import java.util.Arrays;

/**
 * Не связанная коллекция типа Array
 */
public class ArrayList implements List {

    /**Максимальный размер коллекции.*/
    private int maxListLenght = 5;

    /**Текущий размер коллекции.*/
    private int nowListLength = 0;

    /**Массив объектов коллекции*/
    private Object[] list = new Object[ maxListLenght ];

    /**
     * Элемент коллекции
     */
    private class Element implements org.agty.learn_learn.collections.interfaces.Element {
        private Object value;

        Element(Object o) {
            setValue(o);
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public void setValue(Object value) {
            this.value = value;
        }
    }

    /**
     * Добавляет объект в коллекцию
     * @param o Объект.
     */
    public void add(Object o) {
        list[ nowListLength ++ ] = new Element(o);

        if (nowListLength == maxListLenght) {
            maxListLenght = maxListLenght * 2;
            list = Arrays.copyOf(list, maxListLenght);
        }
    }

    /**
     * Возвращает объект коллекции.
     *
     * @param index Индекс.
     * @return Object Объект.
     */
    public Object get(int index) {
        return ((Element) list[ index ]).getValue();
    }

    /**
     * Размер коллекции.
     *
     * @return int Размер.
     */
    public int size() {
        return nowListLength;
    }

    /**
     * Удаляет из массива объкт.
     *
     * @param index Индекс.
     */
    public void remove(int index) {

        for (int i = 0; i < list.length; i++) {
            if (i <= index) continue;
            list[ i - 1 ] = list[ i ];
        }

        list = Arrays.copyOf(list, nowListLength - 1);
        nowListLength--;
    }

    /**
     * Размер массива коллекции.
     *
     * @return int Размер.
     */
    public int sizeCollectionArray() {
        return list.length;
    }
}
