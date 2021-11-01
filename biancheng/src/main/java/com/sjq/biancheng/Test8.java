//package com.sjq.biancheng;
//
//import java.util.ArrayList;
//
//public class Test8 {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static String[] maxMoney(TreeNode root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        dfs(ans, root, 0);
//        String[] ret = new String[ans.size()];
//        for (int i = 0; i < ret.length; i++) {
//            ans.get(i).toString();
//        }
//        return ret;
//    }
//
//    private void dfs(ArrayList<Integer> ans, TreeNode node, int level) {
//        if (node == null) {
//            return;
//        } else if (level < ans.size()) {
//            ans.set(level, ans.get(level) + node.value);
//        } else if (level == ans.size()) {
//            ans.add(node.value);
//        } else if (level > ans.size()) {
//            // DEAD CODE
//        }
//        dfs(ans, node.left, level + 1);
//        dfs(ans, node.right, level + 1);
//    }
//
//    private static class TreeNode {
//        private Integer value;
//        private TreeNode left;
//        private TreeNode right;
//    }
//
//
////    public static Integer[] maxMoney(TreeNode root) {
////        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
////        Integer deep = 0;
////        calculate(root, deep, result);
////        return result.values().toArray(new Integer[deep]);
////    }
////
////    public static void calculate(TreeNode root, Integer deep, Map<Integer, Integer> result) {
////        if (null != root) {
////            Integer integer = result.computeIfAbsent(deep, (key) -> 0);
////            result.put(deep, integer + root.val);
////            deep++;
////            calculate(root.left, deep, result);
////            calculate(root.right, deep, result);
////        }
////        deep--;
////    }
////    private static class TreeNode {
////        private Integer val;
////        private TreeNode left;
////        private TreeNode right;
////    }
//
//}
