package org.agty.learn_learn.collections.interfaces;

/**
 * Интерфейс внутреннего класса для простого элемента коллекциию.
 */
public interface Elements {

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
