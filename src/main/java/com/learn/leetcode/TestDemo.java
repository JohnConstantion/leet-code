package com.learn.leetcode;

public record TestDemo(int id) {
    public TestDemo{
        if (id == 0){
            throw new IllegalStateException("id should not be 0");
        }
    }
}
