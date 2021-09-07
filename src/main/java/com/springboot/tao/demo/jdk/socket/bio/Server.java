package com.springboot.tao.demo.jdk.socket.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: carter
 * @Date: 2021/8/12
 *
 * 链接：一个链接对应一个客户端
 * 请求：一个链接/客户端，可以发送多个请求
 *
 * IO： 一个用户与服务器建立连接就开启一个线程，一般是从线程池中取的，比如你线程池一共就100个线程，
 * 或者服务器内存最多就能支撑100个线程同时开，这时第101个人进来就连接不上了，对于那第101个人来说，就是阻塞了
 *
 * NIO： 由于用户连接之后，并不总是时时刻刻都在发送请求，例如你登陆了微信，可能2个小时才说一句话，
 * 中间这个过程你并没有与服务器进行交互，即请求，那完全没必要为你一直开着一个线程，太浪费资源，而是
 * 通过一个selector进行监听，等你有请求的时候再为你开一个线程，例如你突然看朋友圈了，这就是一个请求。
 * 整个上述过程是请求驱动的，又称事件驱动的
 * 缺点：当所有的链接/客户端，发送请求，会一直在轮询
 *
 */
public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket socket = new ServerSocket(8082);
            while (true) {
                System.out.println("等待客户端连接...");
                // 同步阻塞，直到建立连接
                Socket client = socket.accept();
                // 有客户端连接了，发送一个消息给客户端
                OutputStream output = client.getOutputStream();
                output.write(("客户端[" + client.getPort() + "]你好，你已成功连接到8082服务端").getBytes());
                output.flush();
                System.out.println("客户端已连接:" + client.getPort());
                try {
                    InputStream input = client.getInputStream();
                    byte[] bytes = new byte[1024];
                    // 同步阻塞 读取客户端数据 直到输入数据
                    while (input.read(bytes) != -1) {
                        output.write(("收到了你的消息:" + new String(bytes)).getBytes());
                        output.flush();
                        System.out.println("收到客户端消息:" + new String(bytes));
                    }
                } catch (IOException ex) {
                    // 客户端链接断开则引发异常
                    System.err.println("引发异常：" + ex.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
