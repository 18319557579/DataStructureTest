package com.hsf.datastructuretest.double_linked_list;

public class DoubleNode {
    public Long data;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode() {
    }

    public DoubleNode(Long data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
