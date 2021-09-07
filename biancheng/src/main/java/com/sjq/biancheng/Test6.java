package com.sjq.biancheng;

import java.util.Arrays;

public class Test6 {

    public static void main(String[] args) {

        int a[] = {1,2,3,2,0};
        int duplicateNum = findDuplicateNum(a);
        System.out.println(duplicateNum);
    }

    public static int findDuplicateNum(int[] nums){
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

}
