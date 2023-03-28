package com.hsf.datastructuretest.single_linked_list;

public class LinkedListNode {
    private Integer data;  //结点的数据域

    public LinkedListNode next;  //下一个结点

    public LinkedListNode() {
    }

    public LinkedListNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String nextHashCode = next == null ? null : Integer.toHexString(next.hashCode());
        return Integer.toHexString(this.hashCode()) + "{ " + data + ", " + nextHashCode + " }";
    }
}
