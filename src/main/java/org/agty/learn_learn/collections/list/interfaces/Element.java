package org.agty.learn_learn.collections.list.interfaces;

/**
 * Интерфейс внутреннего класса для простого элемента коллекциию.
 */
public interface Element {

    /**
     * Получает объект элемента.
     *
     * @return Object Объект.
     */
    Object getValue();

    /**
     * Назначает объект в элемент.
     *
     * @param o Объект.
     */
    void setValue(Object o);
}
