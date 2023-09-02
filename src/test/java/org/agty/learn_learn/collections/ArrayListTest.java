package org.agty.learn_learn.collections;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты коллекции типа массив
 */
class ArrayListTest {

    private ArrayList list;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @org.junit.jupiter.api.Test
    void add() {
        list.add(50);

        assertEquals(1, list.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        list.add(50);
        assertEquals(50, list.get(0));
    }

    @Test
    void size() {
        list.add(50);
        list.add("Привет");
        assertEquals(2, list.size());
    }

    @Test
    void remove() {
        /*Добавляем элементы*/
        list.add(50);
        list.add("Привет");
        list.add(107F);
        list.add(new Object() {
            public final String value = "Obj";

            public String toString() {
                return value;
            }
        });

        /*Текущий размер*/
        assertEquals(4, list.size());

        /*Удаляем*/
        list.remove(2);

        /*Размер после удаления*/
        assertEquals(3, list.size());

        /*Сравниваем результаты*/
        assertEquals("Obj", list.get(2).toString());
    }
}