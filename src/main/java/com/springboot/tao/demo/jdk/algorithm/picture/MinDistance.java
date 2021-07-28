package com.springboot.tao.demo.jdk.algorithm.picture;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: carter
 * @Date: 2021/7/26
 * 图的最短距离 - 求一个点到另一个点的所有最短距离
 * 无权图：通过广度优先遍历，判断第几层到达指定位置，则最短路径就是第几层
 * 有权图：地杰斯特拉算法，维护一张表，一直更新到各个点的最短距离
 * <p>
 * 地杰斯特拉算法
 * 每次选择的是未标记的，最小的点
 *
 * 图的最短距离 - 求多个点到另一个点的所有最短距离
 * 弗洛伊德算法 - 必须使用领接矩阵
 */
public class MinDistance {
    /**
     * 表示该点到起始点最短距离时候的前一个顶点索引
     */
    public int[] preIndex = new int[7];
    /**
     * true表示已经使用过
     */
    public boolean[] temp = new boolean[7];
    /**
     * 顶点到起始点的最短距离
     */
    public int[] distances = new int[7];

    /**
     * 求一个点到另一个点的所有最短距离
     */
    public int result(List<PictureBean>[] arr, int start) {
        temp[start] = true;
        // 获取该点的所有连接线
        List<PictureBean> pictureBeans = arr[start];
        // 计算该连接线的下一个点到顶点的最短距离
        pictureBeans.stream().forEach(x -> {
            int id = x.getId();
            int wight = x.getWight();
            if (!temp[id]) {
                if (distances[id] == 0 || distances[id] > distances[start] + wight) {
                    distances[id] = distances[start] + wight;
                    preIndex[id] = start;
                }
            }
        });

        // 获取获取最小距离的非标记(true)的点，如果没有则返回结果
        int minIndex = -1;
        for (int i = 0; i < distances.length; i++) {
            if (temp[i] == false) {
                if (minIndex == -1)
                    minIndex = i;
                else if (distances[i] < distances[minIndex] && distances[i] != 0)
                    minIndex = i;
            }
        }

        if (minIndex == -1) {
            int index = distances.length - 1;
            while (index != 0) {
                System.out.println("-->" + preIndex[index]);
                index = preIndex[index];
            }
            return distances[distances.length - 1];
        } else
            return result(arr, minIndex);
    }

    /**
     * 求一个点到另一个点的所有最短距离
     */
    public int[][] result(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int value = arr[j][i];
                 if(value != 0) {
                    // 无论是没有直达路径 -1 还是有直达或者间达都重新计算
                    for (int k = 0; k < arr.length; k++) {
                        int temp1 = arr[k][i];
                        int temp2 = arr[j][k];
                        if(temp1 > 0 && temp2 > 0) {
                            int sum = temp1 + temp2;
                            if(arr[j][i] < 0 || sum < arr[j][i])   // arr[j][i]不能使用value，因为下一行代码已经更新了值，但是value没有变化
                                arr[j][i] = sum;
                        }
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // 一个点到另一个点 - 邻接表(表示连接线)
        PictureBean AC = new PictureBean(2, 2);
        PictureBean CA = new PictureBean(2, 0);

        PictureBean AB = new PictureBean(5, 1);
        PictureBean BA = new PictureBean(5, 0);

        PictureBean CF = new PictureBean(8, 5);
        PictureBean FC = new PictureBean(8, 2);

        PictureBean CD = new PictureBean(6, 3);
        PictureBean DC = new PictureBean(6, 2);

        PictureBean BD = new PictureBean(1, 3);
        PictureBean DB = new PictureBean(1, 1);

        PictureBean BE = new PictureBean(6, 4);
        PictureBean EB = new PictureBean(6, 1);

        PictureBean DF = new PictureBean(2, 5);
        PictureBean FD = new PictureBean(2, 3);

        PictureBean DE = new PictureBean(1, 4);
        PictureBean ED = new PictureBean(1, 3);

        PictureBean FG = new PictureBean(3, 6);
        PictureBean GF = new PictureBean(1, 5);

        PictureBean EG = new PictureBean(7, 6);
        PictureBean GE = new PictureBean(7, 4);

        List<PictureBean>[] arr = new List[7];
        arr[0] = Arrays.asList(AC, AB);
        arr[1] = Arrays.asList(BA, BD, BE);
        arr[2] = Arrays.asList(CA, CD, CF);
        arr[3] = Arrays.asList(DB, DC, DF, DE);
        arr[4] = Arrays.asList(EB, ED, EG);
        arr[5] = Arrays.asList(FC, FD, FG);
        arr[6] = Arrays.asList(GF, GE);


        MinDistance minDistance = new MinDistance();
        // 一个点到另一个点最短距离
//        int r = minDistance.result(arr, 0);
//        int[] distances = minDistance.distances;
//        int[] preIndex = minDistance.preIndex;

        // 所有点到所有点最短距离
        int[][] arr1= new int[7][];
        arr1[0] = new int[]{0, 5, 2, -1, -1, -1, -1};
        arr1[1] = new int[]{5, 0, -1, 1, 6, -1, -1};
        arr1[2] = new int[]{2, -1, 0, 6, -1, 8, -1};
        arr1[3] = new int[]{-1, 1, 6, 0, 1, 2, -1};
        arr1[4] = new int[]{-1, 6, -1, 1, 0, -1 ,7};
        arr1[5] = new int[]{-1, -1, 8, 2, -1, 0, 3};
        arr1[6] = new int[]{-1, -1, -1, -1, 7, 3, 0};
        int[][] result = minDistance.result(arr1);
         result = minDistance.result(result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

}

//          [0, 5, 2, 6, 7, 8, 11]
//        [5, 0, 7, 1, 2, 3, 6]
//        [2, 7, 0, 6, 7, 8, 11]
//        [6, 1, 6, 0, 1, 2, 5]
//        [7, 2, 7, 1, 0, 3, 6]
//        [8, 3, 8, 2, 3, 0, 3]
//        [11, 6, 11, 5, 6, 3, 0]