package com.example.demo.bean;

public class TestBean {
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
