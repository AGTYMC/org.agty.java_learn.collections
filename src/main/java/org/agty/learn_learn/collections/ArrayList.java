package org.agty.learn_learn.collections;
import org.agty.learn_learn.collections.interfaces.Elements;
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
    private Element[] list = new Element[ maxListLenght ];

    /**
     * Элемент коллекции
     */
    private class Element implements Elements {
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
        return list[ index ].getValue();
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
     * Размер массива коллекции.
     *
     * @return int Размер.
     */
    public int getMaxListLength() {
        return maxListLenght;
    }

    /**
     * Удаляет из массива объкт.
     *
     * @param index Индекс.
     */
    public void remove(int index) {

        //TODO: Проверить если коллекция пустая, если это единственный элемент, если это последний элемент.
        //TODO: Заменить создание через copyOf() на обнуление последних элементов, так как массив динамически расширяется и необходимость
        //TODO: в его пересоздании это лишняя работа и память.
        for (int i = (index + 1); i < list.length; i++) {
            list[ i - 1 ] = list[ i ];
        }

        list = Arrays.copyOf(list, nowListLength - 1);
        nowListLength--;

    }
}
