package com.springboot.tao.demo.jdk.algorithm.picture;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author: carter
 * @Date: 2021/6/29
 */
public class DfsAndBfs {



    /**
     * 深度优先遍历
     * @link {https://blog.csdn.net/yue_2018/article/details/89060556}
     * 0   A   B   C   D   E   F   G
     * A           1   1       1
     * B           1       1
     * C   1   1       1
     * D   1       1
     * E       1
     * F   1                       1
     * G                       1
     */
    private Stack<Integer> stack = new Stack<>();
    private boolean[] temp = {false, false, false, false, false, false, false};

    public void dfs(int[][] arr, int index){
        stack.add(index);
        temp[index] = true;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int value = arr[i][index];
            if (value == 1 && !temp[i]) {
                dfs(arr, i);
            }
            if( i == length - 1) {
                for (int j = 0; j < stack.size(); j++) {
                    System.out.print(stack.get(j));
                }
                System.out.println("---");
                stack.pop();
            }
        }
    }

    /**
     * 广度优先遍历
     */
    LinkedList<Integer> queue = new LinkedList<>();
    public void bfs(int[][] arr) {
        int start = 0;
        Integer poll = queue.poll();
        if(poll == null) {
            return;
        }else {
            start = poll;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i][start] > 0 && temp[i] == false) {
                System.out.println(i);
                temp[i] = true;
                queue.add(i);
            }
        }
        bfs(arr);
    }



    public static void main(String[] args) {
        int[][] arr = new int[7][];
        int[] arrA = {0, 0, 1, 1, 0, 1, 0};
        int[] arrB = {0, 0, 1, 0, 1, 0, 0};
        int[] arrC = {1, 1, 0, 1, 0, 0, 0};
        int[] arrD = {1, 0, 1, 0, 0, 0, 0};
        int[] arrE = {0, 1, 0, 0, 0, 0, 0};
        int[] arrF = {1, 0, 0, 0, 0, 0, 1};
        int[] arrG = {0, 0, 0, 0, 0, 1, 0};
        arr[0] = arrA;
        arr[1] = arrB;
        arr[2] = arrC;
        arr[3] = arrD;
        arr[4] = arrE;
        arr[5] = arrF;
        arr[6] = arrG;
        DfsAndBfs dfsAndBfs = new DfsAndBfs();
        //dfsAndBfs.dfs(arr, 0);

        dfsAndBfs.queue.add(0);
        dfsAndBfs.bfs(arr);
    }
}
