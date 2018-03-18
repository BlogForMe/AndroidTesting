package com.jon.test.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by jon on 2/25/18.
 */


public class mockito {
    LinkedList mockedList;


    @Before
    public void setUp() {
        mockedList = mock(LinkedList.class);
    }

    @Test
    public void mockDifSpy() throws Exception {
        User userMock = mock(User.class);
        userMock.setNumber(2);
        int num = userMock.getNumber();
        System.out.println("mock返回  "+num);

        User userSpy = spy(User.class);
        userSpy.setNumber(5);
        System.out.println("spy返回   "+userSpy.getNumber());
    }


    @Test
    public void verify01() {
//        List mockedList = mock(List.class);
//        mockedList.add("one");
//        mockedList.clear();
//        verify(mockedList).add("one");

//        LinkedList mockedList = mock(LinkedList.class);
//        when(mockedList.get(0)).thenReturn("first");
//        when(mockedList.get(1)).thenThrow(new RuntimeException());
//        println("输出" + mockedList.get(0));
//        System.out.println("输出" + mockedList.get(1));
//        println(mockedList.get(999));
    }

    @Test
    public void verifyTimes02() {
        mockedList.add("once");

        mockedList.add("twice");
        mockedList.add("twice");

        mockedList.add("three times");
        mockedList.add("three times");
        mockedList.add("three times");


        //following two verifications work exactly the same - times(1) is used by default
        verify(mockedList).add("once");
        verify(mockedList, times(1)).add("once");

        //exact number of invocations verification
        verify(mockedList, times(2)).add("twice");
        verify(mockedList, times(3)).add("three times");

        //verification using never(). never() is an alias to times(0)
        verify(mockedList, never()).add("never happened");

        //verification using atLeast()/atMost()
        verify(mockedList, atLeastOnce()).add("three times");
        verify(mockedList, atLeast(2)).add("three times");
        verify(mockedList, atMost(5)).add("three times");

//        doThrow(new RuntimeException()).when(mockedList).clear();
//        mockedList.clear();
    }

    @Test
    public void verifyOrder03() {

        // A. Single mock whose methods must be invoked in a particular order
        List singleMock = mock(List.class);

        //using a single mock
        singleMock.add("was added first");
        singleMock.add("was added second");

        //create an inOrder verifier for a single mock
        InOrder inOrder = inOrder(singleMock);

        //following will make sure that add is first called with "was added first, then with "was added second"
        inOrder.verify(singleMock).add("was added first");
        inOrder.verify(singleMock).add("was added second");

        // B. Multiple mocks that must be used in a particular order
        List firstMock = mock(List.class);
        List secondMock = mock(List.class);

        //using mocks
        firstMock.add("was called first");
        secondMock.add("was called second");

        //create inOrder object passing any mocks that need to be verified in order
        InOrder inOrder1 = inOrder(firstMock, secondMock);

        //following will make sure that firstMock was called before secondMock
        inOrder1.verify(firstMock).add("was called first");   //第一个方法有没有调用
        inOrder1.verify(secondMock).add("was called second");

        // Oh, and A + B can be mixed together at will
    }


}
