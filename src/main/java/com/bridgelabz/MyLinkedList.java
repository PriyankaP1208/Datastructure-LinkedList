package com.bridgelabz;

public class MyLinkedList<K extends Comparable<K>> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList()
    {
        this.head = head;
        this.tail = tail;
    }

    public void add(INode<K> myNode)
    {
        if (this.tail == null)
        {
            this.tail = myNode;
        }
        if (this.head == null)
        {
            this.head = myNode;
        }
        else {
            INode tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNodes()
    {
        StringBuffer myNodes = new StringBuffer("MyNodes");
        INode tempNode = head;
        while (tempNode.getNext()!= null)
        {
            myNodes.append(tempNode.getKey());
            if (!(tempNode.equals(tail))) {
                myNodes.append("->");
            }
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode myNode) {
        if(this.head == null)
        {
            this.head = myNode;
        }
        if(this.tail == null)
        {
            this.tail = myNode;

        }
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void insert(INode myNode, INode newNode)
    {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
}
