package ra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Calculator {
//    public T sum(T a, T b){
//        return a+b;
//    }


    public static <T extends Comparable<? super T>> void sort(T[] array){
        Arrays.sort(array);
    }
}
