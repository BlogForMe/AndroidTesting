package com.jon.test.mock;

import com.jon.test.TestBase;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

/**
 * Created by jon on 3/18/18.
 * 补货参数
 */

public class CapturingArgumentsTest extends TestBase {

    class Person {

        private final Integer age;

        public Person(Integer age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    class BulkEmailService {

        private EmailService service;

        public BulkEmailService(EmailService service) {
            this.service = service;
        }

        public void email(Integer... personId) {
            for (Integer i : personId) {
                Person person = new Person(i);
                service.sendEmailTo(person);
            }
        }
    }

    interface EmailService {
        boolean sendEmailTo(Person person);
    }

    EmailService emailService = Mockito.mock(EmailService.class);
    BulkEmailService bulkEmailService = new BulkEmailService(emailService);

    @Test
    public void should_allow_assertions_on_captured_argument() {
        //given
        ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);

        //when
        bulkEmailService.email(12);

        Mockito.verify(emailService).sendEmailTo(argument.capture());
        System.out.println(argument.getValue().getAge());
        Assert.assertEquals(12, argument.getValue().getAge());


    }


}
