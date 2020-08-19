package com.springboot.tao.demo.jdk.list;

import java.util.Arrays;

public class MyArrayList<E>
{
    private int init=10;
    private int size =0;
    Object [] arr = new Object[init];
    public void add(Object o) {
        size++;
        if (arr[arr.length - 1] != null) {
            Object[] arr1 = new Object[size * 2];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr1[arr.length]=o;
            arr=arr1;
        } else {
            arr[size - 1] = o;
        }
    }
    public void get(int index) {
        if(index>=size) {
            System.out.println("数组越界");
        }else {
            System.out.println(arr[index]);
        }
    }
    public void remove(Object o){
        for(int i=0;i<arr.length;i++){
            if(o.equals(arr[i])){
                this.remove(i);
            }
        }
    }
    public void remove(int index){
        int length = arr.length - index -1;
        System.arraycopy(arr,index+1,arr,index,length);
        arr[size--]=null;
    }

    public static void main(String[] args) {
        MyArrayList list =new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(Arrays.toString(list.arr));
        list.remove("c");
        System.out.println(Arrays.toString(list.arr));
        list.get(2);

    }
}
