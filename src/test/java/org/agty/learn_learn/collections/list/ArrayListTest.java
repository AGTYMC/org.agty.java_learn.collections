package org.agty.learn_learn.collections.list;

import org.agty.learn_learn.collections.list.interfaces.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}