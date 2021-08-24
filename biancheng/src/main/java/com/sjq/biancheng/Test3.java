package com.sjq.biancheng;

import java.util.Arrays;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int size = integers.size() / 6;
        int len = size < 1 ? 1 : size;
        System.out.println(size);
        System.out.println(len);
    }

}
