package com.sjq.biancheng;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * CVTE的软件开发部门最近在做一个文本编辑器，其中需要实现一个单词搜索功能。
 * 搜索包括精准搜索和相似搜索，相似搜索是通过计算两个单词的差异度，如果差异度小于3，则这两个单词是相似的，可以搜索命中。
 * <p>
 * 单词word1和word2差异度：由单词word1转换成单词word2需要的最小修改次数，大小写不敏感，修改操作包括如下：
 * （1）删除一个字符
 * （2）插入一个字符
 * （3）替换一个字符
 * <p>
 * 请使用Java补全下面代码，实现搜索功能，其中入参text为待搜索的原文本，可以通过" "、","、"."进行分词，入参keyword是搜索关键词，方法返回相同或者相似的单词。
 * <p>
 * 【输入输出样例】
 * 入参text：hello,worls
 * 入参keyword：world
 * 输出：worls
 * 说明：worls->只需要把s更换为d，就可以得到world，因此差异度是1，小于3，因此worls和world是相似的
 * <p>
 * public List<String> search(String text, String keyword) {
 * // code here
 * }
 */
public class Test2 {

    public static void main(String[] args) {
        String text1 = "suji,qiang";
        String keyword1 = "qing0";
        String text2 = "hello, worlss";
        String keyword2 = "world";

        System.out.println("考生答案");
        System.out.println(search(text1, keyword1));
        System.out.println(search(text2, keyword2));

        System.out.println("参考答案");
        System.out.println(search2(text1, keyword1));
        System.out.println(search2(text2, keyword2));
    }

    //考生答案
    public static List<String> search(String text, String keyword) {

        return null;
    }

    public static boolean helper(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        ;
        //动态规划
        int[][] dp = new int[m + 1][n + 1];
        //base case 边界情况
        for (int i = 1; i <= m; i++)//word2为0的时候 word1需要i次操作
            dp[i][0] = i;
        for (int i = 1; i <= n; i++)//同上相反
            dp[0][i] = i;

        //更新状态
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //状态转移
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];//相等 用前一个的
                else//不等 三个周边中最小的一个
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + 1));
            }
        }
        if (dp[m][n] < 3) //编辑次数小于3
            return true;
        return false;
    }

    //参考答案

    public static List<String> search2(String text, String keyword) {
        if (keyword == null || keyword.length() < 1
                || text == null || text.length() < 1) {
            return Collections.emptyList();
        }
        String[] words = text.split("[ |,|.]");
        List<String> result = new LinkedList<>();
        for (String word : words) {
            if (word.equalsIgnoreCase(keyword)
                    || difference(word, keyword) < 3) {
                result.add(word);
            }
        }
        return result;
    }

    public static int difference(String from, String to) {
        if (from == null) {
            return to == null ? 0 : to.length();
        }
        if (to == null) {
            return from.length();
        }
        int m = from.length();
        int n = to.length();

        //dp[i][j] 代表最小操作数（步骤），从 word1[0..i-1]转化为 word2[0..j-1].
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (Character.toLowerCase(from.charAt(i - 1)) == Character.toLowerCase(to.charAt(j - 1))) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        return dp[m][n];
    }


}
