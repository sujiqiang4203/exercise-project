package com.sjq.biancheng;

public class Test1 {

    public static void main(String[] args) {
        String a = "ABCBABEFAFEBA";
        String b = "ACBCAD";
        String c = "testsjq00qjsaaa";

        System.out.println("考生答案");
        System.out.println(getMirrorString(a));
        System.out.println(getMirrorString(b));
        System.out.println(getMirrorString(c));

        System.out.println("参考答案");
        System.out.println(getMirrorString2(a));
        System.out.println(getMirrorString2(b));
        System.out.println(getMirrorString2(c));
    }


    //考生答案
    public static String getMirrorString(String s) {
        String max_s ="";
        for(int i = 0;i<s.length();i++){
            int step = 1;
            try{
                for(;;){
                    if(s.charAt(i-step) != s.charAt(i+step))break;
                    step++;
                }
            }catch(Exception e){

            }
            String s1=s.substring(i-step+1,i+step);
            if(s1.length()>max_s.length())max_s=s1;
        }
        return max_s;
    }


    //参考答案
    public static String getMirrorString2(String s) {
        if (s == null) {
            return null;
        }
        if (s.equals("")) {
            return s;
        }
        String max = "";
        char[] arr = s.toCharArray();
        int len = s.length();
        boolean[][] flags = new boolean[len][len];
        for (int j = 0; j < len; j++) {
            int i = 0;
            flags[j][j] = true;
            for (; i < j; i++) {
                // 对于ABCBA，ABCBA为镜像对称字符串，则BCB必为镜像对称字符串
                flags[i][j] = (arr[i] == arr[j]) && ((j - i == 1) || flags[i + 1][j - 1]);
                if (flags[i][j]) {
                    if (max.length() < j - i + 1) {
                        max = s.substring(i, j + 1);
                    }
                }
            }
        }
        return max;
    }

}
