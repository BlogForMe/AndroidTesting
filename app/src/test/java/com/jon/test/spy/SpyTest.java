package com.jon.test.spy;

import com.jon.test.util.PasswordValidator;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

import static com.jon.test.Print.println;
import static org.mockito.Mockito.when;

/**
 * Created by jon on 2/25/18.
 */

public class SpyTest {

    // 13. Spying on real objects
    @Test
    public void spyReal04() {
        List list = new LinkedList();
        List spy = Mockito.spy(list);

        //optionally, you can stub out some methods:
        when(spy.size()).thenReturn(10);

        //using the spy calls *real* methods
        spy.add("one");
        spy.add("two");

        //prints "one" - the first element of a list
        System.out.println(spy.get(0));

        //size() method was stubbed - 100 is printed
        System.out.println(spy.size());
    }

    @Test
    public void spyPwd() {
        //跟创建mock类似，只不过调用的是spy方法，而不是mock方法。spy的用法
        PasswordValidator spyValidator = Mockito.spy(PasswordValidator.class);
//在默认情况下，spy对象会调用这个类的真实逻辑，并返回相应的返回值，这可以对照上面的真实逻辑
        println(spyValidator.verifyPassword("jon")); //true
    }

}
