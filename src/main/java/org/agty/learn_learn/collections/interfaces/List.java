package org.agty.learn_learn.collections.interfaces;

/**
 * Интерфейс коллекции типа List.
 */
public interface List {
    /**
     * Добавляет объект в коллекцию.
     *
     * @param o Объект.
     */
    void add(Object o);

    /**
     * Выбирает объект из коллекции по его индексу.
     *
     * @param index Индекс.
     * @return Object Объект.
     */
    Object get(int index);

    /**
     * Возвращает текущий размер коллекции.
     *
     * @return int Размер.
     */
    int size();

    /**
     * Удаление объекта из коллекции.
     *
     * @param index Индекс.
     */
    void remove(int index);

    /**
     * Возвращает размер массива коллекции.
     *
     * @return int Размер.
     */
    int getMaxListLength();
}
