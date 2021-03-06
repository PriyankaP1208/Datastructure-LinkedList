package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3Numbers_WhenLinkedShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenLinkedShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenInsertingInBetween_ShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        boolean result = myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode)
                &&myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenDeletedFirstElement_ShouldPassLinkedListResult() {
        MyNode<Integer>myFirstNode = new MyNode<>(56);
        MyNode<Integer>mySecondNode = new MyNode<>(30);
        MyNode<Integer>myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();
        boolean result = myLinkedList.head.equals(mySecondNode)&&
                myLinkedList.head.getNext().equals(myThirdNode);
        myLinkedList.printMyNodes();
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenDeletedLastElement_ShouldPassLinkedListResult() {
        MyNode<Integer>myFirstNode = new MyNode<>(56);
        MyNode<Integer>mySecondNode = new MyNode<>(30);
        MyNode<Integer>myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        boolean result=myLinkedList.head.equals(myFirstNode)&&
                myLinkedList.head.getNext().equals(mySecondNode);
        myLinkedList.printMyNodes();
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenSearchedElementShould_PassLinkedListResult() {
        INode tempNode;
        MyNode<Integer>myFirstNode = new MyNode<>(56);
        MyNode<Integer>mySecondNode = new MyNode<>(30);
        MyNode<Integer>myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        tempNode = myLinkedList.search(30);
        Assert.assertEquals(30,tempNode.getKey());
    }

    @Test
    public void given3Numbers_WhenInsertAfterElementShould_PassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode searchNode= myLinkedList.search(30);
        myLinkedList.insert(searchNode, myFourthNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(searchNode)
                && myLinkedList.head.getNext().getNext().equals(myFourthNode)
                && myLinkedList.tail.equals(myFirstNode));
        myLinkedList.printMyNodes();
        Assert.assertEquals(true, result);
    }

    @Test
    public void given3Numbers_WhenDeletedOneElementAfter_ShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(40);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFourthNode);
        myLinkedList.popNode(40);
        int size = myLinkedList.getSize();
        myLinkedList.printMyNodes();
        Assert.assertEquals(3, size);
    }
}
