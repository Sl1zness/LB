package com.company;

import java.util.ArrayList;

public class Run<E> {
    private ArrayList<E> list;

    public void addArr(E[] array) {
        list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    }

    public void printArr() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public E getElem(int i) {
        return list.get(i);
    }

    public void saveCat(E[] array) {
        addArr(array);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
