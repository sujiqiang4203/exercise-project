package com.sjq.biancheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test5 {

    public static void main(String[] args) {

        List<String> imgIds = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            imgIds.add(i + "");
        }
        int pageSize = 15;
        int pageNum = imgIds.size() % pageSize == 0 ? imgIds.size() / pageSize : imgIds.size() / pageSize + 1;
        List<Map<String, String>> imgList = new ArrayList<>();
        for (int i = 0; i < pageNum; i++) {
            List<String> subList;
            if (i == pageNum - 1) {
                subList = imgIds.subList(i * pageSize, imgIds.size());
            } else {
                subList = imgIds.subList(i * pageSize, (i + 1) * pageSize);
            }

            System.out.println(subList.toString());

        }


    }


}
