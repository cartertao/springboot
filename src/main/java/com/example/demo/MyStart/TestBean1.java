package com.example.demo.MyStart;

import org.springframework.stereotype.Component;


@Component(value = "tao")
public class TestBean1 {
    private String seq;

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "seq='" + seq + '\'' +
                '}';
    }
}
