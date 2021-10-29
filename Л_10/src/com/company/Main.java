package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static <E> void convArr(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] newArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] strArr = {"a", "b", "c", "d", "e"};

        convArr(newArr);
        convArr(strArr);

        Run a = new Run<>();
        a.addArr(strArr);
        a.printArr();
        System.out.println(a.getElem(4));
        a.addArr(newArr);
        a.printArr();
        System.out.println(a.getElem(4));

        a.saveCat(strArr);
    }
}
