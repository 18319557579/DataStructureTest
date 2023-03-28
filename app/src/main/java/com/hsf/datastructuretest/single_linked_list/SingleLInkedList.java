package com.hsf.datastructuretest.single_linked_list;

import java.util.List;

public class SingleLInkedList {
    private LinkedListNode head;  //指向单链表的头节点

    private int length;  //保存链表的长度

    public SingleLInkedList() {
        head = new LinkedListNode();
        length = 0;
    }

    /**
     * 获得链表长度
     */
    public int getLength() {
        return length;
    }

    /**
     * 默认在表尾插入
     */
    public void add(Integer data) {
        LinkedListNode newNode = new LinkedListNode(data);  //利用有参的构造函数，将数据存进去

        LinkedListNode p = head;
        while (p.next != null) {  //通过遍历找到next为null的节点
            p = p.next;
        }
        p.next = newNode;
        length++;
    }

    /**
     * 在指定位置插入
     * @param index
     * @param data
     */
    public void add(int index, Integer data) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("位置不合法，或者越界了");
        }

        LinkedListNode newNode = new LinkedListNode(data);
        LinkedListNode p = head;
        int i = 0;
        while (i != index) {
            p = p.next;
            i++;
        }
        newNode.next = p.next;
        p.next = newNode;
        length++;
    }

    /**
     * 获得指定位置的元素
     * @param index
     * @return
     */
    public Integer get(int index) {
        checkElement(index);
        return node(index).getData();
    }

    private void checkElement(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("位置不合法，或者越界了");
        }
    }

    private LinkedListNode node(int index) {
        LinkedListNode p = head;
        int i = 0;
        while (i != index) {
            p = p.next;
            i++;
        }
        return p.next;
    }

    /**
     * 获得某元素的下标
     */
    public int indexOf(Integer data) {
        LinkedListNode p = head;
        int index = 0;
        while (p.next != null) {
            p = p.next;
            if (p.getData().equals(data)) {
                return index;
            }
            index++;
        }

        return -1;
    }

    /**
     * 按指定下标删除
     * @param index
     * @return
     */
    public Integer remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("位置不合法，或者越界了");
        }

        LinkedListNode p = head;
        int i = 0;
        while (i != index) {
            p = p.next;
            i++;
        }

        LinkedListNode pNext = p.next;
        p.next = pNext.next;
        pNext.next = null;

        return pNext.getData();
    }

    /**
     * 删除指定元素
     * @param data
     * @return
     */
    public boolean remove(Integer data) {
        LinkedListNode p = head;
        while (p.next != null) {
            if (p.next.getData().equals(data)) {
                LinkedListNode pNext = p.next;
                p.next = pNext.next;
                pNext.next = null;
                return true;
            }
            p = p.next;
        }
        return false;
    }

    /**
     * 修改指定位置的元素
     * @param index
     * @param data
     * @return 返回原先的元素
     */
    public Integer set(int index, Integer data) {
        checkElement(index);
        LinkedListNode node = node(index);
        Integer origin = node.getData();
        node.setData(data);
        return origin;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode p = head;

        builder.append("length:").append(length).append(" ");

        builder.append(p.toString());
        while (p.next != null) {
            p = p.next;
            builder.append(" -> ");
            builder.append(p.toString());
        }

        return builder.toString();
    }
}
