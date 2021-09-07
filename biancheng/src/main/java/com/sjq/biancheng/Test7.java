package com.sjq.biancheng;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test7 {

    public static void main(String[] args) {
//        getOutOrder(4,1);
        getOutOrder(7,3);
    }


    public static void getOutOrder(int n, int m) {
        StringBuilder bf = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int point = -1;
        ArrayList<Integer> toDel = new ArrayList<>();
        while (!list.isEmpty()) {
            if (point > list.size()) {
                point = (point + m) % list.size();
                for (int j : toDel) {
                    list.remove(j);
                }
                toDel.clear();
            }
            bf.append(list.get(point + m) + " ");
            point = point + m;
            toDel.add(point);
        }
        System.out.print(bf.toString().trim());
    }

}
