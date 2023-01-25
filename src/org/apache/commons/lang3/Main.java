package org.apache.commons.lang3;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

import org.apache.commons.lang3.builder.EqualsBuilder;

import static org.apache.commons.lang3.ArrayUtils.toArray;


public class Main {
    public static void main (String... args) {
        List<Integer> list1 = Arrays.asList(1,5,10,12,15,20,21,22);


        List<Integer> list2 = Arrays.asList(-5,-1,9,15,100);



        List<Integer> list3 = list1;
        list3.addAll(list2);
        System.out.print("слияние листов= " + list3);

        //сортируем пузырьком
        int[] wArray =  ArrayUtils.toPrimitive(list3.toArray(new Integer[0]));
        System.out.print("слияние листов= " + wArray.toString());
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < wArray.length; i++) {
                //ListIterator<Integer> listIterator = list3.listIterator();

                //if (list3.get(i) < list3.listIterator().previous()) {
                  //  var temp = list3.get(i);
                  //  list3.get(i) = list3.listIterator().previous();
                  //  list3.listIterator().previous() = temp;
                  //  isSorted = false;

                if (wArray[i] < wArray[i-1]) {
                    int temp = wArray[i];
                    wArray[i] = wArray[i-1];
                    wArray[i-1] = temp;
                    isSorted = false;

                }

            }
        }
     System.out.print(wArray);
    }
}
