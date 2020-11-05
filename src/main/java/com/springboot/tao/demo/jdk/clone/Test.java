package com.springboot.tao.demo.jdk.clone;

/**
 * @author taozhiwei
 * @date 2020/10/26 16:55
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneB cloneB = new CloneB();
        CloneA cloneA = new CloneA();
        cloneA.setCloneB(cloneB);




        /**
         * clone 的对象如果是基本类型或者包装类以及String则都会重新拷贝一份，
         *  1.因为基本类型是直接保存在堆中对应对象上的，所以不存在共同引用问题
         *  2.包装类由于没有set以及可以修改的变量，我们如果修改一个对象中的包装类型只有 = new Integer("11"),直接修改指向地址，
         *      不存在修改共同对象的问题，所以每次修改都是赋予一个新的地址，而clone的对象还是指向老的地址
         *  3.string 和包装类一样
         *
         * 浅拷贝：如果clone的对象中有其他对象，则拷贝的是同一个地址，也就是原对象和clone对象中都有一个变量，该变量指向的内存地址是同一个，所以修改该对象的属性则两个都会有影响
         *      为了达到深拷贝：我们可以让原对象的变量对应的类也实现Cloneable,然后在原对象的clone方法中在clone一个对象的变量{@link CloneA#clone()}
         */
        CloneA clone = (CloneA)cloneA.clone();
        cloneB.setName("taozhiwei");



        System.out.println(clone);
    }
}
